package ru.wxw.carservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wxw.carservice.dto.ClientDTO;
import ru.wxw.carservice.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public List<ClientDTO> getAll() {
         return clientService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getById(@PathVariable("id")Long id) {
        ClientDTO clientDTO = clientService.findById(id);
        return clientDTO != null
                ? new ResponseEntity<>(clientDTO, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @PostMapping()
    public ResponseEntity<ClientDTO> create(@RequestBody ClientDTO clientDTO) {
        clientDTO = clientService.create(clientDTO);
        return clientDTO != null
                ? new ResponseEntity<>(clientDTO, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        clientService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ClientDTO> update(@RequestBody ClientDTO clientDTO) {
        clientDTO = clientService.update(clientDTO);
        return clientDTO != null
                ? new ResponseEntity<>(clientDTO, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
