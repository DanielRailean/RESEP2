package models;

import java.io.Serializable;

public class Expense implements Serializable {
    private int id;
    private int amount;
    private String description;
    private int day;
    private int month;
    private int year;
    private int accountId;
    private int currencyId;
    private int categoryId;
    private int userId;
    private String accountName;
    private String currencyName;
    private String categoryName;

    public Expense(int amount, String description, int day, int month, int year, int accountId, int currencyId, int categoryId, int userId) {
        this.amount = amount;
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
        this.accountId = accountId;
        this.currencyId = currencyId;
        this.categoryId = categoryId;
        this.userId = userId;
    }

    public Expense(int id, int amount, String description, int day, int month, int year, int accountId, int currencyId, int categoryId, int userId, String accountName, String currencyName, String categoryName) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
        this.accountId = accountId;
        this.currencyId = currencyId;
        this.categoryId = categoryId;
        this.userId = userId;
        this.accountName = accountName;
        this.currencyName = currencyName;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", accountId=" + accountId +
                ", currencyId=" + currencyId +
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                ", accountName='" + accountName + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}