package sio.devoirsio1alt.Model.Exo1;

import java.util.ArrayList;

public class DeveloppeurSenior extends Developpeur
{
    private ArrayList<Mission> lesMissions;
    private Specialite laSpecialite;

    public DeveloppeurSenior(int idDeveloppeur, String nomDeveloppeur, Specialite laSpecialite) {
        super(idDeveloppeur, nomDeveloppeur);
        this.laSpecialite = laSpecialite;
        this.lesMissions = new ArrayList<>();
    }

    @Override
    public String getInfos() {
        return super.getInfos() +lesMissions.size() + " - " + laSpecialite.getNomSpecialite();
    }

    @Override
    public double calculerSalaire() {
        double salaire = 0;
        for (Mission mission : lesMissions) {
            salaire += super.calculerSalaire()+ mission.getDuree()*laSpecialite.getTarif();
        }
        return salaire;
    }
    public void ajouterMission(Mission mission){
        lesMissions.add(mission);
    }
}
