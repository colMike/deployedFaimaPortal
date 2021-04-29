package com.revenue.revenueCollection._controllers;

import com.revenue.revenueCollection._model.request.AgentDetailsRequestModel;
import com.revenue.revenueCollection._model.response.AgentRest;
import com.revenue.revenueCollection._repositories.AgentRepository;
import com.revenue.revenueCollection._service.AgentService;
import com.revenue.revenueCollection._shared.dto.AgentApproveDto;
import com.revenue.revenueCollection._shared.dto.AgentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/agentService/")
public class AgentsController {


    @Autowired
    AgentService agentService;

    @Autowired
    AgentRepository agentRepository;


    @GetMapping(path = "/viewAgents",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<AgentRest> getAgents() {

        List<AgentRest> returnValue = new ArrayList<>();
        List<AgentDto> agents = agentService.getAllAgents();

        for (AgentDto agentDto : agents) {

            AgentRest agentModel = new AgentRest();
            BeanUtils.copyProperties(agentDto, agentModel);
            returnValue.add(agentModel);
        }

        return returnValue;
    }

    
    @GetMapping(path = "/viewAgentsToApprove",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<AgentRest> getAgentToApprove() {

        List<AgentRest> returnValue = new ArrayList<>();
        List<AgentDto> agents = agentService.getAgentToApprove();

        for (AgentDto agentDto : agents) {

            AgentRest agentModel = new AgentRest();
            BeanUtils.copyProperties(agentDto, agentModel);
            returnValue.add(agentModel);
        }

        return returnValue;
    }
    
    
    @GetMapping(path = "/viewAgentsToApproveDelete",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<AgentRest> getAgentsToApproveDelete() {

        List<AgentRest> returnValue = new ArrayList<>();
        List<AgentDto> agents = agentService.getAgentsToApproveDelete();

        for (AgentDto agentDto : agents) {

            AgentRest agentModel = new AgentRest();
            BeanUtils.copyProperties(agentDto, agentModel);
            returnValue.add(agentModel);
        }

        return returnValue;
    }



    @PostMapping(path = "addAgents",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<AgentRest> createAgent(
            @Valid @RequestBody AgentDetailsRequestModel agentDetails) {

        AgentRest returnValue = new AgentRest();

        AgentDto agentDto = new AgentDto();
        BeanUtils.copyProperties(agentDetails, agentDto);

        AgentDto createdAgent = agentService.createAgent(agentDto);
        BeanUtils.copyProperties(createdAgent, returnValue);

        return ResponseEntity.status(200).body(returnValue);
    }

    @PutMapping(path = "updateAgent",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<AgentRest> updateAgent(
            @Valid @RequestBody AgentDetailsRequestModel agentDetails) {

        AgentRest returnValue = new AgentRest();

        AgentDto agentDto = new AgentDto();
        BeanUtils.copyProperties(agentDetails, agentDto);

        AgentDto updatedAgent = agentService.updateAgent(agentDto);
        BeanUtils.copyProperties(updatedAgent, returnValue);

        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }

    @PutMapping(path = "approveAgent",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<AgentRest> approveAgent(
            @Valid @RequestBody AgentDetailsRequestModel agentDetails) {

        AgentRest returnValue = new AgentRest();

        AgentApproveDto agentDto = new AgentApproveDto();
        BeanUtils.copyProperties(agentDetails, agentDto);

        AgentDto approvedAgent = agentService.approveAgent(agentDto);
        BeanUtils.copyProperties(approvedAgent, returnValue);

        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }




    @PutMapping(path = "deleteAgent",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<AgentRest> deleteAgent(
            @Valid @RequestBody AgentDetailsRequestModel agentDetails) {

        AgentRest returnValue = new AgentRest();

        AgentDto agentDto = new AgentDto();
        BeanUtils.copyProperties(agentDetails, agentDto);

        AgentDto updatedAgent = agentService.deleteAgent(agentDto);
        BeanUtils.copyProperties(updatedAgent, returnValue);

        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }

    @PutMapping(path = "approveDeleteAgent",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<AgentRest> approveDeleteAgent(
            @Valid @RequestBody AgentDetailsRequestModel agentDetails) {

        AgentRest returnValue = new AgentRest();

        AgentDto agentDto = new AgentDto();
        BeanUtils.copyProperties(agentDetails, agentDto);

        AgentDto updatedAgent = agentService.approveDeleteAgent(agentDto);
        BeanUtils.copyProperties(updatedAgent, returnValue);

        return new ResponseEntity<>(returnValue, HttpStatus.OK);
    }

}
