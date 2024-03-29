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
 * ElencoAnime generated by hbm2java
 */
@Entity
@Table(name = "ElencoAnime", catalog = "garnet")
public class ElencoAnime implements java.io.Serializable {

	private Integer idElencoAnime;
	private Anime anime;
	private Elenco elenco;

	public ElencoAnime() {
	}

	public ElencoAnime(Anime anime, Elenco elenco) {
		this.anime = anime;
		this.elenco = elenco;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idElencoAnime", unique = true, nullable = false)
	public Integer getIdElencoAnime() {
		return this.idElencoAnime;
	}

	public void setIdElencoAnime(Integer idElencoAnime) {
		this.idElencoAnime = idElencoAnime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAnime", nullable = false)
	public Anime getAnime() {
		return this.anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idElenco", nullable = false)
	public Elenco getElenco() {
		return this.elenco;
	}

	public void setElenco(Elenco elenco) {
		this.elenco = elenco;
	}

}
