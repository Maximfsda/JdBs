import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dao.CityDao;
import dao.EmployeeDao;
import dao.impl.CityDaoImp;
import dao.impl.EmployeeDaoImpl;
import jdbc.ConnectionManager;
import model.City;
import model.Employee;

public class Application {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        CityDao cityDao = new CityDaoImp();

        int n = 5;
        City city = new City("Волгоград");
        List<Employee> employees = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            employees.add(
                    new Employee(
                            "Имя " + (i + 1),
                            "Фамилия " + (i + 1),
                            "Муж ",
                            30 + i,
                            city)
            );
        }
        city.setEmployees(employees);

        cityDao.add(city);
    }
}



