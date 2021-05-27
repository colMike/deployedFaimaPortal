package com.revenue.revenueCollection.Beans;

import com.google.common.base.Strings;
import com.revenue.revenueCollection.Dao.AuditTrailDao;
import com.revenue.revenueCollection.Dao.UserDao;
import com.revenue.revenueCollection.Interfaces.loginBal;
import com.revenue.revenueCollection.Models.Audit_trail;
import com.revenue.revenueCollection.Models.Users;
import com.revenue.revenueCollection.Utility.AES;
import com.revenue.revenueCollection.Utility.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
public class LoginBalImpl implements loginBal {
  @Autowired UserDao userDao;
  @Autowired AuditTrailDao auditTrailDao;

  @Override
  public LoginUser logIn(String uname, String password) {

    if (Strings.isNullOrEmpty(uname) || Strings.isNullOrEmpty(password)) return new LoginUser(404);

    String username = uname.trim();
    String pwd = password.trim();

    Users users = new Users();
    try {
      System.out.println(username + "username");
      System.out.println(pwd + "users.getUserPwd()");
      System.out.println(username + "users.getUserName()");
      if ((pwd != null && !pwd.isEmpty()) && (username != null && !username.isEmpty())) {
        Users user2 = userDao.findByUsernameAndPassword(username, AES.encrypt(pwd));

        if (user2.isLoggedIn()) return new LoginUser(400, "This user is already logged in");

        System.out.println(AES.decrypt(user2.getUserPwd()) + "@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(user2.getUserName() + "@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(user2.getUserId() + "getUserId2");
        System.out.println(pwd + "==============================");
        System.out.println(username + "==============================");

        if (pwd.equals(AES.decrypt(user2.getUserPwd())) && username.equals(user2.getUserName())) {
          System.out.println(user2.getUserPwd() + "################");
          user2.setUserId(user2.getUserId());
          System.out.println(user2.getUserId() + "here 1");

          Audit_trail auditTrail = new Audit_trail();
          auditTrail.setAction(" User Login");
          auditTrail.setCreatedBy(user2.getUserId());

          auditTrail.setCreatedOn(new Timestamp(new Date().getTime()));

          auditTrailDao.save(auditTrail);

          userDao.setLogInStatusTrue(user2.getUserId());

          return new LoginUser(user2.getUserId(), user2.getGroupId(), user2.getUserName(), 200);

        } else {
          // return new ResponseMessage(201, "Invalid Credentials");
          return new LoginUser(201);
        }
      }
      // return new ResponseMessage(203, "Login Failure");
      return new LoginUser(202);
    } catch (Exception e) {
      e.printStackTrace();
      return new LoginUser(404);
    }
  }

  public LoginUser logOut(Integer userId) {

    Users user = userDao.findByUserId(userId);

    userDao.setLogInStatusFalse(user.userId);

    return new LoginUser(user.getUserId(), user.getGroupId(), user.getUserName(), 200);
  }
}
