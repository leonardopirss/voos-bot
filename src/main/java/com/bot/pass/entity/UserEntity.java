package com.bot.pass.entity;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "USER", schema = "BOT")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE")
    private String role;

    @OneToMany
    private List<PreferenceEntity> preference;
}
