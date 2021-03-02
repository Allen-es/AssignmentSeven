package edu.cgcc.cs161;

import java.util.List;
import java.util.ArrayList;


public class Scheduler {
	
	ClinicService availServices;
	Survey survey;
	ServiceNeed serviceNeed;
	Appointment appointment;
	Referral referral;
	
	
	public MedicalEngagement requestToBeSeen() {
	
		
		Client client = new Client();
		ClinicService clinicService = new ClinicService();
		MedicalEngagement medicalEngagement;
		Survey survey = new Survey(); 
		
		
		List<ClinicService> clinicServices = clinicService.getAvailServices();
		
		
		if(client.availServicesWorks(clinicServices)) {
			medicalEngagement = makeAppointment();
		}
		else {
			
			survey.fillOutSurvey(survey);
			
				
			if(clinicService.getAvailServices() != null) {
				medicalEngagement = makeAppointment();
				
			}
			else{
				medicalEngagement = makeReferral();
				
			}
			
		}
		
		return medicalEngagement;
	}



	private MedicalEngagement makeReferral() {
		
		return null;
	}



	private MedicalEngagement makeAppointment() {
		
		return null;
	}

}