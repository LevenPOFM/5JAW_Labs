/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Student extends Person{
    
    public String program;
    public int dateReg;

    public Student(String program, int dateReg, int id, String name, String email, int telNum) {
        super(id, name, email, telNum);
        this.program = program;
        this.dateReg = dateReg;
    }

    public String getProgram() {
        return program;
    }

    public int getDateReg() {
        return dateReg;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setDateReg(int dateReg) {
        this.dateReg = dateReg;
    }

    @Override
    public String toString() {
        return super.toString() + "program=" + program + ", dateReg=" + dateReg + '}';
    }
     
    
    
}
