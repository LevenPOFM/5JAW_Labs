/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class S14_TestEquality {
    
     public static void main(String[] args) {
        
        // Checking Equality
        
         System.out.println("--- Testing Student Equality via ID ---");
        // Created two different students with the same ID.
        // All other variables are different, by equals only looks for ID. 
        Person s1 = new Person(123, "Michael", "mike@gmail.com", 12345678);
        Person s2 = new Person(123, "Daniel", "asdasd", 25235235);
        Person s3 = new Person(457, "Daniel", "asdasd", 25235235);
        
        System.out.println("\nTesting with equals method (Should return true): " + s1.equals(s2));
        System.out.println("Testing with equals method (Should return false): " + s1.equals(s3));
        
        //----------------------------------------------------------------------
        
        
        System.out.println("\n--- Testing Course Equality  ---");
        
        // Creating 3 courses.
        // Checking Course ID for equality.
        Course c1 = new Course(10001, "Maths", 150);
        Course c2 = new Course(10001, "Maths", 150);
        Course c3 = new Course(50021, "English", 99);
        
        System.out.println("\nTesting with equals method (Should return true): " + c1.equals(c2));
        System.out.println("Testing with equals method (Should return false): " + c1.equals(c3));
        
        //----------------------------------------------------------------------
        
        System.out.println("\n--- Testing Enrollment Equality  ---");
        
        // Creating 3 enrollments.
        // Checking Enrollment ID for equality.
        Enrollment e1 = new Enrollment(5131, "01/2021", 98, 2);
        Enrollment e2 = new Enrollment(5131, "06/2019", 98, 1);
        Enrollment e3 = new Enrollment(1093, "02/2017", 98, 2);
        
        System.out.println("\nTesting with equals method (Should return true): " + e1.equals(e2));
        System.out.println("Testing with equals method (Should return false): " + e1.equals(e3));
        
        
    
}
}
