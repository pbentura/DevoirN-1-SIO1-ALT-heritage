package sio.devoirsio1alt.Model.Exo1;

public class DeveloppeurJunior extends Developpeur
{
    private double tarifHoraire;
    private int nbHeures;

    public DeveloppeurJunior(int idDeveloppeur, String nomDeveloppeur, double tarifHoraire, int nbHeures) {
        super(idDeveloppeur, nomDeveloppeur);
        this.tarifHoraire = tarifHoraire;
        this.nbHeures = nbHeures;
    }

    public double getTarifHoraire() {
        return tarifHoraire;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    @Override
    public String getInfos() {
        return super.getInfos() + tarifHoraire + " - " + nbHeures;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire()+(nbHeures*tarifHoraire);
    }
}
