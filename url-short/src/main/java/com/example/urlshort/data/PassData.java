package com.example.urlshort.data;

public class PassData {
    private String data;

    public PassData() {
        //Do nothing
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PassData{" +
                "data='" + data + '\'' +
                '}';
    }
}
