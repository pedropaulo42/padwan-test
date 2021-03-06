package com.padwan.test.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.padwan.test.dto.JediDTO;
import com.padwan.test.service.JediService;

@RestController
@RequestMapping("/jedi")
public class JediController {

    @Autowired
    private JediService service;

    @GetMapping(value = "")
    public ResponseEntity<Object> todos() {
        List<JediDTO> jedis = service.findAll();
        return new ResponseEntity(jedis, HttpStatus.OK);
    }

    @PostMapping(value = "")
    public ResponseEntity<Object> incluirJedi(@RequestBody JediDTO jediDTO) {
        JediDTO novoJedi = service.incluir(jediDTO);
        return new ResponseEntity(novoJedi, HttpStatus.OK);
    }
    
    @ResponseBody
    @RequestMapping(value = "/mestresEAprendizes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> mestresEAprendizes() {
    	List<JediDTO> jedis = service.mestresEAprendizes();
    	return new ResponseEntity(jedis, HttpStatus.OK);
    }
    
    @ResponseBody
    @RequestMapping(value = "/midichlorians9K", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> midichlorians9K() {
    	List<JediDTO> jedis = service.midichlorians9K();
    	return new ResponseEntity(jedis, HttpStatus.OK);
    }
    
    @ResponseBody
    @RequestMapping(value = "/quantidadeCategoria", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> quantidadeCategoria() {
    	List<Object> jedis = service.quantidadeCategoria();
    	return new ResponseEntity(jedis, HttpStatus.OK);
    }
}
