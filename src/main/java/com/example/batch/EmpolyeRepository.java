package com.example.batch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface EmpolyeRepository extends JpaRepository <Employee, Long> {

}
