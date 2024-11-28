package com.appointmentAgenda.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appointmentAgenda.agenda.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    
}
