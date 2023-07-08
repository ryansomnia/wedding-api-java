package com.wedding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.models.Entities.Event;
import com.wedding.services.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Event create(@RequestBody Event event) {
        return eventService.save(event);
    }

    @GetMapping
    public Iterable<Event> findAll() {
        return eventService.findAll();
    }

    @PostMapping("/getOne")
    public Event findOne(@RequestBody IdRequest idRequest) {
        Integer id = idRequest.getId();
        return eventService.findOne(id);
    }

}
