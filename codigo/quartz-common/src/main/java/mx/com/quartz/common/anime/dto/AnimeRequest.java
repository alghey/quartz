package mx.com.quartz.common.anime.dto;

import mx.com.quartz.common.anime.vo.AnimeVo;

public class AnimeRequest {
    private AnimeVo anime;

    public AnimeVo getAnime() {
        return anime;
    }

    public void setAnime(AnimeVo anime) {
        this.anime = anime;
    }
}
