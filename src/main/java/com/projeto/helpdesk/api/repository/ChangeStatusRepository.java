package com.projeto.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projeto.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	public Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
