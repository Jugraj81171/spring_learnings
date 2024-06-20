package code.pragra.learning.studentservice.service;

import code.pragra.learning.studentservice.dto.EmployeeDto;
import code.pragra.learning.studentservice.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeDao employeeDao;


    public List<EmployeeDto> getAllEmployee()
    {
        return employeeDao.findAll();

    }

    public void setEmployeeDao(EmployeeDto employeeDto){
        employeeDao.save(employeeDto);

    }


}
