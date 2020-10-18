//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA CB3005551

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data {

	Scanner s = new Scanner(System.in);
	Date date = new Date();
	DateFormat formataData = DateFormat.getDateInstance(DateFormat.FULL);
	private int d, m, a;
	public Data() {
        entraAno();		
		entraMes();
		entraDia();
	}
	
	public Data(int d, int m, int a) {
		entraDia(d);
		entraMes(m);
		entraAno(a);
		
    }

    public void entraDia(int d) {
		d = this.d;
	}
	
	public void entraMes(int m) {
		m = this.m;
	}
	
	public void entraAno(int a) {
		a = this.a;
    }
    
    public void entraDia() {
        int lm = limiteMes();
        do
		{
		System.out.println("Digite o dia: ");
		d = s.nextInt();
		}while(d > lm || d < 1);
	}
	
	public void entraMes() {
		do
		{
		System.out.println("Digite o mês: ");
		m = s.nextInt();
		}while(m > 12 || m < 1);
	}
	
	public void entraAno() {
		do
		{
		System.out.println("Digite o ano: ");
		a = s.nextInt();
		}while( a < 1);
	}
		
	public int retDia() {
		
		return d;
	}
	
	public int retMes() {
		
		return m;
	}
	
	public int retAno() {
		
		return a;
	}
	
	public String mostra1() {
	    String sd = "";
	    String sm = "";
	    String sa = "";
        sd = String.format("%02d", d);
        sm = String.format("%02d", m);
        sa = String.format("%04d", a);
		System.out.println(date);
		return sd + "/" + sm + "/" + sa;
	}
	
	public String mostra2() {
		
		String sd = "";
	    String sm = "";
        String sa = "";
        
        sd = String.format("%02d", d);
        sm = mesPorExtenso(m);
        sa = String.format("%04d", a);
		//coloca em String.format();
		return sd + "/" + sm + "/" + sa;		
	}
    
    public boolean bissexto(){
        boolean t = false;
        if(a % 4 != 0){
            t = true;
        }
        return t;
    }

    public int limiteMes(){
        boolean t = bissexto();
        int[] meses = {31,29,31,30,31,30,31,31,30,31,30,31};
        if(t == true){
            meses[1] = 28;
        }

        return meses[m-1];
    }
    
	public String mesPorExtenso(int m) {
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        		
		return meses[m-1];		
	}

	public int diasTranscorridos(){
		boolean t = bissexto();
		int dt = 0;
        int[] meses = {31,29,31,30,31,30,31,31,30,31,30,31};
        if(t == true){
            meses[1] = 28;
		}
		for(int i = 0; i < m-1 ; i++){
			dt = dt + meses[i];
		}
		//dt = (a * 365) + (a/4);
		return d + dt;
	}

	public void apresentaDataAtual(){
		System.out.println("Data atual com formatação: "+ formataData.format(date));
	}
	
	public static void main(String[] args) {}

}