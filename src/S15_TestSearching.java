/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;


/**
 *
 * @author Michael
 */
public class S15_TestSearching {
    
    public static void main(String[] args) {
        
        System.out.println("----------- Testing Linear Searching Methods on Students ----------- ");
        
        // Creating an unsorted array of students.
        ArrayList<Student> studentList = new ArrayList();
        
        Student s1 = new Student("SoftwareDev", 2020, 5555, "Michael", "kolev@gmail.com", 12345678);
        Student s2 = new Student("Culinary", 2019, 3333, "Daniel", "saunders@gmail.com", 2362342);
        Student s3 = new Student("Security", 2018, 4444, "Sasha", "test@gmail.com", 234623623);
        Student s4 = new Student("Science", 2021, 2222, "Nick", "kolev@gmail.com", 12378346);
        Student s5 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);
        
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        
        
        // Testing Linear Search
        System.out.println("Searching for student ID 1111, should return a Student object if found " + studentLinearSearch(studentList, 1111));
        System.out.println("Searching for student ID 0, should return null if not found: " + studentLinearSearch(studentList, 0));
        
        // Testing Binary Search
        
        System.out.println("Searching for student ID 5555, should return its index of 4: " + studentBinarySearch(studentList, 5555));
        System.out.println("Searching for student ID 0, should return -1 (Not Found): " + studentBinarySearch(studentList, 0));
        
        //----------------------------------------------------------------------
        
        System.out.println("\n----------- Testing Linear Searching Methods on Courses ----------- ");
        
        // Creating an unsorted array of courses.
        ArrayList<Course> courseList = new ArrayList();
        
        Course c1 = new Course(5555, "Science", 400);
        Course c2 = new Course(3333, "SOSE", 59);
        Course c3 = new Course(1111, "Maths", 100);
        Course c4 = new Course(4444, "Engineering", 3000);
        Course c5 = new Course(2222, "English", 75);
        
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        courseList.add(c4);
        courseList.add(c5);
        
        // Testing Linear Search
        System.out.println("Searching for Course ID 3333, should return a course object if found: " + courseLinearSearch(courseList, 3333));
        System.out.println("Searching for Course ID 0, should return null if not found: " + courseLinearSearch(courseList, 0));
        
        // Testing Binary Search
        System.out.println("Searching for Course Code 1111, should return its index of 0: " + courseBinarySearch(courseList, 1111));
        System.out.println("Searching for Course Code 0, should return -1 (Not Found): " + courseBinarySearch(courseList, 0));
        
        //----------------------------------------------------------------------
        
         System.out.println("\n----------- Testing Linear Searching Methods on Enrollments ----------- ");
        
        // Creating an unsorted array of courses.
        ArrayList<Enrollment> enrollmentList = new ArrayList();
        
        Enrollment e1 = new Enrollment(4713, "1998", 100, 1);
        Enrollment e2 = new Enrollment(6123, "2004", 55, 2);
        Enrollment e3 = new Enrollment(9183, "1991", 85, 2);
        Enrollment e4 = new Enrollment(6821, "2020", 60, 1);
        Enrollment e5 = new Enrollment(2235, "1997", 89, 1);
        
        enrollmentList.add(e1);
        enrollmentList.add(e2);
        enrollmentList.add(e3);
        enrollmentList.add(e4);
        enrollmentList.add(e5);
        
        // Testing Linear Search
        System.out.println("Searching for Enrollment ID 9183, should return a enrollment object if found: " + enrollmentLinearSearch(enrollmentList, 3333));
        System.out.println("Searching for Enrollment ID 0, should return null if not found: " + enrollmentLinearSearch(enrollmentList, 0));
        
