package code.pragra.learning.studentservice.Controller;

import code.pragra.learning.studentservice.dto.EmployeeDto;
import code.pragra.learning.studentservice.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/get")
    public List<EmployeeDto> getAllEmployee()
    {
        return employeeDao.findAll();

    }
    @GetMapping("/getByName")
    public List<EmployeeDto> getEmployeeDtoByName(@RequestParam String employeeName)
    {
        return employeeDao.findByemployeeName(employeeName);
    }
    
    @PostMapping("/set")
    public String setEmployeeDao(@RequestBody EmployeeDto employeeDto)
    {
        employeeDao.save(employeeDto);
        return "Employee saved";

    }
    
    @GetMapping("/getById")
    public Optional<EmployeeDto> findById(@RequestParam int employeeId)
    {
        return employeeDao.findById(employeeId);
    }
    
    @PutMapping("/update")
    public String updateEmployee(@RequestBody EmployeeDto employeeDto)
    {
        if(employeeDao.findById(employeeDto.getEmployeeId()).isPresent()) {
            employeeDao.save(employeeDto);
          return "Employee updated";
        }

        else
        {
           return "Employee not found";
        }

    }
    @PatchMapping("/patch")
    public String updateEmployeeById(@RequestParam int employeeId, String employeeName)
    {
        EmployeeDto entity = employeeDao.findById(employeeId).get();
        entity.setEmployeeName(employeeName);
        employeeDao.save(entity);
        return "Employee updated";
    }

    @DeleteMapping("/delete")
    public String deleteEmployeeDaoById(@RequestParam int employeeId)
    {
        employeeDao.deleteById(employeeId);
        return "Employee deleted";
    }

    @DeleteMapping("/deleteAll")
    public String deleteEmployee(@RequestBody EmployeeDto employeeDto){
        employeeDao.delete(employeeDto);
        return "Employee deleted";

    }

}
