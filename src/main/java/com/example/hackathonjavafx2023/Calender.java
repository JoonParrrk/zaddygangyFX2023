package com.example.hackathonjavafx2023;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Calender {



    public String CurrentDateTime() {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
               System.out.println(dtf.format(now));
    return dtf.format(now);
    }

}
