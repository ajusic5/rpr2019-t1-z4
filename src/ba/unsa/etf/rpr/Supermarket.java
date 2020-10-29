package ba.unsa.etf.rpr;


public class Supermarket {


    private Artikl[] artikli=new Artikl[1000];
    private int brojArtikalaUSupermarketu=0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a){

        if(brojArtikalaUSupermarketu<1000){
            artikli[brojArtikalaUSupermarketu]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojArtikalaUSupermarketu=brojArtikalaUSupermarketu+1;
            return true;
        }
        return false;
    }

    Artikl izbaciArtiklSaKodom(String kod){

        for(int i=0; i<brojArtikalaUSupermarketu; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl a=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());

                for(int j=i; j<brojArtikalaUSupermarketu; j++){
                    artikli[j]=artikli[j+1];
                }
                brojArtikalaUSupermarketu=brojArtikalaUSupermarketu-1;
                return a;
            }

        }

        return null;
    }
}
