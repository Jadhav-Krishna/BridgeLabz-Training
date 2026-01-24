package org.scenario.Tree.BST.MusicBST;

public class Main {
    public static void main(String[] args) {

        Node root = null;

        root = MusicBST.insert(root, 101, "Believer", "Imagine Dragons");
        root = MusicBST.insert(root, 102, "Shape of You", "Ed Sheeran");
        root = MusicBST.insert(root, 103, "Closer", "The Chainsmokers");
        root = MusicBST.insert(root, 104, "Alone", "Alan Walker");
        root = MusicBST.insert(root, 105, "Sajni", "Arijit Singh");
        root = MusicBST.insert(root, 106, "Despacito", "Luis Fonsi");

        System.out.println(" Playlist (Alphabetical Order by Song Title):");
        MusicBST.inorder(root);

        System.out.println("\n Searching Track ID 105:");
        Node found = MusicBST.searchById(root, 105);
        if (found != null) {
            System.out.println("Found -> " + found.title + " by " + found.artist);
        }
        else {
            System.out.println("Track not found");
        }
    }
}
