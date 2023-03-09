package sg.moe.nus.iss.day21_lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.moe.nus.iss.day21_lecture.model.customer;
import sg.moe.nus.iss.day21_lecture.repository.CustomerRepository;

@Service
//Step 4: Create Service layer
public class CustomerService {

    //inject the repository layer
    @Autowired
    CustomerRepository custRepo; 

    public List<customer> retrieveAllCustomers(){
        //call the getAllCustomers class of customerRepo
        return custRepo.getAllCustomers(); 
    }


}
