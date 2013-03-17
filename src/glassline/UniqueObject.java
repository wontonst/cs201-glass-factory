package glassline;

/**
A generic class type for all objects that must have a unique identifier.
 */
public class UniqueObject{

    private static volatile long next_id = 0;///<next object's id

    private long id;///<unique id of object

    public UniqueObject()
    {
	this.id = next_id++;
    }
    public long getId(){
	return this.id;
    }
    public boolean equals(UniqueObject o)
    {
	return this.getId() == o.getId();
    }


}
