package consumer.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
}
