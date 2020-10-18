//FELLIPE SOARES ROMANO CB3005411
//STEFANY LISBOA CB3005551

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
public class MainData extends Data {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println(data.mostra1());
		System.out.println(data.mostra2());
		System.out.println("Dias transcorridos: " + data.diasTranscorridos());
		data.apresentaDataAtual();
		
	}

}