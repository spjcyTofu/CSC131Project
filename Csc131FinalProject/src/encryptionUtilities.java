public class encryptionUtilities {
    
    static String encrypt(int rotValue, String input){
        return rotateBy(rotValue, input);
    }
    
    static String decrypt(int rotValue, String input){
        return rotateBy(26 - rotValue, input);
    }

    static String rotateBy(int rotValue, String input ){
        String output = "";

        for (int loop = 0; loop < input.length(); loop++){
            char c = input.charAt(loop);
            int asciiValue = (int) c;

            if(asciiValue >= 65 && asciiValue <= 90){           //Uppercase letters
                
                int temp = asciiValue - 65;                     // A-Z becomes 0-25
                temp = temp + rotValue;                         // Rotates 
                temp = temp % 26;                               // Accounts for overflow
                asciiValue = temp + 65;                         // Alligns with correct ASCII values   

            }else if(asciiValue >= 97 && asciiValue <= 122){    //Lowercase letters
                int temp = asciiValue - 97;                     // a-z becomes 0-25
                temp = temp + rotValue;                         // Rotates 
                temp = temp % 26;                               // Accounts for overflow
                asciiValue = temp + 97;                         // Alligns with correct ASCII values                   
            }

            c = (char) asciiValue;
            output = output + c;
        }
        
        return output;
    }
}
