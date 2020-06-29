package com.springboot.controller;

import com.springboot.model.Type;
import com.springboot.service.TypeService;
import com.springboot.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("type")
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping("/all")
    public JSONResult typeAll(){
        List<Type> allTypes = typeService.queryAllTypes();
        return JSONResult.ok(allTypes);
    }
}
