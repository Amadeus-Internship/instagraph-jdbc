package org.sanity.instagraph.data.models;

public class Post extends BaseEntity {
    private String caption;

    private int userId;

    private int pictureId;

    public Post() {
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "caption='" + caption + '\'' +
                ", userId=" + userId +
                ", pictureId=" + pictureId +
                '}';
    }
}
