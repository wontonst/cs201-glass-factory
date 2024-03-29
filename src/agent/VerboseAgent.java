
public abstract class VerboseAgent extends Agent{
    private String name = null;
    private Printer printer = new Printer();
    public VerboseAgent(){}
    public VerboseAgent(String name)
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
