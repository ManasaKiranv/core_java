package com.Day1;
// hide all digits of account number except last 4 digits
public final class MaskAcc {
    
    public MaskAcc(){
        System.out.println("constructor excuted");
    }
    public String maskAvv(String Accno){
        return "********" + Accno.substring(Accno.length()-4);
    }
    public static void main(String[] args) {
        
    MaskAcc ma = new MaskAcc();
    String maskedAccno = ma.maskAvv("123456789987");
    System.out.println(maskedAccno);
    System.out.println("successfully masked your account number");
    }

}
