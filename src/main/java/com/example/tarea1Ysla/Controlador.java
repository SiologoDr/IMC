package com.example.tarea1Ysla;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/imc")

public class Controlador {
    //Capturar Objetos
    @GetMapping
    public String calcularIMC(@RequestParam double peso, @RequestParam double altura){
        if (peso <= 0 || altura <= 0){
            return "Datos invalidos";
        }
        double imc = peso / (altura * altura);
        String interpretacion;
        if (imc < 18.5){
            interpretacion = "Bajo peso";
        } else if (imc < 25){
            interpretacion = "Normal";
        } else if (imc < 30){
            interpretacion = "Sobrepeso";
        } else {
            interpretacion = "Obesidad";
        }
        return String.format("El indice de masa corporal es: %.2f - %s", imc, interpretacion);
    }
}
