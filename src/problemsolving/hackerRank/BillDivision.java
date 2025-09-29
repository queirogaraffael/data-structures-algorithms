package problemsSolving.hackerRank;

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int total = 0;

        for(int i = 0; i < bill.size(); i++){
            if( i != k){
                total += bill.get(i);
            }
        }

        int valorJusto = total/2;


        if(b > valorJusto){
            System.out.println(b-valorJusto);
        }else{
            System.out.println("Bon Appetit");
        }


    }
}
