/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 *
 */
public class PatternValided {

    public static Boolean PatternPassword(String pass) {
        Pattern patternPassword = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z#$^+=!*()@%&])(?=.*\\d).{8,20}$");
        return patternPassword.matcher(pass).matches();
    }

    public static Boolean PatternID(String id) {
        Pattern patternID = Pattern.compile("^(?=.{5,90}$)[a-zA-Z][a-zA-Z0-9_-]+$");
        return patternID.matcher(id).matches();
    }

    public static Boolean PatternEmail(String email) {
        Pattern patternEmail = Pattern.compile("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$");
        return patternEmail.matcher(email).matches();
    }

    public static Boolean PatternName(String name) {
        Pattern patternName = Pattern.compile("^[\\pL\\s]+[\\pL\\pZ]{0,25}$");
        return patternName.matcher(name).matches();
    }

    public static Boolean PatternAnswer(String answer) {
        Pattern patternAnswer = Pattern.compile("^.{4,20}$");
        return patternAnswer.matcher(answer).matches();
    }

    public static Boolean PatternPhoneNumber(String phone) {
        Pattern phoneNumber = Pattern.compile("^([0-9][0-9]{1,19}$)|\\+84[0-9]{1,17}$");
        return phoneNumber.matcher(phone).matches();
    }

    public static Boolean PatternCMND(String cmnd) {
        Pattern CMND = Pattern.compile("^(?=.{4,20}$)[a-zA-Z\\d][a-zA-Z0-9_]+$");
        return CMND.matcher(cmnd).matches();
    }

    public static Boolean PatternELevel(String elevel) {
        Pattern eLevel = Pattern.compile("[\\d]{0,2}");
        return eLevel.matcher(elevel).matches();
    }

    public static Boolean PatternPrice(String value) {
        Pattern Salary = Pattern.compile("^[\\d][\\d]*\\.?[\\d]*$");
        return Salary.matcher(value).matches();
    }

    public static Boolean PatternNumberGuest(String value) {
        Pattern Number = Pattern.compile("[1-8]");
        return Number.matcher(value).matches();
    }

    public static Boolean PatternServiceInventory(String value) {
        Pattern Number = Pattern.compile("^[1-9][\\d]{0,8}$");
        return Number.matcher(value).matches();
    }

    public static Boolean PatternRoomArea(String value) {
        Pattern Number = Pattern.compile("^[\\d][\\d]{0,4}\\.?[\\d]{0,3}$");
        return Number.matcher(value).matches();
    }
    
    public static Boolean PatternRoomDiscount(String value){
        Pattern Number = Pattern.compile("^[0]\\.[\\d]{1,3}$");
        return Number.matcher(value).matches();
    }
    

    
}
