package com.ziyu.cuiapiinterface.controller;

import com.ziyu.cuiapiclientsdk.model.User;
import com.ziyu.cuiapiclientsdk.utils.SignUtils;
import javax.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

/**
 * 名称api
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("ziyu"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        //实际情况是去数据库查询是否已分配用户
//        if(!accessKey.equals("ziyu")) {
//            throw new RuntimeException("无权限");
//        }
//        if(Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//
//        //todo 时间和当前时间不能超过5分钟
//        //if (timestamp) {}
//
//        String secretSign = SignUtils.getSign(body, "abcdefgh");
//        if (!sign.equals(secretSign)) {
//            throw new RuntimeException("无权限");
//        }
        return "POST 用户名字是" + user.getUsername();
    }
}
