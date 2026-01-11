package com.chhavi;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.lang.String;
@Entity
public class Allen {
    @Id
   private int aid;
   private String aname;
   private String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }


    public String toString() {
        return "Allen{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
