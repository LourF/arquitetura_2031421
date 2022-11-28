package pt.uma.arq.entities;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;
import pt.uma.arq.game.Ship;


public class PlayerShip {
    private Animator animator;
    private int x,y;

    public PlayerShip(SpriteBatch batch){
        this.animator = new Animator(batch,"ship.png",5,2);
    }

    public void create(){
        this.animator.create();
    }

    public void render() {
        this.animator.render(this.x, this.y);
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

}
