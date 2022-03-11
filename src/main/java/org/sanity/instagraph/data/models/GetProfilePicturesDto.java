package org.sanity.instagraph.data.models;

public class GetProfilePicturesDto {
    private int id;

    private String username;

    private String size;

    public GetProfilePicturesDto() {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "GetProfilePicturesDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
