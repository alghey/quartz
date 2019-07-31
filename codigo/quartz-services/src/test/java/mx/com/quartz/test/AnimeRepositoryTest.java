package mx.com.quartz.test;

import mx.com.quartz.persistence.entities.Anime;
import mx.com.quartz.persistence.repository.AnimeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ComponentScan("mx.com.quartz")
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")
@ActiveProfiles("STANDALONE")
public class AnimeRepositoryTest {

    @Autowired
    AnimeRepository animeRepository;

    @Test
    public void buscarPorNombre(){
        List<Anime> animes = animeRepository.findByNombreStartsWith("poke");

        animes.forEach(anime->{
            System.out.println("Nombre " + anime.getNombre());
            System.out.println("Sinopsis " + anime.getSinopsis());
        });
    }
}
