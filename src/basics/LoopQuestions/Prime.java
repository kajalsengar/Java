package basics.LoopQuestions;

public class Prime {
    public static void main(String[] args) {
        int n=50;
        int flag=0;
        int j;

        for (int i=2; i<=n ;i++){
            for ( j=2 ; j<i; j++){
                if (i%j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(j);
                j++;
            }
        }
    }
}
