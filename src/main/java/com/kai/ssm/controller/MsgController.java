package com.kai.ssm.controller;

import com.kai.ssm.util.Message;

import java.lang.reflect.Method;

public class MsgController {
    public static void main(String[] args) {
        Message mes=new Message();
        try{
            Method m;
            m=mes.getClass().getMethod("setPhnumber", String.class);
            m.invoke(mes,"18990712942");

            m=mes.getClass().getMethod("setAuthcode", String.class);
            m.invoke(mes,"520");

            m =mes.getClass().getMethod("main", String[].class);
            m.invoke(mes, (Object) new String[] { "YayA" });

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
