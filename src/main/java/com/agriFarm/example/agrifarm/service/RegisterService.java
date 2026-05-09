package com.agriFarm.example.agrifarm.service;

import com.agriFarm.example.agrifarm.Repository.RegistrationRepository;
import com.agriFarm.example.agrifarm.model.RegisterModel;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    private MongoOperations mongoOperations;

    private RegistrationRepository registrationRepository;
    public RegisterService(MongoOperations mongoOperations,RegistrationRepository registrationRepository){
        this.mongoOperations = mongoOperations;
        this.registrationRepository = registrationRepository;
    }


    public RegisterModel create(RegisterModel t){

        t.setRegistrationId(System.currentTimeMillis()+"");
        return registrationRepository.save(t);
    }

    public List<RegisterModel> getData(){
        return mongoOperations.findAll(RegisterModel.class);
    }
}
