//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
       int num = JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
        JOptionPane.YES_NO_OPTION);
     if (num == 0) {
    	 int nu = JOptionPane.showConfirmDialog(null, "is it vacation?", "",
    		        JOptionPane.YES_NO_OPTION);
    	 if (nu == 1) {
			 JOptionPane.showMessageDialog(null, "get up lazybones!");
		}
    	
	}
     else {
    	JOptionPane.showMessageDialog(null, "sleep in");
	}
   
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
