package com.vigen.plexonic.analytics.api.data.user.visit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String user_id;

    private Date request_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public Date getRequest_date() {
        return request_date;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setRequest_date(Date request_date) {
        this.request_date = request_date;
    }
}
