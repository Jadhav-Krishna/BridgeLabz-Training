import java.util.*;
// program to generate 6 digit (OTP)
class OTPGenerator{
    public static void main(String[] args){
        Set<Integer> otpSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int otp = generateOTP();
            otpSet.add(otp);
            System.out.println("Generated OTP: " + otp);
        }
        if (otpSet.size() == 10) {
            System.out.println("unique.");
        } else {
            System.out.println("not unique.");
        }
    }
    // generate a 6 digit OTP number
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
}