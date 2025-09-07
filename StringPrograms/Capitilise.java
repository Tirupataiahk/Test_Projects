package StringPrograms;

public class Capitilise {
    public static void main(String[] args) {
        
        String str= "Tirupataiah";
        int size=str.length();
        String ns="";
        for(int i=0;i<size;i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch))
            ns=ns+Character.toUpperCase(ch);
            else
            ns=ns+ch;
        }
        System.out.println("Before converting string: "+str);
        System.out.println("After converting string: "+ns);
    }
    
}
