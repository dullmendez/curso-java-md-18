package practicas.pokemon.dulce_hernandez;

interface TipoPokemon {
String getTipoPokemon();
}

class Pokemon{
    //nombre
    //peso
    //nivel
    //edad
    //tipo

    private String nombre;
    private double peso;
    private int nivel;
    private int edad;

    public Pokemon(String nombre, double peso, int nivel, int edad){
        this.nombre = nombre;
        this.peso = peso;
        this.nivel = nivel;
        this.edad = edad;

    }

    public void atacar(){
        System.out.println(nombre + "está atacando!! xD");
    }
    public String getNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }
    public int getNivel() {
        return nivel;
    }
    public int getEdad() {
        return edad;
    }
}
