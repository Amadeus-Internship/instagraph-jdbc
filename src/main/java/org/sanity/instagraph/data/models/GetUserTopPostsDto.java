package org.sanity.instagraph.data.models;

public class GetUserTopPostsDto {
    private int id;

    private String username;

    private String post;

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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
