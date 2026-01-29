package co.epvtecnologia.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/private/producto")
public class ProductoPrivateCrontroller {

    @GetMapping
    public ResponseEntity<?> obtenerProducto(){
        return ResponseEntity.ok("Metodo private producdt");
    }
}

