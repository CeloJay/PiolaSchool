package com.br.piolaschool.entidade.professor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "professor")
@Entity(name = "professor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "matricula")
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private Long matricula;
    
    private String usuario;

    private String email;

    private String senha;

    private int telefone;

    
}
