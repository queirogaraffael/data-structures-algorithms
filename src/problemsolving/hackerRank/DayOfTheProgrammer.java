package problemsSolving.hackerRank;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        String anoComum = "13.09.";
        String bissexto = "12.09.";

        if(year <= 1917){
            if(year%4 == 0){
                return bissexto + year;
            }else{
                return anoComum + year;
            }
        } else if (year == 1918){
            return "26.09." + year;
        }else{

            if((year%4 == 0 || year % 400 == 0) && year%100 != 0){
                return bissexto + year;
            }else{
                return anoComum + year;
            }
        }

    }
}
