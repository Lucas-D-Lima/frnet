package src;

//Means a 'Edge' in a graph

public class Relationship {
    private int friendshipLevel;

    public Relationship(int friendshipLevel) {
        this.friendshipLevel = friendshipLevel;
    }

    //Get methods
    public int getFriendshipLevel() { return this.friendshipLevel;}
}
