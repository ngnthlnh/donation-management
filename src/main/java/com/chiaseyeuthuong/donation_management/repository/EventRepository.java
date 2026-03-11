package com.chiaseyeuthuong.donation_management.repository;

import com.chiaseyeuthuong.donation_management.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}