public class Main {
    public static void main(String[] args) {
        var user1 = new User("Dwight");
        var user2 = new User("Cleito");
        var user3 = new User("Cleusa");
        var user4 = new User("Mari");
        var user5 = new User("Laura");
        var user6 = new User("Marcia");
        var user7 = new User("Marco");

        user1.addFollower(user2);
        user1.addFollower(user3);
        user1.addFollower(user4);

        user1.createPost("Today smoking is gonna save lives");

    }
}