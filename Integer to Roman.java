public class Solution {
	public String intToRoman(int num) {
		String unit="";
		String decimal ="";
		String hundred ="";
		String thousand ="";
		int a =num%10;
		if (a !=0)
		{
			switch(a) 
			{ 
			   case 1: 
			       unit ="I"; 
			       break; 
			   case 2: 
			       unit ="II"; 
			       break; 
			   case 3: 
			       unit ="III"; 
			       break; 
			   case 4: 
			       unit ="IV"; 
			       break; 
			   case 5: 
			       unit ="V"; 
			       break; 
			   case 6: 
			       unit ="VI"; 
			       break; 
			   case 7: 
			       unit ="VII"; 
			       break; 
			   case 8: 
			       unit ="VIII"; 
			       break; 
			   case 9:
				   unit ="IX";
				   break;
			} 
			
		}
		num =num/10;
		a= num%10;
		if (a !=0)
		{
			switch(a) 
			{ 
			   case 1: 
			       decimal ="X"; 
			       break; 
			   case 2: 
			       decimal ="XX"; 
			       break; 
			   case 3: 
			       decimal ="XXX"; 
			       break; 
			   case 4: 
			       decimal ="XL"; 
			       break; 
			   case 5: 
			       decimal ="L"; 
			       break; 
			   case 6: 
			       decimal ="LX"; 
			       break; 
			   case 7: 
			       decimal ="LXX"; 
			       break; 
			   case 8: 
			       decimal ="LXXX"; 
			       break; 
			   case 9:
				   decimal ="XC";
				   break;
			} 
			
		}
		
		num =num/10;
		a= num%10;
		if (a !=0)
		{
			switch(a) 
			{ 
			   case 1: 
			       hundred ="C"; 
			       break; 
			   case 2: 
			       hundred ="CC"; 
			       break; 
			   case 3: 
			       hundred ="CCC"; 
			       break; 
			   case 4: 
			       hundred ="CD"; 
			       break; 
			   case 5: 
			       hundred ="D"; 
			       break; 
			   case 6: 
			       hundred ="DC"; 
			       break; 
			   case 7: 
			       hundred ="DCC"; 
			       break; 
			   case 8: 
			       hundred ="DCCC"; 
			       break; 
			   case 9:
				   hundred ="CM";
				   break;
			} 
			
		}
		
		num =num/10;
		a= num%10;
		if (a !=0)
		{
			switch(a) 
			{ 
			   case 1: 
			       thousand ="M"; 
			       break; 
			   case 2: 
			       thousand ="MM"; 
			       break; 
			   case 3: 
			       thousand ="MMM"; 
			       break; 
			} 
			
		}
		
		String val =thousand+hundred+decimal+unit;
		return val;
    }

}
