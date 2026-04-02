package day0_4;
// Create a class Student with fields: name (String), rollNo (int), 
// marks (double). Write methods: displayDetails() to print details.
//  In main, create 2–3 students and display.

public class Student {
    String name;
    int rollno;
    double marks;

    public Student(String name,int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void displayInfo() {
        System.out.println("name:" + name + "\nrollno:" + rollno + "\nmarks: " + marks);

    }

    public static void main(String[] args) {
        Student student1 = new Student("shi",55,55.5);
        Student student2 = new Student("si",55,55.5);
        Student student3 = new Student("sheeei",55,55.5);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
