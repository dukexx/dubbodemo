package com.dubbodemo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiayishun on 2017/3/11.
 */
public class TestBean implements Serializable{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
