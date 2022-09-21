import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1;
        String str2;
        str1=sc.next();
        str2=sc.next();

        int count1[]=new int[26];
        int count2[]=new int[26];
        for(int i=0;i<str1.length();i++){
        	count1[str1.charAt(i)-'a']++;
		}
        for(int i=0;i<str2.length();i++){
            count2[str2.charAt(i)-'a']++;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum+=Math.abs(count2[i]-count1[i]);
        }
        sum=sum%6;
		String ans = "";
		switch(sum){
			case 1 : ans = "Friends";
            break;
            case 2 : ans = "Love";
            break;
            case 3 : ans = "Affection";
            break;
            case 4 : ans = "Marriage";
            break;
            case 5 : ans = "Enemy";
            break;
            default : ans = "Siblings";
        }
		System.out.print(ans);
	}
}
