package dao;

import model.City;
import model.Employee;

import java.util.List;
import java.util.Optional;

public interface CityDao {

    City add(City city);

    Optional<City> findById(long id);

    List<City> findAll();

    City update(City employee);

    Optional<City> delete(City employee);
}
