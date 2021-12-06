
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Course {
    
    public int courseCode;
    public String courseName;
    public int cost;

    public Course(int courseCode, String courseName, int cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.courseCode;
        hash = 83 * hash + Objects.hashCode(this.courseName);
        hash = 83 * hash + this.cost;
        return hash;
    } 

    
    // Course codes are unique.
    // Therefore, for 2 courses to e equal they only need to have the same course code.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode) {
            return false;
        }
        return true;
    }
    
    
    
}
