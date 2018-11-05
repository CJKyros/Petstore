package com.nf147.contact.controller;

import com.nf147.contact.dao.PetMapper;
import com.nf147.contact.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.faces.annotation.RequestMap;
import java.util.List;

@Controller
@RequestMapping("/")
public class PetMappers {

    @Autowired
    private PetMapper petMapper;

    @RequestMapping(method = RequestMethod.GET )
    public String selAll(Model model) {
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pets", pets);
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(Pet pet) {
        petMapper.insert(pet);
        return "redirect:/";
    }


    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id) {
        petMapper.deleteByPrimaryKey(id);
        return "redirect:/";
    }
}
