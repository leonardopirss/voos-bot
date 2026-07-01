package com.bot.pass.entity;

import jakarta.persistence.*;
import java.util.Date;

@Table(name = "PREFERENCE", schema = "BOT")
public class PreferenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity user;

    @Column(name = "DT_INITIAL")
    private Date dtInitial;

    @Column(name = "DT_FINAL")
    private Date dtFinal;

    @Column(name = "ORIGIN")
    private String origin;

    @Column(name = "DESTINATION")
    private String destination;

    @Column(name = "ENABLED")
    private Integer enabled;

    @Column (name = "PRICE")
    private Double price;

    @Column(name = "AIR_COMPANY")
    private String airCompany;
}
