package CalculadoraImc.IMC.controller;

import CalculadoraImc.IMC.model.Calculadora;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class CalculadoraController {

    @GetMapping
    public ResponseEntity<String> CalcularImc(@RequestBody Calculadora input) {
        new Calculadora(input.getPeso(), input.getAltura());
        return ResponseEntity.ok(input.getMensagem());

    }
}
