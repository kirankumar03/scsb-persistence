package org.recap.repository;

import org.recap.model.LoanEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chenchulakshmig on 6/13/16.
 */
public interface LoanDetailsRepository extends CrudRepository<LoanEntity, Integer> {}
