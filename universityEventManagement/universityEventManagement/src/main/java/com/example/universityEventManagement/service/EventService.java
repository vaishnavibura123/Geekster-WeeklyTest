package com.example.universityEventManagement.service;

import com.example.universityEventManagement.model.Event;
import com.example.universityEventManagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventService {
    @Autowired
    IEventRepo iEventRepo;
    public List<Event> findEvents() {
        return iEventRepo.findAll();
    }

    public Event findByEventId(int eventId) {
        return iEventRepo.findById(eventId).get();
    }

    public void addEvent(Event event) {
        iEventRepo.save(event);
    }

    public void deleteEvent(int eventId) {
        iEventRepo.deleteById(eventId);
    }

    public void updateEvent(int eventId, Event event) {
        Event event1=iEventRepo.findById(eventId).get();
        event1.setEventName(event.getEventName());
        event1.setEventDate(event.getEventDate());
        event1.setEventId(event.getEventId());
        event1.setEventLocation(event.getEventLocation());
        event1.setStartTime(event.getStartTime());
        event1.setEndTime(event.getEndTime());
        iEventRepo.save(event1);
    }
}
