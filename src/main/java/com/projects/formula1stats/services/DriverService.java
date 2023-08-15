package com.projects.formula1stats.services;

import com.projects.formula1stats.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.List;

@Service
public class DriverService {
    private final DriverRepository driverRepository;
    
    @Autowired

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
    
    public List<Driver> getAllDrivers(){
        return driverRepository.findAll();
    }
    
    public Driver getDriverByID(Long id){
        return driverRepository.findById(id).orElse(null);
    }
    
    public Driver saveDriver(Driver driver){
        return driverRepository.save(driver);
    }
    
    public void Driver deleteDriver(Long id){
        driverRepository.deleteById(id);
    }
}
