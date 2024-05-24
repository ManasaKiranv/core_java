package com.Day1;

import org.apache.commons.lang3.StringUtils;

// hide all digits of account number except last 4 digits
public final class MaskAcc {
    
    public MaskAcc(){
        System.out.println("constructor excuted");
    }
    public String maskAvv(String Accno){
        if(StringUtils.isNotEmpty(Accno) && (Accno.length()>4))
            return "********" + Accno.substring(Accno.length()-4);
        return "not valid Accunt number";
    }
    public static void main(String[] args) {
        
    MaskAcc ma = new MaskAcc();
    String maskedAccno = ma.maskAvv("12353437272783278");
    System.out.println(maskedAccno);
    System.out.println("successfully masked your account number");
    }

}
