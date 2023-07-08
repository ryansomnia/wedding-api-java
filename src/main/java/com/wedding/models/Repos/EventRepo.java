package com.wedding.models.Repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wedding.models.Entities.Event;

public interface EventRepo extends CrudRepository<Event, Integer> {

    List<Event> findByNamaEvent(String namaEvent);
}
