package Package1.subpackage1;

import teacher.TeacherLogin;
import teacher.TeacherSubject;

public class testsub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		TeacherLogin teacher = new TeacherLogin();
		
		teacher.testTeacherLogin();
		teacher.name="Rashmi";
		//System.out.println(teacher.name);
		
		TeacherSubject sub =new TeacherSubject();
		sub.subject="Selenium";
		
	}

}
