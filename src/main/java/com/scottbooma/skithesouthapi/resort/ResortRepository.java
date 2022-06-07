package com.scottbooma.skithesouthapi.resort;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResortRepository extends CrudRepository<Resort, Long> {}