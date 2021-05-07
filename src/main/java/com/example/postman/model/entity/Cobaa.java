package com.example.postman.model.entity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = Cobaa.TABLEDOSEN)
public class Cobaa {
    public static final String TABLEDOSEN = "t_dosen";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator=TABLEDOSEN)
    @SequenceGenerator(name = TABLEDOSEN, sequenceName = "t_dosen_seq")

    private String alamat;
    private String namaDosen;

}