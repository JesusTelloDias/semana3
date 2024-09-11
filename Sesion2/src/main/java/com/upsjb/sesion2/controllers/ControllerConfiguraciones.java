package com.upsjb.sesion2.controllers;

import com.upsjb.sesion2.models.Configuraciones;
import com.upsjb.sesion2.models.Configuraciones;
import com.upsjb.sesion2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ControllerConfiguraciones{
    @Autowired
    private Repository repo;
    @GetMapping
    public String index(){
        return "conectado";
    }
    @GetMapping("Configuraciones")
    public List<Configuraciones> getConfiguraciones(){
        return repo.findAll();
    }
    @PostMapping("grabar")
    public String post(@RequestBody Configuraciones Configuraciones){
        repo.save(Configuraciones);
        return "grabado";
    }
    @DeleteMapping("delete/{idConfiguraciones}")
    public String delete(@PathVariable Long idConfiguraciones){
        repo.deleteById(idConfiguraciones);
        return "Eliminado";
    }

    @PutMapping("editar/{idConfiguraciones}")
    public String update(@PathVariable Long idConfiguraciones,@RequestBody Configuraciones Configuraciones){
        Configuraciones updateConfiguraciones = repo.findById(idConfiguraciones).get();
        updateConfiguraciones.setClave(Configuraciones.getClave());
        updateConfiguraciones.setValor(Configuraciones.getValor());
        updateConfiguraciones.setDescripcion(Configuraciones.getDescripcion());
        updateConfiguraciones.setTipo(Configuraciones.getTipo());
        updateConfiguraciones.setFecha_creacion(Configuraciones.getFecha_creacion());
        updateConfiguraciones.setFecha_modificacion(Configuraciones.getFecha_modificacion());
        updateConfiguraciones.setUsuario_modificacion(Configuraciones.getUsuario_modificacion());
        updateConfiguraciones.setActivo(Configuraciones.getActivo());
        updateConfiguraciones.setCategoria(Configuraciones.getCategoria());
        updateConfiguraciones.setPrioridad(Configuraciones.getPrioridad());
        updateConfiguraciones.setComentario(Configuraciones.getComentario());
        updateConfiguraciones.setValor(Configuraciones.getValor());
        updateConfiguraciones.setNombre(Configuraciones.getNombre());
        updateConfiguraciones.setEstado(Configuraciones.getEstado());

        repo.save(updateConfiguraciones);
        return "Editado Correctamente";


    }

}