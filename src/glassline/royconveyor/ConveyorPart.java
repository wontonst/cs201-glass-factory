package glassline.royconveyor;

public class ConveyorPart{

    private static int linesize = 0;

    protected final int position;///<position from the start of the conveyor (0 is the first component on the conveyor line
    public ConveyorPart(int pos)
    {
	this.position = pos;

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