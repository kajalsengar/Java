package PrecticeQuestions;

public class BallArrange {
    static int count =0;

    static void arrangeball(int G, int Y, int R , char prev, String result ){
        if (G==0 && Y==0 && R==0){
            count++;
            System.out.println(result);
            return;
        }

        if(G>0 && prev!='G'){
            arrangeball(G-1, Y, R ,'G',result+"G");
        }

        if (Y>0 && prev !='Y'){
            arrangeball(G,Y-1, R ,'Y' , result+"Y");
        }

        if(R>0 && prev !='R'){
            arrangeball(G, Y, R-1, 'R', result+"R" );
        }
    }
    public static void main(String[] args) {
        int G=1;
        int Y=1;
        int R=1;

        arrangeball(G, Y, R, ' ', " ");

        System.out.println("Total Arrangement " + count);
    }
}
