public class main_account1 {
    public static void main(String[] args){
        account1 acc = new account1("KH1234",700000);
        
    System.out.println("Thông tin ban đầu: ");
    acc.hienthisotien();

    acc.setsotien(3600);

    System.out.println("Thông tin sau khi thay đổi là:");
    acc.hienthisotien();
    }
}