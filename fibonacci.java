public class fibonicci {
    public static void main(String[] args) {
        int n = 13; // Jumlah angka Fibonacci yang cukup besar untuk membentuk pola
        int a = 0, b = 1;

        StringBuilder currentNumber = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < n; i++) {
            currentNumber.append(splitIntoDigits(a)); // Menambahkan angka Fibonacci sebagai digit ke dalam StringBuilder

            if (currentNumber.length() >= counter) {
                System.out.println(currentNumber.substring(0, counter)); // Cetak sesuai jumlah angka yang diinginkan
                currentNumber.delete(0, counter); // Buang digit yang sudah dicetak
                counter++; // Naikkan jumlah digit yang perlu dicetak di baris berikutnya
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }

    // Fungsi untuk memecah angka menjadi digit individu dan mengembalikannya sebagai string
    public static String splitIntoDigits(int num) {
        return String.valueOf(num);
    }
}