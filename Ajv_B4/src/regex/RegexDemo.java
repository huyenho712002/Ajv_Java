/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

/**
 *
 * @author ADMIN
 */
public class RegexDemo {
    public static void matchUsingString(String regex, String str){
        boolean result = str.matches(regex);
        System.out.println(str +"has matching with "+  regex + " is "+ result);
    }
    public static void main(String[] args) {
        String regex ="^([a-zA-Z0-9\\-\\_\\.]+)(@gmail.com)$";
        String strinput = "sabs12@gmail.com";
        matchUsingString("^([a-zA-Z0-9\\-\\_\\.]+)(@yahoo.com)(.vn)?$", "hohuyen@yahoo.com.vn");
        
    }
}
