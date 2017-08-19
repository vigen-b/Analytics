package com.vigen.plexonic.analytics.api.data.user.register;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String user_id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date install_date;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getInstall_date() {
        return install_date;
    }

    public void setInstall_date(Date install_date) {
        this.install_date = install_date;
    }
}
