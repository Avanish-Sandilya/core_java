public class Main {
    public static void main(String[] args) {
        //System.out.print();
        System.out.print("Hello\n");
        //System.out.printf();
        String name = "Josh";
        int val=4;
        float num = 11.67f;
        char c='A';
        System.out.printf("%s %d %.2f %c\n",name,val,num,c);
        System.out.printf("%2$d %1$.2f %2$d\n",num,val);
    }
}
