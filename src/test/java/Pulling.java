import org.checkerframework.checker.units.qual.Length;

public class Pulling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Test Record");
String str = "ShivaShankar";
/*int length = str.length();
char[] ch = str.toCharArray();
for(int i=0; i<length; i++)
{
	for(int j=i+1; j<length; j++ )
	{
		if (ch[i]==ch[j])
		{
			System.out.println("Duplicate values "+ ch[j]);
		}
	}
}*/
int count =0;
char[] c = str.toCharArray();
for(int i=0; i<c.length; i++)
{
	for ( int j=i+1; j<c.length; j++)
	{
		if (c[i]==c[j])
		{
			System.out.println("Duplicate values "+ c[j]);
		}
	}
}

	}

}
