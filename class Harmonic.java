public class Harmonic{
{
public static void main(String…s)
{
int n,i;
float sum=0;

n=Integer.parseInt(s[0]);

for(i=1;i<=n;i++)
{
  sum=sum+(float)1/i;
}

System.out.println(“nSum=”+sum);
}
}

