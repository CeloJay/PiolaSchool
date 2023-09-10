package com.br.piolaschool.entidade.aluno;

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

@Table(name = "aluno")
@Entity(name = "aluno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "matricula")
public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private Long matricula;
    
    private String nome_completo;

    private String email;

    private int telefone;

    private String senha;


}
