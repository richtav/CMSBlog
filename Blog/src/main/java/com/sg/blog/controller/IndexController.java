/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.blog.controller;

import com.sg.blog.service.BlogService;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Jesse
 */
@Controller
public class IndexController {
    
    BlogService blogService;
    
    @Inject
    public IndexController(BlogService blogService) {
        this.blogService = blogService;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String refresh(Model model) {
        model.addAttribute("posts", blogService.getAllBlogs());
        return "index";
    }

    
}
