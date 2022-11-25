public class Main {
    public static void main(String[] args) {


        ICustomerDal customerDal=new OracleCustomerDal();
        ICustomerDal customerDal1=new MySqlCustomerDal();
        ICustomerDal customerDal2=new SqlServerCustomerDal();
        customerDal.add();
        customerDal1.add();
        customerDal2.add();

        //CustomerManager customerManager=new CustomerManager();
        //customerManager.customerDal=new MySqlCustomerDal();
        //customerManager.add();
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();


    }
}