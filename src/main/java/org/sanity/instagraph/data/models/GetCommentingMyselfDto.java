package org.sanity.instagraph.data.models;

public class GetCommentingMyselfDto {
    private int id;

    private String username;

    private int myComments;

    public GetCommentingMyselfDto() {
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

    public int getMyComments() {
        return myComments;
    }

    public void setMyComments(int myComments) {
        this.myComments = myComments;
    }
}
