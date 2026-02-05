package org.scenario.AVLTree.gaming_app;

public class AVLLeaderboard
{
    public PlayerNode rootNode;
    public int printedCount;

    public int getHeight(PlayerNode node)
    {
        if (node == null)
            return 0;
        return node.height;
    }

    public int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    public int balanceFactor(PlayerNode node)
    {
        if (node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    public PlayerNode rotateRight(PlayerNode node)
    {
        PlayerNode leftChild = node.left;
        PlayerNode leftRight = leftChild.right;

        leftChild.right = node;
        node.left = leftRight;

        node.height = max(getHeight(node.left), getHeight(node.right)) + 1;
        leftChild.height = max(getHeight(leftChild.left), getHeight(leftChild.right)) + 1;

        return leftChild;
    }

    public PlayerNode rotateLeft(PlayerNode node)
    {
        PlayerNode rightChild = node.right;
        PlayerNode rightLeft = rightChild.left;

        rightChild.left = node;
        node.right = rightLeft;

        node.height = max(getHeight(node.left), getHeight(node.right)) + 1;
        rightChild.height = max(getHeight(rightChild.left), getHeight(rightChild.right)) + 1;

        return rightChild;
    }

    public PlayerNode addOrUpdate(PlayerNode node, int id, String playerName, int score)
    {
        if (node == null)
            return new PlayerNode(id, playerName, score);

        if (score < node.score)
            node.left = addOrUpdate(node.left, id, playerName, score);
        else if (score > node.score)
            node.right = addOrUpdate(node.right, id, playerName, score);
        else
            return node;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));

        int balance = balanceFactor(node);

        if (balance > 1 && score < node.left.score)
            return rotateRight(node);

        if (balance < -1 && score > node.right.score)
            return rotateLeft(node);

        if (balance > 1 && score > node.left.score)
        {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && score < node.right.score)
        {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public PlayerNode minNode(PlayerNode node)
    {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public PlayerNode removeByScore(PlayerNode root, int score)
    {
        if (root == null)
            return root;

        if (score < root.score)
            root.left = removeByScore(root.left, score);
        else if (score > root.score)
            root.right = removeByScore(root.right, score);
        else
        {
            if (root.left == null || root.right == null)
            {
                PlayerNode child = (root.left != null) ? root.left : root.right;

                if (child == null)
                    root = null;
                else
                    root = child;
            }
            else
            {
                PlayerNode nextNode = minNode(root.right);
                root.score = nextNode.score;
                root.playerName = nextNode.playerName;
                root.id = nextNode.id;
                root.right = removeByScore(root.right, nextNode.score);
            }
        }

        if (root == null)
            return root;

        root.height = max(getHeight(root.left), getHeight(root.right)) + 1;
        int balance = balanceFactor(root);

        if (balance > 1 && balanceFactor(root.left) >= 0)
            return rotateRight(root);

        if (balance > 1 && balanceFactor(root.left) < 0)
        {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }

        if (balance < -1 && balanceFactor(root.right) <= 0)
            return rotateLeft(root);

        if (balance < -1 && balanceFactor(root.right) > 0)
        {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    public void printTop10(PlayerNode node)
    {
        if (node == null || printedCount >= 10)
            return;

        printTop10(node.right);

        if (printedCount < 10)
        {
            System.out.println("Rank " + (printedCount + 1) + " : " + node.playerName + " | Score = " + node.score);
            printedCount++;
        }

        printTop10(node.left);
    }
}
