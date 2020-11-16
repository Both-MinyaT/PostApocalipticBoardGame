package src.bmtamas;

import java.util.List;

public class Player {
    private int maxHp;
    private int actualHp;
    private int hunger;
    private int radiation;
    private int defense;
    private int food;
    private int cigarettes;
    private String race;
    private String sex;
    private boolean isDead;
    private boolean legIsEquipped;
    private boolean chestIsEquipped;
    private boolean beltIsEquipped;
    private boolean leftArmIsEquipped;
    private boolean rightArmIsEquipped;
    private boolean headIsEquipped;
    private Ability ability;
    private List<ActionCard> actionCardsOnHand;
    private List<ActionCard> equippedGears;
    private List<ActionCard> nonEquippedGears;


    public Player() {
        //base cases
        this.isDead = false;
        this.hunger = 0;
        this.radiation = 0;
        this.defense = 0;
        this.legIsEquipped = false;
        this.chestIsEquipped = false;
        this.leftArmIsEquipped = false;
        this.rightArmIsEquipped = false;
        this.headIsEquipped = false;
        this.beltIsEquipped = false;
        this.cigarettes = 0;
        this.food = 0;
    }

    public int getActualHp() { return actualHp; }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHunger() {
        return hunger;
    }

    public int getRadiation() {
        return radiation;
    }

    public int getDefense() {
        return defense;
    }

    public String getSex(){ return sex; }

    public String getRace(){return race; }

    public boolean isDead() {
        return isDead;
    }

    //TODO

    public void chooseAbility(){
        //Here must be the logic to choose between to abilities



        //After choose, some variables must be set
        setMaxHP();
        setCurrentHP();
        setRace();
        setSex();
    }

    private void setCurrentHP() {

    }

    private void setRace() {

    }

    private void setSex() {

    }

    private void setMaxHP() {

    }


    public void takeDamage(int howMuch){
        actualHp = actualHp - howMuch;
        if (actualHp <= 0){
            isDead = true;
        }
        System.out.println("I am dead");
    }

    private void attack(Player enemyPlayer){
        enemyPlayer.takeDamage(6);
    }

    private void trade(Player enemyPlayer){

    }

    private boolean rob(Player enemyPlayer){
        return false;
    }

    private void buyCards(){

    }

    private void sellCards(){

    }

    private void activateFlashCard(){

    }

    private void drawCards(int howMuch){
        for(int i = 0; i<howMuch; i++){

        }
    }

    public void removeCards(){

    }

    private void move(){

    }

    public void beginMyTurn(){
        decideNonActionMoves();
        decideActionMoves();
    }

    private void decideNonActionMoves() {

    }

    private void decideActionMoves() {

    }

    private void equipGear(){

    }
}
