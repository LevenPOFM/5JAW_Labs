
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class S14_TestComparator {
    
    public static void main(String[] args) {
        
        // Checking Comparators
        // 1.) Courses
        // 2.) Enrollments
        // 3.) Students
        
        
         System.out.println("------------------------- Testing Course Comparator -------------------------");
        // Creating Courses. 
        Course c1 = new Course(5555, "Science", 400);
        Course c2 = new Course(3333, "SOSE", 59);
        Course c3 = new Course(1111, "Maths", 100);
        Course c4 = new Course(4444, "Engineering", 3000);
        Course c5 = new Course(2222, "English", 75);
        Course c6 = new Course(2222, "English", 75);
        
        // Creating a Hash Set of type course.
        // Checking if duplicate hash can be inserted. 
        // Attempting to add duplicate course C5 and C6
        Set<Course> CoursesHash = new HashSet<Course>();
        CoursesHash.add(c1);
        CoursesHash.add(c2);
        CoursesHash.add(c3);
        CoursesHash.add(c4);
        CoursesHash.add(c5);
        CoursesHash.add(c6);
        
        
        System.out.println("\n ---Creating a Course Hash Set and adding a duplicate / Should only add 5---");
        for (Course c : CoursesHash)
        {
            System.out.println(c);
        }
        
        // Adding courses to array.
        Course[] _courses = new Course[5];
        _courses[0] = c1;
        _courses[1] = c2;
        _courses[2] = c3;
        _courses[3] = c4;
        _courses[4] = c5;
        

        // Array is currently unsorted.
        System.out.println("\n---Before Sorting the Course Array---");
        
        for (Course c : _courses)
        {
            System.out.println(c);
        }
        
        // Sorting using CourseCodeComparator.
        System.out.println("\n---After Sorting by Course Code---");
        
        CourseCodeComparator ccc = new CourseCodeComparator();
        Arrays.sort(_courses, ccc);
        for (Course c : _courses)
        {
            System.out.println(c);
        }
        
        //---------------------------------------------------------------------
        
         System.out.println("\n------------------------- Testing Enrollment Comparator -------------------------");
        // Creating Enrollments. 
        Enrollment e1 = new Enrollment(4713, "1998", 100, 1);
        Enrollment e2 = new Enrollment(6123, "2004", 55, 2);
        Enrollment e3 = new Enrollment(9183, "1991", 85, 2);
        Enrollment e4 = new Enrollment(6821, "2020", 60, 1);
        Enrollment e5 = new Enrollment(2235, "1997", 89, 1);
        Enrollment e6 = new Enrollment(2235, "1997", 89, 1);
        
        // Creating a Hash Set of type course.
        // Checking if duplicate hash can be inserted. 
        // Attempting to add duplicate course C5 and C6
        Set<Enrollment> EnrollmentHash = new HashSet<Enrollment>();
        EnrollmentHash.add(e1);
        EnrollmentHash.add(e2);
        EnrollmentHash.add(e3);
        EnrollmentHash.add(e4);
        EnrollmentHash.add(e5);
        EnrollmentHash.add(e6);
        
        
        System.out.println("\n ---Creating a Course Hash Set and adding a duplicate / Should only add 5---");
        for (Course c : CoursesHash)
        {
            System.out.println(c);
        }
        
        
        // Adding courses to array. 
        Enrollment[] _enrollments = new Enrollment[5];
        _enrollments[0] = e1;
        _enrollments[1] = e2;
        _enrollments[2] = e3;
        _enrollments[3] = e4;
        _enrollments[4] = e5;
        
        
        System.out.println("\n ---Before Sorting the Enrollment Array---");
        
        for (Enrollment e : _enrollments)
        {
            System.out.println(e);
        }
        
        // Sorting using CourseCodeComparator.
        System.out.println("\n---After Sorting by Date Enrolled---");
        
        EnrollmentDateComparator edc = new EnrollmentDateComparator();
        Arrays.sort(_enrollments, edc);
        for (Enrollment e : _enrollments)
        {
            System.out.println(e);
        }
        
        //---------------------------------------------------------------------
        
        System.out.println("\n------------------------- Testing Student Comparator -------------------------");
        
        // Creating Enrollments. 
        Student s1 = new Student("SoftwareDev", 2020, 5555, "Michael", "kolev@gmail.com", 12345678);
        Student s2 = new Student("Culinary", 2019, 3333, "Daniel", "saunders@gmail.com", 2362342);
        Student s3 = new Student("Security", 2018, 4444, "Sasha", "test@gmail.com", 234623623);
        Student s4 = new Student("Science", 2021, 2222, "Nick", "kolev@gmail.com", 12378346);
        Student s5 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);
        Student s6 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);
        
        // Creating a Hash Set of type course.
        // Checking if duplicate hash can be inserted. 
        // Attempting to add duplicate course C5 and C6
        Set<Student> StudentHash = new HashSet<Student>();
        StudentHash.add(s1);
        StudentHash.add(s2);
        StudentHash.add(s3);
        StudentHash.add(s4);
        StudentHash.add(s5);
        StudentHash.add(s6);
        
        
        System.out.println("\n ---Creating a Student Hash Set and adding a duplicate / Should only add 5---");
        for (Course c : CoursesHash)
        {
            System.out.println(c);
        }
        
        // Adding courses to array. 
        Student[] _class = new Student[5];
        _class[0] = s1;
        _class[1] = s2;
        _class[2] = s3;
        _class[3] = s4;
        _class[4] = s5;
        
        System.out.println("\n---Before Sorting the Student Array---");
        
        for (Student s : _class)
        {
            System.out.println(s);
        }
        
        // Sorting using CourseCodeComparator.
        System.out.println("\n---After Sorting by Date Enrolled---");
        
        PersonIDComparator sic = new PersonIDComparator();
        Arrays.sort(_class, sic);
        for (Student s : _class)
        {
            System.out.println(s);
        }
        
        
        
    }
}
