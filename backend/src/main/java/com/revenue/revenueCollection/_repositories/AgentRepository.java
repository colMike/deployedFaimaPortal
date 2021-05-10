package com.revenue.revenueCollection._repositories;

import com.revenue.revenueCollection._domains.Agents;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AgentRepository extends CrudRepository<Agents, Long> {

    @Query("select a from agents a where a.deleted=false or a.deleted is null and a.deletedon is null ")
    List<Agents> findAll();

    Agents findByIdnumber(String idNumber);

    Agents findByAgentid(Long agentId);

    @Query("select a from agents a where a.deviceattached=false or a.deviceattached is null")
    List<Agents> findAgentToAssignDevice();

    @Query("select a from agents a where a.approved=false or a.approved is null")
    List<Agents> findAgentToApprove();

    @Query("select a from agents a where a.deleted=false or a.deletedon is null")
    List<Agents> findAgentToDelete();


    @Query("select a from agents a where a.deleted=true and a.deletedon is null")
    List<Agents> findAgentToApproveDelete();

}
