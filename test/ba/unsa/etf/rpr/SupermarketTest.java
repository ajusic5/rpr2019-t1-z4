package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;

class SupermarketTest {

    Artikl a[];

    @BeforeEach
    void postavi(){

        for(int i=0; i<50; i++)
            a[i]=new Artikl("naušnice", 12, "2905");

    }


}