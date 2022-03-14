package org.sanity.instagraph.data.models;

public class GetCheatersDto {
    private int id;

    private String username;

    public GetCheatersDto() {
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
        return "GetCheatersDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
