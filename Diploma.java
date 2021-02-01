public class Diploma
{ 
	public String name = null;
	public String major = null;
	
	public Diploma(String name, String major)
	{
		this.major=major;
		this.name=name;
	}
	public void setName(String name)
	{
		this.name =name;
	}
	public String getName()
	{
		return name;
	}
	public void setMajor(String major)
	{
		this.major =major;
	}
	public String getMajor()
	{
		return major;
	}
	public String toString()
	{
		String str=null;
		str = "Name " + getName() + "\n" +
		"Major " + getMajor()+" \n" + getName()+ " has graduated with a major in " + getMajor() ;
		return str;
	}
	
}