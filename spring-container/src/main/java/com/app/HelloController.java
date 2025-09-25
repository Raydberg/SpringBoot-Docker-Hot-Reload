package com.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> sakudo() {
        return ResponseEntity.ok("Hola mundo desde contenedor de docker testing dadadsada");
    }

}
