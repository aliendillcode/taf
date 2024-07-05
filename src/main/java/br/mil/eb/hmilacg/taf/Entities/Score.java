package br.mil.eb.hmilacg.taf.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "score")
@Getter
@Setter
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Integer id;
    @Column(name = "s_description")
    private String description;
    @Column(name = "s_short")
    private String s_short;
}
