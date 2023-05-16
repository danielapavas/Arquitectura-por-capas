package apitiendavideo_nodip.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo_nodip.apitiendavideo.modelos.Pais;
import apitiendavideo_nodip.apitiendavideo.repositorios.PaisRepositorio;

@Service
public class PaisServicio {

    @Autowired
    private PaisRepositorio repositorio;

    public List<Pais> listar() {
        return repositorio.findAll();
    }

    // CRUD
    public Pais obtener(long id) {
        var pais = repositorio.findById(id);
        return pais.isEmpty() ? null : pais.get();
    }

    public Pais guardar(Pais pais) {
        return repositorio.save(pais);
    }

    public boolean eliminar(long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }

    }

}
