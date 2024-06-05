package com.projeto.app_financeiro_front_end.modules.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    public String Login(){
        return "user/login";
    }

    @PostMapping("/signIn")
    public String signIn(RedirectAttributes redirectAttributes, String username, String password){
        if(username.equals("lucas")){
            return "user/profile";
        }
        redirectAttributes.addFlashAttribute("error_message", "Usuário ou senha incorretos!");
        return "redirect:/user/login";
    }
}
