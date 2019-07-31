package mx.com.quartz.persistence.repository;

import mx.com.quartz.persistence.entities.Clasificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends CrudRepository<Clasificacion, Integer> {

}
