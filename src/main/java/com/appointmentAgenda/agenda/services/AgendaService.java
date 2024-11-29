package com.appointmentAgenda.agenda.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmentAgenda.agenda.dtos.AgendaRequest;
import com.appointmentAgenda.agenda.dtos.AgendaResponse;
import com.appointmentAgenda.agenda.entities.Agenda;
import com.appointmentAgenda.agenda.mappers.AgendaMapper;
import com.appointmentAgenda.agenda.repositories.AgendaRepository;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository repository;

    public List<AgendaResponse> getAllAgenda() {
        return repository.findAll().stream().map(p -> AgendaMapper.toDTO(p)).collect(Collectors.toList());
    }

    public AgendaResponse saveNewAgenda(AgendaRequest agenda) {
        Agenda newAgenda = repository.save(AgendaMapper.toEntity(agenda));
        return AgendaMapper.toDTO(newAgenda);
    }

    public void uptade(AgendaRequest agenda, long id) {
        Agenda aux = repository.getReferenceById(id);

        aux.setName(agenda.name());
        aux.setLocal(agenda.local());
        aux.setDate(agenda.date());

        repository.save(aux);
    }
}
