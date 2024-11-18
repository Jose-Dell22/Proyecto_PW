package com.project.Repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.project.dto.Project_Table;
import jakarta.annotation.PostConstruct;

@Repository
public class Projectrepository {
    private List<Project_Table> database;
    @PostConstruct
    public void init(){
        database= new ArrayList<Project_Table>();
    }
    public void Edit_entity(Project_Table project_Table) {
        database.add(project_Table);
        
    }
    public List<Project_Table> get_entity() {
        return database;
    }
    }

