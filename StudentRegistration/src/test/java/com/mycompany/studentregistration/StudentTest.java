/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistration;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lorca
 */
public class StudentTest {
    //creating mock data for test class  
    private final String name = "Lorcan";
    private final int age = 22;
    private final String dob = "31/03/1998";
    private final int sID = 16422524;
    private final Student stu = new Student(name, age, dob, sID);

    /**
     * Test of get username methods, of class Student.
     */
    
    //test instance of Student class
    //using assertEquals to compare expected value with result
    @Test 
    public void createStudent(){
        Student stu = new Student(name ,  age,  dob,  sID);
        assertEquals(name, stu.name);
        assertEquals(age, stu.age);
        assertEquals(dob, stu.dob);
        assertEquals(sID, stu.sID);
    }
    
    //testing getUsername method
    @Test
    public void testGetUsername(){
        String username = stu.getUsername();
        assertEquals("Lorcan22", username);
    }
    
    //testing accessor and mutator methods
    @Test
    public void testAccessorMethods(){
        assertEquals(name, stu.getName());
        assertEquals(age, stu.getAge());
        assertEquals(sID, stu.getID());
        assertEquals(dob, stu.getDOB());
    }
    
    @Test
    public void testMutatorMethods(){
        stu.setAge(age);
        assertEquals(age, stu.age);
        stu.setName(name);
        assertEquals(name, stu.name);
        stu.setDOB(dob);
        assertEquals(dob, stu.dob);
        stu.setID(sID);
        assertEquals(sID, stu.sID);
    }
  
 
}
