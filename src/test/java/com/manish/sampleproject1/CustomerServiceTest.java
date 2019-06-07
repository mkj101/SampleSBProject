package com.manish.sampleproject1;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.manish.sampleproject1.dao.StudentDao;
import com.manish.sampleproject1.entity.Student;
import com.manish.sampleproject1.service.StudentServiceimpl;

public class CustomerServiceTest {

	@Mock
    private StudentDao daoMock;

    @InjectMocks
    /*Mockito will try to inject mocks only either by constructor injection, setter injection, or property injection in order and as described below.*/
    private StudentServiceimpl service;

    @Before
    /*The @Before methods of super classes will run before those of the current class, unless they are overridden in the current class.*/
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
    }

     @Test
        public void testAddStudent_returnsNewStudent() {

            when(daoMock.save(Mockito
            		.any(Student.class))).thenReturn(new Student());

            Student student = new Student();
            student.setName("manish");
            student.setId(101);
            assertThat(service.addStudent(student), is(notNullValue()));
           
        }


	//Throwing an exception from the mocked method
     @Test(expected = RuntimeException.class)
        public void testAddStudent_throwsException() {

            when(daoMock.save(Mockito.any(Student.class))).thenThrow(RuntimeException.class);

            Student student = new Student();

            service.addStudent(student );//
           
        }
}