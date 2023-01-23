package com.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.geom.Point2D;
public class Player {
    Texture image;
    Point2D position = new Point2D.Double();
    int speed;

    public Player(Texture image) {
        this.image = image;
        this.position.setLocation(0,0);
        this.speed = 10;
    }

    public Texture getImage() {
        return image;
    }

    public void setImage(Texture image) {
        this.image = image;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp() {
        position.setLocation(position.getX(), position.getY() + speed);
    }

    public void moveDown() {
        position.setLocation(position.getX(), position.getY() - speed);
    }

    public void moveLeft() {
        position.setLocation(position.getX() - speed, position.getY());
    }

    public void moveRight() {
        position.setLocation(position.getX() + speed, position.getY());
    }

    /*Move based on key press */
    public void update(){
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            moveUp();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            moveDown();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            moveLeft();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            moveRight();
        }
    }

    public void draw(SpriteBatch batch){
        batch.draw(image, (float) position.getX(), (float) position.getY(), 50, 50);
    }

}
