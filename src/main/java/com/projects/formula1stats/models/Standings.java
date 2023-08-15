package com.projects.formula1stats.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class Standings {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String driver;

    @Column
    private String team;

    @Column
    private LocalDate birthDate;

    @Column
    private Long wins;

    @Column
    private Long poles;

    @Column
    private Long podiums;

    @Column
    private Long races;
}
