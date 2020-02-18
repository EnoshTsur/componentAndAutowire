package com.example.demo;

import com.example.demo.entities.Dev;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Hr;
import com.example.demo.entities.QA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Dev dev = context.getBean(Dev.class);
        QA qa = context.getBean(QA.class);
        Hr hr = context.getBean(Hr.class);

        System.out.printf("QA: %d\n", qa.getSalary());
        System.out.printf("HR: %d\n", hr.getSalary());
        System.out.printf("Dev: %d\n", dev.getSalary());

        System.out.printf("Dev Service: %s\n", dev.getMeetingService().getMeetingContext());
        System.out.printf("Qa Service: %s\n", qa.getMeetingService().getMeetingContext());
        System.out.printf("Dev Service: %s\n", hr.getMeetingService().getMeetingContext());

    }

}
