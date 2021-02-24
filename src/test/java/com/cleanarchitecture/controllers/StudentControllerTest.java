package com.cleanarchitecture.controllers;

import com.cleanarchitecture.dtos.StudentDTO;
import com.cleanarchitecture.fixtures.StudentDTOFixture;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = StudentController.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private StudentController studentController;

    ResponseEntity responseOk;
    ResponseEntity responseCreate;

    final StudentDTO studentDTO = StudentDTOFixture.createBasic();

    @BeforeEach
    public void setup() {
        responseOk = new ResponseEntity<>(StudentDTOFixture.createBasic(), HttpStatus.OK);
        responseCreate = new ResponseEntity<>(StudentDTOFixture.createBasic(), HttpStatus.CREATED);
    }

    @Test
    void shouldFindAllStudentWhenTheURLIsValid() throws Exception {
        when(studentController.findAll()).thenReturn(responseOk);
        this.mvc.perform(get("/students"))
                .andExpect(status().isOk());
        verify(studentController, times(1)).findAll();
    }

    @Test
    void shouldCreateStudentWhenTheURLIsValid() throws Exception {
        when(studentController.create(studentDTO)).thenReturn(responseCreate);
        this.mvc.perform(post("/students")
                .content(asJsonString(studentDTO))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
        verify(studentController, times(1)).create(studentDTO);
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
