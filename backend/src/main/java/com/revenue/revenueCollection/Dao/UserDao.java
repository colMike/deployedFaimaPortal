package com.revenue.revenueCollection.Dao;

import com.revenue.revenueCollection.Models.UserGroupType;
import com.revenue.revenueCollection.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

public interface UserDao extends JpaRepository<Users, Integer> {
  @Query("select u from Users u where u.userName=?1 and u.userPwd=?2  ")
  Users findByUsernameAndPassword(String username, String password);

  @Query("select u from Users u where u.userId=?1")
  Users findByUserId(Integer userid);

  @Query("select u from Users u where u.approved='V' and (u.deleted='U'  or u.deleted IS NULL)")
  List<Users> findAll();

  @Query("select u from Users u where u.approved='N'")
  List<Users> findUsersToApprove();

  @Query("select u from Users u where u.deleted='D'")
  List<Users> findUsersToApproveDelete();

  @Query("select u from UserGroupType u ")
  List<UserGroupType> findGroupType();

  @Modifying
  @Transactional
  @Query("UPDATE Users u SET u.isLoggedIn = 1 WHERE u.userId = ?1")
  void setLogInStatusTrue(Integer userId);

  @Modifying
  @Transactional
  @Query("UPDATE Users u SET u.isLoggedIn = 0 WHERE u.userId = ?1")
  void setLogInStatusFalse(Integer userId);

}
