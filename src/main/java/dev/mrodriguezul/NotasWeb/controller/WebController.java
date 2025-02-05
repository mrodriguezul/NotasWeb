/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.mrodriguezul.NotasWeb.controller;

import dev.mrodriguezul.NotasWeb.bean.NotaBean;
import dev.mrodriguezul.NotasWeb.bean.PersonaBean;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Lenovo
 */
@Controller
@Slf4j
public class WebController {
    
    @Value("${index.mensaje.bienvenida}")
    private String mensaje;
    
    @GetMapping("/")
    public String init(Model model){
        String usuario = "@Mik";
        model.addAttribute("usuario", usuario);
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("persona", getPersonaByUser(usuario));
        model.addAttribute("lstNotas",getNotasByUser(usuario));
        return "index";
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
    
    private List<NotaBean> getNotasByUser(String usuario){
        List<NotaBean> lstNotas = new ArrayList<>();
        lstNotas.add(new NotaBean(1, "Test1", "Descripción 1"));
        lstNotas.add(new NotaBean(2, "Test2", "Descripción 2"));
        lstNotas.add(new NotaBean(3, "Test3", "Descripción 3"));
        lstNotas.add(new NotaBean(4, "Test4", "Descripción 4"));
        lstNotas.add(new NotaBean(5, "Test5", "Descripción 5"));
        lstNotas.add(new NotaBean(6, "Test6", "Descripción 6"));
        
        return lstNotas;
    }
}
