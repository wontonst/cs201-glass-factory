package glassline;

public class Barcode {

    private long barcode;

    public BarcodedObject(long id)
    {
	super();
	this.barcode = id;
    }
    public boolean equals(BarcodedObject o)
    {
	return (this.getBarcode() == o.getBarcode()) && super();
    }
}
