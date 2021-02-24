package com.cleanarchitecture.gateways;

import com.cleanarchitecture.fixtures.StudentFixture;
import com.cleanarchitecture.repositories.StudentRepository;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.mockito.Mockito.*;

public class StudentGatewayImplTest {

    final StudentRepository repository = mock(StudentRepository.class);
    final StudentGateway studentGateway = new StudentGatewayImpl(repository);

    @Test
    void shouldFindAllStudentsWithSuccess() {
        when(repository.findAll()).thenReturn(Collections.singletonList(StudentFixture.createBasic()));
        studentGateway.findAll();
        verify(repository, times(1)).findAll();
    }

    @Test
    void shouldReturnExceptionWhenTryToFindAllStudents() {
        when(repository.findAll()).thenReturn(null);
        studentGateway.create(StudentFixture.createBasic());
        verify(repository, times(0)).findAll();
    }

}
