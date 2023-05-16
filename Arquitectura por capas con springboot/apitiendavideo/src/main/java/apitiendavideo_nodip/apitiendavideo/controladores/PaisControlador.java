package apitiendavideo_nodip.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo_nodip.apitiendavideo.modelos.Pais;
import apitiendavideo_nodip.apitiendavideo.servicios.PaisServicio;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    @Autowired
    private PaisServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Pais> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Pais obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Pais agregar(@RequestBody Pais pais) {
        return servicio.guardar(pais);
    }
}
