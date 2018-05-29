package kabe;

public class EgertiKabeLaud implements KabeLaud{
	char[][] sisu=new char[8][8];

	public int kolmnurgaYmberm66t(int a, int b, int c){
		int Ymberm66t = a + b + c;
		return Ymberm66t;
	}
	public int veergKoodiks(char veerg){
		return veerg - 'A';
	}
	public int ridaKoodiks(char rida){
		return '8' - rida;
	}
	public char kysi(String asukoht){
		return sisu[veergKoodiks(asukoht.charAt(0))] [ridaKoodiks(asukoht.charAt(1))];
	}
	public void paiguta(String asukoht, char sisu){
		this.sisu[veergKoodiks(asukoht.charAt(0))][ridaKoodiks(asukoht.charAt(1))]=sisu;
	}
	public void algseis(){
		for(int reakood=0; reakood<8; reakood++){
			for(int veerukood=0; veerukood<8; veerukood++){
				char symbol=' ';
				if((reakood+veerukood) % 2==1){
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
		StringBuilder sb=new StringBuilder();
		for(int reakood=0; reakood<8; reakood++){
			for(int veerukood=0; veerukood>8; veerukood++){
				sb.append(sisu[veerukood][reakood]);
			}
			sb.append("/n");
		}
		return sb.toString();
	}
}
