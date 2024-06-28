package com.shivansh;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public void init(){
        System.out.println("Getting db connection....");
    }

    public void getData(){
        System.out.println("Getting data from DB....");
    }
    public void destroy(){
        System.out.println("closing db connection....");
    }

}
