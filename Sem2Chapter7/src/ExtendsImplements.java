
interface A{}
interface B extends A{}

class C implements A{}
class D extends C{}

//interface E implements A{}		//syntax error	//interface can't implement interface
//class E implements C{}		//syntax error	//class can't implement class that extends interface

interface Lecturer{
	void teach();
	void prepExam();
	void conductExam();
	void takeAttendance();
}

interface SunwayStaff{
	void applyLeave();
	void reportToWork();
}

class SAELecturer implements Lecturer, SunwayStaff{

	@Override
	public void applyLeave() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportToWork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepExam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void conductExam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeAttendance() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ExtendsImplements {

}
