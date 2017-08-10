package com.vigen.plexonic.analytics.api.data.user.visit;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UserVisitRepository extends CrudRepository<UserVisit, Integer> {

    @Query("SELECT count(*) FROM UserVisit where DATE(request_date) IN (:date)")
    Integer getDailyActiveUsers(@Param("date") Date[] date) throws DataAccessException;
}
