package org.sanity.instagraph.data.models;

public class User extends BaseEntity {
    private String username;

    private String password;

    private int profilePictureId;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getProfilePictureId() {
        return profilePictureId;
    }

    public void setProfilePictureId(int profilePictureId) {
        this.profilePictureId = profilePictureId;
    }

    @Override
    public String toString() {
        return "User{" +
                (getId() != -1 ? "id='" + getId() + '\'' : "") +
                (username != null ? "username='" + username + '\'' : "") +
                (password != null ? ", password='" + password + '\'' : "") +
                (profilePictureId != -1 ? ", profilePictureId=" + profilePictureId : "") +
                '}';
    }
}
