package com.example.demo.controler;


import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public @ResponseBody String addProduct(@RequestBody Product product){

        productService.save(product);

        return "yes saved";

    }

    @RequestMapping(value = "/showAll",method =RequestMethod.GET)
    public List<Product> showAllProduct(){

        return productService.findAll();
    }




}
