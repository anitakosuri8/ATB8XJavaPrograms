package tasks.task_25092024;

public class CountVowelsCns {
    public static void main(String[] args) {
        String s="pramod";
        int vcount=0,ccount=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println(vcount);
        System.out.println(ccount);
    }
}
