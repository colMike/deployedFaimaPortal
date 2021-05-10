package com.revenue.revenueCollection._service.impl;

import com.revenue.revenueCollection._domains.Agents;
import com.revenue.revenueCollection._exceptions.AgentServiceException;
import com.revenue.revenueCollection._repositories.AgentRepository;
import com.revenue.revenueCollection._service.AgentService;
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
  public List<AgentDto> getDevicesToIssue() {

    List<AgentDto> returnValue = new ArrayList<>();

    List<Agents> agents = agentRepository.findAgentToAssignDevice();

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
  public List<AgentDto> getAgentToDelete() {
    List<AgentDto> returnValue = new ArrayList<>();

    List<Agents> agents = agentRepository.findAgentToDelete();

    for (Agents agent : agents) {
      AgentDto agentDto = new AgentDto();
      BeanUtils.copyProperties(agent, agentDto);
      returnValue.add(agentDto);
    }

    return returnValue;
  }

  @Override
  public AgentDto approveAgent(AgentDto agent) {

    Agents agentEntity = agentRepository.findByAgentid(agent.getagentid());

    agentEntity.setapproved(agent.getapproved());
    agentEntity.setrejected(!agent.getapproved());
    agentEntity.setchecker(agent.getchecker());
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

    if (agentRepository.findByIdnumber(agent.getidnumber()) != null) {
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

    System.out.println("agentEntity");
    Agents agentEntity = agentRepository.findByIdnumber(agent.getidnumber());

    System.out.println(agentEntity);

    agentEntity.setagentnames(agent.getagentnames());
    agentEntity.setapproved(false);
    agentEntity.setbusinessmobile(agent.getbusinessmobile());
    agentEntity.setcounty(agent.getcounty());
    agentEntity.setdob(agent.getdob());
    agentEntity.setemail(agent.getemail());
    agentEntity.setfirstname(agent.getfirstname());
    agentEntity.setgender(agent.getgender());
    agentEntity.setidnumber(agent.getidnumber());
    agentEntity.setidtype(agent.getidtype());
    agentEntity.setsecondname(agent.getsecondname());
    agentEntity.setsubcounty(agent.getsubcounty());
    agentEntity.setward(agent.getward());


    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }

  @Override
  public AgentDto deleteAgent(AgentDto agent) {

    Agents agentEntity = agentRepository.findByAgentid(agent.getagentid());

    System.out.println(agentEntity);
    System.out.println(agent);

    agentEntity.setdeleted(agent.getdeleted());
    agentEntity.setdeletedby(agent.getdeletedby());
    agentEntity.setremarks(agent.getremarks());
//    agentEntity.setdeletedon(new Date(System.currentTimeMillis()));

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);

    return returnValue;
  }

  @Override
  public AgentDto approveDeleteAgent(AgentDto agent) {

    Agents agentEntity = agentRepository.findByAgentid(agent.getagentid());

    System.out.println(agentEntity);
    System.out.println(agent);

    agentEntity.setdeletedby(agent.getdeletedby());
    agentEntity.setcheckerremark(agent.getremarks());
    agentEntity.setdeletedon(new Date(System.currentTimeMillis()));

    Agents storedAgentDetails = agentRepository.save(agentEntity);

    AgentDto returnValue = new AgentDto();
    BeanUtils.copyProperties(storedAgentDetails, returnValue);


    return returnValue;
  }
}
