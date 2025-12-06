    import java.util.Scanner;

    public class time_conversion {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            /*String normalFormat = sc.next();

            String stringCut = normalFormat.substring(0,normalFormat.length()-2);
            //System.out.println(stringCut);

            //System.out.println(normalFormat);

            String dayOrNight = normalFormat.substring(normalFormat.length()-2);

            String firstTwoDigit = normalFormat.substring(0,2);
            //System.out.println(firstTwoDigit);
            int firstTwoDigitInteger = Integer.parseInt(firstTwoDigit);
            //System.out.println(firstTwoDigitInteger);

            int militaryValueForPM = firstTwoDigitInteger + 12;
            int militaryValueForAM = firstTwoDigitInteger - 12;

            String StringValueMilitaryPM = String.valueOf(militaryValueForPM);
            String StringValueMilitaryAM = String.valueOf(militaryValueForAM);

            if (dayOrNight.equals("PM")){
                String newMilitaryFormat = stringCut.replace(firstTwoDigit,StringValueMilitaryPM);
                System.out.println(newMilitaryFormat);
            } else if (dayOrNight.equals("AM")) {
                String newMilitaryFormat = stringCut.replace(firstTwoDigit,StringValueMilitaryAM);
                System.out.println(newMilitaryFormat);
            }
*/
            //System.out.println();

            //System.out.println(dayOrNight);


            String time = sc.next();
            String dayOrNight = time.substring(8);
            int hour = Integer.parseInt(time.substring(0,2));
            String rest = time.substring(2,8);

            if (dayOrNight.equals("AM")){
                if (hour == 12){
                    hour = 0;
                }
            }else {
                if (hour != 12){
                    hour += 12;
                }
            }
            System.out.printf("%02d%s",hour, rest);
        }
    }
