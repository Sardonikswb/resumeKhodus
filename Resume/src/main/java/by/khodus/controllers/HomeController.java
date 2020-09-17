package by.khodus.controllers;


import by.khodus.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    ResumeService resumeService;

    @GetMapping(value = "/home")
    public String homePage(Model model, @RequestParam Map<String, String> args) {
        if (args.isEmpty()) {
            model.addAttribute("resumeList", resumeService.getAll());
        }

        if (args.containsKey("name")) {
            String find = args.get("name");
            model.addAttribute("resumeList", resumeService.searchList(find));
        }
        return "home";
    }

    @PostMapping(value = "/home")
    public String DeletePage(Model model, @RequestParam(value = "delete") String del) {

        if (!del.equals("no")) {
            int id = Integer.parseInt(del);
            resumeService.delete(id);
        }
        model.addAttribute("resumeList", resumeService.getAll());
        return "home";
    }
}
