package com.order_manager.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raks on 27.7.17.
 */
@RestController
public class MainController {
    @ApiOperation(value="Home page, start page application", nickname = "homePage")
    @RequestMapping(method = RequestMethod.GET, path = {"/api", "/api/home"})
    @ApiResponses(value = {
            @ApiResponse(code=200, message="Success"),
            @ApiResponse(code=403, message="Forbidden"),
            @ApiResponse(code=500, message="Failure")
    })
    String homeConntroller(){
        return "Main page";
    }
}
