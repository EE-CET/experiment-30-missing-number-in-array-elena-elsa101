   import java.util.*;
public class MissingNumber {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sum=0;
for(int i=0;i<n;i++){
sum+=sc.nextInt();
}
long total=(long)n*(n+1)/2;
System.out.print(total-sum);
}
}

