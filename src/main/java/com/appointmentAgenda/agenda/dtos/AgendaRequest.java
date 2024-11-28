package com.appointmentAgenda.agenda.dtos;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record AgendaRequest(
    @NotBlank(message = "Nome não pode estar vázio.")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "O nome só pode conter letras e espaços.")
    String name,

    @NotBlank(message = "Local não pode estar vazio")
    @Size(min = 2, message = "Tamanho minimo deve ser de 2 caracteres!")
    String local,
    
    @NotBlank(message = "Local não pode estar vazio")
    @FutureOrPresent(message = "A data deve ser no futuro ou no presente.")
    String date
    ) {
    
}
