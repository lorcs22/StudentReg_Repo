/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistration;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.joda.time.*;

/**
 *
 * @author lorcan
 */
public class CourseTest {
    
     //creating instance of course for testing
    private final String name = "ECE";
    private final LocalDate startDate = new LocalDate(2020, 7, 8);
    private final LocalDate endDate = new LocalDate(2020, 5, 25);
    private final Course cour = new Course(name, startDate, endDate);
    
    //testing accessor and mutator methods
    @Test
    public void testAccessorMethods(){
        assertEquals(name, cour.getCName());
        assertEquals(startDate, cour.getStartDate());
        assertEquals(endDate, cour.getEndDate());
    }
    
    @Test
    public void testMutatorMethods(){
        cour.setCName(name);
        assertEquals(name, cour.cName);
        cour.setStartDate(startDate);
        assertEquals(startDate, cour.startDate);
        cour.setEndDate(endDate);
        assertEquals(endDate, cour.endDate);
    }
    
    // testing the arraylist functions that add student and modules to course
    @Test
    public void testAddInfo(){
        Student stu = new Student();
        Module mod = new Module();
        
        //adding stu and mod instances to course instance
        cour.addModules(mod);
        cour.addStudents(stu);
        
        ArrayList<Student> stus = cour.getStudents();
        ArrayList<Module> mods = cour.getModules();
        //test if 1 instance of each has been added to course
        assertEquals(1, stus.size());
        assertEquals(1, mods.size());
        
        
        
    }
    
}
