package br.mil.eb.hmilacg.taf.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "crunch")
@Getter
@Setter
@NoArgsConstructor
public class Crunch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long id;
    @Column(name = "c_age_min")
    private Integer age_min;
    @Column(name = "c_age_max")
    private Integer age_max;
    @Column(name = "c_index_min")
    private Integer index_min;
    @Column(name = "c_index_max")
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
