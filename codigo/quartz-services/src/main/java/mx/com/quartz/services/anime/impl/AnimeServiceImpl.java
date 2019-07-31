package mx.com.quartz.services.anime.impl;

import mx.com.quartz.common.anime.dto.ListaAnimeResponse;
import mx.com.quartz.common.anime.vo.AnimeVo;
import mx.com.quartz.common.anime.vo.AutorVo;
import mx.com.quartz.common.anime.vo.ClasificacionVo;
import mx.com.quartz.common.anime.vo.GeneroVo;
import mx.com.quartz.persistence.entities.Anime;
import mx.com.quartz.persistence.repository.AnimeRepository;
import mx.com.quartz.services.anime.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("AnimeService")
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    AnimeRepository animeRepository;

    @Override
    @Transactional
    public ListaAnimeResponse listarTodo() {
        ListaAnimeResponse response = new ListaAnimeResponse();
        Iterable<Anime> animesDB = animeRepository.findAll();
        List<AnimeVo> listaAnimes = new ArrayList<>();

        animesDB.forEach(anime->{
            AutorVo autorVo = new AutorVo(){{
               setIdAutor(anime.getAutor().getIdAutor());
               setNombre(anime.getAutor().getNombre());
            }};

            GeneroVo generoVo = new GeneroVo(){{
               setIdGenero(anime.getGenero().getIdGenero());
               setNombre(anime.getGenero().getNombre());
            }};

            ClasificacionVo clasificacionVo = new ClasificacionVo(){{
               setIdClasificacion(anime.getClasificacion().getIdClasificacion());
               setNombre(anime.getClasificacion().getNombre());
               setDescripcion(anime.getClasificacion().getDescripcion());
            }};

            AnimeVo animeVo = new AnimeVo(){{
                setIdAnime(anime.getIdAnime());
               setNombre(anime.getNombre());
               setCalificacion(anime.getCalificacion());
               setSinopsis(anime.getSinopsis());
               setAutor(autorVo);
               setClasificacion(clasificacionVo);
               setGenero(generoVo);
            }};

            listaAnimes.add(animeVo);
        });

        response.setAnimes(listaAnimes);
        response.setCode("OK");
        response.setMessage("Exito :D");

        return response;
    }
}
