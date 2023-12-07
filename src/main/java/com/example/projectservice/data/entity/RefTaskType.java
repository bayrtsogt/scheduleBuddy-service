package com.example.projectservice.data.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name ="ref_task_type", schema = "schedulebuddy")
public class RefTaskType {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="ACTIVE_FLAG")
    private Long activeFlag;
}
