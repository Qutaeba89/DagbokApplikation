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
    // Läsa: visa alla inlägg
    @GetMapping
    public String showall(Model model) {
        model.addAttribute("dagBoks", dagBokRepositry.findNotDeleted());
        return "homePage";
    }
    // Skriva: formulär för ny inlägg
    @GetMapping("/new-dagbok")
    public String addNewDagBok(Model model) {
        model.addAttribute("dagBok", new DagBok());
        return "new-dagbok-Page";
    }
    //änvder jag här ModelAttribute för att ropa alla objeck i dagbok klass istället för skriva varje object
    @PostMapping("/save")
    public String saveDagbok(@ModelAttribute DagBok dagBok) {
        dagBokRepositry.save(dagBok);
        return "redirect:/";
    }
    // Ändra: formulär för ändra 
    //änvder jag här PathVariable för att hjälpa mig när jag kilckar på en dagbok visa mig i browser vilken Id här detta object
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
    //Radera: formulär för radera
    @GetMapping("/delete/{id}")
    public String deleteDagbok(@PathVariable int id) {
        DagBok dagBok = dagBokRepositry.findById(id).orElse(null);
        if(dagBok != null) {
            dagBok.setDeleted(1);
            dagBokRepositry.save(dagBok);
        }
        return "redirect:/";
    }
    
    
}
