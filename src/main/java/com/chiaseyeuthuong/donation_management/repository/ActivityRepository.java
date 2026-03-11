package com.chiaseyeuthuong.donation_management.repository;

import com.chiaseyeuthuong.donation_management.model.Activity;
import com.chiaseyeuthuong.donation_management.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
    Optional<Activity> findBySlug(String slug);
    List<Activity> findByEvent(Event event);
}