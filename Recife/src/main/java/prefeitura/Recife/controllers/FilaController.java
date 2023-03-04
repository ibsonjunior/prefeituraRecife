package prefeitura.Recife.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prefeitura.Recife.model.Fila;

import prefeitura.Recife.repositories.FilaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/fila")
public class FilaController {
    @Autowired
    FilaRepository filaRepository;

    @GetMapping
    public Set<Fila> fila() {
        return (Set<Fila>) filaRepository.findAll();
    }

}
