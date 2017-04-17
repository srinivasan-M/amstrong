import java.util.*;
class amstrong
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int c=0,temp=n,p;
while(n>0)
{
p=n%10;
n=n/10;
c=c+(p*p*p);
}
if(c==temp)
System.out.print("Amstrong Number");
else
System.out.print("Not a Amstrong Number");}}

