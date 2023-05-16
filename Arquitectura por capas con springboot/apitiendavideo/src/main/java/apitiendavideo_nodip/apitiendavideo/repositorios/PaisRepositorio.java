package apitiendavideo_nodip.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import apitiendavideo_nodip.apitiendavideo.modelos.Pais;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {

}
