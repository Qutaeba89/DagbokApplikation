package com.dagboksapplikation.dagboksapplikation;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DagBokRepositry extends CrudRepository<DagBok, Integer>{
    @Query("SELECT d FROM DagBok d WHERE d.deleted=0 AND d.datum <=CURRENT_DATE")
    List<DagBok> findNotDeleted();
}
