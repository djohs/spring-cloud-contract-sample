package de.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello(@RequestParam String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
