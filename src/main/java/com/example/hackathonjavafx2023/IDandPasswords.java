package com.example.hackathonjavafx2023;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Admin","tester");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}