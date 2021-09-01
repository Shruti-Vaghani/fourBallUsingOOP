import processing.core.PApplet;
import processing.core.PImage;


public class Four_Ball_Processing_Using_OOP extends PApplet {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 550;

    Balls[] ball = new Balls[4];
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    public void setup()
    {
        background(255);
        float j = 1;
        for (int i = 0; i< ball.length; i++){
            ball[i] = new Balls(i+j);
        }
    }

    @Override
    public void draw() {
        for (Balls b : ball){
            b.move();
            b.display();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Four_Ball_Processing_Using_OOP",args);

    }

    public class Balls{
        float x,ballHeight,ballSpeed;
        Balls(float j){
            this.x = 0;
            this.ballHeight = (height *j)/5;

            this.ballSpeed = j;
        }
        void display(){
            ellipse(this.x,this.ballHeight, 20,20);
        }

        void move(){
            this.x = this.x + this.ballSpeed;
        }
    }

}



