package org.sanity.instagraph.data.models;

public class Comment extends BaseEntity {
    private String content;

    private int userId;

    private int postId;

    public Comment() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
