package staff.impl;
import java.util.ArrayList;
import java.util.List;

class EqualsChecking {
    
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        
        if (equals(array1, array2)) {
            System.out.println("1)CORRECT:\tarray1 and array2 contain the same elements!");
        } else {
            System.out.println("1)INCORRECT:\tarray1 and array2 contain the same elements!");
        }
        
        
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1); list1.add(2); list1.add(3); // Adding 1, 2, and 3 into list1
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1); list2.add(2); list2.add(3); // Adding 1, 2, and 3 into list2

        if (equals(list1, list2)) {
            System.out.println("2)CORRECT:\tlist1 and list2 contain the same elements!");
        } else {
            System.out.println("2)INCORRECT:\tlist1 and list2 contain the same elements!");
        }
        
        
        String string1 = new String("This is a string!");
        String string2 = new String("This is a string!");

        if (equals(string1, string2)) {
            System.out.println("2)CORRECT:\tstring1 and string2 contain the same values!");
        } else {
            System.out.println("2)INCORRECT:\tstring1 and string2 contain the same values!");
        }
        
        
        String stringNull1 = null;
        String stringNull2 = null;

        if (equals(stringNull1, stringNull2)) {
            System.out.println("4)CORRECT:\tstringNull1 and stringNull2 contain the same values!");
        } else {
            System.out.println("4)INCORRECT:\tstringNull1 and stringNull2 contain the same values!");
        }
    }
    
    /**
     * Indicates if both int arrays are equal in value.
     * 
     * @param intArray1 
     *                  An Array of int's to check against
     * @param intArray2 
     *                  An Array of int's to check with
     * @return boolean indicating whether the arrays contain the same values (equal in value) 
     */
    static boolean equals(int[] intArray1, int[] intArray2) {
        if (intArray1 == intArray2) {
            // Same reference...
            return true;
        } else if (intArray1 == null || intArray2 == null) {
            // If one is null and they have not been checked as same reference...
            return false;
        } else if (intArray1.length != intArray2.length) {
             // Different lengths...
            return false;
        } else {
            // Do a manual check...
            // (or let them use java.util.Arrays functions?)
            for (int i = 0; i < intArray1.length; i++) {
                if (intArray1[i] != intArray2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Indicates if both Lists of Integers are equal in value.
     * 
     * @param list1 
     *                  A List of Integers to check against
     * @param list2 
     *                  A List of Integers to check with
     * @return boolean indicating whether the Lists contain the same values (equal in value) 
     */
    static boolean equals(List<Integer> list1, List<Integer> list2) {
        // They can do the same stuff from above or just use List.equals()?
        if (list1 == list2) {
            return true;
        } else if (list1 == null || list2 == null) {
            return false;
        } else {
            return list1.equals(list2);
        }
    }
    

    /**
     * Indicates if both Strings are equal in value.
     * 
     * @param str1
     *                  A String to check against
     * @param str2 
     *                  A String to check with
     * @return boolean indicating whether the String contain the same values (equal in value) 
     */
    static boolean equals(String str1, String str2) {
        // Same as List function, don't forget to check null
        if (str1 == str2) {
            return true;
        } else if (str1 == null || str2 == null) {
            return false;
        } else {
            return str1.equals(str2);
        }
    }
}
