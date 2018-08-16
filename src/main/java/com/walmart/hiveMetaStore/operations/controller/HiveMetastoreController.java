package com.walmart.hiveMetaStore.operations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ragraw1 on 16/08/18.
 */
@RestController
public class HiveMetastoreController {

    //@GetMapping(value = "/")
    @RequestMapping(value = "/",method= RequestMethod.GET)
    public String hello(){
        return "Hello World!!";
    }
}
