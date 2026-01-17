package org.scenario.ArtExpo;

public class Main {
    public static void main(String[] args) {
        Artist[] artists = {
            new Artist("Muskan", 10),
            new Artist("harsh", 5),
            new Artist("Shna", 8),
            new Artist("Anuj", 12)
        };
        ArtExpo expo = new ArtExpo();
        expo.insertionSort(artists);
        for (Artist a : artists) {
            System.out.println(a.name + " - " + a.time);
        }
    }
}
