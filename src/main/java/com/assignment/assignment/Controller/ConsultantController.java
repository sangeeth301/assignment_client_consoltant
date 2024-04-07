package com.assignment.assignment.Controller;

import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Service.ConsultantService;
import com.assignment.assignment.Service.RegisterSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ConsultantController {

    @Autowired
    ConsultantService consultantService;
    @GetMapping("/consultant")
    public List<Consultant> getAllUsers() {
        return consultantService.getAllConsultants();
    }

    @GetMapping("/consultant/{areaOfExpertise}/{experience}")
    public List<Consultant> getConsultantsByAreaAndExperience(@PathVariable String areaOfExpertise, @PathVariable int experience) {
        return consultantService.findConsultantsByAreaOfExpertise(areaOfExpertise, experience);
    }



}
