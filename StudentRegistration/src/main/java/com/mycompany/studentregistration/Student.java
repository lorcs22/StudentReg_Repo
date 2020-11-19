/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistration;
import java.util.ArrayList;
 

/**
 *
 * @author lorca
 */
public class Student {
    protected String name;
    protected int age;
    protected String dob;
    protected int sID;
    protected ArrayList<Module> modules;
    protected ArrayList<Course> courses;
    
    //Student Constructor
    public Student(String name, int age, String dob, int sID){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.sID = sID;
        this.modules = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    public Student(){
        
    }
    
    //accessor methods
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getDOB(){
        return dob;
    }
    
    public int getID(){
        return sID;
    }
    
    public ArrayList<Module> getModules(){
        return modules;
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    public String getUsername(){
        return name + age;
    }
    
    //mutator methods
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setDOB(String dob){
        this.dob = dob;
    }
    
    public void setID(int sID){
        this.sID = sID;
    }
    
    public void setModule(ArrayList<Module> modules){
        this.modules = modules;
    }
    
    public void setCourse(ArrayList<Course> courses){
        this.courses = courses;
    }
    
    //setting & adding modules / courses to the array lists in Student
    public void addModule(Module mod){
        ArrayList<Module> addMod = modules;
        addMod.add(mod);
        setModule(addMod);
    }
    
     public void addCourse(Course cour){
     ArrayList<Course> addCour = courses;
     addCour.add(cour);
     setCourse(addCour);
    }
    
}

