//Stefany Lisboa 3005551
//Fellipe Soares 3005411
//Pedro Luiz Oliveira 3007201
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
		}
		while(hora > 23 || hora < 0);
	}
	
	public void setMin() {
		do
		{
			System.out.println("Digite os minutos: ");
			min = s.nextInt();
		}
		while(min > 59 || min < 0);
	}
	
	public void setSeg() {
		do
		{
			System.out.println("Digite os segundos: ");
			seg = s.nextInt();
		}
		while(seg > 59 || seg < 0);
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
		
		return hora + ":" + min + ":" + seg;
	}
	
	public String getHora2() {
		
		String AMPM = "am";
		
		if (hora > 12)
		{
			AMPM = "pm";
			hora = hora - 12;
		}
		return hora + ":" + min + ":" + seg + " " + AMPM;
	}
	
	public int getSegundos() {
		
		return seg + (min * 60) + (hora * 3600);
	}
	
	
	public static void main(String[] args) {

	}

}

