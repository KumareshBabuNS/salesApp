package tn.zelda.projects.salesapp.dao;

import org.springframework.stereotype.Service;
import tn.zelda.projects.salesapp.model.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zelda on 28/01/17.
 */
@Service
public class ClientDao {

    public List<Client> getClients(){
        List<Client> clients= new ArrayList();
        clients.add(new Client("Oussema","Tunisia"));
        return clients;
    }
}
