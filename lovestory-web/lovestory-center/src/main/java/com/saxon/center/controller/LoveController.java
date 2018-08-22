package com.saxon.center.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinzj
 * @since v4.0.1
 */
@Controller
@RequestMapping
public class LoveController {

    @RequestMapping(value = "/love")
    public String love() {
        return "love/index";
    }

    @RequestMapping(value = "/test")
    public String loveTest() {
        return "love/test";
    }

    @RequestMapping("/index2")
    public String index() {
        return "index2";
    }
}
