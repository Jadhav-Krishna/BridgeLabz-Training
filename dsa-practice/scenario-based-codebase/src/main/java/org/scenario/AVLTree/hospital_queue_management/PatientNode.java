package org.scenario.AVLTree.hospital_queue_management;

public class PatientNode
{
    public int checkInTime;
    public String patientName;
    public int height;
    public PatientNode left;
    public PatientNode right;

    public PatientNode(int checkInTime, String patientName)
    {
        this.checkInTime = checkInTime;
        this.patientName = patientName;
        this.height = 1;
    }
}
