//Stefany Lisboa 3005551
//Fellipe Soares 3005411
//Pedro Luiz Oliveira 3007201

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data {

	Scanner s = new Scanner(System.in);
	Date date = new Date();
	DateFormat formataData = DateFormat.getDateInstance(DateFormat.FULL);
	private int dia, mes, ano;
	public Data() {
        setAno();		
		setMes();
		setDia();
	}
	
	public Data(int d, int m, int a) {
		setAno(a);
		setMes(m);
		setDia(d);
    }

    public void setDia(int d) {
		dia = d;
	}
	
	public void setMes(int m) {
		mes = m;
	}
	
	public void setAno(int a) {
		ano = a;
    }
    
    public void setDia() {
        int lm = limiteMes();
        do
		{
		System.out.println("Digite o dia: ");
		dia = s.nextInt();
		}while(dia > lm || dia < 1);
	}
	
	public void setMes() {
		do
		{
		System.out.println("Digite o mês: ");
		mes = s.nextInt();
		}while(mes > 12 || mes < 1);
	}
	
	public void setAno() {
		do
		{
		System.out.println("Digite o ano: ");
		ano = s.nextInt();
		}while( ano < 1);
	}
		
	public int getDia() {
		
		return dia;
	}
	
	public int getMes() {
		
		return mes;
	}
	
	public int getAno() {
		
		return ano;
	}
	
	public String mostra1() {
	    String sd = "";
	    String sm = "";
	    String sa = "";
        sd = String.format("%02d", dia);
        sm = String.format("%02d", mes);
        sa = String.format("%04d", ano);
		System.out.println(date);
		return sd + "/" + sm + "/" + sa;
	}
	
	public String mostra2() {
		
		String sd = "";
	    String sm = "";
        String sa = "";
        
        sd = String.format("%02d", dia);
        sm = mesPorExtenso(mes);
        sa = String.format("%04d", ano);
		//coloca em String.format();
		return sd + "/" + sm + "/" + sa;		
	}
    
    public boolean bissexto(){
        boolean t = false;
        if(ano % 4 != 0){
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

        return meses[mes-1];
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
		for(int i = 0; i < mes-1 ; i++){
			dt = dt + meses[i];
		}
		//dt = (a * 365) + (a/4);
		return dia + dt;
	}

	public void apresentaDataAtual(){
		System.out.println("Data atual com formatação: "+ formataData.format(date));
	}
	
	public static void main(String[] args) {
		
	}

}