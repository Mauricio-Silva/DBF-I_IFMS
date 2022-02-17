package br.edu.ifms.frame1.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    UUID id;
    String nome;
    String email;
}

//Data - Getters e Setters
//AllArgsConstructor - Construtor Completo Automático
//NoArgsConstructor - Retira Construtor de Default