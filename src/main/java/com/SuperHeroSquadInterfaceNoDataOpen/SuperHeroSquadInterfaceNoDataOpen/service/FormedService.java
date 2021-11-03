package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.service;

import com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.repository.FormedRepositorie;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Service
public class FormedService {

    @Autowired
    private FormedRepositorie formedRepositorie;

    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}
