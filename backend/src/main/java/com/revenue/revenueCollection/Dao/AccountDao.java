package com.revenue.revenueCollection.Dao;

import com.revenue.revenueCollection.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account,Integer> {
}
