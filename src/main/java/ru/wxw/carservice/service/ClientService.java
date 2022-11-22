package ru.wxw.carservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wxw.carservice.dto.ClientDTO;
import ru.wxw.carservice.entity.Client;
import ru.wxw.carservice.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private final ClientRepository clientRepository;
    @Autowired
    private final ModelMapper mapper;

    public ClientService(ClientRepository clientRepository, ModelMapper mapper) {
        this.clientRepository = clientRepository;
        this.mapper = mapper;
    }
    public List<ClientDTO> getAll(){
        return clientRepository.findAll()
                .stream()
                .map(c -> mapper.map(c, ClientDTO.class)).toList();
    }

    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        return client != null
                ? mapper.map(client, ClientDTO.class)
                : null;
    }

    public ClientDTO create(ClientDTO clientDTO) {
        Client client = clientRepository.save(mapper.map(clientDTO, Client.class));
        return mapper.map(client, ClientDTO.class);
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    public ClientDTO update(ClientDTO clientDTO) {
        Client client = clientRepository.save(mapper.map(clientDTO, Client.class));
        return mapper.map(client, ClientDTO.class);
    }
}
