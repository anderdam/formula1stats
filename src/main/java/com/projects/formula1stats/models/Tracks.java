package com.projects.formula1stats.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Pilots {
    @Id
    Long id;
    String name;
    String nationality;
    LocalDate birthDate;
    Teams team;
    Long wins;
    Long poles;
    Long podiums;
    Long races;
}
