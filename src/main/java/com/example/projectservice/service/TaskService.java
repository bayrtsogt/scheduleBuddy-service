package com.example.projectservice.service;

import com.example.projectservice.data.dao.RefTaskTypeDAO;
import com.example.projectservice.data.entity.RefTaskType;
import com.example.projectservice.data.entity.Task;
import com.example.projectservice.data.dao.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    TaskDAO taskDAO;

    @Autowired
    RefTaskTypeDAO refTaskTypeDAO;
    public ResponseEntity<List<Task>> findAllByActiveFlag(Long activeFlag){
        return ResponseEntity.ok(taskDAO.findAllByActiveFlag(activeFlag));
    }
    public ResponseEntity<List<RefTaskType>> findAllTypeByActiveFlag(Long activeFlag){
        return ResponseEntity.ok(refTaskTypeDAO.findAllByActiveFlag(activeFlag));
    }
    public ResponseEntity<Task> saveTask(String name, Long type, String endDate, String endTime){
        Task task = new Task();
        task.setName(name);
        task.setType(type);
        task.setEndDate(endDate);
        task.setEndTime(endTime);
        task.setActiveFlag(1L);
        task.setVersion(1L);
        return ResponseEntity.ok(taskDAO.save(task));
    }

}
