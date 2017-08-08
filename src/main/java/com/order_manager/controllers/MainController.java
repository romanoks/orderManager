package com.order_manager.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raks on 27.7.17.
 */
@RestController
public class MainController {
    @RequestMapping(method = RequestMethod.GET, path = {"/", "/home"})
    String homeConntroller(){
        return "Main page";
    }
}
