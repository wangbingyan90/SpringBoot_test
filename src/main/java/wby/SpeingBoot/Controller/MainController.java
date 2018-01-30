package wby.SpeingBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import wby.SpeingBoot.bean.Admin;
import wby.SpeingBoot.bean.AdminDao;

@Controller
@EnableAutoConfiguration
public class MainController {

    @Autowired
    AdminDao dao;

    @RequestMapping(value = "/save")
    String save() {
        Admin use = new Admin("1","1");
        dao.save(use);
        return "login";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
}
