package com.example.myfirstrestapp;

public class Todo {

    private Integer id;
    private String description;
    boolean isDone;

    public void setId(Integer id){
        this.id = id;

    }
    public Integer getId (){
        return this.id;
    }

    public void setDescription (String desc){
        this.description = desc;
    }

    public java.lang.String getDescription() {
        return description;
    }
    public void setDone (boolean isDone) {
        this.isDone = isDone;

    }
    public boolean getDone(){
        return this.isDone;

    }
}
