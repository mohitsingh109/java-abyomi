package org.example.assignment.assignment6;

public class StudentTest {
    public static void main(String[] args) {
        // Create instances using all constructors
        Student student1 = new Student();  // Default constructor
        Student student2 = new Student("Abayomi Bello", 29, "AD4567", 3.5);  // Parameterized constructor
        Student student3 = new Student("Aisha Janet", 19, "AJ76549");  // Overloaded constructor

        // Set instance variables using setter methods
        student1.setName("Mohammed Ali");
        student1.setAge(21);
        student1.setStudentID("MA654389");
        student1.setGpa(3.2);

        // Print the student's details using the printDetails method
        student1.printDetails();
        System.out.println("Honor Roll: " + student1.isHonorRoll());
        System.out.println();

        student2.printDetails();
        System.out.println("Honor Roll: " + student2.isHonorRoll());
        System.out.println();

        student3.printDetails();
        System.out.println("Honor Roll: " + student3.isHonorRoll());
        System.out.println();

        // Print the total number of students
        System.out.println("Total Students: " + Student.totalStudents);

        // Print the average GPA
        System.out.println("Average GPA: " + Student.getAverageGPA());
    }
}

