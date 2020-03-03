import java.util.*;
import java.lang.*;
class Heap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,size;
		
		
		System.out.println("enter the no of array elements");
		n=sc.nextInt();
		int a[]=new int[n];
		size=n;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Heap hp=new Heap();
		for(i=(a.length-1)/2;i>=0;i--){
			
			hp.max_heap(a,i,size);
		}
		for(i=size-1;i>0;i--){
			j=a[0];
			a[0]=a[i];
			a[i]=j;
			size=size-1;
			hp.max_heap(a,0,size);
			
		}
			
		
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
	void max_heap(int a[],int i,int size)
		{
			int larg,temp;
		
			int l=2*i+1;
			int r=2*i+2;
			if(l<size&& a[l]>a[i])
				larg=l;
			else
				larg=i;
			if(r<size&& a[r]>a[larg])
				larg=r;
			if(larg!=i)
			{
				temp = a[larg];
				a[larg]=a[i];
				a[i]=temp;
				max_heap(a,larg,size);
			}
		}
}