package com.ricemarch.personnel_management_system.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double credit;

    private double lowsetSorce;

    private int weight;

    @OneToMany(mappedBy = "course")
    private List<Elective> electives;

    @OneToOne
    private Teacher teacher;

    public Course(String name, double credit) {
        this.name = name;
        this.credit = credit;
    }
}
