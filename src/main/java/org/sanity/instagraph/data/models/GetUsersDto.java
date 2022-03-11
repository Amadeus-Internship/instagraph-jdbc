package org.sanity.instagraph.data.models;

public class GetUsersDto {
    private int id;

    private String username;

    public GetUsersDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "GetUsersDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
