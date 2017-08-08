package com.vigen.plexonic.analytics.api.data.user.register;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserRegister {
    @Id
    private String user_id;

    private Date install_date;

    public String getUser_id() {
        return user_id;
    }

    public Date getInstall_date() {
        return install_date;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setInstall_date(Date install_date) {
        this.install_date = install_date;
    }
}
