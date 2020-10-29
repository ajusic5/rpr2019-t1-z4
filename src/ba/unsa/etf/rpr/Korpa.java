package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli=new Artikl[50];
    private int brojProizvoda=0;

    public boolean dodajArtikl(Artikl a){

        if(brojProizvoda<50) {
            artikli[brojProizvoda] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojProizvoda=brojProizvoda+1;
            return true;

        }
        return false;

    }
    public Artikl izbaciArtiklSaKodom(String kod){

        for(int i=0; i<brojProizvoda; i++){
            if(artikli[i].getKod().equals(kod)){

                Artikl a=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());

                for(int j=i; j<brojProizvoda; j++){
                    artikli[j]=artikli[j+1];

                }
                brojProizvoda=brojProizvoda-1;
                return a;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
    public int dajUkupnuCijenuArtikala(){

        int s=0;
        for(Artikl a:artikli) {
            if(a==null) break;
            s=s+a.getCijena();
        }

        return s;
    }
}
