/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistration;
import java.util.ArrayList;
import org.joda.time.*;



/**
 *
 * @author lorca
 */
public class Course {
    protected String cName;
    protected ArrayList<Module> modules;
    protected ArrayList<Student> students;
    protected LocalDate startDate;
    protected LocalDate endDate;

    public Course(String cName, LocalDate startDate, LocalDate endDate){
        this.cName = cName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    
    public Course(){
        
    }
    
    //Accessor Methods
    public String getCName(){
        return cName;
    }
    
    public ArrayList<Module> getModules(){
        return modules;
    }
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public LocalDate getStartDate(){
        return startDate;
    }
    
    public LocalDate getEndDate(){
        return endDate;
    }
    
    //mutator methods
    public void setCName(String cName){
        this.cName = cName;
    }
    
    public void setModules(ArrayList<Module> modules){
        this.modules = modules;
    }
    
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    
    public void addModules(Module mod){
        ArrayList<Module> addMod = modules;
        addMod.add(mod);
        setModules(addMod);
    }
    
    public void addStudents(Student stu){
        ArrayList<Student> addStu = students;
        addStu.add(stu);
        setStudents(addStu);
    }
    
}

