package com.example.projectservice.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="tasks", schema = "schedulebuddy")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="TYPE")
    private Long type;

    @Column(name="END_DATE")
    private String endDate;

    @Column(name="END_TIME")
    private String endTime;

    @Column(name="ACTIVE_FLAG")
    private Long activeFlag;

    @Column(name="VERSION")
    private Long version;

}
