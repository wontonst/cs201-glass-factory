package glassline;

public class Glass extends UniqueObject{

    Barcode barcode;

    public Glass(long barcode)
    {
	this.barcode = new Barcode(barcode);
    }

}
