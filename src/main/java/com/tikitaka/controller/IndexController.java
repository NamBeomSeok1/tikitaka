package com.tikitaka.controller;

import com.tikitaka.front.domain.user.User;
import com.tikitaka.front.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model) {
        User user = new User();
        /*user.builder("nbs0105@naver.com", "Beom", "19960105", 27);
        userRepository.save(user);*/
        List<User> userList = userRepository.findAll();
        System.out.println(userList);
        model.addAttribute("userList",userList);
        return "index";
    }
}
