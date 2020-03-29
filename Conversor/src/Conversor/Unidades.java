package Conversor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Unidades {
	
	Scanner sc = new Scanner(System.in);
	int unidade;
	int unidadeM;
	int unidadeL;
	int unidadeG;
	int unidadeH;
	int unidadeT;
		
	void escolherUnidade() {
 		 unidade = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Metro (Massa) \n 2- Litro (Volume) \n 3 - Grama (Massa) "
		 		+ "\n 4 - Hertz (Frequência) \n 5 - Segundos (Tempo) ", "Digite a unidade que você deseja converter:"
		 		, JOptionPane.INFORMATION_MESSAGE));
				
	
		 
switch(unidade){
		
	case 1:	
					
		unidadeM = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilometro \n 2- Hectograma \n 3 - Decametro "
		+ "\n 4 - Decímetro \n 5 - Centímetro \n 6 - Milímetro", "Digite a unidade de comprimento que você deseja converter:"
		, JOptionPane.INFORMATION_MESSAGE));
			
			switch (unidadeM){
							
				case 1:
							
					double numeroKm;
					numeroKm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Kilometros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoKm = numeroKm / 1000;
			
					JOptionPane.showMessageDialog(null, "" + operacaoKm + "Km", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );	
							
				break;
					
				case 2:
			
					double numeroHm;
					numeroHm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Hectometros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoHm = numeroHm / 100;
				
					JOptionPane.showMessageDialog(null, "" + operacaoHm + "Hm", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					
				break;			
					
				case 3:
							
					double numeroDam;
					numeroDam = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Decametros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoDam = numeroDam / 10;
						
					JOptionPane.showMessageDialog(null, "" + operacaoDam + "Dam", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
				
				break;
					
				case 4:
								
					double numeroDm;
					numeroDm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Decímetros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoDm = numeroDm * 10;
					
					JOptionPane.showMessageDialog(null, "" + operacaoDm + "Dm", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					
				break;
					
				case 5:
							
					double numeroCm;
					numeroCm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Centímetros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoCm = numeroCm * 100;
				
					JOptionPane.showMessageDialog(null, "" + operacaoCm + "Cm", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					
				break;
					
				case 6:
							
					double numeroMm;
					numeroMm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Milímetros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoMm = numeroMm * 1000;
				
					JOptionPane.showMessageDialog(null, "" + operacaoMm + "Mm", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					
				break;
				
			}
				
	case 2:
			
		unidadeL = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilolitro \n 2- Hectolitro \n 3 - Decalitro "
		+ "\n 4 - Decílitro \n 5 - Centílitro \n 6 - Milílitro", "Digite a unidade de volume que você deseja converter:"
		, JOptionPane.INFORMATION_MESSAGE));
			
			switch (unidadeG ){
			
				case 1:
				
					double numeroKl;
					numeroKl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o valor para conversão em Kilolitros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoKl= numeroKl / 1000;

					JOptionPane.showMessageDialog(null, "" + operacaoKl+ "Kl", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );	
					
				break;
		
				case 2:
					
					double numeroHl;
								numeroHl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Hectolitros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoHl = numeroHl / 100;
	
							JOptionPane.showMessageDialog(null, "" + operacaoHl + "Hl", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
		
					break;
			
		
					case 3:
				
								double numeroDal;
								numeroDal = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Decalitros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoDam = numeroDal / 10;
			
							JOptionPane.showMessageDialog(null, "" + operacaoDam + "Dal", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
		
					case 4:
					
								double numeroDl;
								numeroDl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Decílitros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoDl = numeroDl * 10;
		
							JOptionPane.showMessageDialog(null, "" + operacaoDl + "Dl", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
		
					case 5:
				
								double numeroCl;
								numeroCl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Centílitros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoCl = numeroCl * 100;
	
							JOptionPane.showMessageDialog(null, "" + operacaoCl + "Cl", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
		
					case 6:
				
								double numeroMl;
								numeroMl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Milímetros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoMl = numeroMl * 1000;
								
							JOptionPane.showMessageDialog(null, "" + operacaoMl + "Ml", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					break;
	
}
	 
			case 3:	
						unidadeG = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilograma \n 2- Hectograma \n 3 - Decagrama "
						+ "\n 4 - Decígrama \n 5 - Centígrama \n 6 - Milígrama", "Digite a unidade de massa que você deseja converter:"
						, JOptionPane.INFORMATION_MESSAGE));
		
					switch (unidadeG){
						
						case 1:
						
									double numeroKg;
									numeroKg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Kilogramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoKg = numeroKg / 1000;
		
								JOptionPane.showMessageDialog(null, "" + operacaoKg + "Kg", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );	
						
						break;
		
				
						case 2:
		
									double numeroHg;
									numeroHg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Hectogramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoHg = numeroHg / 100;
			
								JOptionPane.showMessageDialog(null, "" + operacaoHg + "Hg", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
				
						break;
					
				
						case 3:
						
									double numeroDag;
									numeroDag = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Decagramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoDag = numeroDag / 10;
					
								JOptionPane.showMessageDialog(null, "" + operacaoDag + "Dag", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
						break;
					
				
						case 4:
							
									double numeroDg;
									numeroDg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Decígramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoDg = numeroDg * 10;
				
								JOptionPane.showMessageDialog(null, "" + operacaoDg + "Dg", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
						break;
			
			
					case 5:
					
								double numeroCg;
								numeroCg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Centígramas:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoCg = numeroCg * 100;
								
							JOptionPane.showMessageDialog(null, "" + operacaoCg + "Cg", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					break;
			
			
					case 6:
					
								double numeroMg;
								numeroMg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Milígramas:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoMg = numeroMg * 1000;
		
							JOptionPane.showMessageDialog(null, "" + operacaoMg + "Mg", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
	}
			case 4:	
				
				unidadeH = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilo-hertz \n 2- Mega-hertz \n 3 - Giga-hertz "
				, "Digite a unidade de frequência que você deseja converter:"
				, JOptionPane.INFORMATION_MESSAGE));

			switch (unidadeH){
				
				case 1:
				
							double numeroKHz;
							numeroKHz = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Kilo-hertz:", JOptionPane.INFORMATION_MESSAGE ));				
							double operacaoKHz = numeroKHz / 1000;

						JOptionPane.showMessageDialog(null, "" + operacaoKHz + "KHz", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );	
				
				break;

		
				case 2:

							double numeroMHz;
							numeroMHz = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para conversão em Mega-hertz:", JOptionPane.INFORMATION_MESSAGE ));				
							double operacaoMHz = numeroMHz / 1000000;
	
						JOptionPane.showMessageDialog(null, "" + operacaoMHz + "MHz", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
		
				break;
			
		
				case 3:
				
							double numeroGHz;
							numeroGHz = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para conversão em Giga-hertz:", JOptionPane.INFORMATION_MESSAGE ));				
							double operacaoGHz = numeroGHz / 1000000000;
			
						JOptionPane.showMessageDialog(null, "" + operacaoGHz + "GHz", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
				break;
			
			
				}
			
			case 5:
				
				unidadeT = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Segundos \n 2-  Horas \n 3 - Dias "
						+ "\n 4 - Semanas \n 5 - Meses \n 6 - Anos", "Digite a unidade de tempo que você deseja converter:"
						, JOptionPane.INFORMATION_MESSAGE));
				switch(unidadeT){
				
				case 1:
					
					double segundos;
					segundos = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite quantos Minutos você quer converter para Segundos:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoSeg = segundos * 60;

				JOptionPane.showMessageDialog(null, "" + operacaoSeg + "seg", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );	
		
				break;


				case 2:

					double horas;
					horas = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite quantas Horas você quer converter para Minutos:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoHr = horas * 60;

				JOptionPane.showMessageDialog(null, "" + operacaoHr + "hr", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );

				break;
	

				case 3:
		
					double dias;
					dias = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite quantos Dias você deseja para conversão em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoDias = dias * 1440;
	
				JOptionPane.showMessageDialog(null, "" + operacaoDias + "Min", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
				break;
	

				case 4:
			
					double semana;
					semana = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite a quantas Semanas você deseja para conversão em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoSem = semana * 10;

				JOptionPane.showMessageDialog(null, "" + operacaoSem + "Semana(s)", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
				break;


				case 5:
	
				double mes;
				mes = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite a quantos Meses você deseja para conversão em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
				double operacaoMes = mes * 43800;
				
				JOptionPane.showMessageDialog(null, "" + operacaoMes + "Mês(es)", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
				break;
		

				case 6:
	
				double ano;
				ano = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite a quantoos Anos você deseja para conversão em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
				double operacaoAno = ano * 525600;

			JOptionPane.showMessageDialog(null, "" + operacaoAno + "Ano(s)", "O valor da conversão:", JOptionPane.INFORMATION_MESSAGE );
			break;
					
				}
		 	}
		}
	}
	

			
			
	

