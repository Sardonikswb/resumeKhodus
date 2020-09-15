package by.khodus.restControllers;

import by.khodus.entity.Mobile;
import by.khodus.services.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchRestController {

    @Autowired
    MobileService springService;

    @PostMapping(value = "/search-rest")
    public List<Mobile> searchByName(@RequestParam String modelSearch) {

        List<Mobile> list = springService.findModels(modelSearch);

        return list;
    }
}
