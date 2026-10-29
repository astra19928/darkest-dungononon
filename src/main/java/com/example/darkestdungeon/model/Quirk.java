package com.example.darkestdungeon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "quirk")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Quirk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(length = 30)
    private String nome;

    @Column(length = 100)
    private String efeito;

    @ManyToMany(mappedBy="quirk_heroi")
    private Set<Heroi> herois;
}
