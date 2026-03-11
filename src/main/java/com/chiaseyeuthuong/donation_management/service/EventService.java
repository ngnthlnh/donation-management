package com.chiaseyeuthuong.donation_management.service;

import com.chiaseyeuthuong.donation_management.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event getEventBySlug(String slug);
}