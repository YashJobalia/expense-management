package com.expensemanagement.expense_management.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "transaction_name")
    private String transactionName;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amount")
    private float transactionAmount;

    @Column(name = "transaction_datetime")
    private String transactionDateTime;

    @Column(name = "transaction_description")
    private String transactionDescription;

    @Column(name = "user_id")
    private String userId;

    public Transaction(String transactionName, String transactionType, float transactionAmount, String transactionDateTime, String transactionDescription, String userId) {
        this.transactionName = transactionName;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionDateTime = transactionDateTime;
        this.transactionDescription = transactionDescription;
        this.userId = userId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
