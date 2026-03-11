package com.chiaseyeuthuong.donation_management.service;

import com.chiaseyeuthuong.donation_management.model.Activity;

import java.util.List;

public interface ActivityService {
    List<Activity> getAllActivities();
    Activity getActivityById(Long id);
}