package com.crevado.fr.androidmvvmbasics.model;

/**
 * Created by Fazle Rabbi 04,March,2020.
 * ┌────────────────────────────────────────
 * │ Web: https://fr.crevado.com
 * ├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄
 * │ Email: fazle.rabbi.cse@gmail.com
 * └────────────────────────────────────────
 */
public class User {

    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
