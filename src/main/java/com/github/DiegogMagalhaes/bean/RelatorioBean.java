package com.github.DiegogMagalhaes.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.github.DiegogMagalhaes.modelo.Pessoa;
import com.github.DiegogMagalhaes.modelo.TipoLogradouro;

@Stateless
public class RelatorioBean {

	@PersistenceContext
    private EntityManager em;
	
	public List<Pessoa> selectAllPessoaQuery(){
		Query q = em.createQuery("Select p FROM Pessoa p");
		return q.getResultList();
	}
	
	public List<Pessoa> selectAllPessoaTypedQuery(){
		TypedQuery q = em.createQuery("Select p FROM Pessoa p", Pessoa.class);
		return q.getResultList();
	}
	
	public List<Pessoa> selectAllPessoaNamedQuery(){
		return em.createNamedQuery("Pessoa.findAll", Pessoa.class).getResultList();
	}
	
	public List<String> selectAllPessoaNomeQuery(){
		Query q = em.createQuery("Select p.nome FROM Pessoa p");
		return q.getResultList();
	}
	
	public List<String> selectAllPessoaNomeTypedQuery(){
		TypedQuery q = em.createQuery("Select p.nome FROM Pessoa p", String.class);
		return q.getResultList();
	}
	
	public List<String> selectAllPessoaNomeNamedQuery(){
		return em.createNamedQuery("Pessoa.findAllNome", String.class).getResultList();
	}
	
	public List<Pessoa> selectAllPessoaNomeEnderecoQuery(){
		Query q = em.createQuery("Select p.nome, p.endereco FROM Pessoa p");
		return q.getResultList();
	}
	
	public List<Object[]> selectAllPessoaNomeEnderecoTypedQuery(){
		TypedQuery q = em.createQuery("Select p.nome, p.endereco FROM Pessoa p", Object[].class);
		return q.getResultList();
	}
	
	public List<Object[]> selectAllPessoaNomeEnderecoNamedQuery(){
		return em.createNamedQuery("Pessoa.findAllNomeEndereco", Object[].class).getResultList();
	}
	
	public List<Pessoa> selectAllPessaoByAvenidaQuery(){
		Query q = em.createQuery("Select p FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1");
		return q.getResultList();
	}
	
	public List<Pessoa> selectAllPessaoByAvenidaTypedQuery(){
		TypedQuery q = em.createQuery("Select p FROM Pessoa p WHERE p.endereco.tipoLogradouro = 1", Pessoa.class);
		return q.getResultList();
	}
	
	public List<Pessoa> selectAllPessaoByAvenidaNamedQuery(){
		return em.createNamedQuery("Pessoa.findAllByAvenida").getResultList();
		
	}
	

	public List<Pessoa> selectAllPessaoDiffPracaQuery(){
		Query q = em.createQuery("Select p FROM Pessoa p WHERE p.endereco.tipoLogradouro != 3");
		return q.getResultList();
	}
	
	public List<Pessoa> selectAllPessaoDiffPracaTypedQuery(){
		TypedQuery q = em.createQuery("Select p FROM Pessoa p WHERE p.endereco.tipoLogradouro != 3", Pessoa.class);
		return q.getResultList();
	}
	
	public List<Pessoa> selectAllPessaoDiffPracaNamedQuery(){
		return em.createNamedQuery("Pessoa.findAllDiffPraca").getResultList();
		
	}

}
