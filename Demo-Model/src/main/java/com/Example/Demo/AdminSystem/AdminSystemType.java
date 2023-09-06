package	com.Example.Demo.AdminSystem;

public enum AdminSystemType {
	
	FIRST("FIRST"),
	SECOND("SECOND"),
	THIRD("THIRD");
	
	String name;
    
    AdminSystemType(String name)
    {
       this.name = name;
    }
    

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
