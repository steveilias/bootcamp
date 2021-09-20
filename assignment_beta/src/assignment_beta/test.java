///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package assignment_beta;
//
///**
// *
// * @author eliaspanagiotopoulos
// */
///
//public class NewClass {
//    
//}
//package assignment_beta;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.WeekFields;
//import java.util.ArrayList;
//import java.util.Arrays;
//import static java.util.Collections.list;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Locale;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;
//
///**
// *
// * @author eliaspanagiotopoulos
// */
//public class Logic {
//
//    Model md = new Model();
//    Scanner sc;
//    Course course;
//    Student student;
//    Assignment assignment;
//    Trainer trainer;
//    List<Trainer> trainers = new ArrayList<>();
//    List<Assignment> assignmentList = new ArrayList<>();
//    Map<Student, List<Assignment>> student_Assignment_Course;// = new HashMap<>();
//    List<Course> coursessyn;
//    List<Trainer> trainerssyn;
//    List<Assignment> assignssyn;
//    List<Student> stsyn;
//    LocalDate date1, date2;
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
////---------------------------Menus----------------------
//
//    /*if you press one you procees to add entries to entities, if you press 2, you print all bullet points with custom entries,if you press 3
//    you preview assignments with specific date, if 4 then print all sample data*/
//    void programMenu() {
//        sc = new Scanner(System.in);
//        printscr(md.welcomeMsg);
//        printscr(md.choice);
//        printscr(md.choice1_1);
//        printscr(md.choice1_2);
//        printscr(md.choice1_3);
//        printscr(md.choice1_4);
//        //printscr(md.choice1_4);
//        int f = sc.nextInt();
//        switch (f) {
//
//            case 1:
//                enterManuallyEntriesMenu(); //add entries to entities
//                break;
//            case 2:
//
//                showManuallyEntriesMenu();  //print all bullets, show entries manually edited
//                break;
//            case 3:
//                previewAsssignmentsonDateMenu();  // show assignments in specific calendar date (last bullet point)
//                break;
//            case 4:
//                //show sample data
//                addSyntheticData();
//                ShowSyntheticData();
//                  ShowSyntheticData2();
//        }
//    }
//
////-----Enter manually entries Menu
//    /*if you press o go back else if you press 1 proceed to add entities
//     */
//    public void enterManuallyEntriesMenu() {
//
//        System.out.println("Enter manually entries Menu");
//        sc = new Scanner(System.in);
//        printscr(md.manuallyEntriesInfo);
//        int ch = sc.nextInt();
//        if (ch == 0) {
//            programMenu();
//        }
//        if (ch == 1) {
//            addEntities();
//        }
//
//    }
////-----Show manually entries Menu------------------
//
//    public void showManuallyEntriesMenu() {
//        System.out.println("Show manual entries Menu");
//    }
////-----Preview assignments    
//
//    public void previewAsssignmentsonDateSynthetic() {
//
////        System.out.println("Enter a date for assignments on the same calendar week in format: d/MM/yyyy)");
////        sc = new Scanner(System.in);
////        String date2 = sc.next();
//       Boolean assignn=false;
////        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
//       //String dateInput = "
//       
//       String date2 ="17/08/2017";
////        //convert String to LocalDate
//      //  LocalDate localDate3 = LocalDate.parse(dateInput, formatter);
//        LocalDate localDate2 = LocalDate.parse(date2, formatter);
//        for (Course crs : coursessyn) {
//
//            for (Student st : crs.getStudent_Assignment_Course().keySet()) {
//                for (List<Assignment> listt : crs.getStudent_Assignment_Course().values()) {
//                    ListIterator<Assignment> itr = listt.listIterator();
//                    while (itr.hasNext()) {
//                        String st2 = itr.next().getSubDateTime();
//                        String title= itr.next().getTitle();
//                        LocalDate localDate1 = LocalDate.parse(st2, formatter);
//                        if ((dateFunction(localDate1, localDate2)) == true) {
//                           // assignn=true;
//                            System.out.println(st.getfName()+" " +st.getlName()+ " Assignment date on: "+ localDate1 +" Assignment title: "+title);
//
//                        }
//                    }
//                }
//
//            }
//        }if (assignn==false){
//            System.out.println("No users in specific date");
//        }
//   
//    
//    }
//
//    public void previewAsssignmentsonDateMenu() {
//        System.out.println("If you want to enter date based on synthetic data press 1");
//        System.out.println("If you want to enter date based on manual entries press 2");
//        Scanner sc = new Scanner(System.in);
//        int ch = sc.nextInt();
//        if (ch == 1) {
//            addSyntheticData();
//            previewAsssignmentsonDateSynthetic();
//        
//        }
//        if (ch == 2) {
//            previewAsssignmentsonDateSynthetic();
//        }
//
//    }
//
//    void printscr(String x) {
//        System.out.println(x);
//    }
//
//    void exit() {
//        System.out.println("GoodBye");
//        sc.close();
//    }
//
//    /*  ------------------------------------------------------------
//    "1.  Enter manually entries (Press 1)";
//     2.  Show manually entries (Press 2)";
//     3.  Preview  assignments at a given date (Press 3)";
//    
//     */
////manual entries    
////-------------------------------Enter manually entries (Press 1)";
//    public void addEntities() {
//
//        addCourse();
//        addStudent();
//        //addAssignment();
//        addTrainer();
//        //connectStudentAssign();
//        printscr(md.successfullyEnterEntries);
//        programMenu();
//    }
//
//    public void addCourse() {
//        sc = new Scanner(System.in);
//        System.out.println("---ENTER A COURSE---");
//        System.out.println("Number of courses");
//        printscr(md.courseTitle);
//        String title = sc.nextLine();
//        printscr(md.courseStartDate);
//        String startDate = sc.nextLine();
//        printscr(md.courseEndDate);
//        String endDate = sc.nextLine();
//
//// printscr(md.contin);
//        //   course = new Course(title, startDate, endDate);
//        coursessyn.add(course);
//
//    }
//
//    public void addStudent() {
//        System.out.println("---ENTER A STUDENT---");
//        printscr(md.StudentFname);
//        String fname = sc.nextLine();
//        printscr(md.StudentLname);
//        String lname = sc.nextLine();
//        printscr(md.studentDateOfBirth);
//        String dateOfBirth = sc.nextLine();
//
//        // contin();
//        student = new Student(fname, lname, dateOfBirth);
//
//    }
//
//    public void addAssignment() {
//        System.out.println("---ENTER AN ASSIGNMENT---");
//        printscr(md.assignmentTitle);
//        String title = sc.nextLine();
//        printscr(md.subDateTime);
//        String subDateTime = sc.nextLine();
//        printscr(md.totalMark);
//        String totalMark = sc.nextLine();
//        printscr(md.contin);
//        //assignment = new Assignment(title);
//        assignmentList.add(assignment);
//
//    }
//
//    public void addTrainer() {
//        System.out.println("---ENTER A TRAINER---");
//        printscr(md.trainerFname);
//        String fname = sc.nextLine();
//        printscr(md.trainerLname);
//        String lname = sc.nextLine();
//        printscr(md.trSubject);
//        String subject = sc.nextLine();
//        // Trainer trainer = new Trainer(fname, lname, subject);
//
//    }
//
//    //synthetic data
//    // --------------------------------ADD Synthetic Data--------------
//    public void addSyntheticData() {
//        //------create lists-----
//
//        //Hashmap of assignments
//        //courses lists
//        coursessyn = new ArrayList<>();
//        coursessyn.add(md.javaCourse);
//        coursessyn.add(md.cssCourse);
//        coursessyn.add(md.cShasrpCourse);
//
//        //trainer lists
//        trainerssyn = new ArrayList<>();//
//        trainerssyn.add(md.tr1);
//        trainerssyn.add(md.tr2);
//         trainerssyn.add(md.tr3);
//          trainerssyn.add(md.tr4);
//        md.javaCourse.setTrainers(trainerssyn);
//        //trainer list2
//        ArrayList trainerssyn2 = new ArrayList<>();
//        trainerssyn2.add(md.tr3);
//        trainerssyn2.add(md.tr4);
//        md.cShasrpCourse.setTrainers(trainerssyn2);
//        //trainer list2
//        ArrayList trainerssyn3 = new ArrayList<>();//
//        trainerssyn3.add(md.tr2);
//        trainerssyn3.add(md.tr4);
//        md.cssCourse.setTrainers(trainerssyn3);
//
//        //student list
//        stsyn = new ArrayList<>();
//        stsyn.add(md.st1);
//        stsyn.add(md.st2);
//        //student list 2
//        ArrayList stsyn2 = new ArrayList<>();
//        stsyn2.add(md.st3);
//        stsyn2.add(md.st4);
//        ArrayList stsyn3 = new ArrayList<>();
//        stsyn3.add(md.st2);
//        stsyn3.add(md.st1);
//
////    Asignment lists to course
//        //Assignment list 1
//        assignssyn = new ArrayList<>();
//        ArrayList assignsyn2 = new ArrayList<>();
//        ArrayList assignsyn3 = new ArrayList<>();
//         ArrayList assignsyn4 = new ArrayList<>();
//        assignssyn.add(md.assign1);
//        assignsyn2.add(md.assign2);
//        assignsyn3.add(md.assign3);
//        assignsyn2.add(md.assign4);
//        student_Assignment_Course = new HashMap<Student, List<Assignment>>();
//        student_Assignment_Course.put(md.st1, assignssyn);
//        student_Assignment_Course.put(md.st3, assignsyn3);
//        student_Assignment_Course.put(md.st2, assignsyn2);
//        student_Assignment_Course.put(md.st4, assignsyn4);
//        md.javaCourse.setStudent_Assignment_Course(student_Assignment_Course);
//
////assignment list2md.
//        assignsyn2.add(md.assign3);
//        assignsyn2.add(md.assign4);
//        Map student_Assignment_Course2 = new HashMap<>();
//        student_Assignment_Course2.put(md.st2, assignsyn2);
//        md.cShasrpCourse.setStudent_Assignment_Course(student_Assignment_Course2);
//        //assignment list 3
//
//        assignsyn3.add(md.assign1);
//        assignsyn3.add(md.assign3);
//        Map student_Assignment_Course3 = new HashMap<Student, List<Assignment>>();
//        student_Assignment_Course3.put(md.st3, assignsyn3);
//        md.cssCourse.setStudent_Assignment_Course(student_Assignment_Course3);
//    }
//
//    //show synthetic data bullets part 1
//    void ShowSyntheticData() {
//
//  System.out.println("|------------------------------------------|");
//    Set<Student> studdd= new HashSet<>();
////show all Students
//        System.out.println("Show all Students:");
//        for (Course crs : coursessyn) {
//            //crs.getStudent_Assignment_Course().
//            //System.out.println(crs.getTitle());
//            for (Student st0 : crs.getStudent_Assignment_Course().keySet()) {
//               // System.out.println(st0);
//           studdd.add(st0);
//            
//            
//            }
//        }System.out.println(studdd);
//        System.out.println("|------------------------------------------|");
////show all courses
//        System.out.println("--SHOW ALL COURSES--");
//        for (Course course1 : coursessyn) {
//            System.out.println(course1);
//        }
//        System.out.println("|------------------------------------------|");
//        
//        
//        
////show all assignments
//        System.out.println("--SHOW ALL ASSIGNMENTS--");
//        Set<Assignment> assgnm= new HashSet<>();
//
//        for (Course crs : coursessyn) {
//            
//           for (Student st0 : crs.getStudent_Assignment_Course().keySet()) {
//            for (List<Assignment> listt : crs.getStudent_Assignment_Course().values()) {
//                    ListIterator<Assignment> itr = listt.listIterator();
//                    while (itr.hasNext()) {
//                       assgnm.add(itr.next());
//                    }
//            }
//        }}System.out.println(assgnm);
//    
//    
//        System.out.println("|------------------------------------------|");
////show all trainers
//        System.out.println("--SHOW ALL TRAINERS --");
//        Set<Trainer> tr2= new HashSet<>();
//        for (Course crs : coursessyn) {
//            // System.out.println(crs);
//            //Set<Trainer> tr2= new HashSet<>();
//            for (Trainer tr : crs.getTrainers()) {
//                tr2.add(tr);
//                //System.out.println(tr);
//            
//           }
//        }
//System.out.println(tr2);
//    }
//
//    //Assignment bullets parts 2
//    void ShowSyntheticData2() {
//
////show all trainers per course
//        System.out.println("--SHOW ALL TRAINERS PER COURSE--");
//        for (Course crs : coursessyn) {
//            System.out.println(crs); //print course
//            for (Trainer tr : crs.getTrainers()) {
//                //Set<Trainer> hashSet = new HashSet(fdp);
//                System.out.println(tr);
//            }
//        }
//        System.out.println("|------------------------------------------|");
//       
//        //show all assignment per course
//        Set<Assignment> setas = new HashSet<>();
//        System.out.println("--SHOW ALL Assignments PER COURSE--");
//        for (Course crse : coursessyn) {
//            System.out.println(crse.getTitle());
//            for (Student st : crse.getStudent_Assignment_Course().keySet()) {
//                for (List<Assignment> listt : crse.getStudent_Assignment_Course().values()) {
//                    ListIterator<Assignment> itr = listt.listIterator();
//                    while (itr.hasNext()) {
//                       //System.out.println(itr.next().toString());
//                    setas.add(itr.next());
//                    }
//        }} System.out.println(setas);}
//           
//        System.out.println("|------------------------------------------|");
//        //show all the assignments per course
//        System.out.println("--SHOW ALL  students per COURSE--");
//
//        for (Course crs : coursessyn) {
//            //crs.getStudent_Assignment_Course().
//            System.out.println(crs.getTitle());
//            for (Student st : crs.getStudent_Assignment_Course().keySet()) {
//                System.out.println(st.toString());
//
//            }
//        }
//        System.out.println("|------------------------------------------|");
////a list of students that belong to more than one courses    
//        System.out.println("a list of students that belong to more than one courses:");
//        List<Student> abc = new ArrayList<>();
//        //find duplicates
//        for (Course crs : coursessyn) {
//
//            for (Student st : crs.getStudent_Assignment_Course().keySet()) {
//                //List<Student> abc= new ArrayList<>();
//                abc.add(st);
//            }
//        }
//        Set<Student> set = new HashSet<>();
//        for (int i = 0; i < abc.size(); i++) {
//            if (set.contains(abc.get(i))) {
//                System.out.println(abc.get(i) + " duplicate");
//            } else {
//                set.add(abc.get(i));
//            }
//        }
//
//        System.out.println("|------------------------------------------|");
//
////show all the assignents per student
//        System.out.println("Show all the assignments per student");
//        for (Course crs : coursessyn) {
//            //crs.getStudent_Assignment_Course().
//            System.out.println(crs.getTitle());
//            for (Student st : crs.getStudent_Assignment_Course().keySet()) {
//                System.out.println(st.toString() + " " + crs.getStudent_Assignment_Course().get(st));
//
//            }
//
//        }
//
//    }
//
//    //is the date in the same calendar week?
//    public boolean dateFunction(LocalDate date1, LocalDate date2) {
//        boolean f = false;
//        WeekFields weekFields = WeekFields.of(Locale.getDefault());
//        //find calendar week for each dates
//        int firstDatesCalendarWeek = date1.get(weekFields.weekOfWeekBasedYear());
//        int secondDatesCalendarWeek = date2.get(weekFields.weekOfWeekBasedYear());
//        //week based year
//        int firstWeekBasedYear = date1.get(weekFields.weekBasedYear());
//        int secondWeekBasedYear = date2.get(weekFields.weekBasedYear());
//        //System.out.println(firstWeekBasedYear);
//
//        return firstDatesCalendarWeek == secondDatesCalendarWeek
//                && firstWeekBasedYear == secondWeekBasedYear;
//    }
//}
//*/