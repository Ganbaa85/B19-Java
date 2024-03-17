package Exceptions;

import ClassesAndObject.Basketball;

public class Ball {
    boolean isFouled;

    void playerFouledDuringShooting(boolean isFouled) {
        this.isFouled = isFouled;
    }

    void makeFoul() throws ShootingFoulException {
        throw new ShootingFoulException("Player is fouled");
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        try {
            ball.makeFoul();
        } catch (ShootingFoulException shootingFoulException) {
            System.out.println(shootingFoulException.getMessage());
        }
    }
}
