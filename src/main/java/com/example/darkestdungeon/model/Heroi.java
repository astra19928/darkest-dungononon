package com.example.darkestdungeon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="heroi")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Heroi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(length = 20)
    private String nome;

    @Column(length = 15)
    private String classe;

    @OneToOne(mappedBy = "arma")
    private Arma arma;
}
