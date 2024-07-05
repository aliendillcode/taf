package br.mil.eb.hmilacg.taf.Entities;

import jakarta.persistence.*;
import jdk.jfr.Description;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "run")
@Getter
@Setter
@NoArgsConstructor
public class Run {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "age_min")
    private Integer age_min;
    @Column(name = "age_max")
    private Integer age_max;
    @Column(name = "index_min")
    private Integer index_min;
    @Column(name = "index_max")
    private Integer index_max;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "genger_id")
    private Genger genger;

    @ManyToOne
    @JoinColumn(name = "score_id")
    private Score score;


}
