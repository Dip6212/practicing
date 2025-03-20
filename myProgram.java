

public class MyProgram{

    public static void main(String[] args){
        int c=12;
        int d=23;

        int temp=c;
        c=d;
        d=temp;

        System.out.println(c);
        System.out.println(d);
    }
}