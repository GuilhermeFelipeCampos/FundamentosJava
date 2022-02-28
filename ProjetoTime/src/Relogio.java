import java.util.Scanner;
public class Relogio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Time tm = new Time();
		int h, m,  s;
		System.out.println("Insira um horário:");
		
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		
		tm.setTime(h,m,s);
		
		System.out.println(tm.exibirHoraUniversal());
		System.out.println(tm.exibirHoraPadrao());
	}

}
