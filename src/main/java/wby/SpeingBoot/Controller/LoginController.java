package wby.SpeingBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import wby.SpeingBoot.bean.Admin;
import wby.SpeingBoot.bean.AdminDao;

import javax.servlet.http.HttpSession;

/**
 * 登陆控制层
 */
@RestController
@EnableAutoConfiguration
public class LoginController {
    @Autowired
    AdminDao dao;



    @RequestMapping(value = "/login/auth",method = RequestMethod.POST)
    public Admin loginAuth(Admin user, HttpSession session){
        Admin use = dao.findByNameAndAndPassow(user.getName(),user.getPassow());
        if (use==null)
            return null;
        session.setAttribute("user",use);
        System.out.println(use.getName()+"--------------"+use.getPassow());
        return use;
    }



}
