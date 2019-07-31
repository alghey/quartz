package mx.com.quartz.controllers.anime;

import mx.com.quartz.common.anime.dto.ListaAnimeResponse;
import mx.com.quartz.services.anime.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    AnimeService animeService;

    @GetMapping("/")
    public ListaAnimeResponse listarTodo(){
        return animeService.listarTodo();
    }
}
