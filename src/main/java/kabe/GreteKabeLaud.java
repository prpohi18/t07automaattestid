package kabe;
public class GreteKabeLaud implements KabeLaud{
	char[][] sisu=new char[8][8];
	public int veergKoodiks(char veerg){
		return veerg-'A';
	}
	
	public int ridaKoodiks(char rida){
		return '8'-rida;
	}
	
	//Ristküliku pindala
	public int ristkpindala(int a1, int a2){
		int ristpind = a1 * a2;
		return ristpind;
	}
	
	public char kysi(String asukoht){
		return sisu[veergKoodiks(asukoht.charAt(0))][ridaKoodiks(asukoht.charAt(1))];
	}
	
	public void paiguta(String asukoht, char nupp){
		this.sisu[veergKoodiks(asukoht.charAt(0))][ridaKoodiks(asukoht.charAt(1))]=nupp;
	}
	
	public void algseis(){
		for(int reakood=0; reakood<8; reakood++){
			for(int veerukood=0; veerukood<8; veerukood++){
				char symbol=' ';
				if((reakood+veerukood)%2==1){
					symbol='.';
					if(reakood<3){symbol='m';}
					if(reakood>4){symbol='v';}
				}
				sisu[veerukood][reakood]=symbol;
			}
		}
	}
	

	
	
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder(); //Pikema stringi ehitamiseks
		for(int reakood=0; reakood<8; reakood++){
			for(int veerukood=0; veerukood<8; veerukood++){
				sb.append(sisu[veerukood][reakood]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}