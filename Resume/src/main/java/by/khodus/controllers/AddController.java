package by.khodus.controllers;


import by.khodus.entity.Contacts;
import by.khodus.entity.Names;
import by.khodus.entity.Resume;
import by.khodus.entity.Technologies;
import by.khodus.service.ContactsService;
import by.khodus.service.NamesService;
import by.khodus.service.ResumeService;
import by.khodus.service.TechnologiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class AddController {

    @Autowired
    ResumeService resumeService;

    @Autowired
    NamesService namesService;

    @Autowired
    ContactsService contactsService;

    @Autowired
    TechnologiesService technologiesService;

    @GetMapping(value = "/add")
    public String addPage() {
        return "add";
    }

    @PostMapping(value = "/add")
    public String addAction(@RequestParam String name, @RequestParam String surename, @RequestParam String middle_name, @RequestParam String birthday, @RequestParam String phone,
                            @RequestParam String github, @RequestParam String email, @RequestParam String linkedin, @RequestParam String skype, @RequestParam String gender,
                            @RequestParam Map<String, String> args) {

        namesService.save(new Names(name, surename, middle_name));
        contactsService.save(new Contacts(phone, github, email, linkedin, skype));
        int idNames = namesService.findIdNames();
        int idContacts = contactsService.findIdContacts();

        if (args.containsKey("Git")) {
            technologiesService.save(new Technologies(args.get("Git"), idNames));
        }
        if (args.containsKey("HTML")) {
            technologiesService.save(new Technologies(args.get("HTML"), idNames));
        }
        if (args.containsKey("JavaEE")) {
            technologiesService.save(new Technologies(args.get("JavaEE"), idNames));
        }
        if (args.containsKey("Java Core")) {
            technologiesService.save(new Technologies(args.get("Java Core"), idNames));
        }
        if (args.containsKey("Spring Boot")) {
            technologiesService.save(new Technologies(args.get("Spring Boot"), idNames));
        }
        if (args.containsKey("Spring")) {
            technologiesService.save(new Technologies(args.get("Spring"), idNames));
        }
        if (args.containsKey("Maven")) {
            technologiesService.save(new Technologies(args.get("Maven"), idNames));
        }
        if (args.containsKey("REST")) {
            technologiesService.save(new Technologies(args.get("REST"), idNames));
        }
        resumeService.save(new Resume(idNames, birthday, idContacts, gender));

        return "redirect:home";
    }
}

