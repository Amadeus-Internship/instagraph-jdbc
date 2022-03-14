package org.sanity.instagraph.data.models;

public class GetHighQualityPicturesDto {
    private int id;

    private String path;

    private double size;

    public GetHighQualityPicturesDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "GetHighQualityPicturesDto{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", size=" + size +
                '}';
    }
}
