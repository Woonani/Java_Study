package kr.or.kosa;

// 한건의 데이터를 담을 수 있는 클래스
// 데이터베이스의 테이블과 1: 1로 맵핑하는 클래스
// create table emp( empno number, ename varchar2(30)); >> 1건의	//바차가 variable character였다니
// select * from emp where empno=7902 			
// DTO, VO, DOMAIN 
public class CopyEmp {
	private int empno;
	private String ename;
	private int sal;
	
	
	// source > Generate Constructor using Fields
	public CopyEmp(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	// source > Generate Getters and Setters...
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	// source > Generate toString...
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	


	
	
}
