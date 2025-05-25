/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.mrodriguezul.NotasWeb.controller;

import dev.mrodriguezul.NotasWeb.bean.CategoriaBean;
import dev.mrodriguezul.NotasWeb.bean.NotaBean;
import dev.mrodriguezul.NotasWeb.bean.PersonaBean;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.mrodriguezul.NotasWeb.services.INotasService;
import dev.mrodriguezul.NotasWeb.services.NotasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Lenovo
 */
@Controller
@Slf4j
public class WebController {

    INotasService notasService;

    //usando un qualifier para decir que servicio es el que se va implmentar
    public WebController(@Qualifier("notasFree") INotasService notasService) {
        this.notasService = notasService;
    }

    @Value("${index.mensaje.bienvenida}")
    private String mensaje;

    @GetMapping("/")
    public String init(Model model) {
        String usuario = "@Mik";
        model.addAttribute("usuario", usuario);
        model.addAttribute("premium", Boolean.TRUE);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("persona", getPersonaByUser(usuario));
        model.addAttribute("lstNotas", notasService.getNotasByUser(usuario));
        return "index";
    }

    @RequestMapping(value = "/app")
    public String info(Model model) {
        return "appindex";
    }

    @RequestMapping(value = "appindex")
    public ModelAndView AppIndex(ModelAndView mv) {
        String usuario = "@Mike!";

        mv.addObject("usuario", usuario);
        mv.addObject("premium", Boolean.TRUE);
        mv.setViewName("appindex");

        return mv;
    }

    @GetMapping(value = "/categoria")
    public ModelAndView CategoriaByParam(@RequestParam(defaultValue = "", name = "cat") String categoria, ModelAndView mv) {
        mv.addObject("categoria", categoria);
        mv.setViewName("notas-categoria");
        return mv;
    }

    @GetMapping(value = "/categoria/{categoria}")
    public ModelAndView CategoriaByPath(@PathVariable(name = "categoria") String categoria, ModelAndView mv) {
        mv.addObject("categoria", categoria);
        mv.setViewName("notas-categoria");
        return mv;
    }

    @ModelAttribute(name = "lstCategorias")
    private List<CategoriaBean> getListaCategoriasByUser(){
        List<CategoriaBean> lista = new ArrayList<>();
        lista.add(new CategoriaBean(1, "Categoria 1"));
        lista.add(new CategoriaBean(2, "Categoria 2"));
        lista.add(new CategoriaBean(3, "Categoria 3"));

        return lista;
    }

    
    private PersonaBean getPersonaByUser(String usuario){
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Miguel");
        persona.setApellidos("Rodríguez");
        persona.setFecNacimiento(LocalDate.of( 1989 , 10 , 19 ));
        persona.setEmail("mrodriguezul@gmail.com");
        persona.setCelular("948942091");
        return persona;
    }
    

}
