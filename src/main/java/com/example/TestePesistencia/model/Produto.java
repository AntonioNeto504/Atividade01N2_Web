package com.example.TestePesistencia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity // Indica que esta classe é uma entidade JPA
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo; // Campo ID

    private String nome; // Nome do produto

    private double preco; // Preço do produto
}
