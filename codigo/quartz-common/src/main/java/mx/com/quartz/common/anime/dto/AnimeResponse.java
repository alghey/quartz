package mx.com.quartz.common.anime.dto;

import mx.com.quartz.common.anime.vo.AnimeVo;
import mx.com.quartz.common.response.GeneralResponse;

public class AnimeResponse extends GeneralResponse {
    private AnimeVo anime;

    public AnimeVo getAnime() {
        return anime;
    }

    public void setAnime(AnimeVo anime) {
        this.anime = anime;
    }
}
