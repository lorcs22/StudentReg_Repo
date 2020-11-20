package com.mycompany.studentregistration;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lorca
 */
public class ModuleTest {
    //creating instance of module for testing
    private final String name = "Graphics";
    private final String id = "CT417";
    private final Module mod = new Module(name, id);
    
    //Testing getters & setters
    @Test
    public void testAccessorMethods(){
        assertEquals(name, mod.getMName());
        assertEquals(id, mod.getMId());
    }
    
    @Test
    public void testMutatorMethods(){
        mod.setMName(name);
        assertEquals(name, mod.mName);
        mod.setMId(id);
        assertEquals(id, mod.mID);
    }
    
    @Test
    public void testAddInfo(){
        Student stu = new Student();
        Course cour = new Course();
        //adding student and cour instances to module
       mod.addStudents(stu);
       mod.addCourses(cour);
        ArrayList<Student> stus = mod.getStudents();
        ArrayList<Course> cours = mod.getCourses();
        //checking if 1 instance of each have been added to Module
        assertEquals(1, stus.size());
        assertEquals(1, cours.size());
        
    }
    
}