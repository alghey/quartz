package mx.com.quartz.persistence.repository;

import mx.com.quartz.persistence.entities.Anime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends CrudRepository<Anime, Integer> {
    List<Anime> findByNombreStartsWith(String nombre);
}
