package com.sna.spring_monthly_exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sna.spring_monthly_exam.repository")
public class SpringMonthlyExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMonthlyExamApplication.class, args);
    }

}
