public class Solution {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length()+num2.length()];
        for(int i=0;i<num1.length();i++)
        {
            int carry = 0;
            int a = num1.charAt(num1.length()-1-i)-'0';
            for(int j=0;j<num2.length();j++){
                int  b = num2.charAt(num2.length()-1-j)-'0';
                result[i+j]+=carry+a*b;
                carry=num[i+j]/10;
                result[i+j]%=10;
            }
            result[i+num2.length()]+=carry;
        }
        int i=result.length-1;
        while(i>0 && result[i]==0) 
            i--;
        
        StringBuilder temp = new StringBuilder("");
        while(i>=0)
            temp.append((char)('0'+result[i--]));
        
        return temp.toString();
    }
}
