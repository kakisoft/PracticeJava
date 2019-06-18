class User {
    private String name;
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() { // getter
        return this.score;
    }

    public void setScore(int score) { // setter
        if (score > 0) {
            this.score = score;
        }
    }

}

public class Accessor {

    public static void main(String[] args) {
        User tom = new User("tom", 65);
        tom.setScore(85);
        tom.setScore(-22);
        System.out.println(tom.getScore()); // => 85
    }

}