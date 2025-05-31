package com.api.apitoy.api.domain.login;

import com.api.apitoy.api.utils.response.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @PostMapping("/login")
    public CommonResponse<?> login(){

        return new CommonResponse<>("로그인 성공");
    }



}
