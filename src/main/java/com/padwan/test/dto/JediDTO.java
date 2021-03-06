package com.padwan.test.dto;

import com.padwan.test.entity.Jedi;
import com.padwan.test.entity.enums.Status;

public class JediDTO {

    private Integer id;
    private String nome;
    private Status status;
    private String mentor;
    private Integer midichlorians;
    
    public JediDTO() {

    }

    public JediDTO(Jedi jedi) {
        this.id = jedi.getId();
        this.nome = jedi.getNome();
        this.status = jedi.getStatus();
        this.mentor = jedi.getMentor();
        this.midichlorians = jedi.getMidichlorians();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public Integer getMidichlorians() {
		return midichlorians;
	}

	public void setMidichlorians(Integer midichlorians) {
		this.midichlorians = midichlorians;
	}
}
