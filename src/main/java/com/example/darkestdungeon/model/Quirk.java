package com.example.darkestdungeon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToMany(mappedBy="quirks")
    @JsonIncludeProperties({"id", "nome"})
    private Set<Heroi> herois;
}
