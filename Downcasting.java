class Employee {
    void work() {
        System.out.println("Employee Working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Managing Team");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Manager(); // Upcasting

        Manager m = (Manager) e;    // Downcasting

        m.work();
        m.manage();
    }
}
