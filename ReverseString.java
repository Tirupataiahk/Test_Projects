package selenium.AutomationFrameworkSelenium.src;

public class ReverseString {
    public static void main(String[] args) {
        String str ="WELCOME";
        int size=str.length();
        String rev="";
        for(int i=0;i<size;i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Before Reverse the String: "+str);
        System.out.println("After Reverse the string: "+rev);

    }
    
}
