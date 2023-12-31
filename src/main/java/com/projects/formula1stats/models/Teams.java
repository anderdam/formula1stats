package com.projects.formula1stats.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Teams {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String nationality;

    @Column
    private String CreatedAt;

    @Column
    private String director;

    @Column
    private String projetist;

    @Column
    private String firstDriver;

    @Column
    private String secondDriver;

    @Column
    private String testDriver;

    @Column
    private String mainSponsor;
}
