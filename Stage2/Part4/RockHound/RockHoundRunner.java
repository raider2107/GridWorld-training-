import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class RockHoundRunner
{
public static void main(String[] args)
{
ActorWorld world = new ActorWorld();
world.add(new Location(3,3),new Rock());
world.add(new Location(6,6),new Rock());
world.add(new Location(4,8),new Rock(Color.BLUE));
world.add(new Location(7,3),new Rock(Color.YELLOW));
world.add(new Location(2,6),new RockHound());
world.add(new Location(3,0),new RockHound());
world.show();

}
}
