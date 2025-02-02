package rest_api.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
/**
	 * TODO:
	 * 
	 * In nuovo esercizio creare entita' e tabella in database come segue:
	 * 
	 * Machine:
	 * - id : INT
	 * - name : STRING
	 * - description : STRING
	 * - price : INT
	 * 
	 * Dopo aver creato entita', repo e service, aggiungere controller per
	 * l'interazione con l'utente. Definire 2 endpoints per:
	 * - aggiungere 3 macchine con dati a piacere
	 * - leggere l'intero contenuto della tabella e ritornarlo come JSON
	 * 
	 * Testare che l'intero contenuto della tabella sia accessibile attraverso
	 * Postman e le chiamate ai due endpoints definiti.
	 * 
	 */