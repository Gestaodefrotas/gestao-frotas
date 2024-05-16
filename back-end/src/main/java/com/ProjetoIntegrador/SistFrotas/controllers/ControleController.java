package com.ProjetoIntegrador.SistFrotas.controllers;

import com.ProjetoIntegrador.SistFrotas.dto.ControleDTO;
import com.ProjetoIntegrador.SistFrotas.dto.CriarControleDTO;
import com.ProjetoIntegrador.SistFrotas.entities.Controle;
import com.ProjetoIntegrador.SistFrotas.services.ControleService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping(value = "/controle")
public class ControleController {

    private final ModelMapper modelMapper;

    private final ControleService controleService;

    public ControleController(ModelMapper modelMapper, ControleService controleService) {
        this.modelMapper = modelMapper;
        this.controleService = controleService;
    }

    @PostMapping
    public ResponseEntity<ControleDTO> criaControle(@RequestBody CriarControleDTO criarControleDTO) {
        Controle criarControle = controleService.criarControle(criarControleDTO.getPlaca(), criarControleDTO.getNomeFuncionario(), criarControleDTO.getKmInicial(), criarControleDTO.getKmFinal(), criarControleDTO.getObservacao());

        ControleDTO controleDTO = modelMapper.map(criarControle, ControleDTO.class);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(controleDTO.getId())
                .toUri();
        return ResponseEntity.created(uri).body(controleDTO);
    }

}
