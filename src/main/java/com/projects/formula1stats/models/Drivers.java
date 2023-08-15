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
public class Drivers {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column
    private String name;

    @Column
    private String nationality;

    @Column
    private LocalDate birthDate;

    @Column
    private String team;

    @Column
    private Long wins;

    @Column
    private Long poles;

    @Column
    private Long podiums;

    @Column
    private Long races;
}
