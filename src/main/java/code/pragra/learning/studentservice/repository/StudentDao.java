package code.pragra.learning.studentservice.repository;

import code.pragra.learning.studentservice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;






}
