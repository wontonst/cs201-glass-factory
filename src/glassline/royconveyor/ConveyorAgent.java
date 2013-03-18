package glassline.royconveyor;

public class ConveyorAgent extends VerboseAgent implements Transporter{

    ArrayList<ConveyorPart> components;///<list of popups and conveyors

    TwoWayMap<ConveyorPart,OperatorAgent> operators;///<list of operators and their respective duty

    public ConveyorAgent()
    {
	super("ConveyorAgent");
    }


}
