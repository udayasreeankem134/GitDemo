import org.checkerframework.checker.units.qual.Length;

public class Thirdcoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String r = "Udayasree";
int count=0;
char[] ch = r.toCharArray();
for(int i=0; i<ch.length; i++) {
	for(int j=i+1; j<ch.length; j++)
	{
		if(ch[i]==ch[j]) {
			System.out.println("Duplicate are :" +ch[j]);
		}
		
	}
}
	}

}
