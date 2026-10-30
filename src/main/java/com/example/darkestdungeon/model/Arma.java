package com.example.darkestdungeon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "arma")

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_heroi", referencedColumnName = "id")
    @JsonBackReference
    private Heroi heroi;

    @Column(length = 30)
    private String nome;

    @Column(length = 100)
    private String descricao;

    @Column
    private Integer poder;
}
