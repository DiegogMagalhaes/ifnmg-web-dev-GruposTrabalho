package com.github.DiegogMagalhaes.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@NamedQueries({
	@NamedQuery(
	name =  "Pessoa.findAll",
	query = "SELECT p FROM Pessoa p"),
	@NamedQuery(
	name =  "Pessoa.findAllNome",
	query = "SELECT p.nome FROM Pessoa p"),
	@NamedQuery(
	name =  "Pessoa.findAllNomeEndereco",
	query = "SELECT p.nome, p.endereco FROM Pessoa p"),
	@NamedQuery(
	name =  "Pessoa.findAllByAvenida",
	query = "Select p FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1"),
	@NamedQuery(
	name =  "Pessoa.findAllDiffPraca",
	query = "Select p FROM Pessoa p WHERE p.endereco.tipoLogradouro != 3"),
})

@Table(name = "Pessoa")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 5844208459165419526L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 65)
	private String nome;
	
	@Column(length = 250)
	private String email;
	
	private LocalDate nasciemento;
	
	@Transient
	private Byte idade;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Grupo> gruposLider;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Telefone> telefones;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id")
	@JsonbTransient
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getNasciemento() {
		return nasciemento;
	}
	public void setNasciemento(LocalDate nasciemento) {
		this.nasciemento = nasciemento;
	}
	
	public Byte getIdade() {
		return idade;
	}
	public void setIdade(Byte idade) {
		this.idade = idade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Grupo> getGruposLider() {
		return gruposLider;
	}
	public void setGruposLider(List<Grupo> gruposLider) {
		this.gruposLider = gruposLider;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", nasciemento=" + nasciemento + ", idade="
				+ idade + ", gruposLider=" + gruposLider + ", telefones=" + telefones + ", endereco=" + endereco + "]";
	}
	
	
	
}
