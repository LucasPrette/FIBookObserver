public class Post {
    private String subject;
    private User author;

    public Post (String subject, User author) {
        this.subject = subject;
        this.author = author;
    }

    public String getSubject() {
        return  this.subject;
    };

    public User getAuthor() {
        return this.author;
    };


}
