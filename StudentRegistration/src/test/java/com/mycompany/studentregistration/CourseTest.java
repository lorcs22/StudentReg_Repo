/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistration;

import org.junit.Test;
import static org.junit.Assert.*;
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
    
    
    
}
