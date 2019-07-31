package mx.com.quartz.persistence.entities;
// Generated 31/07/2019 10:40:26 AM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Capitulo generated by hbm2java
 */
@Entity
@Table(name = "Capitulo", catalog = "garnet")
public class Capitulo implements java.io.Serializable {

	private Integer idCapitulo;
	private Anime anime;
	private String nombre;
	private int numero;
	private int duracion;
	private int temporada;

	public Capitulo() {
	}

	public Capitulo(Anime anime, String nombre, int numero, int duracion, int temporada) {
		this.anime = anime;
		this.nombre = nombre;
		this.numero = numero;
		this.duracion = duracion;
		this.temporada = temporada;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCapitulo", unique = true, nullable = false)
	public Integer getIdCapitulo() {
		return this.idCapitulo;
	}

	public void setIdCapitulo(Integer idCapitulo) {
		this.idCapitulo = idCapitulo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAnime", nullable = false)
	public Anime getAnime() {
		return this.anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "numero", nullable = false)
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Column(name = "duracion", nullable = false)
	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Column(name = "temporada", nullable = false)
	public int getTemporada() {
		return this.temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

}