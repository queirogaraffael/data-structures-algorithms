package problems_solving.hackerRank;

public class TimeConversion {
    public static String timeConversion(String s) {
        String hora = s.substring(0,2);
        String minutos = s.substring(3,5);
        String segundos = s.substring(6,8);
        String format = s.substring(8,10);

        if(format.equals("AM")){
            if(hora.equals("12")){
                hora = "00";
            }

        }else{
            if(!hora.equals("12")){
                hora = String.valueOf(Integer.parseInt(hora) + 12);
            }

        }

        return hora + ":" + minutos + ":" + segundos;


    }
}
