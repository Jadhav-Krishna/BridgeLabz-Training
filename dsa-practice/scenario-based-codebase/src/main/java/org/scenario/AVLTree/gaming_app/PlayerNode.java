package org.scenario.AVLTree.gaming_app;

public class PlayerNode
{
    public int id;
    public String playerName;
    public int score;
    public int height;
    public PlayerNode left;
    public PlayerNode right;

    public PlayerNode(int id, String playerName, int score)
    {
        this.id = id;
        this.playerName = playerName;
        this.score = score;
        this.height = 1;
    }
}
