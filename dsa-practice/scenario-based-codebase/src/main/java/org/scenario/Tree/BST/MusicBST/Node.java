package org.scenario.Tree.BST.MusicBST;

public class Node {
	int trackId;
	String title;
	String artist;
	Node left, right;
	
	Node(int trackId, String title, String artist){
		this.title = title;
		this.trackId = trackId;
		this.artist = artist;
		this.left = null;
		this.right = null;
	}

}
