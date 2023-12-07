package com.example.projectservice.controller;

import com.example.projectservice.data.dao.TaskDAO;
import com.example.projectservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskService taskService;
    @Autowired
    TaskDAO taskDAO;
//    @GetMapping("/allTask")
//    public ResponseEntity getAll(){
//        return ResponseEntity.ok(taskService.getAllTasks());
//    }

    @GetMapping("/tasks")
    public ResponseEntity getTasks(){
        return ResponseEntity.ok(taskService.findAllByActiveFlag(1L));
    }

    @GetMapping("/taskType")
    public ResponseEntity getTaskType(){
        return ResponseEntity.ok(taskService.findAllTypeByActiveFlag(1L));
    }

    @GetMapping("/saveTask")
    public ResponseEntity saveTask(@RequestParam("name") String name, @RequestParam("type") Long type, @RequestParam("endDate") String endDate, @RequestParam("endTime") String endTime){
        return ResponseEntity.ok(taskService.saveTask(name, type, endDate, endTime));
    }
}
