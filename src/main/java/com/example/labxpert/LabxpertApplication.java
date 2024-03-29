package com.example.labxpert;

import com.example.labxpert.Model.*;
import com.example.labxpert.Model.Enum.*;
import com.example.labxpert.Repository.IPersonRepository;
import com.example.labxpert.Service.*;
import lombok.AllArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@AllArgsConstructor
public class LabxpertApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LabxpertApplication.class, args);
	}

	private IUserService iUserService;
	private IPatientService iPatientService;
	private IFournisseurService iFournisseurService;
	private IReactifService iReactifService;
	private IEchontillonService iEchontillonService;
	private IAnalyseService iAnalyseService;
	private IPlanificationService iPlanificationService;
	private ISousAnalyseService iSousAnalyseService;
	private IResultService iResultService;

	@Override
	public void run(String... args) throws Exception {

		/**
		 * 		fournisseur crud
 		 */


		/*Fournisseur fournisseur = new Fournisseur();
		fournisseur.setNameComplet("marouane mouslih");
		fournisseur.setSocieteName("atlas");
		iFournisseurService.add(fournisseur);

		Fournisseur fournisseur1 = iFournisseurService.getById(3L);

		System.out.println(fournisseur.getNameComplet() + "," + fournisseur.getSocieteName());

		fournisseur1.setSocieteName("TIMAR");
		iFournisseurService.update(fournisseur1);*/

		/**
		 * Reactif crud
		 */

		/*Reactif reactif = new Reactif();
		Fournisseur fournisseur = iFournisseurService.getById(3L);
		reactif.setNom("nom reactif 3");
		reactif.setDescription("description 3");
		reactif.setFournisseur(fournisseur);
		reactif.setQuantity_stock(18);
		reactif.setDate_exp(LocalDate.now());
		iReactifService.add(reactif);

		iFournisseurService.delete(2L);*/

		/**
		 * Patient crud
		 */

		/*Patient patient = new Patient();
		patient.setNom("marouane");
		patient.setPrenom("mouslih");
		patient.setTel("0630011276");
		patient.setVille("casablanca");
		patient.setAddress("address 1");
		patient.setSexe(Sexe.MALE);
		patient.setDate_naissance(LocalDate.now());
		patient.setAge(22);
		iPatientService.add(patient);

		Patient patient = iPatientService.getById(1L);
		patient.setAddress("address 111");
		iPatientService.update(patient);

		iPatientService.delete(2L);

		List<Patient> patients = iPatientService.getAll();

		for (Patient p : patients)
		{
			System.out.println("name : " + p.getNom());
			System.out.println("age: " + p.getAge());
		}*/

		/**
		 * User crud
		 */

		/*User user = new User();
		user.setNom("abdo");
		user.setPrenom("ayoub");
		user.setTel("0630011276");
		user.setVille("casablanca");
		user.setAddress("address 1");
		user.setSexe(Sexe.MALE);
		user.setDate_naissance(LocalDate.now());
		user.setRole(Role.Responsable);
		user.setEmail("maromouslih@gmail.com");
		user.setPassword("111111");
		iUserService.add(user);

		User user = iUserService.getById(4L);
		user.setNom("oussama");
		//System.out.println(user);
		iUserService.update(user);

		iUserService.delete(5L);*/


		/**
		 * Reactif crud
		 */

		/*Reactif reactif = new Reactif();
		reactif.setNom("reactif 1");
		reactif.setDescription("description 1");
		reactif.setDate_exp(LocalDate.now());
		reactif.setQuantity_stock(23);
		reactif.setFournisseur(fournisseur);
		iReactifService.add(reactif);

		Reactif reactif = iReactifService.getById(4L);
		reactif.setNom("name reactif 4");
		iReactifService.update(reactif);

		iReactifService.delete(2L);*/

		/**
		 * Echontillon crud
		 */

		/*Patient patient = iPatientService.getById(1L);
		Echontillon echontillon = new Echontillon();
		echontillon.setPatient(patient);
		echontillon.setStatusEchontillon(StatusEchontillon.en_attend);
		echontillon.setDate_p(LocalDate.of(2022,2,12));
		iEchontillonService.add(echontillon);

		Echontillon echontillon = iEchontillonService.getById(2L);
		echontillon.setStatusEchontillon(StatusEchontillon.en_cours);
		iEchontillonService.update(echontillon);

		iEchontillonService.delete(2L);*/

		/**
		 * Analyse crud
		 */

		/*Echontillon echontillon = iEchontillonService.getById(1L);
		User user = iUserService.getById(4L);
		Analyse analyse = new Analyse();
		analyse.setCommantaires("commentaire 2");
		analyse.setEchontillon(echontillon);
		analyse.setStatusResult(StatusResult.normal);
		analyse.setDate_fin(LocalDate.of(2022,1,12));
		analyse.setTechnicienResponsable(user);
		analyse.setDate_debut(LocalDate.of(2021,8,16));
		analyse.setTypeAnalyse(TypeAnalyse.Hormonologie);
		iAnalyseService.add(analyse);
		Analyse analyse = iAnalyseService.getById(1L);
		analyse.setCommantaires("commantaire 11");
		iAnalyseService.update(analyse);

		iAnalyseService.delete(2L);*/

		/**
		 * Planification crud
		 */

	/*	Analyse analyse = iAnalyseService.getById(1L);
		User user = iUserService.getById(4L);
		Planification planification = new Planification();
		planification.setAnalyse(analyse);
		planification.setTechnicien(user);
		planification.setDate_debut(LocalDate.of(2022,1,22));
		planification.setDate_fin(LocalDate.now());
		iPlanificationService.add(planification);

		Planification planification = iPlanificationService.getById(1L);
		planification.setDate_debut(LocalDate.of(2022,1,22));
		iPlanificationService.update(planification);

		iPlanificationService.delete(2L);*/

		/**
		 * Sous analyse crud
		 */

		/*SousAnalyse sousAnalyse = new SousAnalyse();
		Analyse analyse = iAnalyseService.getById(1L);
		Reactif reactif = iReactifService.getById(4L);
		sousAnalyse.setTitle("sous analyse 1");
		sousAnalyse.setEtat_normal_max(12.3);
		sousAnalyse.setEtat_normal_min(8.03);
		sousAnalyse.setAnalyse(analyse);
		sousAnalyse.setReactif(reactif);
		sousAnalyse.setStatusResult(StatusResult.anormal);
		iSousAnalyseService.add(sousAnalyse);

		SousAnalyse sousAnalyse = iSousAnalyseService.getById(1L);
		sousAnalyse.setEtat_normal_max(14.1);
		sousAnalyse.setEtat_normal_min(9.80);
		iSousAnalyseService.update(sousAnalyse);

		iSousAnalyseService.delete(2L);*/

		/**
		 *  Result crud
		 */

	/*	Result result = new Result();
		SousAnalyse sousAnalyse = iSousAnalyseService.getById(1L);
		result.setValeur_result(13);
		result.setUnite_mesure("Up");
		result.setSousAnalyse(sousAnalyse);
		iResultService.add(result);

		Result result = iResultService.getById(2L);
		result.setUnite_mesure("WAT");
		iResultService.update(result);

		iResultService.delete(2L);*/
	}
}
