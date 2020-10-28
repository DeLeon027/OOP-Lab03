package oop.lab03.acme;

public final class Testing {

	private Testing() {
	}

	public static void main(final String[] args) {
		/*
		 * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3) Creare due
		 * aulee di esame, una con 100 posti una con 80 posti 4) Creare due esami, uno
		 * con nMaxStudents=10, l'altro con nMaxStudents=2 5) Iscrivere tutti e 3 gli
		 * studenti agli esami 6) Stampare in stdout la rapresentazione in stringa dei
		 * due esami
		 */

		Student studente1 = new Student(1, "Mario", "Rossi", "lallero1", 2005);
		Student studente2 = new Student(2, "Carlo", "Rossi", "lallero2", 2002);
		Student studente3 = new Student(3, "Giacomo", "Rossi", "lallero3", 2009);
		Professor prof1 = new Professor(10, "Marco", "Antonio", "ciccio",
				new String[] { "Matematica", "Analisi", "Algebra" });
		Professor prof2 = new Professor(10, "Giovanni", "Storti", "ciccio4",
				new String[] { "Programmazione", "Sistemi Operativi", "OOP" });

		ExamRoom aula1 = new ExamRoom(100, "bella", true, false);
		ExamRoom aula2 = new ExamRoom(80, "bella ma non troppo", true, true);
		
		Exam analisi1 = new Exam(33, 10, 0, "analisi 1", prof1, aula1, new Student[]{studente1, studente2, studente3});
		Exam oop = new Exam(99, 2, 0, "oop", prof2, aula2,  new Student[]{studente3, studente2, studente1});
		
		System.out.println(analisi1.toString());
		System.out.println(oop.toString());
	}
}
