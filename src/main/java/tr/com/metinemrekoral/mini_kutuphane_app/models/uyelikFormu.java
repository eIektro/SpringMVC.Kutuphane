package tr.com.metinemrekoral.mini_kutuphane_app.models;

import java.util.Objects;

public class uyelikFormu {
    private String Isim;
    private String Soyisim;
    private String KullaniciAdi;
    private String ePosta;
    private String Passwd;

    public uyelikFormu(){
        super();
    }


    public uyelikFormu(String Isim, String Soyisim, String KullaniciAdi, String ePosta, String Passwd) {
        this.Isim = Isim;
        this.Soyisim = Soyisim;
        this.KullaniciAdi = KullaniciAdi;
        this.ePosta = ePosta;
        this.Passwd = Passwd;
    }

    public String getIsim() {
        return this.Isim;
    }

    public void setIsim(String Isim) {
        this.Isim = Isim;
    }

    public String getSoyisim() {
        return this.Soyisim;
    }

    public void setSoyisim(String Soyisim) {
        this.Soyisim = Soyisim;
    }

    public String getKullaniciAdi() {
        return this.KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getEPosta() {
        return this.ePosta;
    }

    public void setEPosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getPasswd() {
        return this.Passwd;
    }

    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    public uyelikFormu Isim(String Isim) {
        this.Isim = Isim;
        return this;
    }

    public uyelikFormu Soyisim(String Soyisim) {
        this.Soyisim = Soyisim;
        return this;
    }

    public uyelikFormu KullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
        return this;
    }

    public uyelikFormu ePosta(String ePosta) {
        this.ePosta = ePosta;
        return this;
    }

    public uyelikFormu Passwd(String Passwd) {
        this.Passwd = Passwd;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof uyelikFormu)) {
            return false;
        }
        uyelikFormu uyelikFormu = (uyelikFormu) o;
        return Objects.equals(Isim, uyelikFormu.Isim) && Objects.equals(Soyisim, uyelikFormu.Soyisim) && Objects.equals(KullaniciAdi, uyelikFormu.KullaniciAdi) && Objects.equals(ePosta, uyelikFormu.ePosta) && Objects.equals(Passwd, uyelikFormu.Passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Isim, Soyisim, KullaniciAdi, ePosta, Passwd);
    }

    @Override
    public String toString() {
        return "{" +
            " Isim='" + getIsim() + "'" +
            ", Soyisim='" + getSoyisim() + "'" +
            ", KullaniciAdi='" + getKullaniciAdi() + "'" +
            ", ePosta='" + getEPosta() + "'" +
            ", Passwd='" + getPasswd() + "'" +
            "}";
    }

}