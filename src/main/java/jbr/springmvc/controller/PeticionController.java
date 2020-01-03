/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jbr.springmvc.controller;

/**
 *
 * @author Enrique Luna
 */
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Peticion;
import jbr.springmvc.service.PeticionService;
 
 
@Controller
public class PeticionController {
 
    @Autowired
    private PeticionService prodService;
 
    @RequestMapping("/")
    public ModelAndView home() {
        List<Peticion> listproducto = prodService.validateUser();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listProduct", listproducto);
        return mav;
    }
    @RequestMapping("/new")
    public String newprodForm(Map<String, Object> model) {
        Peticion prod = new Peticion();
        model.put("producto", prod);
        return "new_producto";
    }
    
}