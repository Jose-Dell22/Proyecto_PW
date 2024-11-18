package com.project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.Repository.Projectrepository;
import com.project.dto.Project_Table;



@Service
public class projectservice {

    @Autowired
    private Projectrepository repository;

    public void Edit_entity (@RequestBody com.project.dto.Project_Table Project_Table){
        repository.Edit_entity(Project_Table);
    }
    public List<Project_Table> get_entity() {
       return repository.get_entity();
    }
}
