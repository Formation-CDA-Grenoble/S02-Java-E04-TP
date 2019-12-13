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
        if (isBig == true) {
            isBig = false;
        } else {
            lives -= 1;
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
    }
    
    public boolean hasLives() {
        return lives > 0;
    }
}
