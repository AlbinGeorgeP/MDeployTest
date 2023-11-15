package com.ManualDeployTest.ManualDeployTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/V1/DatabaseFetch")
public class Controller {

    @Autowired
    Repo repo;
    @GetMapping(value="getUSer",produces = "application/json")
    public List<user> GetUser()
    {
        return repo.findAll();
    }
}
