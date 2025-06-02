package java_with_DSA;

interface A
{
     int add(int i,int j);
}

public class LambdaExample
{
  public static void main(String[] args) {
        A obj=(i,j) ->  i+j;
      int res=obj.add(10, 15);
       System.out.println(res);
  }
}