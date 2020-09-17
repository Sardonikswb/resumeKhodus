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

        namesService.save(new Names.Builder().withName(name).withSureName(surename).withMiddleName(middle_name).build());
        contactsService.save(new Contacts.Builder().withPhone(phone).withGithub(github).withEmail(email).withLinkedin(linkedin).withSkype(skype).build());
        int idNames = namesService.findIdNames();
        int idContacts = contactsService.findIdContacts();

        if (args.containsKey("Git")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Git")).withIdResume(idNames).build());
        }
        if (args.containsKey("HTML")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("HTML")).withIdResume(idNames).build());
        }
        if (args.containsKey("JavaEE")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("JavaEE")).withIdResume(idNames).build());
        }
        if (args.containsKey("Java Core")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Java Core")).withIdResume(idNames).build());
        }
        if (args.containsKey("Spring Boot")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Spring Boot")).withIdResume(idNames).build());
        }
        if (args.containsKey("Spring")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Spring")).withIdResume(idNames).build());
        }
        if (args.containsKey("Maven")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Maven")).withIdResume(idNames).build());
        }
        if (args.containsKey("REST")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("REST")).withIdResume(idNames).build());
        }
        resumeService.save(new Resume.Builder().withIdNames(idNames).withBirthday(birthday).withIdContacts(idContacts).withGender(gender).build());

        return "redirect:home";
    }
}

