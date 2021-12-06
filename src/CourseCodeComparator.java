
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
public class CourseCodeComparator implements Comparator<Course>{

    @Override
    public int compare(Course c1, Course c2) {
        return (c1.getCourseCode() - c2.getCourseCode());
    }
    
}
