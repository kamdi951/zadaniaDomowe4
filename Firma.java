package zadaniaDomowe4;

import java.util.List;

public class Firma {

    private String nazwa;
    private String szef;
    private List<Pracownik> pracownikList;

    public Firma(String nazwa, String szef, List<Pracownik> pracownikList) {
        this.nazwa = nazwa;
        this.szef = szef;
        this.pracownikList = pracownikList;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSzef() {
        return szef;
    }

    public void setSzef(String szef) {
        this.szef = szef;
    }

    public List<Pracownik> getPracownikList() {
        return pracownikList;
    }

    public void setPracownikList(List<Pracownik> pracownikList) {
        this.pracownikList = pracownikList;
    }
}
