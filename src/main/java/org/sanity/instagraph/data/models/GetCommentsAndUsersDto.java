package org.sanity.instagraph.data.models;

public class GetCommentsAndUsersDto {
    private int id;

    private String fullComment;

    public GetCommentsAndUsersDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullComment() {
        return fullComment;
    }

    public void setFullComment(String fullComment) {
        this.fullComment = fullComment;
    }
}
