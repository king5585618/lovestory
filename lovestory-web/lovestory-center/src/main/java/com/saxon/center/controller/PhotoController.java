package com.saxon.center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Controller
public class PhotoController {

    @RequestMapping(value = "/photo")
    public String photo(Model model) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<16;i++){

        }
        return "/photo/index";
    }
}
