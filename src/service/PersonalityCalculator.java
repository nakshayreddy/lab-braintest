package service;

public class  PersonalityCalculator {
	
	public String findYourBrainType(String options)
	{
		int value[]=findAnswers(options);	
		int a=value[0]+value[1]+value[2]+value[4]+value[7]+value[9]+value[10]+value[17]+value[13]+value[17]+value[19];
		int b=value[3]+value[5]+value[6]+value[8]+value[12]+value[14]+value[15]+value[16]+value[18];
		int x=66-a+b;		  
		if(x>=20 && x<=55)
		{
			return ("Left-brained ");
		}
		if(x>=56 && x<=64)
		{
			return ("No clear preference ");
		}
		if(x>=65 && x<=100)
		{
			return ("Right-brained");
		}
		else
		{
			return ("False ");
		}
		
				            
				

		
	}
	public int[] findAnswers(String options) {
		String c[]=options.split(",");
		int n=c.length;
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(c[i]);
		}
		return a;
		
		
	}
}