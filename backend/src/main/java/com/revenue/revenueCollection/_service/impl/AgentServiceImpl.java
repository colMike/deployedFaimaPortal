package com.revenue.revenueCollection._service.impl;

import com.revenue.revenueCollection._domains.Agents;
import com.revenue.revenueCollection._exceptions.AgentServiceException;
import com.revenue.revenueCollection._repositories.AgentRepository;
import com.revenue.revenueCollection._service.AgentService;
import com.revenue.revenueCollection._shared.dto.AgentApproveDto;
import com.revenue.revenueCollection._shared.dto.AgentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

  @Autowired AgentRepository agentRepository;

  @Override
  public List<AgentDto> getAllAgents() {

    List<AgentDto> returnValue = new ArrayList<>();

    List<Agents> agents = (List<Agents>) agentRepository.findAll();

    for (Agents agent : agents) {
      AgentDto agentDto = new AgentDto();
      BeanUtils.copyProperties(agent, agentDto);
      returnValue.add(agentDto);
    }

    return returnValue;
  }

  @Override
  public List<AgentDto> getAgentToApprove() {
    List<AgentDto> returnValue = new ArrayList<>();

    List<Agents> agents = agentRepository.findAgentToApprove();

    for (Agents agent : agents) {
      AgentDto agentDto = new AgentDto();
      BeanUtils.copyProperties(agent, agentDto);
      returnValue.add(agentDto);
    }

    return returnValue;
  }

  @Override
  public AgentDto approveAgent(AgentApproveDto agent) {

    Agents agentEntity = new Agents();

    BeanUtils.copyProperties(agent, agentEntity);
    
    agentEntity.setapproved(agent.getApproved());
    agentEntity.setchecker(agent.getChecker());
    agentEntity.setcheckerdate(new Date(System.currentTimeMillis()));

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }

  @Override
  public List<AgentDto> getAgentsToApproveDelete() {
    List<AgentDto> returnValue = new ArrayList<>();

    List<Agents> agents = agentRepository.findAgentToApproveDelete();

    for (Agents agent : agents) {
      AgentDto agentDto = new AgentDto();
      BeanUtils.copyProperties(agent, agentDto);
      returnValue.add(agentDto);
    }

    return returnValue;
  }

  @Override
  public AgentDto createAgent(AgentDto agent) {

    if (agentRepository.findByidnumber(agent.getidnumber()) != null) {
      System.out.println("agent exists" + agent.getagentnames() + ":" + agent.getidnumber());
      throw new AgentServiceException("Record already exists");
    }

    Agents agentEntity = new Agents();

    BeanUtils.copyProperties(agent, agentEntity);

    agentEntity.setmakerdate(new Timestamp(System.currentTimeMillis()));

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }

  @Override
  public AgentDto updateAgent(AgentDto agent) {

    if (agentRepository.findByidnumber(agent.getidnumber()) == null) {

      System.out.println("here we are1");
      System.out.println(agent);
      throw new AgentServiceException("No Such record exists.");
    }

    System.out.println("here we are..");
    Agents agentEntity = new Agents();

    BeanUtils.copyProperties(agent, agentEntity);

    agentEntity.setapproved(false);

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }

  @Override
  public AgentDto deleteAgent(AgentDto agent) {

    if (agentRepository.findByidnumber(agent.getidnumber()) == null)
      throw new AgentServiceException("No Such record exists.");

    Agents agentEntity = new Agents();

    agent.setdeletedby(agent.getdeletedby());
    agent.setremarks(agent.getremarks());
    agent.setdeletedon(new Date(System.currentTimeMillis()));

    BeanUtils.copyProperties(agent, agentEntity);

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }

  @Override
  public AgentDto approveDeleteAgent(AgentDto agent) {
    if (agentRepository.findByidnumber(agent.getidnumber()) == null)
      throw new AgentServiceException("No Such record exists.");

    Agents agentEntity = new Agents();

    agent.setdeletedby(agent.getdeletedby());
    agent.setremarks(agent.getremarks());
    agent.setdeletedon(new Date(System.currentTimeMillis()));

    BeanUtils.copyProperties(agent, agentEntity);

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }
}
