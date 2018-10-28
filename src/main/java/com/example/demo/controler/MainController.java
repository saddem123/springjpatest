package com.example.demo.controler;

import com.example.demo.entity.Users;
import com.example.demo.repristory.UserRepository;
import com.example.demo.service.UsersService;
import com.example.demo.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/add")
    public @ResponseBody String addNewUser(@RequestParam String name,
                                           @RequestParam String secondName,
                                           @RequestParam String email,
                                           @RequestParam String poste){
        Users n =  new Users();

        n.setName(name);
        n.setSecondName(secondName);
        n.setEmail(email);
        n.setPoste(poste);

        usersService.save(n);

        return "Saved";



    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Users> getAllUsers(){
        return usersService.findAll();
    }


}
