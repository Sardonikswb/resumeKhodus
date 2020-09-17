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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UpdateController {

    @Autowired
    ResumeService resumeService;

    @Autowired
    NamesService namesService;

    @Autowired
    ContactsService contactsService;

    @Autowired
    TechnologiesService technologiesService;

    int idRes, idNam, idCont;

    @GetMapping(value = "/update")
    public String updatePage(Model model, @RequestParam String idResume, @RequestParam String idContacts, @RequestParam String idNames) {
        idRes = Integer.parseInt(idResume);
        idNam = Integer.parseInt(idNames);
        idCont = Integer.parseInt(idContacts);
        model.addAttribute("one_resume", resumeService.findById(idRes));
        return "update";
    }

    @PostMapping(value = "/update")
    public String updateAction(Model model, @RequestParam String name, @RequestParam String surename, @RequestParam String middle_name,
                               @RequestParam String birthday, @RequestParam String phone, @RequestParam String github,
                               @RequestParam String email, @RequestParam String linkedin,
                               @RequestParam String skype, @RequestParam String gender, @RequestParam Map<String, String> args) {

        if (name.equals("")) {
            name = namesService.findById(idNam).getName();
        }
        if (surename.equals("")) {
            surename = namesService.findById(idNam).getSurename();
        }
        if (middle_name.equals("")) {
            middle_name = namesService.findById(idNam).getMiddle_name();
        }
        if (birthday.equals("")) {
            birthday = resumeService.findById(idRes).getBirthday();
        }
        if (phone.equals("")) {
            phone = contactsService.findById(idCont).getPhone();
        }
        if (github.equals("")) {
            github = contactsService.findById(idCont).getGithub();
        }
        if (email.equals("")) {
            email = contactsService.findById(idCont).getEmail();
        }
        if (linkedin.equals("")) {
            linkedin = contactsService.findById(idCont).getLinkedin();
        }
        if (skype.equals("")) {
            skype = contactsService.findById(idCont).getSkype();
        }
        if (gender.equals("")) {
            gender = resumeService.findById(idRes).getGender();
        }
        technologiesService.delete(idRes);
        if (args.containsKey("Git")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Git")).withIdResume(idRes).build());
        }
        if (args.containsKey("HTML")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("HTML")).withIdResume(idRes).build());
        }
        if (args.containsKey("JavaEE")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("JavaEE")).withIdResume(idRes).build());
        }
        if (args.containsKey("Java Core")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Java Core")).withIdResume(idRes).build());
        }
        if (args.containsKey("Spring Boot")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Spring Boot")).withIdResume(idRes).build());
        }
        if (args.containsKey("Spring")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Spring")).withIdResume(idRes).build());
        }
        if (args.containsKey("Maven")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("Maven")).withIdResume(idRes).build());
        }
        if (args.containsKey("REST")) {
            technologiesService.save(new Technologies.Builder().withTechnologies(args.get("REST")).withIdResume(idRes).build());
        }

        namesService.save(new Names.Builder().withId(idNam).withName(name).withSureName(surename).withMiddleName(middle_name).build());
        contactsService.save(new Contacts.Builder().withId(idCont).withPhone(phone).withGithub(github).withEmail(email).withLinkedin(linkedin).withSkype(skype).build());
        resumeService.save(new Resume.Builder().withId(idRes).withIdNames(idNam).withBirthday(birthday).withIdContacts(idCont).withGender(gender).build());

        return "redirect:home";

    }
}
