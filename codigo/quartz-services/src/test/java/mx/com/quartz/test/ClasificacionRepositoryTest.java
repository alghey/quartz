package mx.com.quartz.test;

import io.jsonwebtoken.ClaimJwtException;
import mx.com.quartz.persistence.entities.Clasificacion;
import mx.com.quartz.persistence.repository.ClasificacionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ComponentScan("mx.com.quartz")
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")
@ActiveProfiles("STANDALONE")
public class ClasificacionRepositoryTest {

    @Autowired
    ClasificacionRepository clasificacionRepository;

   // @Test
    public void buscarPorId(){
        Optional<Clasificacion> clasificacionDB = clasificacionRepository.findById(7);

        if(clasificacionDB.isPresent()){
            System.out.println("Nombre: " + clasificacionDB.get().getNombre());
            System.out.println("Nombre: " + clasificacionDB.get().getDescripcion());
        }else{
            System.out.println("No se encontró registro");
        }
    }

   // @Test
    public void crearClasificacion(){
        Clasificacion clasificacionDB = new Clasificacion();
        clasificacionDB.setNombre("Clasificacion de Prueba");
        clasificacionDB.setDescripcion("Esta es una clasificacion de prueba");

        clasificacionRepository.save(clasificacionDB);

        System.out.println("Clasificacion creada con el id " + clasificacionDB.getIdClasificacion());
    }

    //@Test
    public void modificarClasificacion(){
        //Clasificacion clasificacionDB = clasificacionRepository.findById(7).get();
        Optional<Clasificacion> clasificacionDB = clasificacionRepository.findById(7);

        if(clasificacionDB.isPresent()){
            clasificacionDB.get().setNombre("Clasificacion E");

            clasificacionRepository.save(clasificacionDB.get());
        }else{
            System.out.println("No se encontro la clasificacion");
        }
    }

    @Test
    public void eliminarClasificacion(){
        clasificacionRepository.deleteById(7);

        Optional<Clasificacion> clasificacionDB = clasificacionRepository.findById(7);
        if(clasificacionDB.isPresent()){
            System.out.println("Ocurrio un error al borrar");
        }else{
            System.out.println("Se elimino correctamente");
        }
    }
}
