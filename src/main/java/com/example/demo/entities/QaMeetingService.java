package com.example.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class QaMeetingService implements  MeetingService{

    @Override
    public String getMeetingContext() {
        return "Trying to broke developers code muhahah!";
    }
}
