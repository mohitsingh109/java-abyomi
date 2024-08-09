package org.example.inheritance;

//Teacher is a Person

/**
 * Person  ----> Student (C)
 *         ----> Teacher (C)
 *
 * if parent has more then 1 child this is called Hierarchial inheritance
 */
public class Teacher extends Person { // extend always refer to is a relation

    private String subject; // C++, Java, C#

    private Double salary;

    @Override
    public void displayDetails() {
        // super refer the parent object
        // super is used to access the parent class function & variable
        super.displayDetails(); // I am calling the parent function
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
