package com.dagboksapplikation.dagboksapplikation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DagBokController {

    @Autowired
    DagBokRepositry dagBokRepositry;

    @GetMapping
    public String showall(Model model) {
        model.addAttribute("dagBoks", dagBokRepositry.findAll());
        return "homePage";
    }
    @GetMapping("/new-dagbok")
    public String addNewDagBok(Model model) {
        model.addAttribute("dagBok", new DagBok());
        return "new-dagbok-Page";
    }

    @PostMapping("/save")
    public String saveDagbok(@ModelAttribute DagBok dagBok) {
        dagBokRepositry.save(dagBok);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editDagBok(@PathVariable int id, Model model) {
        model.addAttribute("dagBok", dagBokRepositry.findById(id).orElse(null));
        return "edit-dagbok";
    }
    @PostMapping("/update")
    public String updataDagbok(@ModelAttribute DagBok dagBok) {
        dagBokRepositry.save(dagBok);
        return "redirect:/";
    }
    
}
