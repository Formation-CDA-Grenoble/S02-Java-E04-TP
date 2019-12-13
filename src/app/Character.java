package app;

class Character {
    private int lives = 3;
    private boolean isBig;

    public Character() { }

    public Character(int lives) {
        this.lives = lives;
    }

    public boolean getIsBig() {
        return isBig;
    }

    public void pickUpMushroom() {
        isBig = true;
    }

    public void takeHit() {
        if (isBig) {
            isBig = false;
        } else {
            loseLife();
        }
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void addLife() {
        lives ++;
    }

    public void loseLife() {
        lives --;
        if (lives == 0) {
            System.out.println("Game over");
        }
    }
    
    public boolean hasLives() {
        return lives > 0;
    }
}
