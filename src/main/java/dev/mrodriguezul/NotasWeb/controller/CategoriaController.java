package dev.mrodriguezul.NotasWeb.controller;

import dev.mrodriguezul.NotasWeb.dao.ICategoria;
import dev.mrodriguezul.NotasWeb.dao.ICategoriaManual;
import dev.mrodriguezul.NotasWeb.entity.Categoria;
import dev.mrodriguezul.NotasWeb.services.ICategoriaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoriaController {
    /*
    private ICategoriaManual categoriaRepository;
    public CategoriaController(ICategoriaManual categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }*/
    private ICategoriaService categoriaService;
    public CategoriaController(ICategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping("api/categoria")
    public int guardar(@RequestParam String nombre){
        Categoria categoria = new Categoria();
        categoria.setNombre(nombre);
        //categoriaRepository.save(categoria);
        categoriaService.save(categoria);

        return categoria.getIdCategoria();
    }

    @GetMapping("api/categoria/{id}")
    public String buscarPorId(@PathVariable(name = "id") int id){
        //return categoriaRepository.findById(id).getNombre();
        return categoriaService.findById(id).getNombre();
    }


}
