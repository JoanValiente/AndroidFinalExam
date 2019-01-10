package com.example.joanvil.joanvaliente;

public class Model {
    String id, description;
    Boolean state;

    public Model(String id, String description, boolean state){
        this.id = id;
        this.description = description;
        this.state = state;
    }

    public String getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public Boolean getState(){
        return state;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setState(Boolean state){
        this.state = state;
    }
}
