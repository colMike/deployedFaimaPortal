package com.revenue.revenueCollection._repositories;

import com.revenue.revenueCollection._domains.Agents;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AgentRepository extends CrudRepository<Agents, Long> {

    Agents findByidnumber(String idNumber);

    Agents findByAgentid(Long agentId);

    @Query("select a from agents a where a.approved=false")
    List<Agents> findAgentToApprove();

    @Query("select a from agents a where a.deleted=true and a.deletedon is null")
    List<Agents> findAgentToApproveDelete();

}
