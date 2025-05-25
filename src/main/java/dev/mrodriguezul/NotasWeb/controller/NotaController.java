package dev.mrodriguezul.NotasWeb.controller;

import dev.mrodriguezul.NotasWeb.entity.Nota;
import dev.mrodriguezul.NotasWeb.services.INotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NotaController {

    private INotasService notaService;

    public NotaController(INotasService notaService) {
        this.notaService = notaService;
    }

    @GetMapping("web/nota")
    public String CrearNota(Model model) {
        Nota nota = new Nota();
        model.addAttribute("nota", nota);
        model.addAttribute("titulo", "Nota Web NUEVO");

        return "nota";
    }

    @GetMapping("web/nota/{id}")
    public String editarNota(@PathVariable(name = "id") int id, Model model) {
        Nota nota = new Nota();
        model.addAttribute("nota", nota);
        model.addAttribute("titulo", "Nota Web EDITAR");

        return "nota";
    }

}
