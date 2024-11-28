package com.appointmentAgenda.agenda.mappers;

import com.appointmentAgenda.agenda.dtos.AgendaRequest;
import com.appointmentAgenda.agenda.dtos.AgendaResponse;
import com.appointmentAgenda.agenda.entities.Agenda;

public class AgendaMapper {
    
    public static AgendaResponse toDTO(Agenda agenda) {
        return new AgendaResponse(
            agenda.getId(), 
            agenda.getName(), 
            agenda.getLocal(), 
            agenda.getDate()
        );
    }

    public static Agenda toEntity(AgendaRequest agendaRequest) {
        Agenda agenda = new Agenda();
        agenda.setName(agendaRequest.name());
        agenda.setLocal(agendaRequest.local());
        agenda.setDate(agendaRequest.date());

        return agenda;
    }
}
