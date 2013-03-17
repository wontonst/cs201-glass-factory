package glassline.interfaces;

/**
An interface used for all production line conveyor systems.
 */
public interface ConveyorFamily{

    public void msgHalt();
    public void msgHereIsGlass();
    public void msgRequestTransfer();
    public void msgTransferApproved();

}
