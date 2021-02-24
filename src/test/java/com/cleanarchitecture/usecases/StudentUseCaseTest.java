package com.cleanarchitecture.usecases;

import com.cleanarchitecture.fixtures.StudentFixture;
import com.cleanarchitecture.gateways.StudentGateway;
import com.cleanarchitecture.gateways.StudentGatewayImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class StudentUseCaseTest {

    final StudentGateway studentGateway = mock(StudentGatewayImpl.class);
    final StudentUseCase usecase = new StudentUseCase(studentGateway);

    @Test
    void shouldFindAllStudentsWithSuccess() {
        when(studentGateway.findAll()).thenReturn(Collections.singletonList(StudentFixture.createBasic()));
        usecase.findAll();
        verify(studentGateway, times(1)).findAll();
    }

    @Test
    void shouldReturnExceptionWhenTryToFindAllStudents() {
        when(studentGateway.findAll()).thenReturn(null);
        Assertions.assertThrows(EntityNotFoundException.class, usecase::findAll);
        verify(studentGateway, times(1)).findAll();
    }

}
