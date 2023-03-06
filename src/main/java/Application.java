import java.sql.*;
import java.util.List;
import java.util.Optional;

import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import jdbc.ConnectionManager;
import model.City;
import model.Employee;

public class Application {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        City moscow = new City(1, "Москва");
        City piter = new City(2, "Санкт-ПитерБург");
        City kazan = new City(1, "Казань");

        Employee nikola = employeeDao.add(new Employee("Николай", "Иванов", "муж", 12, 1L));
                System.out.println("Добавление сотрудника: " + nikola);

        Employee niy = employeeDao.add(new Employee("Ний", "Ивав", "муж", 19, 2L));
                System.out.println("Добавление сотрудника: " + niy);

        System.out.println("Все сотруднки:");
        employeeDao.findAll().forEach(System.out::println);



    }
}


