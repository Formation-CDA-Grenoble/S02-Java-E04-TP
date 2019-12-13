package app;

class Character {
    private int lives = 3;

    public Character() { }

    public Character(int lives) {
        this.lives = lives;
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
