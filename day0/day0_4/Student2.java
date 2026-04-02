public class Student2 {
    String name;
    int rollno;
    double marks;

    public Student2(String name,int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void displayInfo() {
        System.out.println("name:" + name + " rollno:" + rollno + " marks: " + marks);

    }

    public void updateMarks(int marks){
        this.marks=marks;
        System.out.println("name:" + name + " rollno:" + rollno + " marks: " + marks);
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2("shi",55,55.5);
        Student2 student2 = new Student2("si",5,55.5);
        Student2 student3 = new Student2("sheeei",755,55.5);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        System.out.println();
        student1.updateMarks(8788);
        student2.updateMarks(7878);
        student3.updateMarks(878);


    }   
}
