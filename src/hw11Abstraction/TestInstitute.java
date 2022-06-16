package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biology();
		columbiaUniversity.caring();
		columbiaUniversity.hygiene();
		ColumbiaUniversity.columbiaUniversity();
		ColumbiaUniversity.medicalSchool();

		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.languageClub();
		university.playGround();
		university.surgeryRoom();
		university.teacher();
		University.library();

		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.caring();
		medicalSchool.hygiene();
		MedicalSchool.medicalSchool();

	}
}
