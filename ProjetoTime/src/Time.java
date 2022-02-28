
public class Time {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	
	public int getHora() {
		
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	
	
	public void setTime(int h, int m, int s) {
		
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	
	public String exibirHoraUniversal() {
		
		
		return this.hora+":"+this.minuto+":"+this.segundo;
	}
	
	public String exibirHoraPadrao() {
		String texto = "";
		int horaAmPm = 0;
		    if(this.hora > 12 && this.hora < 24) {
			
			horaAmPm  = this.hora - 12;
			texto = horaAmPm + ":"+this.minuto +":"+ this.segundo +  "PM";
			
		}else if(this.hora == 00 && this.hora <= 12) {
			
			texto = this.hora + ":"+this.minuto +":"+ this.segundo +  "AM";
		}
		    
		return texto;
	}
	
	
}
