package com.vigen.plexonic.analytics.api.data.user.visit;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface UserVisitRepository extends CrudRepository<UserVisit, Integer> {

    @Query("FROM UserVisit WHERE DATE(request_date) IN (:date)")
    Iterable<UserVisit> getDailyActiveUsers(@Param("date") Date[] date) throws DataAccessException;

    @Query(value = "SELECT COUNT(*) FROM user_visit AS uv " +
            "INNER JOIN user_register AS ur ON uv.user_id = ur.user_id " +
            "WHERE DATE(ur.install_date) = str_to_date(:start_date,'%Y-%m-%d') " +
            "AND DATE(uv.request_date) > str_to_date(:end_date,'%Y-%m-%d') " +
            "GROUP BY ur.user_id", nativeQuery = true)
    ArrayList<Integer> getReturnedUsers(@Param("start_date") Date startDate, @Param("end_date") Date endDate) throws DataAccessException;
}
