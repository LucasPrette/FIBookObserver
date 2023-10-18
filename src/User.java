import javax.security.auth.Subject;
import java.util.ArrayList;

public class User implements Observer{
    private String name;
    private ArrayList<User> followers;
    private Post post;

    public User(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    };

    private String getName() {
        return this.name;
    }

    public void addFollower(User user) {
        followers.add(user);
    }

    public void removeFollower(User user) {
        followers.remove(user);
    }

    public void createPost(String subject) {
        post = new Post(subject);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(User followers : followers){
            System.out.println("----------");
            System.out.println("Hey " + followers.getName());
            System.out.println("there's a new post from " + this.name);
            System.out.println(this.name + " says: " + post.getSubject());
        }

    }



}
