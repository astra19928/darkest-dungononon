package com.example.darkestdungeon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name="quirk_heroi",
            joinColumns = @JoinColumn(name="id_heroi"),
            inverseJoinColumns = @JoinColumn(name="id_quirk")
    )
    private Set<Quirk> quirks;
}
