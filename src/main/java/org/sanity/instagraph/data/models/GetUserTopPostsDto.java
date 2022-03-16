package org.sanity.instagraph.data.models;

public class GetUserTopPostsDto {
    private int id;

    private String username;

    private String caption;

    public GetUserTopPostsDto() {
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

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", caption='" + caption + '\'' +
                '}';
    }
}
