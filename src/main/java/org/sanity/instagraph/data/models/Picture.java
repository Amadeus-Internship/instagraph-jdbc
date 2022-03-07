package org.sanity.instagraph.data.models;

public class Picture extends BaseEntity {
    private String path;

    private double size;

    public Picture() {
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
        return "Picture{" +
                "path='" + path + '\'' +
                ", size=" + size +
                '}';
    }
}
