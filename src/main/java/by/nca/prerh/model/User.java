package by.nca.prerh.model;

import lombok.Getter;

@Getter
public enum User {
    SUPER_ADMIN("tatarinova", "c12g28Ale8"),
    INVALID_USER("hachapur", "74dh973jfj");

    private String username;
    private String password;


    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
