package com.cleanarchitecture.builders;

import com.cleanarchitecture.models.CPF;
import com.cleanarchitecture.models.Email;
import com.cleanarchitecture.models.Phone;
import com.cleanarchitecture.models.Student;

public class StudentBuilder {

    private Student student;

    public StudentBuilder cpf(CPF cpf) {
        student.setCpf(cpf);
        return this;
    }

    public StudentBuilder name(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder email(Email email) {
        student.setEmail(email);
        return this;
    }

    public StudentBuilder phone(Phone phone) {
        student.addPhone(phone);
        return this;
    }

    public Student create() {
        return this.student;
    }
}
