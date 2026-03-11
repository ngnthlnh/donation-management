package com.chiaseyeuthuong.donation_management.service.impl;

import com.chiaseyeuthuong.donation_management.model.Event;
import com.chiaseyeuthuong.donation_management.repository.EventRepository;
import com.chiaseyeuthuong.donation_management.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }
}