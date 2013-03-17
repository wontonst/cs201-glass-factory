package glassline.royconveyor;

/**
Object representation of the conveyor line pop up system. has an OperatorAgent attached. 
 */
public class Popup extends ConveyorPart{
    
    protected BinaryTree<Barcode> persistentgrab;///<grabs all parts with the specified barcode
    protected BinaryTree<UniqueObject> singlegrab;///<grabs a single part

    /**
sets a part with the specified barcode to always be grabbed
     */
    public void addPersistent(Barcode b)
    {

    }
    /**
stop the part with the specified barcode from being always grabbed
     */
    public void removePersistent(Barcode b)
    {

    }
    /**
grab the passed UniqueObject once
     */
    public void addUnique(UniqueObject o)
    {

    }
    /**
cancel order to grab the passed UniqueObject once
    */
public void removeUnique(UbiqueObject o)
    {

    }
    /**
check if the part is to be grabbed
     */
    public boolean needsGrab(Glass g)
    {

    }
}
