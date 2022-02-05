public class Datos {
    
    // Atributos
    private int id;
    private String name;
    private final String DEVELOPER = "apple";
    private int matriz[][] = new int[2][2];

    // Constructor
    public Datos(int id, String name, int matriz[][]) {
        this.id = id;
        this.name = name;
        this.matriz = matriz;
    }

    // Get and Set
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDEVELOPER() {
        return this.DEVELOPER;
    }

    public int[][] getMatriz() {
        return this.matriz;
    }

    public void setMatriz(int matriz[][]) {
        this.matriz = matriz;
    }
}
