// School Bus Attendance System , Track 10 students's presence.
class SchoolBusAttendance{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int present = 0;
        int absent = 0;
        String[] name = {"krishna", "Rudra", "Vansh", "Akash", "vivek", "muskan", "sanya", "Rudresh", "Vishal", "Palak"};
        for (String n : name){
            System.out.print(name + " Present or Absent? ");
            String attendance = sc.nextLine().trim().toLowerCase();
            if (attendance.equals("present")){
                present++;
            }else{
                absent++;
            }
        }
        System.out.println("Present : "+ present +" Absent : "+absent);
    }
}