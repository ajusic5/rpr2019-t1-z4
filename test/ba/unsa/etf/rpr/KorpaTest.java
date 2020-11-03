package ba.unsa.etf.rpr;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    void testiranjeDodavanjaUPunuKorpu(){

        for(int i=0; i<50; i++)
            k.dodajArtikl(a);

        boolean neMozeseDodati=k.dodajArtikl(a);
        assertFalse(neMozeseDodati);
    }
    @Test
    void testiranjeIzbacivanjaArtikla(){

        k.dodajArtikl(a);
        Artikl izbačeniArtikl=k.izbaciArtiklSaKodom("12345");
        assertAll("Izbacivanje", ()->assertEquals(a.getKod(),izbačeniArtikl.getKod()));

    }
    @Test
    void testiranjeUkupneCijenePrazneKorpe(){

        k.izbaciArtiklSaKodom("12345");
        assertEquals(0, k.dajUkupnuCijenuArtikala());
    }





}