package com.robby.user.log;

import java.util.Date;



public class Log {
    public static void log(String str){
        System.out.println(new Date()+"---"+str);
    }
}
