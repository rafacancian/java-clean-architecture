package com.cleanarchitecture;

import com.cleanarchitecture.builders.StudentBuilder;
import com.cleanarchitecture.models.CPF;
import com.cleanarchitecture.models.Email;
import com.cleanarchitecture.models.Phone;
import com.cleanarchitecture.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder
                .cpf(new CPF("111.111.111.11"))
                .name("Rafael Cancian")
                .email(new Email("Rua 1 de maio"))
                .phone(new Phone("351", "913133300")).create();
        System.out.println(student);

    }

}
