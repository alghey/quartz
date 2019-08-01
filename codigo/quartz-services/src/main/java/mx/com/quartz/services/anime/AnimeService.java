package mx.com.quartz.services.anime;

import mx.com.quartz.common.anime.dto.AnimeRequest;
import mx.com.quartz.common.anime.dto.AnimeResponse;
import mx.com.quartz.common.anime.dto.ListaAnimeResponse;

public interface AnimeService {
    ListaAnimeResponse listarTodo();
    AnimeResponse buscarPorId(AnimeRequest request);
}
