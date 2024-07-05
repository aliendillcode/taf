package br.mil.eb.hmilacg.taf.Entities;

import jakarta.persistence.*;
@Entity
@Table(name = "plank")
public class Plank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;
    @Column(name = "p_age_min")
    private Integer age_min;
    @Column(name = "p_age_max")
    private Integer age_max;
    @Column(name = "p_index_min")
    private Integer index_min;
    @Column(name = "p_index_max")
    private Integer index_max;

    @ManyToOne
    @JoinColumn(name = "categories_c_id")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "genger_g_id")
    private Genger genger;

    @ManyToOne
    @JoinColumn(name = "score_s_id")
    private Score score;
}
