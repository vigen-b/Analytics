package com.vigen.plexonic.analytics.api.data.user.register;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;


public interface UserRegisterRepository extends CrudRepository<UserRegister, Integer> {

    @Query("SELECT COUNT(id) FROM UserRegister where DATE(install_date) = :date")
    Integer getRegisteredUsers(@Param("date") Date date) throws DataAccessException;
}
