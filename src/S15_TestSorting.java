
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
public class S15_TestSorting {

    public static void main(String[] args) {

        System.out.println("----------- Testing Sorting Methods on Students ----------- ");

        ArrayList<Student> studentListBubble = new ArrayList();
        ArrayList<Student> studentListSelection = new ArrayList();

        Student s1 = new Student("SoftwareDev", 2020, 4444, "Michael", "kolev@gmail.com", 12345678);
        Student s2 = new Student("Culinary", 2019, 5555, "Daniel", "saunders@gmail.com", 2362342);
        Student s3 = new Student("Security", 2018, 2222, "Sasha", "test@gmail.com", 234623623);
        Student s4 = new Student("Science", 2021, 3333, "Nick", "kolev@gmail.com", 12378346);
        Student s5 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);

        studentListBubble.add(s1);
        studentListBubble.add(s2);
        studentListBubble.add(s3);
        studentListBubble.add(s4);
        studentListBubble.add(s5);
        
        studentListSelection.add(s1);
        studentListSelection.add(s2);
        studentListSelection.add(s3);
        studentListSelection.add(s4);
        studentListSelection.add(s5);

        System.out.println("\nList of students before being sorted by the bubble sort algorithm: ");
        studentListBubble.forEach(System.out::println);
        
        studentBubbleSort(studentListBubble);
        
        System.out.println("\nList of students after the bubble sort has been applied: ");
        studentListBubble.forEach(System.out::println);
        
        System.out.println("\nList of students before being sorted by the Selection sort algorithm: ");
        studentListSelection.forEach(System.out::println);
        
        studentSelectionSortOfInt(studentListSelection);
        
        System.out.println("\nList of students after the selection sort has been applied: ");
        studentListSelection.forEach(System.out::println);
        
        //----------------------------------------------------------------------
        
        System.out.println("----------- Testing Sorting Methods on Courses ----------- ");
        
        // Creating an unsorted array of courses.
        ArrayList<Course> courseListBubble = new ArrayList();
        ArrayList<Course> courseListSelection = new ArrayList();
        
        Course c1 = new Course(5555, "Science", 400);
        Course c2 = new Course(3333, "SOSE", 59);
        Course c3 = new Course(1111, "Maths", 100);
        Course c4 = new Course(4444, "Engineering", 3000);
        Course c5 = new Course(2222, "English", 75);
        
        courseListBubble.add(c1);
        courseListBubble.add(c2);
        courseListBubble.add(c3);
        courseListBubble.add(c4);
        courseListBubble.add(c5);
        
        courseListSelection.add(c1);
        courseListSelection.add(c2);
        courseListSelection.add(c3);
        courseListSelection.add(c4);
        courseListSelection.add(c5);
        
        System.out.println("\nList of courses before being sorted by the bubble sort algorithm: ");
        courseListBubble.forEach(System.out::println);
        
        courseBubbleSort(courseListBubble);
        
        System.out.println("\nList of courses after the bubble sort has been applied: ");
        courseListBubble.forEach(System.out::println);
        
        System.out.println("\nList of courses before being sorted by the selection sort algorithm: ");
        courseListSelection.forEach(System.out::println);
        
        courseSelectionSortOfInt(courseListSelection);
        
        System.out.println("\nList of courses after the selection sort has been applied: ");
        courseListSelection.forEach(System.out::println);
        
        //----------------------------------------------------------------------
        
        System.out.println("----------- Testing Sorting Methods on Enrollments ----------- ");
        
        // Creating an unsorted array of courses.
         ArrayList<Enrollment> enrollmentListBubble = new ArrayList();
         ArrayList<Enrollment> enrollmentListSelection = new ArrayList();
        
        Enrollment e1 = new Enrollment(4713, "1998", 100, 1);
        Enrollment e2 = new Enrollment(6123, "2004", 55, 2);
        Enrollment e3 = new Enrollment(9183, "1991", 85, 2);
        Enrollment e4 = new Enrollment(6821, "2020", 60, 1);
        Enrollment e5 = new Enrollment(2235, "1997", 89, 1);
        
        enrollmentListBubble.add(e1);
        enrollmentListBubble.add(e2);
        enrollmentListBubble.add(e3);
        enrollmentListBubble.add(e4);
        enrollmentListBubble.add(e5);
        
