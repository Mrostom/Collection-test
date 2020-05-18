/**
 * @since 5/18/2020
 * @author ROSTOM
 * @version 1.1
 */
	public class Question9A {
	    private String studentname;
	    private int rollno;
	    private int studentage;
	    public Question9A(int i, String string, int j) {
		}
		public void Student(int rollno, String studentname, int studentage) {
	         this.rollno = rollno;
	         this.studentname = studentname;
	         this.studentage = studentage;
	    }
	    public String getStudentname() {
	         return studentname;
	    }
	    public void setStudentname(String studentname) {
		this.studentname = studentname;
	    }
	    public int getRollno() {
		return rollno;
	    }
	    public void setRollno(int rollno) {
		this.rollno = rollno;
	    }
	    public int getStudentage() {
		return studentage;
	    }
	    public void setStudentage(int studentage) {
	 	this.studentage = studentage;
	    }	
	}