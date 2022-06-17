package za.ac.cput.service;

import za.ac.cput.domain.City;
import za.ac.cput.domain.Country;

import java.util.List;
import java.util.Optional;

public interface ICityService extends IService<City, String>{
    void delete(City city);

    List<City> findAll();
    void deleteById(String id);
}