        enrollmentListSelection.add(e1);
        enrollmentListSelection.add(e2);
        enrollmentListSelection.add(e3);
        enrollmentListSelection.add(e4);
        enrollmentListSelection.add(e5);
        
        System.out.println("\nList of enrollments before being sorted by the bubble sort algorithm: ");
        enrollmentListBubble.forEach(System.out::println);
        
        enrollmentBubbleSort(enrollmentListBubble);
        
        System.out.println("\nList of courses after the bubble sort has been applied: ");
        enrollmentListBubble.forEach(System.out::println);
        
        System.out.println("\nList of enrollments before being sorted by the selection sort algorithm: ");
        enrollmentListSelection.forEach(System.out::println);
        
        enrollmentSelectionSortOfInt(enrollmentListSelection);
        
        System.out.println("\nList of courses after the selection sort has been applied: ");
        enrollmentListSelection.forEach(System.out::println);

    }


    private static void studentBubbleSort(ArrayList<Student> studentList) {
        
        Student t;

        for (int j = 0; j <= studentList.size() - 2; j++) {
            for (int i = 0; i <= studentList.size() - 2; i++) {
                if (studentList.get(i).getId() > studentList.get(i + 1).getId()) {
                    t = studentList.get(i + 1);
                    studentList.set(i + 1, studentList.get(i));
                    studentList.set(i, t);
                }
            }
        }
    }
    
    private static void courseBubbleSort(ArrayList<Course> courseList) {
        
        Course t;

        for (int j = 0; j <= courseList.size() - 2; j++) {
            for (int i = 0; i <= courseList.size() - 2; i++) {
                if (courseList.get(i).getCourseCode() > courseList.get(i + 1).getCourseCode()) {
                    t = courseList.get(i + 1);
                    courseList.set(i + 1, courseList.get(i));
                    courseList.set(i, t);
                }
            }
        }
    }
    
    private static void enrollmentBubbleSort(ArrayList<Enrollment> enrollmentList) {
        
        Enrollment e;

        for (int j = 0; j <= enrollmentList.size() - 2; j++) {
            for (int i = 0; i <= enrollmentList.size() - 2; i++) {
                if (enrollmentList.get(i).getEnrollmentId() > enrollmentList.get(i + 1).getEnrollmentId()) {
                    e = enrollmentList.get(i + 1);
                    enrollmentList.set(i + 1, enrollmentList.get(i));
                    enrollmentList.set(i, e);
                }
            }
        }
    }
    
    public static void studentSelectionSortOfInt(ArrayList<Student> studentList){
        Student tmp;
        int min_key;
        
        for (int j = 0; j < studentList.size() -1; j++) 
        {
            min_key = j;
            
            for (int k = j + 1; k < studentList.size(); k++ )
            {
                if (studentList.get(k).getId() < studentList.get(min_key).getId()) 
                {
                    min_key = k;
                }
            }
            
            tmp = studentList.get(min_key);
            studentList.set(min_key, studentList.get(j));
            studentList.set(j, tmp);
        }
    }
    
    public static void courseSelectionSortOfInt(ArrayList<Course> courseList){
        Course tmp;
        int min_key;
        
        for (int j = 0; j < courseList.size() -1; j++) 
        {
            min_key = j;
            
            for (int k = j + 1; k < courseList.size(); k++ )
            {
                if (courseList.get(k).getCourseCode() < courseList.get(min_key).getCourseCode()) 
                {
                    min_key = k;
                }
            }
            
            tmp = courseList.get(min_key);
            courseList.set(min_key, courseList.get(j));
            courseList.set(j, tmp);
        }
    }
    
    public static void enrollmentSelectionSortOfInt(ArrayList<Enrollment> enrollmentList){
        Enrollment tmp;
        int min_key;
        
        for (int j = 0; j < enrollmentList.size() -1; j++) 
        {
            min_key = j;
            
            for (int k = j + 1; k < enrollmentList.size(); k++ )
            {
                if (enrollmentList.get(k).getEnrollmentId() < enrollmentList.get(min_key).getEnrollmentId()) 
                {
                    min_key = k;
                }
            }
            
            tmp = enrollmentList.get(min_key);
            enrollmentList.set(min_key, enrollmentList.get(j));
            enrollmentList.set(j, tmp);
        }
    }
   
}

