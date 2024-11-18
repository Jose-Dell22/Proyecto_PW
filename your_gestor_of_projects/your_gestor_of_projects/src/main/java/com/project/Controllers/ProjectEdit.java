package com.project.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.Services.projectservice;
import com.project.dto.Project_Table;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("ProjectEdit")
public class ProjectEdit {

@Autowired
private projectservice service;

@PostMapping("/Edit_entity")
public void Edit_entity (@RequestBody com.project.dto.Project_Table Project_Table) {
    service.Edit_entity(Project_Table);
}
@GetMapping("/get_project")
public List <Project_Table> get_entity(){
    return service.get_entity();
}
}


