package INF121_1;

public class Main {

	public static void main(String[] args) {
		Punto p = new Punto(3, 4);
        System.out.println("Coordenadas Cartesianas: " + p.coord_cartesianas());
        System.out.println("Coordenadas Polares: " + p.coord_polares());
        System.out.println("Representación toString: " + p.toString());

	}

}
