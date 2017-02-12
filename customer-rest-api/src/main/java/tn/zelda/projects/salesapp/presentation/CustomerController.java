package tn.zelda.projects.salesapp.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.projects.salesapp.business.CustomerService;
import tn.zelda.projects.salesapp.model.Customer;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService clientService;

    @RequestMapping("/customers")
    public List<Customer> getEmployees(){
        return clientService.getCustomers();
    }

}
