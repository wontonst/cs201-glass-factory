package glassline.royconveyor;

import glassline.interfaces.ConveyorFamily;

/**
Roy's conveyor production line system implementation.
 */
public class ConveyorLine extends VerboseObject implements ConveyorFamily{

    ConveyorAgent conveyor;

    public ConveyorLine()
    {
	super("MAIN");//set name of this class
    }


}
