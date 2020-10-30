package tr.com.metinemrekoral.mini_kutuphane_app.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String isim;
    private String soyisim;
    private String kullaniciAdi;
    private String email;
    private String passwd;

    public User(){
        super();
    }


    public User(String isim, String soyisim, String kullaniciAdi, String email, String passwd) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.kullaniciAdi = kullaniciAdi;
        this.email = email;
        this.passwd = passwd;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return this.soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKullaniciAdi() {
        return this.kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User isim(String isim) {
        this.isim = isim;
        return this;
    }

    public User soyisim(String soyisim) {
        this.soyisim = soyisim;
        return this;
    }

    public User kullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(isim, user.isim) && Objects.equals(soyisim, user.soyisim) && Objects.equals(kullaniciAdi, user.kullaniciAdi) && Objects.equals(email, user.email) && Objects.equals(passwd, user.passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim, soyisim, kullaniciAdi, email, passwd);
    }

    @Override
    public String toString() {
        return "{" +
            " isim='" + getIsim() + "'" +
            ", soyisim='" + getSoyisim() + "'" +
            ", kullaniciAdi='" + getKullaniciAdi() + "'" +
            ", email='" + getEmail() + "'" +
            ", passwd='" + getPasswd() + "'" +
            "}";
    }
    

}

    