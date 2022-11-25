public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){

    System.out.println("Musteri eklendi");
    //DatabaseLogger databaseLogger=new DatabaseLogger();
    //databaseLogger.Log("Log mesajı");

        this.baseLogger.log("Log mesajı");
}
}
