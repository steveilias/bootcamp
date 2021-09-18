/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_beta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class Student {
    private String fName;
    private String lName;
    private String dateOfBirth;
   // private ArrayList<Assignment> assignmentOfStudent;
   
    
    public Student(String fName, String lName, String dateOfBirth) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
      //  this.assignmentOfStudents = assignmentOfStudents;
    }
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", lName=" + lName + ", dateOfBirth=" + dateOfBirth + '}';
    }

   
    
    
    
}
