class Pattern
{
public static void pyramid(int n)
{
for(int i = 0;i<n;i++)
{
for(int j = n-1;j>1;j--)
{
System.out.println(" ");
}
for(int j = n-1;j>1;j++)
{
System.out.println("* ");
}
System.out.println();
}
}
public static void main(String[] args)
{
int n = 5;
pyramid(n);
}
}