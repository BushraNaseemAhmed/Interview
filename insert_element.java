package array;
// insert 12 in a specific 3 in the array...
import java.util.ArrayList;
import java.util.List;
public class insert_element {
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		List s=new ArrayList();
		for(int i=0; i<a.length;i++)
		{
			s.add(a[i]);
		}
		s.add(3,12);
		System.out.println(s);
		Object[]c=new  Object[s.size()];
		s.toArray(c);
		for(int j=0;j<a.length;j++)
		{
			System.out.print(c[j]+" ");
		}
	}

}
