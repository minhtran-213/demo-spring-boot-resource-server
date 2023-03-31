package com.example.demo.controller;

import java.security.Principal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

  @PostMapping("/test")
  @PreAuthorize("hasRole('user')")
  public String getString(@RequestBody String title, Principal principal) {
    return principal.getName();
  }
}
