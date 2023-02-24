package com.example.universityEventManagement.repository;

import com.example.universityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEventRepo extends JpaRepository<Event,Integer> {

}
