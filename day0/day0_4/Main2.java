package day0_4;
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {

    public Manager(String name, int id) {
        super(name, id);
    }

    public void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 101);
        emp.work();

        Manager mgr = new Manager("Priya", 201);
        mgr.work();         // inherited method
        mgr.manageTeam();   // manager-specific method
    }
}
