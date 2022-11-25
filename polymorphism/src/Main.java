public class Main {
    public static void main(String[] args) {

/*
        EmailLogger emailLogger=new EmailLogger();
        DatabaseLogger databaseLogger=new DatabaseLogger();
        FileLogger fileLogger=new FileLogger();


        emailLogger.Log("Email log mesajı");
        databaseLogger.Log("database log mesajı");
        fileLogger.Log("File log mesajı");


      BaseLogger[] baseLoggers=new BaseLogger[]{new ConsoleLogger(),new FileLogger(),new DatabaseLogger(),new EmailLogger()};


        for(BaseLogger logger:baseLoggers){

            System.out.println(logger.Log("Loglandı");

*/
        CustomerManager customerManager=new CustomerManager(new ConsoleLogger());
        CustomerManager customerManager1=new CustomerManager(new EmailLogger());
        CustomerManager customerManager2=new CustomerManager(new FileLogger());
        CustomerManager customerManager3=new CustomerManager(new DatabaseLogger());

        customerManager.add();
        customerManager1.add();
        customerManager2.add();
        customerManager3.add();




    }
}
