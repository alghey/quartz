package mx.com.quartz.controllers.anime;

import mx.com.quartz.common.anime.dto.AnimeRequest;
import mx.com.quartz.common.anime.dto.AnimeResponse;
import mx.com.quartz.common.anime.dto.ListaAnimeResponse;
import mx.com.quartz.services.anime.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    AnimeService animeService;

    @GetMapping("/")
    public ListaAnimeResponse listarTodo(){
        return animeService.listarTodo();
    }

    @PostMapping("/buscarPorId")
    public AnimeResponse buscarPorId(@RequestBody AnimeRequest animeRequest){
        return animeService.buscarPorId(animeRequest);
    }
}
