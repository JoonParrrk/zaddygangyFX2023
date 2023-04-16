package com.example.hackathonjavafx2023;

public class Login {

    private String username;

    private String password;

    private int accountNumber;

    public Login(String username, String password, int accountNumber) {
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
}
