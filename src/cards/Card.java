

public abstract class Card {
    protected int healthPoints = 400;
    protected int damagePoints = 50;
    protected int range;
    protected int speed;
    protected int cost;
    protected int troopCount = 1;
    protected String sourceImage;
    protected String sourceName;

    private int cordX;
    private int cordY;
    protected int renderingLayer = 1; // for troups that can move underground and will not have environmental impact until it appears on base layer
    
    public Card(){
        
    }

    public void act() {

    }

    private void move() {
        
    }

    private void getXLocation() {

    }

    private void getYLocation() {

    }
}