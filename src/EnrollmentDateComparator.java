
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class EnrollmentDateComparator implements Comparator<Enrollment>{

    @Override
    public int compare(Enrollment e1, Enrollment e2) {
        return (e1.getDateEnrolled().compareTo(e2.getDateEnrolled()));
    }
    
}
