package br.com.devsenior.kube_argo_kust.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeResource {

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        String health = "Status Ok Now " + Instant.now();
        return ResponseEntity.ok(health);
    }
    
}
