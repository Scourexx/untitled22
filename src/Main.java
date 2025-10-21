import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1
//        int n = in.nextInt();
//        int x = in.nextInt();
//        if(n>x){
//            System.out.println(x);
//        } else if (x>n) {
//            System.out.println(n);
//
//        }else {
//            System.out.println("Тең");
//        }

        //2
//          int n1 = in.nextInt();
//          if(n1%2==0){
//              System.out.println("Жұп");
//
//
//          } else {
//              System.out.println("Тақ");
        //3
//        int NN = in.nextInt();
//        int sum=0;
//        for(int i = 0; i < NN; i++){
//            sum+=i;
//
//          }
//        System.out.println(NN+sum);
        //4
//        int XX = in.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(XX + " x " + i + " = " + (XX * i));
//        }
        //5
//        int n = in.nextInt();
//        int s = 1;
//        for (int i = 1; i <= n; i++) {
//            s*= i;
//        }
//
//        System.out.println(n + s);
        //6
//        String t= in.nextLine();
//        int c = 0;
//        String aa = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
//        for (int i = 0; i < t.length(); i++) {
//            if (aa.indexOf(t.charAt(i)) != -1) {
//                c++;
//            }
//        }
//
//        System.out.println(c);
        //7
//        String text = in.nextLine();
//        String a ="";
//        for (int i = text.length() - 1; i >= 0; i--) {
//            a+= text.charAt(i);
//        }
//
//        System.out.println(a);
        //8

//        String line = in.nextLine();
//
//
//        String[] parts = line.split(" ");
//
//
//        int max = Integer.parseInt(parts[0]);
//
//
//        for (int i = 1; i < parts.length; i++) {
//            int num = Integer.parseInt(parts[i]);
//            if (num > max) {
//                max = num;
//            }}
        //9
        String l =in.nextLine();


//        String[] parts = l.split(" ");
//        int sum = 0;
//        for (int i = 0; i < parts.length; i++) {
//            int num = Integer.parseInt(parts[i]);
//            sum = sum + num;
//        }
//
//
//        System.out.println(sum);
        //10
        String line = in.nextLine();
        String[] parts = line.split(" ");



        int x = in.nextInt();
        boolean X = false;

        for (int i = 0; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i]);
            if (num == x) {
                X = true;
                break;
            }
        }

        if (X) {
            System.out.println(x + " табылды.");
        } else {
            System.out.println(x + " табылмады.");
    }}}