package com.xrafece.yice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Xrafece
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password ,Model model) {
        model.addAttribute("a", username);
        model.addAttribute("b", password);
        return "login";
    }

}
