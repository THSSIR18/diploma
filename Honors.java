public class Honors extends Diploma
{
	public Honors(String name , String major)
	{
		super(name,major);
	}
	public String toString()
	{
		String str=null;
		str = super.toString() + " with Honors";
		return str;
	}
}