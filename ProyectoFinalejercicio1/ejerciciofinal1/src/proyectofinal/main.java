package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

import management.Management;
import management.Student;
import utils.ConfigGrades;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Integer option = -1;
		Management management = new Management();  
		  management.register(new Student ("Loredo Almendras", "Vany", "vany@gmail.com"));
		  management.register(new Student ("Soto Medina", "Omar", "Omar@gmail.com"));
		  management.register(new Student ("Loredo Almendras", "Omar", "Omar@gmail.com"));
		  management.register(new Student ("Pedro Ruben", "Vany", "p@gmail.com"));
		  management.register(new Student ("Acebey Mamani", "Ivan", "a@gmail.com"));
		do {
		  System.out.println("1.-) Crear estudiante");
		  System.out.println("2.-) Listar estudiante");
		  System.out.println("3.-) Agregar notas");
		  System.out.println("4.-) Configurar la ponderacion");
		  System.out.println("5.-) Buscar estudiante");
		  System.out.println("6.-) Borrar registro de estudiante");
		  System.out.println("7.-) Salir del sistema");	  
		  
		  option = Integer.parseInt(read.nextLine()) ;	
		  
		  switch(option) {
			  case 1: {
				  System.out.print("Nombre");
				  String name=read.nextLine();
				  System.out.print("Apellidos");
				  String lastname=read.nextLine();
				  System.out.print("Email");
				  String email=read.nextLine();
				  Student student=new Student(lastname, name, email);
				  management.register(student);
				  System.out.println("Estudiante registrado con exito");
				
				  break;
			  }
			  case 2: {
			
				  System.out.println("1.-) Listar por orden alfabetico");
				  System.out.println("2.-) Listar por nota maxima");
				  System.out.println("3.-) Mostrar solo reprobados");
				  System.out.println("4.-) Mostrar solo aprobados");
				  System.out.println("5.-) Mostrar mejores parciales");
				  
				  option = Integer.parseInt(read.nextLine()) ;	
				  switch (option) {
				  case 1:{
					  ArrayList<Student> list=management.ShowOrderABC();
					  list.forEach((Student item) -> {
					  System.out.println(item.getId()+ " .-)" + item.getLastname()+ " "+ item.getName()+ " "+
					  item.getEmail()+ " : "+
					  item.getGrade().getP1()+ " | "+
					  item.getGrade().getP2()+ " | "+
					  item.getGrade().getP3()+ " | "+
					  item.getGrade().getHomeworksgrade()+ " | "+
					  item.getGrade().getFinalgrade()+" | "+
					  item.getGrade().getTOTALGRADE()+ " | ");
					  });
						
					  
					  
					  break;
				  }
				  case 2:{
					  ArrayList<Student> list=management.ShowOrderMaxGrade();
					  list.forEach((Student item) -> {
					  System.out.println(item.getId()+ " .-)" + item.getLastname()+ " "+ item.getName()+ " "+
					  item.getEmail()+ " : "+
					  item.getGrade().getP1()+ " | "+
					  item.getGrade().getP2()+ " | "+
					  item.getGrade().getP3()+ " | "+
					  item.getGrade().getHomeworksgrade()+ " | "+
					  item.getGrade().getFinalgrade()+" | "+
					  item.getGrade().getTOTALGRADE()+ " | ");
					  });
					  break;
				  }
				  case 3:{
					  ArrayList<Student> list=management.ShowFailStudents();
					  list.forEach((Student item) -> {
					  System.out.println(item.getId()+ " .-)" + item.getLastname()+ " "+ item.getName()+ " "+
					  item.getEmail()+ " : "+
					  item.getGrade().getP1()+ " | "+
					  item.getGrade().getP2()+ " | "+
					  item.getGrade().getP3()+ " | "+
					  item.getGrade().getHomeworksgrade()+ " | "+
					  item.getGrade().getFinalgrade()+" | "+
					  item.getGrade().getTOTALGRADE()+ " | ");
					  });
					  break;
				  }
				  case 4:{
					  ArrayList<Student> list = management.ShowSuccesStudents();
				         list.forEach((Student item)->{ 
				        	 System.out.println(item.getId() + ".-"+ item.getLastname()+ " " +
							         item.getName()+ " " + item.getEmail() + " notas:" +
									 item.getGrade().getP1()+ " | " +
					    			 item.getGrade().getP2()+ " | " +
							         item.getGrade().getP3()+ " | " +
					    		     item.getGrade().getHomeworksgrade() + " | " +
							         item.getGrade().getFinalgrade() + " | " +
					    		     item.getGrade().getTOTALGRADE() + " | ");
							
						  });
					  break;
				  }
				  case 5:{
					  ArrayList<Student> list = management.ShowMayoresParciales();
				         list.forEach((Student item)->{ 
				        	 System.out.println(item.getId() + ".-"+ item.getLastname()+ " " +
							         item.getName()+ " " + item.getEmail() + " notas:" +
									 item.getGrade().getP1()+ " | " +
					    			 item.getGrade().getP2()+ " | " +
							         item.getGrade().getP3()+ " | " +
					    		     item.getGrade().getHomeworksgrade() + " | " +
							         item.getGrade().getFinalgrade() + " | " +
					    		     item.getGrade().getTOTALGRADE() + " | ");
							
						  });
				         break;
				  }
		  }
				 
			  }
			  case 3: {
				 
				  System.out.println("Seleccione un estudiante por su ID");
				  ArrayList<Student> list = management.ShowOrderABC();
			         list.forEach((Student item)->{ 
						  System.out.println(item.getId() + ".-"+ item.getLastname()+ " " +
			         item.getName()+ " " + item.getEmail() + " notas:"  );
					 	
					  });
			         Integer idstudent = Integer.parseInt(read.nextLine());
			         Student student = management.getStudentId(idstudent);
			         System.out.println("Parcial 1");
			         Double p1 = Double.parseDouble(read.nextLine());
			         
			         System.out.println("Parcial 2");
			         Double p2 = Double.parseDouble(read.nextLine());
			         System.out.println("Parcial 3");
			         Double p3 = Double.parseDouble(read.nextLine());
			         
			         System.out.println("Tareas");
			         Double homework = Double.parseDouble(read.nextLine());
			         System.out.println("Final");
			         Double finaltest = Double.parseDouble(read.nextLine());
			         
			         student.getGrade().setP1(p1);
			         student.getGrade().setP2(p2);
			         student.getGrade().setP3(p3);
			         
			         student.getGrade().setHomeworksgrade(homework);
			         student.getGrade().setFinalgrade(finaltest);
					 
			         management.calcFinalGrade(student);
			         System.out.println("La nota final del estudiante" + student.getName() + " " + student.getLastname() + " es "+ student.getGrade().getTOTALGRADE());
				  
				  
				  break;
			  }
			  case 4: {
				System.out.println("1.-) Configurar Ponderacion");
				  System.out.println("Configure la ponderacion para los parciales");
				  Double parcial = Double.parseDouble(read.nextLine());
				  
				  System.out.println("Configure la ponderacion de las tareas");
				  Double homework = Double.parseDouble(read.nextLine());
				  
				  System.out.println("Configure la ponderacion para el examen final");
				  Double FINAL = Double.parseDouble(read.nextLine());
				  
				  ConfigGrades.PARCIAL = parcial;
				  ConfigGrades.HOMEWORKS = homework;
				  ConfigGrades.FINAL = FINAL;
				  System.out.println("Configuracion");
			  }
			  case 5:{
				  System.out.println("Busca por Nombre , Apellido o Email");
				  String key = read.nextLine();
				  ArrayList<Student> list=management.searchStudents(key);
				  list.forEach((Student item) -> {
				  System.out.println(item.getId()+ " .-)" + item.getLastname()+ " "+ item.getName()+ " "+
				  item.getEmail()+ " : "+
				  item.getGrade().getP1()+ " | "+
				  item.getGrade().getP2()+ " | "+
				  item.getGrade().getP3()+ " | "+
				  item.getGrade().getHomeworksgrade()+ " | "+
				  item.getGrade().getFinalgrade()+" | "+
				  item.getGrade().getTOTALGRADE()+ " | ");
				  });
				  break;
			  }
			  case 6:{
				  System.out.println("Seleccione un estudiante por su ID");
				  ArrayList<Student> list = management.ShowOrderABC();
			         list.forEach((Student item)->{ 
						  System.out.println(item.getId() + ".-"+ item.getLastname()+ " " +
			         item.getName()+ " " + item.getEmail() + " notas:"  );
					 	
					  });
			       Integer idstudent = Integer.parseInt(read.nextLine());
			       Student student = management.getStudentId(idstudent);
			       management.removeStudents(student);
			       System.out.println("Estudiante borrado con éxito");
			       
			       
				  break;
			  }
			  case 7:{
				  break;
			  }
		  }
		} while(option != 7);
		System.out.print("TERMINO!");
	}
	
	}
