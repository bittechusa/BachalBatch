import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;


public class MyFristClass 
{
	
	
     
	public static void main(String[] args) throws NoSuchMethodException, RuntimeException, Exception, Exception 
	{
		Double e=323.567;
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		//System.out.println(currency);
		String s=currency.format(e);
		System.out.println(s);
		/*ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		//System.out.println(a.t);
		for(int i=a.size()-1;i>=0;i= -1)
		{
			System.out.println("ho");
			
		}*/
		/*
		Foo foo= new Foo();
		Method method = foo.getClass().getMethod("doSomething", null);
		method.invoke(foo, null);*/
	}

}
