package br.com.fiap.movies.model;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
@Entity
public class Filme {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id; 
	private String titulo;
	private String sinopse;
	private String genero;
	private String ondeAssistir;
	private boolean assistido;
	private int avaliacao;
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		EntityManagerFactory factory =
		Persistence.createEntityManagerFactory("Filme");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(titulo);
		manager.getTransaction().commit();
		
		manager.close();
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getOndeAssistir() {
		return ondeAssistir;
	}

	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}

	public boolean isAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Missao [detalhes=" + titulo + ", Observacoes=" + sinopse + ", Condicoes Climaticas=" + genero + ", Condicoes de Pouso="
				+ ondeAssistir + ", Abortar=" + assistido + ", avaliacao=" + avaliacao + "0%]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
