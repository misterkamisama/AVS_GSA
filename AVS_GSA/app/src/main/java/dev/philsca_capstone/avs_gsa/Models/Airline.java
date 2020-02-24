package dev.philsca_capstone.avs_gsa.Models;

import java.io.Serializable;

public class Airline implements Serializable {
    private String name;
    private String desc;
    private String image;
    private String uid;

    public Airline(){

    }
    public Airline(String name, String desc, String image) {
        this.name = name;
        this.desc = desc;
        this.image = image;

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() { return uid; }

    public void setUid(String uid) { this.uid = uid; }

}
