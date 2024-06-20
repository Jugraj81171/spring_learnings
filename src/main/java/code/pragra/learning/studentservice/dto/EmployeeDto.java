package code.pragra.learning.studentservice.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class EmployeeDto
{
    @Id
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeePhoneNo;
    private String employeeEmail;
}
