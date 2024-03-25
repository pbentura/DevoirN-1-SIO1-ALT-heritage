package sio.devoirsio1alt.Model.Exo1;

public class Specialite
{
    private int idSpecialite;
    private String nomSpecialite;
    private double tarif;

    public Specialite(int idSpecialite, String nomSpecialite, double tarif) {
        this.idSpecialite = idSpecialite;
        this.nomSpecialite = nomSpecialite;
        this.tarif = tarif;
    }

    public String getNomSpecialite() {
        return nomSpecialite;
    }

    public double getTarif() {
        return tarif;
    }
}
