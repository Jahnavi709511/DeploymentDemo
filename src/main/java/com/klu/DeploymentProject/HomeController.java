package com.klu.DeploymentProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping({"/", "/home", "/status"})
    public String getStatus() {
        return "Current date: 09-04-2025";
    }
}
