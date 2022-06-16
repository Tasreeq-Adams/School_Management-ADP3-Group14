package za.ac.cput.service;

import za.ac.cput.domain.EmployeeAddress;

import java.util.List;

public interface IEmployeeAddressService extends IService<EmployeeAddress,String> {
    List<EmployeeAddress> findAll();
}
