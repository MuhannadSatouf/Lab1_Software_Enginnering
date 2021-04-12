public class DataBase {

    private DBInterface dbInterface;

    public void SetDataBase(DBInterface dbInterface) {
        this.dbInterface = dbInterface;
    }

    public boolean connect(String address, String userName, String password) {
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        System.out.println("We testing if the connection to the database went successfully ");
        System.out.println("It connected successfully");
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        return false;
    }


    public void disconnect() {
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        System.out.println("We testing the method disconnection from the database");
        System.out.println("The connection is disconnected successfully");
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
    }


    public boolean isConnected() {
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        System.out.println("We testing that the connection is disconnected");
        System.out.println("The Connection is disconnected");
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        return false;
    }


    public String getName(int id) {
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        System.out.println("We return the Name");
        System.out.println("This method will return null");
        System.out.println("---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        return null;
    }
}
