package com.example.JWT.Controller;

import com.example.JWT.Dto.LoginRequest;
import com.example.JWT.Utility.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
@PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        // Dummy
        if("loga".equals(request.getUsername())
        && "1234".equals(request.getPassword())){

            return JwtUtil.generateToken(request.getUsername()); //Generate
        }
        return "Invalid Credentials";
    }
    @GetMapping("/hello")
    public String hello(@RequestHeader ("Authorization" ) String token){

        String username= JwtUtil.validateToken(token.replace("Bearer",""));
        return "Hello"+username;
    }
}
