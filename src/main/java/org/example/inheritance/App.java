package org.example.inheritance;

public class App {

    public static void main(String[] args) {
        Student student = new Student(); // java is creating the default constructor
        //new Student("Mohit", "test@gmail.com","123456789",  "address1", 3, "CS");
        student.setName("Mohit");
        student.setEmail("test@gmail.com");
        student.setPhoneNumber("123456789");
        student.setAddress("address1");
        student.setYear(3);
        student.setCourse("CS");

        student.displayDetails();

        System.out.println("---------------------");
        Teacher teacher = new Teacher();
        teacher.setName("Karan");
        teacher.setEmail("karan@gmail.com");
        teacher.setPhoneNumber("12345678");
        teacher.setAddress("address2");
        teacher.setSubject("Java");
        teacher.setSalary(45.6);

        teacher.displayDetails();
    }
}
