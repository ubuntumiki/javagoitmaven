package core.com.module_06;

class Database {
    public Database() {

    }

    {
        System.out.println("Init connection");
    }
}

class DatabaseTest {
    public static void main(String[] main) {
        new Database();
        new Database();
    }
}
