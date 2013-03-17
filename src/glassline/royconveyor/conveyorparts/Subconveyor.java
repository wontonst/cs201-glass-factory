package glassline.royconveyor.conveyorparts;

/**
A data structure that is used to represent that various segments of the conveyor.
 */
public class Subconveyor implements Transporter{

    LinkedList<Transportable> queue = new LinkedList<Transportable>();

    public Subconveyor()
    {

    }
    public void addPart(Glass t)
    {
	this.queue.add(t);
    }
    public void popFront()
    {

    }

}
