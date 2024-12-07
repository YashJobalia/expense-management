package com.expensemanagement.expense_management.repository;

import com.expensemanagement.expense_management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
