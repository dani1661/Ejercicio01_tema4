
public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actividad1 programa=new Actividad1 ();
		programa.inicio();
		}
		public void inicio() {
			tablas();
		}
		
		public void tablas() {
			for (int i=1;i<=10;i++) {
				for (int j = 0; j <=10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println();
		}
	}

}
