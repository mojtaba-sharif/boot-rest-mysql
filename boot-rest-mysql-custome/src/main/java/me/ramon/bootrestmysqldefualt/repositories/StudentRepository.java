package me.ramon.bootrestmysqldefualt.repositories;

import me.ramon.bootrestmysqldefualt.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mojtaba on 8/18/2017.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
