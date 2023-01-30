package src;

import java.util.ArrayList;

public class Entity {
    private Personality persona;
    private ArrayList<Relationship> relationships;
    
    public Entity() {
        this.persona = Personality.INIT;
        this.persona = this.persona.randomNew();
    }

    //Get methods, ugly code ...
    public Personality getPersonality(){return this.persona;}
    public ArrayList<Relationship> getRelationships(){return this.relationships;}
}