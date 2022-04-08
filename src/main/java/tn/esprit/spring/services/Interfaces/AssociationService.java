package tn.esprit.spring.services.Interfaces;

import java.util.List;

import tn.esprit.spring.DAO.entities.Association;
import tn.esprit.spring.DAO.entities.Account;


public interface AssociationService {

	List<Association> retriveAllAssociation();
	Association addAssociation(Association c);
	void deleteAssociation(Long id);
	Association uploadAssociation(Association c);
	Association retrieveAssociationBYID(Long id);
    //void deleteSAssociationByPLandNM(int p,int nb);
	List<Association> retrieveAssociationByP(int p);
	List<Association> retrieveAssociationByTime();
	void ajouterParticipant(Long associationId, Long participantId);
	List<Long> afficherParticipants(Long AssociationId);
	List<Association> retriveAssociationByScore(Long idU);
}
