package com.nf147.contact.controller;

import com.nf147.contact.dao.PetMapper;
import com.nf147.contact.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.faces.annotation.RequestMap;
import java.util.List;

@Controller
@RequestMapping("/")
public class PetMappers {

    @Autowired
    private PetMapper petMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String selAll(Model model){
       List<Pet> petsAll = petMapper.selectAll();
       model.addAttribute("petsAll",petsAll);
       return "index";
    }
}
