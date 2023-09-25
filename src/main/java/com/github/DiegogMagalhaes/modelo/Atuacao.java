package com.github.DiegogMagalhaes.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Atuacao")
public class Atuacao implements Serializable{

    private static final long serialVersionUID = -8590868208513862360L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@JsonbTransient
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    
	@JsonbTransient
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "grupo_id")
    private Grupo grupo;
    
    @Temporal(TemporalType.TIMESTAMP) 
	private Date inicio;
    
    @Temporal(TemporalType.TIMESTAMP) 
	private Date termino;
	
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atuacao other = (Atuacao) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Atuacao [id=" + id + ", pessoa=" + pessoa + ", grupo=" + grupo + ", inicio=" + inicio + ", termino="
				+ termino + "]";
	}
	
	
	
}
