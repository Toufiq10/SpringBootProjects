package com.elearn.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Allrounder {
    @Id
    private String name;
    private String matches;
    private String runs;
    private String wickets;
    private String best;
}
