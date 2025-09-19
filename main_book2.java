public class main_book2 {
    public static void main(String[] args){
        book2 book = new book2 ("DNU01","Lập trình",60000,10000);

        System.out.println("Thông tin quyển sách là:");
        book.hienthithontinsach();

        System.out.println("Giá bán của quyển sách là: "+ book.tinhgiaban());

        book.setgiamgia(1000);

        System.out.println("Thông tin của quyền sách sau khi thay đổi là: ");
        book.hienthithontinsach();
        System.out.println("Giá bán của quyền sách sau khi thay đổi là: " + book.tinhgiaban());
    }
}