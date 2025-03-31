package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;


@RestController
@RequestMapping("app")
public class AppController {
	//create some student objects
	Student Bob = new Student("2020ICT05","Bob Marle",23,"IT",3.2);
	Student Alice = new Student("2020ICT07","Alice Johnson",22,"IT",3.41);
	Student Heily = new Student("2020ICT11","Heily Beiber",24,"AMC",3.01);
	
	List<Student> students = new ArrayList<Student>();
	
	public appController() {
		{
			students.add(Alice);
			students.add(Bob);
			students.add(Heily);
			return students;
			}
	}
	
	@GetMapping("/msg")
	public String myMessage() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String myName() {
		return "My name is SpringBoot";
	}
	@GetMapping("/age/{ag}")
	public String MyAge(@PathVariable("ag") int age) {
		return "My age is" +age;
	}
	
	@GetMapping("/town/{tow},{liv}")
	public String MyTown(@PathVariable("tow") String town ,@PathVariable("liv") String live) {
		return "My home town is "+town+" and I live in "+live;
	}
	
	//a method to return a student
	@GetMapping("/student")
	public Student getStudent() {
		return Bob;
	}
	
	//return multiple students
	@GetMapping("/students")
	public List<Student> getStudents()
	
	//find a student from the list by regNo
	@GetMapping("/student/{regno}")
	Public Stuent getStudent (@PathVariable("regno") String regNo) {
		for (Student student : students) {
			if(student.getRegNo().equals(regno))
			{return student;
		}
	}return null;
	
}
}

//find the student who's age is between 20 and 23
List<Student> studentbetween20and30 = new ArrayList<Student>();
	@GetMapping("/studentbetween20and30")
	public List<Student> getStudentBetween() {
		for(Student student:students) {
			if(20<student.getAge() && student.getAge()<30 ) {
				studentbetween20and30.add(student);
			}
		}
		return studentbetween20and30;
	}

//sort the students by their GPA
@GetMapping("/sortbyGPA")
	public List<Student> getSortedStudentbyGPA(){
		students.sort(Comparator.comparing(Student::getGpa));
		return students;
	}

//create CRUD operations for students
//for create
	@GetMapping("/addStudent/{nm},{ag},{crs},{reg},{gp}")
	public List<Student> addStudent(@PathVariable("nm") String name,@PathVariable("ag") int age,@PathVariable("crs") String course,@PathVariable("reg") String regNo,@PathVariable("gp") double gpa){
		Student newstu = new Student(name,age,course,regNo,gpa);
		students.add(newstu);
		return students;
	}

	//for update
	@GetMapping("/updateStudent/{reg},{nm},{ag},{crs},{gp}")
	public Student updateStudent(@PathVariable("nm") String name,@PathVariable("ag") int age,@PathVariable("crs") String course,@PathVariable("reg") String regNo,@PathVariable("gp") double gpa){
		for(Student student:students) {
			if(student.getRegNo().equals(regNo)) {
				if(age!=0 && age>0){
					student.setAge(age);					
				}
				if(!course.equals("")) {
					student.setCourse(course);					
				}
				if(gpa>0 && gpa<4) {
					student.setGpa(gpa);					
				}
				if(!name.equals("")) {
					student.setName(name);					
				}
				return student;
			}
		}
		return null;		
	}

	//for delete
	@GetMapping("/deleteStudent/{reg}")
	public List<Student> deleteStudent(@PathVariable("reg") String regNo){
		for(Student student:students) {
			if(student.getRegNo().equals(regNo)) {
				students.remove(student);
			}
		}
		return students;
	}
}
