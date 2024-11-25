package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancers successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class PartieMonoJoueur {

	/**
	 * Constructeur
	 */
	private ArrayList<Tour> tours;
	
	public PartieMonoJoueur() {
		tours = new ArrayList<>();
	}

	/**
	 * Cette méthode doit être appelée à chaque lancer de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de ce lancer
	 * @throws IllegalStateException si la partie est terminée
	 * @return vrai si le joueur doit lancer à nouveau pour continuer son tour, faux sinon	
	 */
	public boolean enregistreLancer(int nombreDeQuillesAbattues) {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * Cette méthode donne le score du joueur.
	 * Si la partie n'est pas terminée, on considère que les lancers restants
	 * abattent 0 quille.
	 * @return Le score du joueur
	 */
	public int score() {
		//
		int scoreTotal = 0;
		for (int i = 0; i < tours.size(); i++) {
			Tour tour = tours.get(i);
			scoreTotal += tour.score();
		}
		return scoreTotal;
		
		
	}

	/**
	 * @return vrai si la partie est terminée pour ce joueur, faux sinon
	 */
	public boolean estTerminee() {
		
		if(){
			return true;
		}
		return false ;
		
	}


	/**
	 * @return Le numéro du tour courant [1..10], ou 0 si le jeu est fini
	 */
	public int numeroTourCourant() {

		if(estTerminee()){
			return 0 ;
		}
		return tours.size();
		
	}

	/**
	 * @return Le numéro du prochain lancer pour tour courant [1..3], ou 0 si le jeu
	 *         est fini
	 */
	public int numeroProchainLancer() {
		if(estTerminee()){
			return 0 ;
		}
		return tours.get(numeroTourCourant()-1);
		
	}

}
