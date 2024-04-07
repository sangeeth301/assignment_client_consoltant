package com.assignment.assignment.Repository;

import com.assignment.assignment.Entity.Slot;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlotRepository extends JpaRepository<Slot, Long> {
}

