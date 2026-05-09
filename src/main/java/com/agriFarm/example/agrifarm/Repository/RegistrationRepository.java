package com.agriFarm.example.agrifarm.Repository;

import com.agriFarm.example.agrifarm.model.RegisterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends MongoRepository<RegisterModel,String> {

}
