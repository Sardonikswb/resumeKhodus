package by.khodus.restControllers;


import by.khodus.entity.Mobile;
import by.khodus.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeleteRestController {

    @Autowired
    MobileService springService;

    @PostMapping(value = "/delete-rest")
    public List<Mobile> deleteHome(@RequestParam String id) {
        int idDelete = Integer.parseInt(id);

        springService.deleteMobile(idDelete);
        List<Mobile> list = springService.findAll();
        return list;
    }
}
