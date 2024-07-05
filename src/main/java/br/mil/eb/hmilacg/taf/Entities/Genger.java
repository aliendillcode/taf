package br.mil.eb.hmilacg.taf.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "genger")
@Getter
@Setter
@NoArgsConstructor
public class Genger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="description")
    private String description;
    @Column(name = "shortening")
    private String shortening;



}
