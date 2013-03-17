package glassline.royconveyor;

public class Printer implements PrintControllable{

    private static boolean verbosity = true;///<true = print ; false = disable printing

    public void setPrintOutput(boolean in)
    {
	this.verbosity = in;
    }
    public void print(String s)
    {
	if(verbosity)
	System.out.println(s);
    }
}
