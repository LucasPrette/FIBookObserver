public class Post {
    private String subject;
    private User author;

    public Post (String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return  this.subject;
    };

    public User getAuthor() {
        return this.author;
    };


}
