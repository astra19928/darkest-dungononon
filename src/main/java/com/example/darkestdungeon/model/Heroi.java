package com.example.darkestdungeon.model;

import com.fasterxml.jackson.annotation.*;
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

    @OneToOne(mappedBy = "heroi")
    @JsonManagedReference
    private Arma arma;

    @OneToMany
    @JoinColumn(name = "id_heroi")
    @JsonManagedReference
    private Set<Skill> skills;

    @ManyToMany
    @JoinTable(
            name="quirk_heroi",
            joinColumns = @JoinColumn(name="id_heroi"),
            inverseJoinColumns = @JoinColumn(name="id_quirk")
    )
    @JsonIgnoreProperties("herois")
    private Set<Quirk> quirks;
}
