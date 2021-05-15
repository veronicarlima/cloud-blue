package br.com.cbm.services;

import br.com.cbm.models.Solicitation;
import br.com.cbm.repositories.SolicitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitationService {

    @Autowired
    private SolicitationRepository solicitationRepository;

    public List<Solicitation> findAll(){

      List<Solicitation> allSolicitations =
             this.solicitationRepository.findAll();

      return allSolicitations;
    }
}
