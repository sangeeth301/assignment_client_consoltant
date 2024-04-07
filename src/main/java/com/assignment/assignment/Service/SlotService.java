package com.assignment.assignment.Service;


import com.assignment.assignment.Entity.Slot;
import com.assignment.assignment.Repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SlotService {

    @Autowired
    private SlotRepository slotRepository;

    public String createSlot(Slot slot) {
        if (slot.getStartTime().isAfter(LocalDateTime.now()) && slot.getEndTime().isAfter(slot.getStartTime())) {
            slotRepository.save(slot);
            return "Slot created successfully!";
        } else {
            return "Invalid slot timings!";
        }
    }
}
