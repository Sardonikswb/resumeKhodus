package by.khodus.controllers;


import by.khodus.entity.Mobile;
import by.khodus.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditController {

    @Autowired
    MobileService springService;

    @GetMapping(value = "/edit")
    public String editPage() {
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String editHome(@RequestParam String id, @RequestParam String modelS, @RequestParam String costS, @RequestParam String model, @RequestParam String cost) {
        int idEdit = Integer.parseInt(id);
        if (modelS.equals("")) modelS = model;
        if (costS.equals("")) costS = cost;
        springService.editMobile(new Mobile(idEdit, modelS, costS));

        return "redirect:homeAdmin";
    }
}
