//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA CB3005551

import java.util.Scanner;

public class Hora {

	Scanner s = new Scanner(System.in);
	
	private int hora, min, seg;
	
	public Hora() {
		setHor();
		setMin();
		setSeg();
	}
	
	public Hora(int h, int m, int s) {
		setHor(h);
		setMin(m);
		setSeg(s);
	}
	
	public void setHor(int h) {
		hora = h;
	}
	
	public void setMin(int m) {
		min = m;
	}
	
	public void setSeg(int s) {
		seg = s;
	}
	
	public void setHor() {
        do
		{
		System.out.println("Digite a hora: ");
		hora = s.nextInt();
		}while(hora > 23 || hora < 0);
	}
	
	public void setMin() {
		do
		{
		System.out.println("Digite a minuto: ");
		min = s.nextInt();
		}while(min > 59 || min < 0);
	}
	
	public void setSeg() {
		do
		{
		System.out.println("Digite a segundo: ");
		seg = s.nextInt();
		}while(seg > 59 || seg < 0);
	}
	
	public int getHor() {
		
		return hora;
	}
	
	public int getMin() {
		
		return min;
	}
	
	public int getSeg() {
		
		return seg;
	}
	
	public String getHora1() {
	    String shor = "";
	    String smin = "";
	    String sseg = "";
        shor = String.format("%02d", hora);
        smin = String.format("%02d", min);
        sseg = String.format("%02d", seg);
		
		return shor + ":" + smin + ":" + sseg;
	}
	
	public String getHora2() {
		
		String AMPM = "AM";
		String shor = "";
	    String smin = "";
        String sseg = "";
        if (hora > 12)
		{
			AMPM = "PM";
			hora = hora - 12;
		}
	    shor = String.format("%02d", hora);
        smin = String.format("%02d", min);
        sseg = String.format("%02d", seg);
		
		return shor + ":" + smin + ":" + sseg + " " + AMPM;		
	}
	
	public int getSegundos() {
		
		return seg + (min * 60) + (hora * 3600);
	}
	
	
	public static void main(String[] args) {

	}

}