package com.example.projectservice.data.dao;

import com.example.projectservice.data.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskDAO extends JpaRepository<Task, Long> {
    List<Task> findAllByActiveFlag(Long activeFlag);
}
