import java.util.*;
class prg5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String name=sc.nextLine();
        System.out.println("Enter age ");
        int age=sc.nextInt();
        System.out.println("Enter monthly income ");
        double income=sc.nextDouble();
        System.out.println("Enter cibil score ");
        int cibil=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter existing loan(yes/no) ");
        String loan=sc.nextLine();
        if(age>=21){
            if(income>=30000){
                if(cibil>=750){
                    if(loan.equalsIgnoreCase("no")){
                        System.out.println("Eligible for loan");
                    }
                    else{
                        System.out.println("criteria not fulfilled");
                        System.out.println("Not Eligible");
                    }
                }
            }
        }
    }
}