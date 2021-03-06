import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;

public class QuickCrabRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Rock());
        world.add(new Flower());
        world.add(new Flower());
        world.add(new Flower());
        world.add(new Flower());
        world.add(new Bug());
        world.add(new Bug());
        world.add(new QuickCrab());
        world.add(new QuickCrab());
        world.add(new QuickCrab());
        world.show();
    }
}