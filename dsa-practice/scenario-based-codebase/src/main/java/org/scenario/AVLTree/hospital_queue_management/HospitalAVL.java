package org.scenario.AVLTree.hospital_queue_management;

public class HospitalAVL
{
    public PatientNode rootNode;

    public int getHeight(PatientNode node)
    {
        return node == null ? 0 : node.height;
    }

    public int max(int a, int b)
    {
        return a > b ? a : b;
    }

    public int balanceFactor(PatientNode node)
    {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    public PatientNode rotateRight(PatientNode node)
    {
        PatientNode leftChild = node.left;
        PatientNode leftRight = leftChild.right;

        leftChild.right = node;
        node.left = leftRight;

        node.height = max(getHeight(node.left), getHeight(node.right)) + 1;
        leftChild.height = max(getHeight(leftChild.left), getHeight(leftChild.right)) + 1;

        return leftChild;
    }

    public PatientNode rotateLeft(PatientNode node)
    {
        PatientNode rightChild = node.right;
        PatientNode rightLeft = rightChild.left;

        rightChild.left = node;
        node.right = rightLeft;

        node.height = max(getHeight(node.left), getHeight(node.right)) + 1;
        rightChild.height = max(getHeight(rightChild.left), getHeight(rightChild.right)) + 1;

        return rightChild;
    }

    public PatientNode addPatient(PatientNode node, int checkInTime, String patientName)
    {
        if (node == null)
            return new PatientNode(checkInTime, patientName);

        if (checkInTime < node.checkInTime)
            node.left = addPatient(node.left, checkInTime, patientName);
        else
            node.right = addPatient(node.right, checkInTime, patientName);

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));

        int balance = balanceFactor(node);

        if (balance > 1 && checkInTime < node.left.checkInTime)
            return rotateRight(node);

        if (balance < -1 && checkInTime > node.right.checkInTime)
            return rotateLeft(node);

        if (balance > 1 && checkInTime > node.left.checkInTime)
        {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && checkInTime < node.right.checkInTime)
        {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public PatientNode minNode(PatientNode node)
    {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public PatientNode removeByTime(PatientNode node, int checkInTime)
    {
        if (node == null)
            return null;

        if (checkInTime < node.checkInTime)
            node.left = removeByTime(node.left, checkInTime);
        else if (checkInTime > node.checkInTime)
            node.right = removeByTime(node.right, checkInTime);
        else
        {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else
            {
                PatientNode nextNode = minNode(node.right);
                node.checkInTime = nextNode.checkInTime;
                node.patientName = nextNode.patientName;
                node.right = removeByTime(node.right, nextNode.checkInTime);
            }
        }

        if (node == null)
            return null;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        int balance = balanceFactor(node);

        if (balance > 1 && balanceFactor(node.left) >= 0)
            return rotateRight(node);

        if (balance > 1 && balanceFactor(node.left) < 0)
        {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && balanceFactor(node.right) <= 0)
            return rotateLeft(node);

        if (balance < -1 && balanceFactor(node.right) > 0)
        {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void printByTime(PatientNode node)
    {
        if (node != null)
        {
            printByTime(node.left);
            System.out.println(node.checkInTime + " -> " + node.patientName);
            printByTime(node.right);
        }
    }
}
