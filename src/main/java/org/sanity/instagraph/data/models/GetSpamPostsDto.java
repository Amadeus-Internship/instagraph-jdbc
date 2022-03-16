package org.sanity.instagraph.data.models;

public class GetSpamPostsDto {
    private int id;

    private String caption;

    private int comments;

    public GetSpamPostsDto() {
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

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", comments=" + comments +
                '}';
    }
}
