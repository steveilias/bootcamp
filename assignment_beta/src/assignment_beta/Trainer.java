/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_beta;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class Trainer {

    String fName;
    String lName;
    String subject;

    public Trainer(String fName, String lName, String subject) {
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "fName=" + fName + ", lName=" + lName + ", subject=" + subject + '}';
    }

  
    
}
