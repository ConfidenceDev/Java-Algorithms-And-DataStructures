package Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	
	private int id;
	private String fname;
	private double cgpa;
	
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class SortStudentList {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
      	for(Student st: sortedList(studentList)){
			System.out.println(st.getFname());
		}
	}

	private static Student[] sortedList(List<Student> sList){
        Student[] studentList = new Student[sList.size()];
        
		for (int i = 0; i < studentList.length; i++) {
			studentList[i] = sList.get(i);
		}
        		
		//boolean isSorted = false;
		//while(!isSorted) {
			
			for (int k = 0; k <studentList.length - 1; k++) {
				if (studentList[k].getCgpa() == studentList[k + 1].getCgpa()){
	        		for(int j = k + 1; j < studentList.length; j++) {
		                if (studentList[k].getFname().compareTo(studentList[k + 1].getFname()) > 0){
		                	Student temp = studentList[k];
		                    studentList[k] = studentList[k + 1];
		                    studentList[k + 1] = temp;
		                    
		                }
	        		}
			}
	        for(int i = 0; i < studentList.length - 1; i++){
		            if (studentList[i].getCgpa() < studentList[i + 1].getCgpa()){
		                Student temp = studentList[i];
		                studentList[i] = studentList[i + 1];
		                studentList[i + 1] = temp;
		                       
		                //isSorted = false;
		            }/*else if (studentList[i].getId() < studentList[i + 1].getId()){
	            		Student temp = studentList[i];
	            		studentList[i] = studentList[i + 1];
	            		studentList[i + 1] = temp;
		            	
		            	isSorted = false;
		            }*/else {
		            	//isSorted = true;
		            }
	        	} 
			}

		//}
        return studentList;
    }
	
	private static boolean isSorted(Student[] arr) {
		boolean sort = false;
		  for(int i = 0; i < arr.length - 1; i++){
	        	if (arr[i].getCgpa() < arr[i + 1].getCgpa()){
	        		sort = false;
	        	}else {
	        		sort = true;
	        	}
		  }
		  return sort;
	}
}
