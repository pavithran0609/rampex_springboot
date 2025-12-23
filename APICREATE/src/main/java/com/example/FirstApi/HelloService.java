package com.example.FirstApi;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String wish(){
        return "HelloWorld!..";
    }
    public String admit(){
        return "Welcome Home";
    }
}
