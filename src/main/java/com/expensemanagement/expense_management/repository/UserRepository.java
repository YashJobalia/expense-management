package com.expensemanagement.expense_management.repository;

import com.expensemanagement.expense_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
