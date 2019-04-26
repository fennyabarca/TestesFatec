package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {
	
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
//verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarLivroComDadosInvalidos() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarLivroComDadosInvalidos() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn(null);
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT04TituloInvalido() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("1111");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT05TituloNulo() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("1111");
			umLivro.setTitulo(null);
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
	}
	
	//------------------------------------------------------Autor
	@Test
	public void CT06CadastrarautorComDadosValidos() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
//verificacao
			fail("nao deve falhar");
		}
	
	}
	
	@Test
	public void CT07CadastrarAutorComDadosInvalidos() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("");
		} catch (RuntimeException e) {
//verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
	}
	@Test
	public void CT08CadastrarAutorComDadosNulo() {
		try {
//cenario
			Livro umLivro = new Livro();
//acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor(null);
		} catch (RuntimeException e) {
//verificacao
			assertEquals("Autor nulo",e.getMessage());
		}
	}	
}