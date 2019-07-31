package mx.com.quartz.common.anime.dto;

import mx.com.quartz.common.anime.vo.AnimeVo;
import mx.com.quartz.common.response.GeneralResponse;

import java.util.List;

public class ListaAnimeResponse extends GeneralResponse {
    private List<AnimeVo> animes;

    public List<AnimeVo> getAnimes() {
        return animes;
    }

    public void setAnimes(List<AnimeVo> animes) {
        this.animes = animes;
    }
}
