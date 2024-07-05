package br.mil.eb.hmilacg.taf.Entities;

import jakarta.persistence.*;
import jdk.jfr.Description;

public class Run {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private Long id;
    @Column(name = "r_age_min")
    private Integer age_min;
    @Column(name = "r_age_max")
    private Integer age_max;
    @Column(name = "r_index_min")
    private Integer index_min;
    @Column(name = "r_index_max")
    private Integer index_max;

    @ManyToOne
    @JoinColumn(name = "categories_c_id")
    @Column(name = "r_category")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "genger_g_id")
    @Column(name = "r_genger")
    private Genger genger;

    @ManyToOne
    @JoinColumn(name = "score_s_id")
    @Column(name = "r_score")
    private Score score;



    public Run(){}



}
