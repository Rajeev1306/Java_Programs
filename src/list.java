import java.text.SimpleDateFormat;
import java.util.*;

public class list {

    public static void main(String args[]){
        //Date d = new Date();


        SimpleDateFormat sc = new SimpleDateFormat("dd/M/yyyy");
        //String date = sc.format(d);
        //System.out.println(date);


        //System.out.println(Calendar.DAY_OF_WEEK);

        Date d = new Date();
        SimpleDateFormat sd1 = new SimpleDateFormat("d");
        SimpleDateFormat sd2 = new SimpleDateFormat("MM");
        SimpleDateFormat sd3 = new SimpleDateFormat("yy");
        String date = sd1.format(d);
        String month = sd2.format(d);
        String year = sd3.format(d);
        int next = Integer.parseInt(date) + 5;
        String nextdate = String.valueOf(next);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +7);
        //System.out.println(sd1.format(cal.getTime()));

        System.out.println(date);
        //System.out.println(nextdate);
    }

    public static String[] todaysDate(){
        Date d = new Date();
        SimpleDateFormat sd1 = new SimpleDateFormat("dd");
        SimpleDateFormat sd2 = new SimpleDateFormat("MM");
        SimpleDateFormat sd3 = new SimpleDateFormat("yy");
        String date = sd1.format(d);
        String month = sd2.format(d);
        String year = sd3.format(d);
        String[] arr= {date,month,year};
        return arr;
    }
}
