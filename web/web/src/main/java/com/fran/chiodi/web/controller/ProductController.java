package com.tuempresa.autogestionable.controller;//petition receiver from the web LAIN I MISS YOU

import com.tuempresa.autogestionable.model.Producto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;//activates the get for the products display
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController//marks the clase as web cvontroller to drive api rest rutes (JSON)
@RequestMapping("/api/productos")//main url LAIN I MISS YOU, any petition that satarts with this router, goes to this controller lain.
@CrossOrigin(origins = "http://localhost:4200") // Permite conexión con Angular
public class ProductoController {

