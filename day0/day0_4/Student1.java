package day0_4;
// 2. Modify Student class: add a method updateMarks(double newMarks) to change marks. Use from main.
public class Student1 {
    double marks;
    public Student1(double marks){
        this.marks = marks;
    }
    public void displayInfo(){
        System.out.println("marks real: " + marks);
    }
    public void updateMarks(double newMarks){
        this.marks = newMarks;
        System.out.println("marks updated: " + newMarks);
    }
    public static void main(String args[]){
        Student1 student1 = new Student1(33.2);
        student1.displayInfo();
        student1.updateMarks(55.5);
        student1.displayInfo();
}
}