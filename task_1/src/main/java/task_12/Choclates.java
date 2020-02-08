package task_12;

public class Choclates {
	int c=0,s=0,s1=0;
	
	public int w(int p[])
	{    
		for(int i=0;i<p.length;i++)
		{
			
			s=s+p[i];
		}
			return s;
	}
	public int w1(int p[],int a,int b)
	{    
		for(int i=0;i<p.length;i++)
		{
			
			if(p[i]>a && p[i]<b)
			{
				c++;
				
			}
			
		}
			return c;
	}

}
