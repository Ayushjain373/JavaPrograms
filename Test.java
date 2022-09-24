package sumit;

public class Test{
	static int d=60;//static variable
	
	
	void display()
	{
		int t=70;//Local Variable
		System.out.println(t);
	}
	
	
	
public static void main(String[] args) {
	
	int f=500;//Instance variable
	System.out.println(f);
	Test t1=new Test();
	t1.display();
	System.out.println(d);
	
	

}
}
