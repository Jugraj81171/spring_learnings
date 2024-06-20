package code.pragra.learning.studentservice.repository;

import code.pragra.learning.studentservice.dto.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeDto, Integer> {


    List<EmployeeDto> findByemployeeName(String employeeName);


}
