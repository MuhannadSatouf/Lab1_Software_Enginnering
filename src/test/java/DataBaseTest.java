import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class DataBaseTest {
    private DataBase dataBase;
    private DBInterface dataBaseInterface;
    private String address;
    private String userName;
    private String password;
    private int id;

    @Before
    public void setUp() {
        dataBase = new DataBase();
        dataBaseInterface = mock(DBInterface.class);
        dataBase.SetDataBase(dataBaseInterface);
    }

    @Test
    public void connect() {
        dataBase.connect(address, userName, password);
    }

    @Test
    public void disconnect() {
        dataBase.disconnect();
    }

    @Test
    public void isConnected() {
        dataBase.isConnected();
    }

    @Test
    public void getName() {
        dataBase.getName(id);
    }
}