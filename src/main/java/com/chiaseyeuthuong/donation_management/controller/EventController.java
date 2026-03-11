package com.chiaseyeuthuong.donation_management.controller;

import com.chiaseyeuthuong.donation_management.model.Event;
import com.chiaseyeuthuong.donation_management.repository.ActivityRepository;
import com.chiaseyeuthuong.donation_management.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {

    private final EventService eventService;
    private final ActivityRepository activityRepository;

    public EventController(EventService eventService, ActivityRepository activityRepository) {
        this.eventService = eventService;
        this.activityRepository = activityRepository;
    }

    @GetMapping("/events")
    public String getAllEvents(Model model) {
        model.addAttribute("events", eventService.getAllEvents());
        return "pages/event-list";
    }

    @GetMapping("/events/{slug}")
    public String getEventDetail(@PathVariable String slug, Model model) {
        Event event = eventService.getEventBySlug(slug);

        model.addAttribute("event", event);

        if (event != null) {
            model.addAttribute("activities", activityRepository.findByEvent(event));
        }

        return "pages/event-detail";
    }
}