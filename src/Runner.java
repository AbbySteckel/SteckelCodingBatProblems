public class Runner {


    public static void main(String[] args) {
        System.out.println(diff21(2));
        System.out.println(diff21(25));
        System.out.println(stringBits("Hello"));
        System.out.println(helloName("Abby"));
        System.out.println(makeOutWord("!@##@!","computer" ));
        System.out.println(love6(5,6));
        System.out.println(blackjack(18,4));

    }
//Warmup-1
    public static int diff21(int n) {
        if(n>21){
            return (n-21)*2;
        }else{
            return 21-n;
        }
    }

    //Warmup-2
    public static String stringBits(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i+=2){
            answer+=str.substring(i,i+1);
        }
        return answer;
    }
//String-1
    public static String helloName(String name) {
        return "Hello "+ name + "!";
    }

    public static String makeOutWord(String out, String word) {
        int length = out.length();
        String result = out.substring(0,length/2);
        result +=word;
        result+=out.substring(length/2,length);
        return result;
    }
//Array-1
    public static boolean commonEnd(int[] a, int[] b) {
        int firsta = a[0];
        int lasta = a[a.length - 1];
        int firstb = b[0];
        int lastb = b[b.length - 1];
        if (firsta == firstb || lasta == lastb) {
            return true;
        }
        return false;
    }
    //Logic-1
    public static boolean love6(int a, int b) {
        if(a==6 || b==6){
            return true;
        }
        if(Math.abs(a-b)==6){
            return true;
        }
        if(a+b==6){
            return true;
        }
        return false;
    }
//Logic-2
    public static int blackjack(int a, int b) {
        if(a>21&&b>21){
            return 0;
        }
        if(a>21){
            return b;
        }
        if(b>21){
            return a;
        }
        if(21-a<21-b){
            return a;
        }else{
            return b;
        }
    }


}
