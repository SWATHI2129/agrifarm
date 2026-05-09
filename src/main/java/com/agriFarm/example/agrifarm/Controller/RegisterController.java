package com.agriFarm.example.agrifarm.Controller;

import com.agriFarm.example.agrifarm.model.RegisterModel;
import com.agriFarm.example.agrifarm.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {


   @Autowired
    private RegisterService registerService;


   @PostMapping("/data-register")
   public RegisterModel create(@RequestBody RegisterModel t){
       return registerService.create(t);
   }

   @GetMapping("/get-registerData")
    public List<RegisterModel> getdata(){
       return registerService.getData();

   }


}
