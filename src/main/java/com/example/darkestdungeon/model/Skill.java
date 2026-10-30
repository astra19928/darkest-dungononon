package com.example.darkestdungeon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(length = 30)
    private String nome;

    @Column(length = 50)
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_heroi")
    @JsonBackReference
    private Heroi heroi;
}
