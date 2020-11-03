package ba.unsa.etf.rpr;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KorpaTest {

    private Korpa k;
    private Artikl a;

    @BeforeEach
    void postavi(){
        k=new Korpa();
        a=new Artikl("mašna", 10, "12345");

    }
    @Test
    void testiranjeDodavanjaUKorpu(){

        boolean mozeSeDodati=k.dodajArtikl(a);
        assertTrue(mozeSeDodati);

    }



}