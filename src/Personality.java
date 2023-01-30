package src;

import java.util.Random;

public enum Personality {
    INIT(0.0f),
    NEUTRAL(0.25f),
    FRIENDLY(0.5f),
    RUDE(0.1f);

    private float newFriendProbability;
    
    Personality(float newFriendProbability) {
        
    }

    public Personality randomNew(){
        Random rand = new Random();
        int index = rand.nextInt(values().length);
        if (index == 0) index=+1;
        return values()[index];
    }

    public float getNewFriendProbability(){ return this.newFriendProbability;}

    
}
//----------------------------------------------------------------
/*
 * Personalty is a enum that represents a unique Personality
 * Has arguments that represent the probability of an action
 */