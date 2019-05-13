package com.xa.controller;

import com.xa.pojo.Dept;
import com.xa.service.DeptServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptServer deptServer;

    @RequestMapping("getAAA")
    public List<Dept>  getCCC(){
        return deptServer.getAllDept();
    }

}
