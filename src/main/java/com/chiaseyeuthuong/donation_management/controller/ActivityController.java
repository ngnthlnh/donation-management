package com.chiaseyeuthuong.donation_management.controller;

import com.chiaseyeuthuong.donation_management.service.ActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/activities")
    public String getAllActivities(Model model) {
        model.addAttribute("activities", activityService.getAllActivities());
        return "pages/activity-list";
    }

    @GetMapping("/activities/{slug}")
    public String getActivityDetail(@PathVariable String slug, Model model) {
        model.addAttribute("activity", activityService.getActivityBySlug(slug));
        return "pages/activity-detail";
    }
}