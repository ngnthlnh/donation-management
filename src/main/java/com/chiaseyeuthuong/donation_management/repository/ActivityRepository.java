package com.chiaseyeuthuong.donation_management.repository;

import com.chiaseyeuthuong.donation_management.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}