package by.khodus.controllers;


import by.khodus.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    @Autowired
    MobileService springService;

    @GetMapping(value = "/delete")
    public String deletePage(Model model) {
        return "delete";
    }

    @PostMapping(value = "/delete")
    public String deleteHome(@RequestParam String id, Model model) {
        int idDelete = Integer.parseInt(id);

        springService.deleteMobile(idDelete);
        return "redirect:homeAdmin";
    }
}
