package com.projects.formula1stats.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Tracks {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String gpName;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private LocalDate weekStart;

    @Column
    private LocalDate weeEnd;

    @Column
    private Long distance;

    @Column
    private Long laps;

    @Column
    private Long kmPerLap = getDistance()/getLaps();

    @Column
    private LocalDate atF1Since;
}
