package com.chiaseyeuthuong.donation_management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "activities")
@Data
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(unique = true)
    private String slug;

    @Column(length = 2000)
    private String description;

    private String location;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private Double targetAmount;

    private Double raisedAmount;
}