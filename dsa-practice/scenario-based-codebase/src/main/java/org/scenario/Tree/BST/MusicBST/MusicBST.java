package org.scenario.Tree.BST.MusicBST;

public class MusicBST {
    // Insert student
    static Node insert(Node root, int trackId, String title, String artist) {
        if (root == null) return new Node(trackId, title, artist);
        if (trackId < root.trackId)
            root.left = insert(root.left, trackId, title, artist);
        else if (trackId > root.trackId)
            root.right = insert(root.right, trackId, title, artist);
        return root;
    }
    
//    search
    static Node searchById(Node root, int trackId) {
        if (root == null) return null;
        if (root.trackId == trackId) return root;
        Node leftSearch = searchById(root.left, trackId);
        if (leftSearch != null) return leftSearch;

        return searchById(root.right, trackId);
    }
    
//    Inorder
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("title: " + root.title + " Artist: " + root.artist + " Track ID: " + root.trackId);
            inorder(root.right);
        }
    }
}
