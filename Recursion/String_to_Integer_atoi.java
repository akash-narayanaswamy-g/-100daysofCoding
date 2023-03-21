package Recursion;

public class String_to_Integer_atoi {

	public static void main(String[] args) {
		String s = "   -42";
		System.out.println(myAtoi(s));

	}
	static int total;
	public static int myAtoi(String s) {
        total=0;
        return myAtoi(s,0,true,false);
    }
	static int myAtoi(String S,int ind,boolean sign,boolean num){
        if(ind==S.length()) return 0;
        if(!num){
            if(S.charAt(ind)==' ') return myAtoi(S,ind+1,sign,num);
            if(S.charAt(ind)=='-' || S.charAt(ind)=='+'){
                sign=(S.charAt(ind)=='-'?false:true);
                return myAtoi(S,ind+1,sign,!num);
            }
        }
        num=true;
        char ch=S.charAt(ind);
        if(ch-'0'<0 || ch-'0'>9) return 0;
        if(total>Integer.MAX_VALUE/10 || total==Integer.MAX_VALUE/10 && ch-'0'>7)
            return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
            
        total=total*10+ch-'0';
        int t=myAtoi(S,ind+1,sign,num);
        if(t==0) return sign?total:-total;
        else return t;
    }

}