        // Testing Binary Search
        System.out.println("Searching for Enrollment ID 6821, should return its index of 3: " + enrollmentBinarySearch(enrollmentList, 6821));
        System.out.println("Searching for Enrollment ID 0, should return -1 (Not Found): " + enrollmentBinarySearch(enrollmentList, 0));
        
        

    }
    
    // Linear Search Algorithms -----------------------------------------------
    
    public static Student studentLinearSearch(ArrayList<Student> studentList, int targetID)
        {
            for (Student student : studentList){
                if (student.getId() == targetID) {
                    return student;
                }
            }
            return null; // Not Found
            
        }
    
    public static Course courseLinearSearch(ArrayList<Course> courseList, int targetID)
        {
            for (Course course : courseList){
                if (course.getCourseCode() == targetID) {
                    return course;
                }
            }
            return null; // Not Found
            
        }
    
     public static Enrollment enrollmentLinearSearch(ArrayList<Enrollment> enrollmentList, int targetID)
        {
            for (Enrollment enrollment : enrollmentList){
                if (enrollment.getEnrollmentId() == targetID) {
                    return enrollment;
                }
            }
            return null; // Not Found
            
        }
    
     // Binary Search Algorithms -----------------------------------------------
     
     public static int studentBinarySearch(ArrayList<Student> studentList, int targetID) {
         // Minimum and maximum array indexes.
         int min = 0;
         int N = studentList.size();
         int max = N - 1;
         int compareID = 0;
        
         // Creating a new comparator to sort by.
         // Binary searches require the array to be sorted beforehand. 
         PersonIDComparator sic = new PersonIDComparator();
         studentList.sort(sic);
         
         // Each iteration of this while loop will increase modify the size of min or max.
         // If the id is greater, min increases.
         // If the ID is smaller, max decreases.
         while (min <= max) {
             int mid = (min + max) / 2;
             compareID = studentList.get(mid).getId();
             
             if (targetID > compareID) {
                min = mid + 1;
             } if (targetID < compareID){
                 max = mid -1;
             }
             
             // If the ID is found, the index if returned.
             if (targetID == compareID) {
                 return mid;
             }
         }
         // Returns -1 if not found. 
         return -1;
     }
     
     public static int courseBinarySearch(ArrayList<Course> courseList, int targetID) {
         // Minimum and maximum array indexes.
         int min = 0;
         int N = courseList.size();
         int max = N - 1;
         int compareID = 0;
        
         // Creating a new comparator to sort by.
         // Binary searches require the array to be sorted beforehand. 
         CourseCodeComparator ccc = new CourseCodeComparator();
         courseList.sort(ccc);
         
         // Each iteration of this while loop will increase modify the size of min or max.
         // If the id is greater, min increases.
         // If the ID is smaller, max decreases.
         while (min <= max) {
             int mid = (min + max) / 2;
             compareID = courseList.get(mid).getCourseCode();
             
             if (targetID > compareID) {
                min = mid + 1;
             } if (targetID < compareID){
                 max = mid -1;
             }
             
             // If the ID is found, the index if returned.
             if (targetID == compareID) {
                 return mid;
             }
         }
         // Returns -1 if not found. 
         return -1;
     }
     
     public static int enrollmentBinarySearch(ArrayList<Enrollment> enrollmentList, int targetID) {
         // Minimum and maximum array indexes.
         int min = 0;
         int N = enrollmentList.size();
         int max = N - 1;
         int compareID;
        
         // Creating a new comparator to sort by.
         // Binary searches require the array to be sorted beforehand. 
         EnrollmentCodeComparator ecc = new EnrollmentCodeComparator();
         enrollmentList.sort(ecc);
         
         // Each iteration of this while loop will increase modify the size of min or max.
         // If the id is greater, min increases.
         // If the ID is smaller, max decreases.
         while (min <= max) {
             int mid = (min + max) / 2;
             compareID = enrollmentList.get(mid).getEnrollmentId();
             
             if (targetID > compareID) {
                min = mid + 1;
             } if (targetID < compareID){
                 max = mid -1;
             }
             
             // If the ID is found, the index if returned.
             if (targetID == compareID) {
                 return mid;
             }
         }
         // Returns -1 if not found. 
         return -1;
     }
     
}
