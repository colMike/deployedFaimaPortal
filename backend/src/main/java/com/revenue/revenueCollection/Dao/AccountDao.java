package com.revenue.revenueCollection.Dao;

import com.revenue.revenueCollection.Models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountDao extends CrudRepository<Account, Integer> {}
