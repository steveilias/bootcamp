/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_beta;

import java.text.ParseException;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        //Controler contr = new Controler();
        //contr.menuChoice(); 

        Logic lg = new Logic();
        lg.addSyntheticData(); 
        lg.ShowSyntheticData2();
        //lg.showSampleCourses();
        //lg.showSampleTrainers();
        // lg.showSampleAssignments();
        //
    }

}
