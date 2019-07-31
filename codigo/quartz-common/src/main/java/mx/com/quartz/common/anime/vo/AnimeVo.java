package mx.com.quartz.common.anime.vo;

public class AnimeVo {
    private Integer idAnime;
    private AutorVo autor;
    private ClasificacionVo clasificacion;
    private GeneroVo genero;
    private String nombre;
    private String sinopsis;
    private Integer calificacion;

    public Integer getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Integer idAnime) {
        this.idAnime = idAnime;
    }

    public AutorVo getAutor() {
        return autor;
    }

    public void setAutor(AutorVo autor) {
        this.autor = autor;
    }

    public ClasificacionVo getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ClasificacionVo clasificacion) {
        this.clasificacion = clasificacion;
    }

    public GeneroVo getGenero() {
        return genero;
    }

    public void setGenero(GeneroVo genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
}
