package sio.devoirsio1alt.Model.Exo1;

public class Developpeur implements ISalaire, Comparable<Developpeur>
{
    protected int idDeveloppeur;
    protected String nomDeveloppeur;

    public Developpeur(int idDeveloppeur, String nomDeveloppeur) {
        this.idDeveloppeur = idDeveloppeur;
        this.nomDeveloppeur = nomDeveloppeur;
    }
    public String getInfos() {
        return nomDeveloppeur + " - ";
    }

    public int getIdDeveloppeur() {
        return idDeveloppeur;
    }

    public String getNomDeveloppeur() {
        return nomDeveloppeur;
    }

    @Override
    public int compareTo(Developpeur o) {
        // Tous les objets sont triés de façon décroissante sur le salaire.
        return Double.compare(o.calculerSalaire(), this.calculerSalaire());
    }

    @Override
    public double calculerSalaire() {
        return 1500;
    }
}
