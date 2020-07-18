package com.example.tales;

import java.io.Serializable;

public class folktitle implements Serializable {

    private String name ;
    private String info;
    private String where;

    public folktitle(String name, String info, String where) {
        this.name = name;
        this.info = info;
        this.where = where;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
///
}
