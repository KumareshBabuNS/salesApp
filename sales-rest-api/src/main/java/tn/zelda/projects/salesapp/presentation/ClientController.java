package tn.zelda.projects.salesapp.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.projects.salesapp.business.ClientService;
import tn.zelda.projects.salesapp.model.Client;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */
@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/clients")
    public List<Client> getEmployees(){
        return clientService.getClients();
    }

}
