package com.assignment.assignment.Repository;

import com.assignment.assignment.Entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultantRepository extends JpaRepository<Consultant, Long> {

    List<Consultant> findByAreaOfExpertiseAndExperience(String areaOfExpertise,int experience);

    Consultant findByEmailAndPassword(String email, String password);

    Consultant findByEmail(String email);
}

