package com.example.backlenguajesformales.controllers;

import com.example.backlenguajesformales.services.CedulaValidationService;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/cedula")
public class CedulaValidationController {
    @Autowired
    private CedulaValidationService cedulaValidationService;

    @GetMapping("/validate")
    public ResponseEntity<String> validateCedula() {
        try {
            Response response = cedulaValidationService.validateCedula();
            // Aquí procesa la respuesta de la API externa y construye el JSON de respuesta
            String jsonResponse = "{\n" +
                    "    \"id\": 1,\n" +
                    "    \"firstName\": \"Daniel Santiago\",\n" +
                    "    \"lastName\": \"Silva Fonseca\",\n" +
                    "    \"cedula\": \"1002527958\",\n" +
                    "    \"rol\": \"jurado\",\n" +
                    "    \"table\": \"M1\",\n" +
                    "    \"ubication\": \"Laguito\"\n" +
                    "}";
            return ResponseEntity.ok(jsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al validar la cédula");
        }
    }
}
