import java.util.*;
public class PhoneRecharge{
    int internet;
    int talkTime;

    PhoneRecharge(){
        internet = 0;
        talkTime = 0;
    }
    public void recharge(int choice){
        switch (choice){
            case 1:
                internet += 1;
                talkTime += 100;
                System.out.println("Activated recharge of ₹199 (1gb + 100min)");
                break;
             case 2:
                 internet += 2;
                 talkTime += 200;
                 System.out.println("Activated recharge of ₹299 (2gb + 200min)");
                 break;
             case 3:
                 internet += 3;
                 talkTime += 300;
                 System.out.println("Activated recharge of ₹399 (3gb + 300min)");
                 break;
              case 4:
                  internet += 5;
                  talkTime += 400;
                  System.out.println("Activated recharge of ₹499 (5gb + 400min)");
                  break;
            case 5:
                internet += 5;
                talkTime += 700;
                System.out.println("Activated recharge of ₹599 (5gb + 700min)");
                break;
             default:
                 System.out.println("Invalid choice");
        }
        showRecharge();
    }
        public void showRecharge(){
            System.out.println("internet : " + internet + "gb, talk time : " + talkTime + "min activated");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneRecharge r1  = new PhoneRecharge();
        System.out.println("Choose Recharge : ");
        System.out.println("1. ₹199 (1gb + 100min)");
        System.out.println("2. ₹299 (2gb + 200min)");
        System.out.println("3. ₹399 (3gb + 300min)");
        System.out.println("4. ₹499 (5gb + 400min)");
        System.out.println("5. ₹599 (5gb + 700min)");
        int choice =  sc.nextInt();
        r1.recharge(choice);
        r1.showRecharge();
    }
}