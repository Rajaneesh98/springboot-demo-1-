package com.rajaneesh.springbootdemo.services;

import com.rajaneesh.springbootdemo.dao.EmployeeDao;
import com.rajaneesh.springbootdemo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
//    List<Employee> list;

    public EmployeeServiceImpl(){

//        list = new ArrayList<>();
//        list.add(new Employee(1,"1person","1@gmail.com","1anantapur","19398314034"));
//        list.add(new Employee(2,"2person","2@gmail.com","2anantapur","29398314034"));

    }
    @Override
    public List<Employee> getEmployees() {
//        return list;
          return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(Integer id) {
////        for(Employee e : list){
////            if(e.getId()==id){
////                return e;
////            }
////        }
////        return null;
        return employeeDao.getOne(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
//        list.add(employee);
//        return employee;
        employeeDao.save(employee);
        return employee;
    }
}
