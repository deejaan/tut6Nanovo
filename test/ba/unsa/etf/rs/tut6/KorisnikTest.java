package ba.unsa.etf.rs.tut6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class KorisnikTest {
    @Test
    void setIme() {
        Korisnik k = new Korisnik();
        k.setIme("Dejan");
        assertEquals("Dejan", k.getIme());
    }



    @Test
    void setPrezime() {
        Korisnik k = new Korisnik();
        k.setPrezime("Popovic");
        assertEquals("Popovic", k.getPrezime());
    }
}