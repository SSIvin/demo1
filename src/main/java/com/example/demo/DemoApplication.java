package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("привет");

        System.out.println("master-commit1");
        System.out.println("master-commit1");

        System.out.println("branch2-commit1");
        System.out.println("branch2-commit1");

        System.out.println("branch2-commit2");
        System.out.println("branch2-commit2");


    }



}
