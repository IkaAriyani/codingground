public class Tugas10{
    
	public static void main(String[] args){
		BiodataTugas10 b = new BiodataTugas10();

		b.setNama("Ika Ariyani");
		b.setUmur(20);
		b.setAlamat("Pengkol Jepara");

		String namaPrint = b.getNama();
		int umurPrint = b.getUmur();
		String alamatPrint = b.getAlamat();

		System.out.println("Nama : " + namaPrint + "\nAlamat : " + alamatPrint + "\nUmur : " + umurPrint);
	}
}