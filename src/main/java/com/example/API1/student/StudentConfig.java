package com.example.API1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maraiam=new Student(
                "Mariam",
                "Mariam.jamal@gmail.com",
                LocalDate.of(2000, JANUARY,5)
        );
            Student alex=new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2004, JANUARY,5)
            );
            studentRepository.saveAll(
                    List.of(maraiam,alex)
            );

        };
    }

}
