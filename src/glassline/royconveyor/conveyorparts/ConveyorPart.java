package glassline.royconveyor.conveyorparts;

/**
All parts that exists in the ConveyorAgent must extend this class.
 */
public class ConveyorPart extends VerboseObject{

    private static int linesize = 0;

    protected final int position;///<position from the start of the conveyor (0 is the first component on the conveyor line
    public ConveyorPart(int pos)
    {
	super("ConveyorPart"+pos);
	this.position = pos;
	if(pos != this.linesize)
	    {
		this.print("WARNING - linesize does not pos which may mean that conveyor parts are not added in sequential order.");
	    }
    this.linesize++;
    }
    public int getPosition()
    {
	return this.position;
    }
    public boolean isBehind(ConveyorPart c)
    {
	return c.getPosition() < this.getPosition();
    }
    public boolean isInFront(ConveyorPart c)
    {
	return c.getPosition() > this.getPosition();
    }

}
