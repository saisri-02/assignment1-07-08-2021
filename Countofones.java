import java.util.*;
public class Countofones
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n+1];
for(int i=0;i<=n;i++)
{
a[i]=Countofone(i);
System.out.print(a[i]+" ");
}
}
public static int Countofone(int n)
{
int count=0;
while(n>0)
{
n=n&(n-1);
count++;
}
return count;
}
}

output1:
2
0 1 1

output2:
5
0 1 1 2 1 2 