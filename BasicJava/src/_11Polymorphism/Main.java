package _11Polymorphism;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new FileLogger()); // Polymorphism
        customerManager.add();
    }
}
