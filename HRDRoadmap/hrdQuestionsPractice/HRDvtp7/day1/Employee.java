// package day1b;
public class Employee {
    static String fullName;
    static String empId;
    Employee(String fullName,String empId){
        this.fullName=fullName;
        this.empId=empId;
    }
    public static void display(){
        System.out.println("fullName: "+fullName+" ,empId: "+empId);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("shivam", "shi144");
        e1.display();
        Employee e2 = new Employee("raj", "shi145");
        e2.display();
    }
}