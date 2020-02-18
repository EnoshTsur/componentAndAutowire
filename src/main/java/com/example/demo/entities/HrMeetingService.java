package com.example.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class HrMeetingService implements MeetingService {

    @Override
    public String getMeetingContext() {
        return "Talk about employees salaries";
    }
}
