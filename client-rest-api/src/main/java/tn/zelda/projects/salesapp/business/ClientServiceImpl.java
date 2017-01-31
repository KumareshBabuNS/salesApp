package tn.zelda.projects.salesapp.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.zelda.projects.salesapp.dao.ClientDao;
import tn.zelda.projects.salesapp.model.Client;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDao clientDao;

    @Override
    public List<Client> getClients() {
        return  clientDao.getClients();
    }
}
