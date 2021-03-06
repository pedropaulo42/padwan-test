package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padwan.test.dto.JediDTO;
import com.padwan.test.entity.Jedi;
import com.padwan.test.repository.JediRepository;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<JediDTO> findAll() {
        List<Jedi> jedis = repository.findAll();
        List<JediDTO> listJedis = new ArrayList<>();
        jedis.forEach(it -> listJedis.add(new JediDTO(it)));
        return listJedis;
    }

    public JediDTO incluir(JediDTO jediDTO) {
        Jedi jedi = new Jedi();
        jedi.setId(jediDTO.getId());
        jedi.setNome(jediDTO.getNome());
        return new JediDTO(repository.save(jedi));
    }
    
    public List<JediDTO> mestresEAprendizes() {
    	List<Jedi> jedis = repository.mestresEAprendizes();
    	List<JediDTO> listJedis = new ArrayList<>();
    	jedis.forEach(it -> listJedis.add(new JediDTO(it)));
    	return listJedis;
    }
    
    public List<JediDTO> midichlorians9K() {
    	List<Jedi> jedis = repository.midichlorians9K();
    	List<JediDTO> listJedis = new ArrayList<>();
    	jedis.forEach(it -> listJedis.add(new JediDTO(it)));
    	return listJedis;
    }
    
    public List<Object> quantidadeCategoria() {
    	return repository.quantidadeCategoria();
    }
}
