package com.cleanarchitecture.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "student")
public class StudentDTO implements Serializable {

    private String cpf;
    private String name;
    private String email;
    //private PhoneDTO phone;
    private List<PhoneDTO> phones;
}






