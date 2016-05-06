package org.sambaran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sambaran on 3/5/16.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Das boot, reporting for duty!";
    }

}
