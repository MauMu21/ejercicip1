package management;

import java.util.ArrayList;

import utils.ConfigGrades;

	public class Management {
	      private ArrayList <Student> mainlist;
	      public Management() {
	    	  mainlist = new ArrayList<>();
	      }
	      public void register (Student student) {
	    	  Integer id=mainlist.size()+1;
	    	  student.setId(id);
	    	  mainlist.add(student);
	      }
	      
	    
	   
	      public ArrayList<Student> ShowOrderABC (){
	    	  mainlist.sort((Student a , Student b)->{
	    		  return a.getLastname().compareTo(b.getLastname());
	    	  });
	    	  return mainlist;
	      }
	      public ArrayList<Student> ShowOrderMaxGrade (){
	    	  mainlist.sort((Student a , Student b)->{
	    		  return b.getGrade().getTOTALGRADE().compareTo(a.getGrade().getTOTALGRADE());
	    	  });
	    	  return mainlist;
	      }
	      public ArrayList<Student> ShowOrderMinGrade (){
	    	  mainlist.sort((Student a , Student b)->{
	    		  return a.getGrade().getTOTALGRADE().compareTo(b.getGrade().getTOTALGRADE());
	    	  });
	    	  return mainlist;
	      }
	      public ArrayList<Student> ShowFailStudents(){
	    	  ArrayList<Student> failstudents = new ArrayList<Student>();
	    	  for(int i=0 ; i< mainlist.size(); i++) {
	    		  if (mainlist.get(i).getGrade().getTOTALGRADE()< ConfigGrades.MIN_GRADES) {
	    			  failstudents.add(mainlist.get(i));
	    		  }		  
	    	  }
	    	 return failstudents;  
	      }
	      public ArrayList<Student> ShowSuccesStudents(){
	    	  ArrayList<Student> successtudents = new ArrayList<Student>();
	    	  for(int i=0 ; i< mainlist.size(); i++) {
	    		  if (mainlist.get(i).getGrade().getTOTALGRADE()> ConfigGrades.MIN_GRADES) {
	    			  successtudents.add(mainlist.get(i));
	    		  }		  
	    	  }
	    	 return successtudents;  
	      }
	      public ArrayList<Student> ShowMayoresParciales(){
	    	  ArrayList<Student> mayoresparciales= new ArrayList<Student>();
	    	  for(int i=0 ; i< mainlist.size(); i++) {
	    		  if (mainlist.get(i).getGrade().getTOTALGRADE()>= ConfigGrades.MAX_GRADES) {
	    			  mayoresparciales.add(mainlist.get(i));
	    		  }		  
	    	  }
	    	 return mayoresparciales;  
	      }
	       public Student getStudentId(Integer id) {
	    	   for (int i=0; i< mainlist.size(); i++) {
	    		   if (mainlist.get(i).getId() == id) {
	    			return mainlist.get(i);   
	    		   }
	    		   
	    	   }
	    	  return null;
	       }
	       public ArrayList<Student> searchStudents (String key){
	    	   ArrayList<Student> successtudents = new ArrayList<Student>();
	    	  for (int i = 0; i < mainlist.size(); i++ ) {
	    		  if(mainlist.get(i).getLastname().toLowerCase().contains(key.toLowerCase())) {
	    			  successtudents.add(mainlist.get(i));
	    		  }
	    		  if(mainlist.get(i).getName().toLowerCase().contains(key.toLowerCase())) {
	    			  successtudents.add(mainlist.get(i));
	    		  }
	    		  if(mainlist.get(i).getEmail().toLowerCase().contains(key.toLowerCase())) {
	    			  successtudents.add(mainlist.get(i));
	    		  }
	    	  }
	    	  return successtudents;
	       }
	       public void removeStudents (Student student) {
	    	   mainlist.remove(student);
	       }
	       public void calcFinalGrade (Student student) {
	      	 ArrayList<Double> grades = new ArrayList<Double>();
	      	 grades.add(student.getGrade().getP1());
	      	 grades.add(student.getGrade().getP2());
	      	 grades.add(student.getGrade().getP3());
	      	 grades.sort((a ,b) -> {
	      		 return b.compareTo(a);
	      	 });
	      
	    	  Double total = ((grades.get(0) + grades.get(1)) /2)* ConfigGrades.PARCIAL+
	    			  student.getGrade().getHomeworksgrade()* ConfigGrades.HOMEWORKS+
	    			  student.getGrade().getFinalgrade()*ConfigGrades.FINAL;
	    	  student.getGrade().setTOTALGRADE(total);
	      }
}