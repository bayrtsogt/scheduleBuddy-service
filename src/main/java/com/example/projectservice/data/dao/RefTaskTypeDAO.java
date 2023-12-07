package com.example.projectservice.data.dao;

import com.example.projectservice.data.entity.RefTaskType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefTaskTypeDAO extends JpaRepository<RefTaskType, Long> {

    List<RefTaskType> findAllByActiveFlag(Long activeFlag);
}
