package com.lambdaschool.ordersapp.services;


import com.lambdaschool.ordersapp.models.Agent;
import com.lambdaschool.ordersapp.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "agentservices")
public class AgentServicesImpl implements AgentServices{

    @Autowired
    private AgentRepository agentRepository;

    @Transactional
    @Override
    public Agent save(Agent agent) { return agentRepository.save(agent);}
}
