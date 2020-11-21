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
public class Module {
    protected String mName;
    protected String mID;
    protected ArrayList<Student> students;
    protected ArrayList<Course> courses;
    
    public Module(String mName, String mID){
        this.mName = mName;
        this.mID = mID;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    public Module(){
        
    }
    
    
    //accessor methods
    public String getMName(){
        return mName;
    }
    
    public String getMId(){
        return mID;
    }
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    //mutator methods
    public void setMName(String mName){
        this.mName = mName;
    }
    
    public void setMId(String mID){
        this.mID = mID;
    }
    
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    
    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
    
    //adding students and courses to Module function
    public void addStudents(Student stu){
        ArrayList<Student> addStu = students;
        addStu.add(stu);
        setStudents(addStu);
    }
    
    public void addCourses(Course cour){
        ArrayList<Course> addCour = courses;
        addCour.add(cour);
        setCourses(addCour);
    }
    
    @Override
    public String toString(){
        String s = " Module: "+mName;
        return s;
    }
}
