import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testClasses {

@Test
public void checkCorrectEncryptionOutput() {
    String inputString, outputString;
    int rotValue;

    rotValue = 6;
    inputString = "Hello!";
    outputString = "Nkrru!";

    assertEquals("checkCorrectEncryptionOutput()", encryptionUtilities.encrypt(rotValue, inputString), outputString );

}

@Test
public void checkCorrectDecryptionOutput() {
    String inputString, outputString;
    int rotValue;

    rotValue = 6;
    outputString = "Hello!";
    inputString = "Nkrru!";

    assertEquals("checkCorrectEncryptionOutput()", encryptionUtilities.decrypt(rotValue, inputString), outputString );

}



}