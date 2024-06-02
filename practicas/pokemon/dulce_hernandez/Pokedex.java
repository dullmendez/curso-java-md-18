package practicas.pokemon.dulce_hernandez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego ponyta = new PokemonFuego("ponyta", 8.5, 50, 5);
        PokemonAgua horsea = new PokemonAgua("horsea", 8.0, 40, 7);
        PokemonElectrico raichu = new PokemonElectrico("raichu", 9.0, 80, 6);
        PokemonPsiquico alakazam = new PokemonPsiquico("alakazam", 10, 70, 5);

        ponyta.atacar();
        horsea.atacar();
        raichu.atacar();
        alakazam.atacar();

        //Quiero saber la edad y peso de mis pikachus

        System.out.println("Edad de mi Ponyta: " + ponyta.getEdad());
        System.out.println("Peso de mi Horsea: " + horsea.getPeso());
        System.out.println("Nivel de mi Raichu: " + raichu.getNivel());
        System.out.println("Peso de mi Alakazam: " + alakazam.getPeso());
    }
}
