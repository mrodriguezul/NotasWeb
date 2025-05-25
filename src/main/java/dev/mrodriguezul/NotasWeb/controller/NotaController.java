package dev.mrodriguezul.NotasWeb.controller;

import dev.mrodriguezul.NotasWeb.entity.Etiqueta;
import dev.mrodriguezul.NotasWeb.entity.Nota;
import dev.mrodriguezul.NotasWeb.services.ICategoriaService;
import dev.mrodriguezul.NotasWeb.services.IEtiquetaService;
import dev.mrodriguezul.NotasWeb.services.INotaService;
import dev.mrodriguezul.NotasWeb.services.INotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class NotaController {

    private INotaService notaService;
    private ICategoriaService categoriaService;
    private IEtiquetaService etiquetaService;

    public NotaController(INotaService notaService, ICategoriaService categoriaService, IEtiquetaService etiquetaService) {
        this.notaService = notaService;
        this.categoriaService = categoriaService;
        this.etiquetaService = etiquetaService;
    }

    @GetMapping("web/nota")
    public String CrearNota(Model model) {
        Nota nota = new Nota();
        model.addAttribute("nota", nota);
        model.addAttribute("categorias", categoriaService.findAll());
        model.addAttribute("etiquetas", etiquetaService.findAll());
        model.addAttribute("titulo", "Nota Web NUEVO");

        return "nota";
    }

    @GetMapping("web/nota/{id}")
    public String editarNota(@PathVariable(name = "id") int id, Model model) {
        Nota nota = new Nota();
        model.addAttribute("nota", nota);
        model.addAttribute("categorias", categoriaService.findAll());
        model.addAttribute("etiquetas", etiquetaService.findAll());
        model.addAttribute("titulo", "Nota Web EDITAR");

        return "nota";
    }

    @PostMapping("web/nota")
    public  String registrar(Nota nota, @ModelAttribute(name = "ids") String ids) {
        //ids: 1,3,4
        List<Long> lstIds = Arrays.stream(ids.split(",")).map(Long::parseLong).collect(Collectors.toList());

        List<Etiqueta> lstEtiquetas = etiquetaService.findAllById(lstIds);
        nota.setLstEtiquetas(lstEtiquetas);
        notaService.save(nota);
        return "redirect:/home";
    }

    @GetMapping({"/", "/web", "/home","/index"})
    public String home(){
        return "home";
    }

}
