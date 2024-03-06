import com.cem.EkranaYaz;
import org.junit.jupiter.api.Test;


public class EkranaYazTest {
    private EkranaYaz ekranaYaz;


    @Test
    public void printScreenFullTest(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen("test");
    }
    @Test
    void printScreenFullTestXXXLarge(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen("merhaba nasilsin nerelerdesin gorusemkiyoruz.");
    }

    @Test
    public void printScreenNullTest(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen(null);
    }

}
