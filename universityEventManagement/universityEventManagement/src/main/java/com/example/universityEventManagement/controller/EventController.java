package com.example.universityEventManagement.controller;

import com.example.universityEventManagement.model.Event;
import com.example.universityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping("/findEvents")
    public List<Event> findEvents(){
        return eventService.findEvents();
    }
    @GetMapping("/findByEventId/Id/{eventId}")
    public Event findByEventId(@PathVariable int eventId){
        return eventService.findByEventId(eventId);
    }
    @PostMapping("/addEvent")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }
    @DeleteMapping("/deleteEvent/eventId/{EventId}")
    public void deleteEvent(@PathVariable int eventId){
        eventService.deleteEvent(eventId);
    }
    @PutMapping("/updateEvent/Id/{eventId}")
    public void updateEvent(@PathVariable int eventId,@RequestBody Event event){
        eventService.updateEvent(eventId,event);
    }

}
