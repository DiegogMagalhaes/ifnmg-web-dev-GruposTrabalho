package com.github.DiegogMagalhaes.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.github.DiegogMagalhaes.modelo.Atuacao;
import com.github.DiegogMagalhaes.modelo.Endereco;
import com.github.DiegogMagalhaes.modelo.Grupo;
import com.github.DiegogMagalhaes.modelo.Pessoa;
import com.github.DiegogMagalhaes.modelo.Telefone;
import com.github.DiegogMagalhaes.modelo.TipoLogradouro;

@Singleton
@Startup
public class CargaDados implements CargaDadosLocal{
	
	@PersistenceContext
    private EntityManager em;
	
	@PostConstruct
	@Override
	public void popularBanco() {
		Endereco endereco;
		Telefone telefone;
		Grupo grupo;
		Atuacao atuacao;
		
		DateFormat dataformat = new SimpleDateFormat("dd-MM-yyyy");
		
		Pessoa anaZaira = new Pessoa();
		Pessoa beatrizYana = new Pessoa();
		Pessoa ceciliaXerxes = new Pessoa();
		Pessoa deboraWendel = new Pessoa();
		
		//Cadastrando Ana Zaira
		
		anaZaira.setNome("Ana Zaira");
		anaZaira.setEmail("ana@mail.com");
		anaZaira.setNasciemento(LocalDate.of(2001, 1, 1));
		
		endereco = new Endereco();
		endereco.setLogradouro("RUA 1");
		endereco.setTipoLogradouro(TipoLogradouro.RUA);
		endereco.setNumero(1111);
		endereco.setBairro("Bairro Humberto");
		
		anaZaira.setEndereco(endereco);
		
		telefone = new Telefone();
		telefone.setDdd(new Integer(11).byteValue());
		telefone.setNumero(11111111);
		telefone.setPessoa(anaZaira);
		em.persist(telefone);
		
		telefone = new Telefone();
		telefone.setDdd(new Integer(12).byteValue());
		telefone.setNumero(12121212);
		telefone.setPessoa(anaZaira);
		em.persist(telefone);
		
		telefone = new Telefone();
		telefone.setDdd(new Integer(13).byteValue());
		telefone.setNumero(13131313);
		telefone.setPessoa(anaZaira);
		em.persist(telefone);
		
		
		em.persist(anaZaira);
		
		
		//Cadastrando Beatriz Yana
		
		beatrizYana.setNome("Beatriz Yana");
		beatrizYana.setEmail("beatriz@mail.com");
		beatrizYana.setNasciemento(LocalDate.of(2002, 2, 2));
		
		endereco = new Endereco();
		endereco.setLogradouro("AVEVINA 2");
		endereco.setTipoLogradouro(TipoLogradouro.AVENIDA);
		endereco.setNumero(2222);
		endereco.setBairro("Bairro Doisberto");
		em.persist(endereco);
		
		beatrizYana.setEndereco(endereco);
		
		telefone = new Telefone();
		telefone.setDdd(new Integer(22).byteValue());
		telefone.setNumero(22222222);
		telefone.setPessoa(beatrizYana);
		em.persist(telefone);
		
		em.persist(beatrizYana);
		
		
		//Cadastrando Cecília Xerxes
		
		ceciliaXerxes.setNome("Cecília Xerxes");
		ceciliaXerxes.setEmail("cecilia@mail.com");
		ceciliaXerxes.setNasciemento(LocalDate.of(2003, 3, 3));
		
		endereco = new Endereco();
		endereco.setLogradouro("AVEVINA 3");
		endereco.setTipoLogradouro(TipoLogradouro.AVENIDA);
		endereco.setNumero(3333);
		endereco.setBairro("Bairro Trêsberto");
		em.persist(endereco);
		
		ceciliaXerxes.setEndereco(endereco);
		
		em.persist(ceciliaXerxes);
		
		//Cadastrando Débora Wendel
		
		deboraWendel.setNome("Débora Wendel");
		deboraWendel.setEmail("debora@mail.com");
		deboraWendel.setNasciemento(LocalDate.of(2004, 4, 4));
		
		endereco = new Endereco();
		endereco.setLogradouro("PRACA 4");
		endereco.setTipoLogradouro(TipoLogradouro.PRACA);
		endereco.setNumero(4444);
		endereco.setBairro("Bairro Quatroberto");
		em.persist(endereco);
		
		deboraWendel.setEndereco(endereco);
		
		telefone = new Telefone();
		telefone.setDdd(new Integer(44).byteValue());
		telefone.setNumero(444444444);
		telefone.setPessoa(deboraWendel);
		em.persist(telefone);
		
		telefone = new Telefone();
		telefone.setDdd(new Integer(45).byteValue());
		telefone.setNumero(45454545);
		telefone.setPessoa(deboraWendel);
		em.persist(telefone);
		
		em.persist(deboraWendel);
		
		//Grupo Estudo I
		grupo = new Grupo();
		grupo.setAtivo(false);
		grupo.setName("Estudo I");
		grupo.setPessoa(anaZaira);
		em.persist(grupo);
		
		//Atuações Grupo Estudo 1
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("01-01-2011"));
			atuacao.setTermino(dataformat.parse("11-11-2021"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(anaZaira);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("01-01-2012"));
			atuacao.setTermino(dataformat.parse("11-11-2022"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(anaZaira);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("02-01-2012"));
			atuacao.setTermino(dataformat.parse("12-01-2021"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(beatrizYana);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("03-01-2013"));
			atuacao.setTermino(dataformat.parse("13-01-2021"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(ceciliaXerxes);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("04-01-2014"));
			atuacao.setTermino(dataformat.parse("14-01-2021"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(deboraWendel);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);

		
		//Grupo Estudo II
		grupo = new Grupo();
		grupo.setAtivo(true);
		grupo.setName("Estudo II");
		grupo.setPessoa(beatrizYana);
		em.persist(grupo);
		
		//Atuações Grupo Estudo II
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("02-01-2012"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(beatrizYana);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("02-01-2012"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(deboraWendel);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		
		//Grupo Estudo III
		grupo = new Grupo();
		grupo.setAtivo(false);
		grupo.setName("Estudo III");
		grupo.setPessoa(ceciliaXerxes);
		em.persist(grupo);
		
		//Atuações Grupo Estudo 1
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("03-01-2012"));
			atuacao.setTermino(dataformat.parse("13-01-2023"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(beatrizYana);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("03-01-2012"));
			atuacao.setTermino(dataformat.parse("13-01-2023"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(deboraWendel);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		//Grupo Estudo IV
		grupo = new Grupo();
		grupo.setAtivo(true);
		grupo.setName("Estudo IV");
		grupo.setPessoa(beatrizYana);
		em.persist(grupo);
		
		//Atuações Grupo Estudo IV
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("04-01-2012"));
			atuacao.setTermino(dataformat.parse("14-01-2024"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(beatrizYana);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("04-01-2012"));
			atuacao.setTermino(dataformat.parse("14-01-2024"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(ceciliaXerxes);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
		
		atuacao = new Atuacao();
		try {
			atuacao.setInicio(dataformat.parse("04-01-2012"));
			atuacao.setTermino(dataformat.parse("14-01-2024"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		atuacao.setPessoa(deboraWendel);
		atuacao.setGrupo(grupo);
		em.persist(atuacao);
				
	}
	
}
