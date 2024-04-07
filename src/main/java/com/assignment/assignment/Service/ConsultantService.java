package com.assignment.assignment.Service;

import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultantService {
    @Autowired
    ConsultantRepository consultantRepository;

    public List<Consultant> getAllConsultants() {
        return consultantRepository.findAll();
    }

    public List<Consultant> findConsultantsByAreaOfExpertise(String areaOfExpertise,int experience) {
        return consultantRepository.findByAreaOfExpertiseAndExperience(areaOfExpertise,experience);
    }
    public Consultant findByEmail(String email){
        return consultantRepository.findByEmail(email);
    }
}
