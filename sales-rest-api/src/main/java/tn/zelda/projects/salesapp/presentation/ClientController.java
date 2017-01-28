package tn.zelda.projects.salesapp.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.projects.salesapp.model.Client;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */
@RestController
public class ClientController {

    @RequestMapping("/employees")
    public List<Client> getEmployees(){

        return  null;
    }

}
