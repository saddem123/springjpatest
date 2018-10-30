package com.example.demo.controler;

import com.example.demo.entity.Provider;
import com.example.demo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(path = "/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping(path = "/addProvider",method = RequestMethod.POST,produces={"application/json"})
    public @ResponseBody String addProvider(@RequestBody  Provider provider){

        providerService.save(provider);

        return "added";
    }

    @RequestMapping(path = "/showAll",method = RequestMethod.GET)
    public List<Provider> showAll(){

        return providerService.findAll();
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Long id){
         providerService.deleteById(id);
    }


}
