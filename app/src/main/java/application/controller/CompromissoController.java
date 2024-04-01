package application.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompromissoController {
    @GetMapping("/teste/{data}")
    public String teste(
        @PathVariable("data")
        @DateTimeFormat(pattern = "dd-MM-yyyy") Date data) {
        return "Retorno: " + data;
    }
}
