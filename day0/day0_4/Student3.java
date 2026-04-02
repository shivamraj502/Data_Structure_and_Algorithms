package day0_4;
// 1.Modify your Student class: make marks and rollNo private, 
//   add getMarks(), setMarks(), and getRollNo() methods.

public class Student3 {
    private double marks;
    private int rollNo;

    Student3(double marks,int rollNo){
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double marks){
        this.marks = marks;
    }

    public int getRollNo(){
        return rollNo;
    }

    public static void main(String args[]){
        Student2 student = new Student2(33.5,33);
        System.out.println("old marks is: ");
        System.out.println("marks: "+ student.getMarks());
        System.out.println("rollNo: "+ student.getRollNo());
        // System.out.println("new marks is: ");
        student.setMarks(44.5);
        System.out.println("updated marks: "+ student.getMarks());
    }
}
