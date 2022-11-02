package co.edu.eci.arep.model;

public class Tweet {

    String text;
    User user;

    public Tweet(String text,User user) {
        this.text = text;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "{usuario:" + user.getName() + ",text:" +
                text + '\'' +
                '}';
    }
}
