package org.sanity.instagraph.data.models;

public class GetPostsAndCommentatorsDto {
    private int id;

    private String caption;

    private int users;

    public GetPostsAndCommentatorsDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }
}
