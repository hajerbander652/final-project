package com.example.tales;

import java.io.Serializable;

public class recmovie implements Serializable {

    private  String url;
    private String name ;
    private int poster ;
    private String inf;

    public recmovie(String url, String name, int poster, String inf) {
        this.url = url;
        this.name = name;
        this.poster = poster;
        this.inf = inf;
    }


    /*




    public recmovie(String name, int poster, String url) {
        this.name = name;
        this.poster = poster;
       this.url= url;
    }
/*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
///

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }


    ////
}




