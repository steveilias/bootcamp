/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_beta;

import java.util.List;
import java.util.Map;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class Course {

    private String title;
    private String Stream;
    private String type;
    private String startDate;
    private String endDate;
    List<Trainer> trainers;//
    List <Assignment> assignList;
    List<Student> students;
  
    
            
    //List of map<Student> student;
    private Map<Student, List<Assignment>> student_Assignment_Course;

    public Course(String title, String startDate, String endDate) {
        this.title = title;
        //this.Stream = Stream;
        //this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainers = trainers;
        //this.student_Assignment_Course = student_Assignment_Course;
    }
  public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return Stream;
    }

    public void setStream(String Stream) {
        this.Stream = Stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public List<Assignment> getAssignList() {
        return assignList;
    }

    public void setAssignList(List<Assignment> assignList) {
        this.assignList = assignList;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<Student, List<Assignment>> getStudent_Assignment_Course() {
        return student_Assignment_Course;
    }

    public void setStudent_Assignment_Course(Map<Student, List<Assignment>> student_Assignment_Course) {
        this.student_Assignment_Course = student_Assignment_Course;
    }

  



    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", Stream=" + Stream + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

}


