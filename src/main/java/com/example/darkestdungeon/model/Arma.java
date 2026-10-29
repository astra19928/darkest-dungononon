package com.example.darkestdungeon.model;

import jakarta.persistence.*;
import lombok.*;

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
    private Heroi heroi;

    @Column(length = 30)
    private String nome;

    @Column(length = 100)
    private String descricao;

    @Column
    private Integer poder;
}
