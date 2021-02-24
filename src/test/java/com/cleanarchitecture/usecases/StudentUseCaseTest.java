package com.cleanarchitecture.usecases;

import com.cleanarchitecture.fixtures.StudentFixture;
import com.cleanarchitecture.repositories.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class StudentUseCaseTest {

    final StudentRepository repository = mock(StudentRepository.class);
    final StudentUseCase usecase = new StudentUseCase(repository);

    @Test
    void shouldFindAllStudentsWithSuccess() {
        when(repository.findAll()).thenReturn(Collections.singletonList(StudentFixture.createBasic()));
        usecase.findAll();
        verify(repository, times(1)).findAll();
    }

    @Test
    void shouldReturnExceptionWhenTryToFindAllStudents() {
        when(repository.findAll()).thenReturn(null);
        Assertions.assertThrows(EntityNotFoundException.class, usecase::findAll);
        verify(repository, times(1)).findAll();
    }

}
