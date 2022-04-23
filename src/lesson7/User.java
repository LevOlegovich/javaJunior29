package lesson7;

public class User {
    private String username;
    private String name;
    private int ponts;
    private String pathToAvatar;

    public User() {
    }

    public User(String username, String name, int ponts) {
        this.username = username;
        this.name = name;
        this.ponts = ponts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPonts() {
        return ponts;
    }

    public void setPonts(int ponts) {
        this.ponts = ponts;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }
}
