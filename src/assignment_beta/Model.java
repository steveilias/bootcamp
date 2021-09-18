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
public class Model {

    
    //Screen Strings
    String welcomeMsg = "Welcome to the Private School!";
    String choice = "Please enter a value from 1-3 if you want to: ";
    String choice1_1="1.  Enter manually entries (Press 1)";
    String choice1_2="2.  Show manually entries (Press 2)";
    String choice1_3="3.  Preview  assignments at a given date (Press 3)";
    String choice1_4="4. To print sample data values (press 4)";
   
    //Enter manually entries menu
    String manuallyEntriesInfo = " You are going to add  entries for the following entities:\n Course, Student, "
            + "Assignment, Trainers.\n If you dont want to proceed please press 0 to go back  else press 1"
            ;
    String successfullyEnterEntries = "You sucessfully enter entries!! ";
    //Show manual entries menu
    
    //Preview assignments Menu
    
    String showAssign = "To show all the assignments press 1";
    String showCourses="To show all the courses press 2";
    String showStudents="To show all the students press 3";
    String trainers="To show all the trainers press 4";
    
    
    //course
    String courseTitle = "insert course title";
    String courseStartDate = "insert course Start date dd-mm-yyyy";
    String courseEndDate = "insert course end date- dd-mm-yyyy";
    
    String contin = "Do you want to add other course?";

    //Student
    String StudentFname = "insert First name of the student";
    String StudentLname = "insert last name of the student";
    String studentDateOfBirth = "insert date of birth of the student “dd-mm-yyyy”";
    //trainer
    String trainerFname = "insert name of the Trainer";
    String trainerLname = "insert last name of the trainer";
    String trSubject = "insert the subject of the trainer";
    //assignment
    String assignmentTitle = "insert assignment title";
    String subDateTime = "insert course submision date dd-mm-yyyy";
    String totalMark = "insert course totalmark";

  
    //objects 
    Course javaCourse = new Course("JAVA", "19-5-19", "20-05-19");
    Course cShasrpCourse = new Course("c++", "19-5-19", "20-05-19");
    Course cssCourse= new Course("CSS", "19-5-19", "20-05-19");

    Student st1 = new Student("maria", "mpakodi", "111");
    Student st2 = new Student("georgia", "kostopoulou", "111");
    Student st3 = new Student("george", "mariopoulos", "111");
    Student st4 = new Student("george", "giorgopus", "111");

    Assignment assign1 = new Assignment("Assignment 1");
    Assignment assign2 = new Assignment("Assignment 2");
    Assignment assign3 = new Assignment("Assignment 3");
    Assignment assign4 = new Assignment("Assignment 4");

    Trainer tr1 = new Trainer("louis", "yhuet", "programming");
    Trainer tr2 = new Trainer("john", "newton", "computer sc.");
    Trainer tr3 = new Trainer("jim", "kole", "programming");
    Trainer tr4 = new Trainer("george", "aios", "Algebra");

}