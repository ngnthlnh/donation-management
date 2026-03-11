package com.chiaseyeuthuong.donation_management.controller;

import com.chiaseyeuthuong.donation_management.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public String getAllEvents(Model model) {
        model.addAttribute("events", eventService.getAllEvents());
        return "pages/event-list";
    }

    @GetMapping("/events/{slug}")
    public String getEventDetail(@PathVariable String slug, Model model) {
        model.addAttribute("event", eventService.getEventBySlug(slug));
        return "pages/event-detail";
    }
}