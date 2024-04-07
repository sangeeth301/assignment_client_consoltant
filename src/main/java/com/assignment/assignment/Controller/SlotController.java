package com.assignment.assignment.Controller;

import com.assignment.assignment.Entity.Consultant;
import com.assignment.assignment.Entity.Slot;
import com.assignment.assignment.Service.ConsultantService;
import com.assignment.assignment.Service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlotController {

    private final SlotService slotService;
    private final ConsultantService consultantService;

    @Autowired
    public SlotController(SlotService slotService, ConsultantService consultantService) {
        this.slotService = slotService;
        this.consultantService = consultantService;
    }
    AuthenticationController auth;

    @PostMapping("/authenticate/slots")
    public String createSlot(@RequestBody Slot slot) {
        String loggedEmail = auth.loggedEmail(); // Assuming this method is in your authentication mechanism

        Consultant consultant = consultantService.findByEmail(loggedEmail);

        if (consultant != null && consultant.getRole().equals("consultant")) {
            slot.setConsultantId(consultant.getId());
            slot.setEmail(consultant.getEmail());
            return slotService.createSlot(slot);
        }
        else {
            return "Access denied! You do not have the necessary role to create slots.";
        }
    }
}


