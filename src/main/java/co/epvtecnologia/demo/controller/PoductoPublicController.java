package co.epvtecnologia.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("api/public/producto")
public class PoductoPublicController {
    @GetMapping
    public String product() {
        return "Endpoint product public";
    }
}
