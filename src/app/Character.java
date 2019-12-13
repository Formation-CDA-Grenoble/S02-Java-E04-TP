package app;

class Character {
    private int lives = 3;
    private boolean isBig;
    private boolean isInvulnerable;

    public Character() { }

    public Character(int lives) {
        this.lives = lives;
    }

    public boolean getIsInvulnerable() {
        return isInvulnerable;
    }

    public void pickUpStar() {
        isInvulnerable = true;
    }

    public void invulnerableWearsOff() {
        isInvulnerable = false;
    }

    public boolean getIsBig() {
        return isBig;
    }

    public void pickUpMushroom() {
        isBig = true;
    }

    public void takeHit() {
        if (isInvulnerable) {
            return;
        }
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
