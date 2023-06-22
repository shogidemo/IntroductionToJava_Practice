import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    // @Test public void 名前の長さが3文字未満だったらエラーとなること(){
    //     try {
    //         Bank b = new Bank("ミナ",0);
    //     } catch (Exception e) {
    //      assertEquals(new IllegalArgumentException,e);
    //     }
    // }
    
    @Test public void 名前が3文字だったらOKになるはず(){
        Bank b = new Bank();
        
        b.setName("ミナト");
        
        assertEquals("ミナト", b.getName());
    }
    
    @Test public void 名前が2文字だったらエラーになるはず(){
        Bank b = new Bank();
        
        assertThrows(IllegalArgumentException.class,()->{b.setName("ミナ");});
    
    }
}
