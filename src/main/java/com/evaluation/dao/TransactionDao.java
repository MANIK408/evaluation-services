package com.evaluation.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.evaluation.entity.dto.TransactionDto;

@Transactional
public interface TransactionDao extends CrudRepository<TransactionDto, Integer> {

}