package assignment_beta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class Logic {

    //String z = "exit";
    Model md = new Model();
    Scanner sc;
    Course course;
    Student student;
    Assignment assignment;
    Trainer trainer;
    List<Trainer> trainers = new ArrayList<>();
    List<Assignment> assignmentList = new ArrayList<>();
    Map<Student, List<Assignment>> student_Assignment_Course;// = new HashMap<>();

    //synthetic data
    List<Course> coursessyn;
    List<Trainer> trainerssyn;
    List<Assignment> assignssyn;
    List<Student> stsyn;
//---------------------------Menus

    /*if you press one you procees to add entries to entities, if you press 2, you print all bullet points with custom entries,if you press 3
    you preview assignments with specific date, if 4 then print all sample data*/
    void programMenu() {
        sc = new Scanner(System.in);
        printscr(md.welcomeMsg);
        printscr(md.choice);
        printscr(md.choice1_1);
        printscr(md.choice1_2);
        printscr(md.choice1_3);
        //printscr(md.choice1_4);
        int f = sc.nextInt();
        switch (f) {

            case 1:
                enterManuallyEntriesMenu(); //add entries to entities
                break;
            case 2:

                showManuallyEntriesMenu();  //print all bullets, show entries manually edited
                break;
            case 3:
                previewAsssignmentsMenu();  // show assignments in specific calendar date (last bullet point)
                break;
            case 4:
                //show sample data
                ShowSyntheticData();
        }
    }

//-----Enter manually entries Menu
    /*if you press o go back else if you press 1 proceed to add entities
     */
    public void enterManuallyEntriesMenu() {

        System.out.println("Enter manually entries Menu");
        sc = new Scanner(System.in);
        printscr(md.manuallyEntriesInfo);
        int ch = sc.nextInt();
        if (ch == 0) {
            programMenu();
        }
        if (ch == 1) {
            addEntities();
        }

    }
//-----Show manually entries Menu------------------

    public void showManuallyEntriesMenu() {
        System.out.println("Show manual entries Menu");
    }
//-----Preview assignments    

    public void previewAsssignmentsMenu() {

        System.out.println("Preview assignments Menu");
    }

    void printscr(String x) {
        System.out.println(x);
    }

    void exit() {
        System.out.println("GoodBye");
        sc.close();
    }

    /*  ------------------------------------------------------------
    "1.  Enter manually entries (Press 1)";
     2.  Show manually entries (Press 2)";
     3.  Preview  assignments at a given date (Press 3)";
    
     */
//manual entries    
//-------------------------------Enter manually entries (Press 1)";
    public void addEntities() {

        addCourse();
        addStudent();
        //addAssignment();
        addTrainer();
        //connectStudentAssign();
        printscr(md.successfullyEnterEntries);
        programMenu();
    }

    public void addCourse() {
        sc = new Scanner(System.in);
        System.out.println("---ENTER A COURSE---");
        System.out.println("Number of courses");
        printscr(md.courseTitle);
        String title = sc.nextLine();
        printscr(md.courseStartDate);
        String startDate = sc.nextLine();
        printscr(md.courseEndDate);
        String endDate = sc.nextLine();

// printscr(md.contin);
        course = new Course(title, startDate, endDate);
        coursessyn.add(course);
   
    }

    public void addStudent() {
        System.out.println("---ENTER A STUDENT---");
        printscr(md.StudentFname);
        String fname = sc.nextLine();
        printscr(md.StudentLname);
        String lname = sc.nextLine();
        printscr(md.studentDateOfBirth);
        String dateOfBirth = sc.nextLine();

        // contin();
        student = new Student(fname, lname, dateOfBirth);

    }

    public void addAssignment() {
        System.out.println("---ENTER AN ASSIGNMENT---");
        printscr(md.assignmentTitle);
        String title = sc.nextLine();
        printscr(md.subDateTime);
        String subDateTime = sc.nextLine();
        printscr(md.totalMark);
        String totalMark = sc.nextLine();
        printscr(md.contin);
        assignment = new Assignment(title);
        assignmentList.add(assignment);

    }

    public void addTrainer() {
        System.out.println("---ENTER A TRAINER---");
        printscr(md.trainerFname);
        String fname = sc.nextLine();
        printscr(md.trainerLname);
        String lname = sc.nextLine();
        printscr(md.trSubject);
        String subject = sc.nextLine();
        Trainer trainer = new Trainer(fname, lname, subject);

    }

    //synthetic data
    // --------------------------------ADD Synthetic Data--------------
    public void addSyntheticData() {
        //------create lists-----

        //Hashmap of assignments
        
        //courses lists
        coursessyn = new ArrayList<>();
        coursessyn.add(md.javaCourse);
        coursessyn.add(md.cssCourse);
        coursessyn.add(md.cShasrpCourse);

        //trainer lists
        trainerssyn = new ArrayList<>();//
        trainerssyn.add(md.tr1);
        trainerssyn.add(md.tr2);
        md.javaCourse.setTrainers(trainerssyn);
        //trainer list2
        ArrayList trainerssyn2 = new ArrayList<>();
        trainerssyn2.add(md.tr3);
        trainerssyn2.add(md.tr4);
        md.cShasrpCourse.setTrainers(trainerssyn2);
        //trainer list2
        ArrayList trainerssyn3 = new ArrayList<>();//
        trainerssyn3.add(md.tr2);
        trainerssyn3.add(md.tr4);
        md.cssCourse.setTrainers(trainerssyn3);

        //student list
        stsyn = new ArrayList<>();
        stsyn.add(md.st1);
        stsyn.add(md.st2);
        //student list 2
        ArrayList stsyn2 = new ArrayList<>();
        stsyn.add(md.st3);
        stsyn.add(md.st4);
        ArrayList stsyn3 = new ArrayList<>();
        stsyn3.add(md.st2);
        stsyn3.add(md.st1);

//    Asignment lists to course
        //Assignment list 1
        assignssyn = new ArrayList<Assignment>();
        ArrayList assignsyn2 = new ArrayList<>();
        ArrayList assignsyn3 = new ArrayList<>();
        assignssyn.add(md.assign1);
        assignssyn.add(md.assign2);
        student_Assignment_Course= new HashMap<Student, List<Assignment>>();
        student_Assignment_Course.put(md.st1, assignssyn);
        md.javaCourse.setStudent_Assignment_Course(student_Assignment_Course);
        
//assignment list2md.
        
        assignsyn2.add(md.assign3);
        assignsyn2.add(md.assign4);
        Map student_Assignment_Course2= new HashMap<Student, List<Assignment>>();
        student_Assignment_Course2.put(md.st2,assignsyn2 );
        md.cShasrpCourse.setStudent_Assignment_Course(student_Assignment_Course2);
        //assignment list 3

        assignsyn3.add(md.assign1);
        assignsyn3.add(md.assign3);
         Map student_Assignment_Course3= new HashMap<Student, List<Assignment>>();
        student_Assignment_Course3.put(md.st3,assignsyn3 );
          md.cssCourse.setStudent_Assignment_Course(student_Assignment_Course3);
    }

    //show synthetic data bullets part 1
    void ShowSyntheticData() {

        
//show all Students
    
System.out.println("Show all Students");
     for (Course crs : coursessyn) {
        //crs.getStudent_Assignment_Course().
           System.out.println(crs.getTitle());
        for(Student st0: crs.getStudent_Assignment_Course().keySet()){
            System.out.println(st0.toString());
        }}
//show all courses
        System.out.println("--SHOW ALL COURSES--");
        for (Course course1 : coursessyn) {
            System.out.println(course1);
        }

//show all assignments
        System.out.println("--SHOW ALL ASSIGNMENTS--");
        for (Course crs : coursessyn) {
            // System.out.println(crs);
            for (Assignment assgn : crs.getAssignList()) {
                System.out.println(assgn);
            }
        }
//show all trainers
        System.out.println("--SHOW ALL TRAINERS --");
        for (Course crs : coursessyn) {
            // System.out.println(crs);
            for (Trainer tr : crs.getTrainers()) {
                System.out.println(tr);
            }
        }

    }

    void ShowSyntheticData2() {

//show all trainers per course
        System.out.println("--SHOW ALL TRAINERS PER COURSE--");
       // List<Trainer> fdp = new ArrayList();
        for (Course crs : coursessyn) {
            System.out.println(crs); //print course
            for (Trainer tr : crs.getTrainers()) {
                //fdp.add(tr);
                //Set<Trainer> hashSet = new HashSet(fdp);
                System.out.println(tr);
//                Iterator iter = fdp.iterator();
//                while (iter.hasNext()) {
//                    System.out.println(iter.next());
//                }
            }
        }
//show all the assignents per student
     
System.out.println("Show all the assignments per student");
     for (Course crs : coursessyn) {
        //crs.getStudent_Assignment_Course().
           System.out.println(crs.getTitle());
        for(Student st: crs.getStudent_Assignment_Course().keySet()){
               System.out.println(st.toString()+ " "+ crs.getStudent_Assignment_Course().get(st));
               
     }
            
            
         //crs.setStudent_Assignment_Course(student_Assignment_Course);
        
        
    }

}}

//show all trainers per course
//        System.out.println("--SHOW ALL TRAINERS PER COURSE--");
//        List<Trainer> fdp = new ArrayList<Trainer>();
//        for (Course crs : coursessyn) {
//           // System.out.println(crs);
//            for (Trainer tr : crs.getTrainers()) {
//                fdp.add(tr);
//                        }
//        }
//               // Set<Trainer> hashSet = new LinkedHashSet(fdp);
// System.out.println(fdp);
//  System.out.println(tr);
//  System.out.println(listWithoutDuplicates);
//show all assignments per course
//        System.out.println("--SHOW ALL ASSIGNMENTS PER COURSE--");    
//        for (Course crs : coursessyn) {
//             System.out.println(crs);
//            for (Assignment assgn : crs.getAssignList()){
//                System.out.println(assgn);
//            }
//        }

