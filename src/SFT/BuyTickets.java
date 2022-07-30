package SFT;

public class BuyTickets {
    public static void main(String[] args) {
        int[] a= new int[]{2,3,2};
        System.out.println(timeRequiredToBuy(a,2));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int result=0;
        while(true){
        for (int i = 0; i <n ; i++) {
            if(i==k&&tickets[i]==1){
                tickets[i]-=1;
                result++;
                break;
            }
            else if (tickets[i]!=0){
                tickets[i]-=1;
                result++;
            }
        }
        if(tickets[k]==0){
            break;
        }
        }
        return result;
    }

}
