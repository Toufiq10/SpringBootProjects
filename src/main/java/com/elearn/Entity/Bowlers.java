package com.elearn.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Bowlers {
    @Id
    private String name;
    private String wickets;
    private String average;
    private String best;
    private String matches;
}
