package glassline.royconveyor;

public class VerboseObject()
{
    private String name = null;
    private Printer printer = new Printer();
    public VerboseObject(){}
    public VerboseObject(String name)
    {
	this.name = name;
    }
    public print(String s)
    {
	if(this.name != null)
	    {
		printer.print("."+this.name+": "+s);
		return;
	    }
	printer.print("."+this.getClassName()+": "+s);
    }

}
