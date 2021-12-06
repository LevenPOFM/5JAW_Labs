/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class S16_TestLinkedList {
    
    public static void main(String[] args) {
        
        System.out.println("----------- Testing Linked List Methods on Students ----------- ");
        
        // Creating a linked list of students.
        LinkedList<Student> studentSingleLinkedList = new LinkedList<Student>();
        DoublyLinkedList<Student> studentDoublyLinkedList = new DoublyLinkedList<Student>();
        
        // Creating students for Testing
        
        Student s1 = new Student("SoftwareDev", 2020, 5555, "Michael", "kolev@gmail.com", 12345678);
        Student s2 = new Student("Culinary", 2019, 3333, "Daniel", "saunders@gmail.com", 2362342);
        Student s3 = new Student("Security", 2018, 4444, "Sasha", "test@gmail.com", 234623623);
        Student s4 = new Student("Science", 2021, 2222, "Nick", "kolev@gmail.com", 12378346);
        Student s5 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);
        
        
        // Adding 2 students to the front of the list.
        studentSingleLinkedList.addFirst(s1);
        studentSingleLinkedList.addFirst(s2);
        studentSingleLinkedList.addFirst(s4);
   
        studentDoublyLinkedList.addFirst(s1);
        studentDoublyLinkedList.addFirst(s2);
        studentDoublyLinkedList.addFirst(s4);
        
        // Adding a student to the end of the list
        studentSingleLinkedList.addLast(s3);
        studentDoublyLinkedList.addLast(s3);
        
        // Seeing if the list contains a certain student object
        System.out.println("\nDoes the Single Linked list contain S2 (Should be true: " + studentSingleLinkedList.contains(s2));
        System.out.println("Does the Single Linked list contain S5 (Should be false: " + studentSingleLinkedList.contains(s5));
        System.out.println("Does the Single Linked list contain S2 (Should be true: " + studentDoublyLinkedList.contains(s2));
        System.out.println("Does the Single Linked list contain S5 (Should be false: " + studentDoublyLinkedList.contains(s5));
        
        
        // Removing the first element of the list.
        studentSingleLinkedList.removeFirst();
        studentDoublyLinkedList.removeFirst();
        
        // Removing the last element of the list. 
        studentSingleLinkedList.removeLast();
        studentDoublyLinkedList.removeLast();
        
        
        // Traversing through each list forward.
        System.out.println("\nPrinting each list normally: ");
        printLinkedList(studentSingleLinkedList.getHead());
        printLinkedList(studentDoublyLinkedList.getHead());
        
        //Travering through the doubly linked list in reverse. 
        System.out.println("\nPrinting the DoublyLinked list in reverse");
        printLinkedListReverse(studentDoublyLinkedList.getTail());
        
        System.out.println("----------- Testing Linked List Methods on Course ----------- ");
        
        // Creating a linked list of courses.
        LinkedList<Course> courseSingleLinkedList = new LinkedList<Course>();
        DoublyLinkedList<Course> courseDoublyLinkedList = new DoublyLinkedList<Course>();
        
        // Creating students for Testing
        
        Course c1 = new Course(5555, "Science", 400);
        Course c2 = new Course(3333, "SOSE", 59);
        Course c3 = new Course(1111, "Maths", 100);
        Course c4 = new Course(4444, "Engineering", 3000);
        Course c5 = new Course(2222, "English", 75);
        
        
        // Adding 2 students to the front of the list.
        courseSingleLinkedList.addFirst(c1);
        courseSingleLinkedList.addFirst(c2);
        courseSingleLinkedList.addFirst(c4);
   
        courseDoublyLinkedList.addFirst(c1);
        courseDoublyLinkedList.addFirst(c2);
        courseDoublyLinkedList.addFirst(c4);
        
        // Adding a student to the end of the list
        courseSingleLinkedList.addLast(c3);
        courseDoublyLinkedList.addLast(c3);
        
        // Seeing if the list contains a certain student object
        System.out.println("\nDoes the Single Linked list contain C2 (Should be true: " + courseSingleLinkedList.contains(c2));
        System.out.println("Does the Single Linked list contain C5 (Should be false: " + courseSingleLinkedList.contains(c5));
        System.out.println("Does the Single Linked list contain C2 (Should be true: " + courseDoublyLinkedList.contains(c2));
        System.out.println("Does the Single Linked list contain C5 (Should be false: " + courseDoublyLinkedList.contains(c5));
        
        
        // Removing the first element of the list.
        courseSingleLinkedList.removeFirst();
        courseDoublyLinkedList.removeFirst();
        
        // Removing the last element of the list. 
        courseSingleLinkedList.removeLast();
        courseDoublyLinkedList.removeLast();
        
        
        // Traversing through each list forward.
        System.out.println("\nPrinting each list normally: ");
        printLinkedList(courseSingleLinkedList.getHead());
        printLinkedList(courseDoublyLinkedList.getHead());
        
        //Travering through the doubly linked list in reverse. 
        System.out.println("\nPrinting the DoublyLinked list in reverse");
        printLinkedListReverse(courseDoublyLinkedList.getTail());
        
        System.out.println("----------- Testing Linked List Methods on Enrollments ----------- ");
        
        // Creating a linked list of Enrollments.
        LinkedList<Enrollment> enrollmentSingleLinkedList = new LinkedList<Enrollment>();
        DoublyLinkedList<Enrollment> enrollmentDoublyLinkedList = new DoublyLinkedList<Enrollment>();
        
        // Creating Enrollments for Testing
        
        Enrollment e1 = new Enrollment(4713, "1998", 100, 1);
        Enrollment e2 = new Enrollment(6123, "2004", 55, 2);
        Enrollment e3 = new Enrollment(9183, "1991", 85, 2);
        Enrollment e4 = new Enrollment(6821, "2020", 60, 1);
        Enrollment e5 = new Enrollment(2235, "1997", 89, 1);
        
        
        // Adding 2 Enrollments to the front of the list.
        enrollmentSingleLinkedList.addFirst(e1);
        enrollmentSingleLinkedList.addFirst(e2);
        enrollmentSingleLinkedList.addFirst(e4);
   
        enrollmentDoublyLinkedList.addFirst(e1);
        enrollmentDoublyLinkedList.addFirst(e2);
        enrollmentDoublyLinkedList.addFirst(e4);
        
        // Adding a enrollment to the end of the list
        enrollmentSingleLinkedList.addLast(e3);
        enrollmentDoublyLinkedList.addLast(e3);
        
        // Seeing if the list contains a certain enrollment object
        System.out.println("\nDoes the Single Linked list contain e2 (Should be true: " + enrollmentSingleLinkedList.contains(e2));
        System.out.println("Does the Single Linked list contain e5 (Should be false: " + enrollmentSingleLinkedList.contains(e5));
        System.out.println("Does the Single Linked list contain e2 (Should be true: " + enrollmentDoublyLinkedList.contains(e2));
        System.out.println("Does the Single Linked list contain e5 (Should be false: " + enrollmentDoublyLinkedList.contains(e5));
        
        
        // Removing the first element of the list.
        enrollmentSingleLinkedList.removeFirst();
        enrollmentDoublyLinkedList.removeFirst();
        
        // Removing the last element of the list. 
        enrollmentSingleLinkedList.removeLast();
        enrollmentDoublyLinkedList.removeLast();
        
        
        // Traversing through each list forward.
        System.out.println("\nPrinting each list normally: ");
        printLinkedList(enrollmentSingleLinkedList.getHead());
        printLinkedList(enrollmentDoublyLinkedList.getHead());
        
        //Travering through the doubly linked list in reverse. 
        System.out.println("\nPrinting the DoublyLinked list in reverse");
        printLinkedListReverse(enrollmentDoublyLinkedList.getTail());
        
        
        
    }
    
    public static void printLinkedList(Node node){
        
        while(node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
    
    public static void printLinkedListReverse(Node node){
        
        while(node != null) {
            System.out.println(node.getValue());
            node = node.getPrevious();
        }
    }
    
}
