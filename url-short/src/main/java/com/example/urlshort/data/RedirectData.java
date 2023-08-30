package com.example.urlshort.data;

public class RedirectData {
    private String redirectTo;

    public RedirectData() {
    }

    public String getRedirectTo() {
        return redirectTo;
    }

    public void setRedirectTo(String redirectTo) {
        this.redirectTo = redirectTo;
    }

    @Override
    public String toString() {
        return "RedirectData{" +
                "redirectTo='" + redirectTo + '\'' +
                '}';
    }
}
