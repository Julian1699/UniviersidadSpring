package com.uspring.USpring.Controller;

import com.uspring.USpring.Entity.Persona;
import com.uspring.USpring.Service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/")
public class personaController {

    @Autowired
    private personaService personaService;

    @GetMapping("/")
    public String inicio(Model model){
        List<Persona> personas = personaService.getAllPersonas();
        model.addAttribute("personas", personas);
        var saldoTotal = 0D;
        for(var p: personas){
            saldoTotal += p.getSaldo();
        }
        model.addAttribute("saldoTotal", saldoTotal);
        model.addAttribute("totalClientes", personas.size());
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Model model,Persona persona){
        model.addAttribute("persona",persona);
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Validated Persona persona, Errors errors){
        if(errors.hasErrors()){
            return  "modificar";
        }
        personaService.savePersona(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String modificar(@PathVariable (name="id") Long id, Persona persona, Model model){
        persona = personaService.getById(id);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.deletePersona(persona);
        return "redirect:/";
    }

}
