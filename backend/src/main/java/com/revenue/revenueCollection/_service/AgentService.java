package com.revenue.revenueCollection._service;


import com.revenue.revenueCollection._shared.dto.AgentDto;

import java.util.List;

public interface AgentService {

    List<AgentDto> getAllAgents();

    List<AgentDto> getAgentToApprove();

    List<AgentDto> getAgentToDelete();

    List<AgentDto> getDevicesToIssue();

    AgentDto approveAgent(AgentDto agent);

    List<AgentDto> getAgentsToApproveDelete();

    AgentDto createAgent(AgentDto agent);

    AgentDto updateAgent(AgentDto agentDto);

    AgentDto deleteAgent(AgentDto agentDto);

    AgentDto approveDeleteAgent(AgentDto agentDto);
}
