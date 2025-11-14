public class BookSheet {
    static int total_Sheet = 100;

    void BookSheetMethod(int sheetRequired) {
        if (total_Sheet >= sheetRequired) {

            System.out.println("seat comformed");
            total_Sheet = total_Sheet - sheetRequired;
            System.out.println("sheets left:" + total_Sheet);

        } else {
            System.out.println("seats not available");

        }
    }
}

class MBApp extends Thread {
    BookSheet b;
    static int sheet1;

    public void run() {
        b.BookSheetMethod(sheet1);

    }

    public static void main(String[] args) {
        BookSheet b = new BookSheet();
        MBApp.sheet1 = 70;
        MBApp t1 = new MBApp();
        t1.b = b;
        t1.start();
    }

}
