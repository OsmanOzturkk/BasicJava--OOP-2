package _12Abstract;

import _12Abstract.CustomerManager;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDataBaseManager = new SqlServerDataBaseManager();
        customerManager.getCustomers();
    }
}
