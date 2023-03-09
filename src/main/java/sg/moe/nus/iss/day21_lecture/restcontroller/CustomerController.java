package sg.moe.nus.iss.day21_lecture.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.CustomRepositoryImplementationDetector;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.moe.nus.iss.day21_lecture.model.customer;
import sg.moe.nus.iss.day21_lecture.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
//Step 5: Create REST controller to call the Service layer
//outcome: API to retrieve all records 
public class CustomerController {
    @Autowired
    CustomerService custSvc; 

    //business logic
    @GetMapping
    public List<customer> getAllCustomers(){
        //get all customers
        return custSvc.retrieveAllCustomers(); 
    }

}
