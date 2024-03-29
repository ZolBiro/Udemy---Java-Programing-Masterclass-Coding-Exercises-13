public class NumberOfDaysInMonth {


    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999 || year % 4 != 0) {
            return false;
        } else if((year % 100 == 0 && year % 400 == 0) || year % 100 != 0) {
            return true;
        } return false;
    }

    public static int getDaysInMonth (int month, int year){

        if ((month <1 || month >12) || (year <1 || year >9999)) {
            return -1;
        }

        int daysInMonth;

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                System.out.println(daysInMonth);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                System.out.println(daysInMonth);
                break;

            case 2:
                if (isLeapYear (year)) {
                    daysInMonth = 29;
                    System.out.println(daysInMonth);
                } else {
                    daysInMonth = 28;
                    System.out.println(daysInMonth);
                }
                break;


            default:
                return -1;


        }
    return daysInMonth;
    }

}
