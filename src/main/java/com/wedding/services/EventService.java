package com.wedding.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.models.Entities.Event;
import com.wedding.models.Repos.EventRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EventService {

    @Autowired
    private EventRepo eventRepo;

    public Event save(Event event) {
        return eventRepo.save(event);
    }

    public Event findOne(Integer id) {
        return eventRepo.findById(id).get();

    }

    public Iterable<Event> findAll() {
        return eventRepo.findAll();
    }

    public void removeOne(Integer id) {
        eventRepo.deleteById(id);
    }

    public List<Event> findByName(String namaEvent) {
        return eventRepo.findByNamaEvent(namaEvent);
    }
}
