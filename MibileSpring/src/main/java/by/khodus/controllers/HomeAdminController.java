package by.khodus.controllers;

import by.khodus.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeAdminController {

    @Autowired
    MobileService springService;

    @GetMapping("/homeAdmin")
    public String adminPage(Model model, @RequestParam Map<String, String> args) {
        if (args.isEmpty()) {
            model.addAttribute("mobilesList", springService.findAll());
        }
        if (args.containsKey("modelSearch")) {
            String find = args.get("modelSearch");
            model.addAttribute("mobilesList", springService.findModels(find));
        }
        if (args.containsKey("Sort")) {
            String sort = args.get("Sort");
            switch (sort) {
                case "sort by model":
                    model.addAttribute("mobilesList", springService.sortByModel());
                    break;
                case "sort by cost ASC":
                    model.addAttribute("mobilesList", springService.sortByCostASC());
                    break;
                case "sort by cost DESC":
                    model.addAttribute("mobilesList", springService.sortByCostDESC());
                    break;
            }
        }
        return "homeAdmin";
    }

    @PostMapping("/homeAdmin")
    public String adminPage() {
        return "redirect:home";
    }
}
