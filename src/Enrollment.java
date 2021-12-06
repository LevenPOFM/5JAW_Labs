
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Enrollment {
    
    public int enrollmentId;
    public String dateEnrolled;
    public int grade;
    public int semester;

    public Enrollment(int enrollmentId, String dateEnrolled, int grade, int semester) {
        this.enrollmentId = enrollmentId;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public int getGrade() {
        return grade;
    }

    public int getSemester() {
        return semester;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    

    @Override
    public String toString() {
        return "Enrollment{" + "enrollmentId=" + enrollmentId + ", dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    // Enrollment IDs are unique.
    // Therefore, for 2 enrollments to ne equal they only need to have the same Enrollment ID.
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
        final Enrollment other = (Enrollment) obj;
        if (this.enrollmentId != other.enrollmentId) {
            return false;
        }
        return true;
    }
    
    
    
}
