import javax.security.auth.Subject;
import java.util.ArrayList;

public class User implements Observer{
    private String name;
    private ArrayList<User> followers;

    public User(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    };

    public void addFollower(User user) {
        followers.add(user);
    }

    public void removeFollower(User user) {
        followers.remove(user);
    }
    
    public void createPost(String subject, User author) {
        var post = new Post(subject, author);
        notifyObserver(author);
    }

    @Override
    public void notifyObserver(User author) {
        System.out.println();
    }



}
