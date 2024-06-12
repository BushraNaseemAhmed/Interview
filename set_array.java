package array;
import java.util.LinkedHashSet;
import java.util.Set;
public class set_array {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,3};
		Set s=new LinkedHashSet();
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
		}
		Object[] o=new Object[s.size()];
		s.toArray(o);
		for(int j=0;j<o.length;j++)
		{
			System.out.print(o[j]);
		}
	}

}
