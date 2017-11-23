package com.nisum.economycart.app.util;
import java.util.*;
import javax.mail.*;  
import javax.mail.internet.*;


/**
 * 
 * @author vpurini
 *
 */
public class MailSender {

	public static String messageBody(String userName){

		StringBuilder sb = new StringBuilder();

		sb.append("<html><head></head><title></title>");
		sb.append("<body style='font-size:12px;font-family:Trebuchet MS;'>");
		sb.append("<i>Hi"+"  "+userName+","+"</i>");
		sb.append("<br><br>");
		sb.append("<i> Now Price is available at lowest Price</i>");
		sb.append("<br><br>");
		sb.append("<i>This is an auto generated e-mail. Thanking you.</i>");
		sb.append("<br><br>");
		sb.append("<i>Regards,</i>");
		sb.append("<br><br>");
		sb.append("<font color=red><i>Nisum Portal Application.</i></font>");
		
		return sb.toString();

	}


		public static String removeLastChar(String str) {
		return str.substring(0,str.length()-1);
	}
	
	

}  

