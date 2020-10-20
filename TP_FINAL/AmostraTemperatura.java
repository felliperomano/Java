//Stefany Lisboa 3005551
//Fellipe Soares 3005411
//Pedro Luiz Oliveira 3007201
import java.util.Scanner;

public class AmostraTemperatura {
	
	Scanner s = new Scanner(System.in);
	
	private int numseq;
	private Data data;
	private Hora hora;
	private float valor;

	public AmostraTemperatura() {
		setData();
		setHora();
		setValor();
	}
	
	public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v) {
		setData(a, b, c);
		setHora(d, e, f);
		setValor(v);
	}
	
	public AmostraTemperatura(Data d, Hora h, float v) {
		data = d;
		hora = h;
		valor = v;
	}
	
	public void setData(int a, int b, int c) {
		data = new Data(a, b, c);
	}

	public void setData() {
		
		data = new Data();
		
	}
	
	public void setHora(int a, int b, int c) {
		
		hora = new Hora(a, b, c);
		
	}
	
	public void setHora() {
		
		hora = new Hora();
		
	}
	
	public void setValor(float v) {
		valor = v;
		numseq++;
	}
	
	public void setValor() {
		System.out.println("Digite uma temperatura: ");
		valor = s.nextFloat();
		numseq++;
	}
	
	public int getNumSeq() {
		
		return numseq;
	}
	
	public String getData() {
		
		return data.mostra1();
	}
	
	public String getHora() {
		
		return hora.getHora1();
	}
	
	public float getValor() {
		
		return valor;
	}
	
	public static void main(String[] args) {
		
		AmostraTemperatura t2 = new AmostraTemperatura();
		System.out.println(t2.getHora());
		System.out.println(t2.getData());
		System.out.println(t2.getValor());
		
		AmostraTemperatura t1 = new AmostraTemperatura(01, 01, 2010, 01, 01, 01, 25);
		System.out.println(t1.getHora());
		System.out.println(t1.getData());
		System.out.println(t1.getValor());
		
		t1.setData();
		t1.setHora();
		t1.setValor();
		
		System.out.println(t1.getHora());
		System.out.println(t1.getData());
		System.out.println(t1.getValor());
		
	}

}
