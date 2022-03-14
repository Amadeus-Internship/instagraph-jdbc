package org.sanity.instagraph.data.models;

public class GetFilterPostsDto {
    private int id;

    private String caption;

    private String user;

    public GetFilterPostsDto() {
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "GetFilterPostsDto{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
