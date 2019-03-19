package domain.dao;

import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        connetionManager.connect();
        connectionManager.getConnectionObject().prepareStatement("insert into domain.Employee tbl");
        connectionManager.disconnect();
        System.out.println("saved employee to the database: " + employee);
    }

    public void deleteEmployee(Employee employee) {

    }
}
