package org.example.assignment;

public class StudentTest {
    public static void main(String[] args) {// jvm
        Student student1 = new Student();
        student1.setName("Abayomi");
        student1.setAge(55);
        student1.setRollNumber("23");
        student1.setCourse("English");
        student1.printDetails();

        // creating another student
        Student student2 = new Student();
        student2.setName("Bello");
        student2.setAge(33);
        student2.setRollNumber("23");
        student2.setCourse("Java Programming");
        student2.printDetails();
    }
}
