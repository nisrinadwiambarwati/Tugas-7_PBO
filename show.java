 interface Mahasiswa {

	public void namaMhs();
	int stb();
}

interface namaMK{
	String mk();
}

 interface MataKuliah extends Mahasiswa, namaMK{

}

 class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa adalah Nisrina");
		
	}

	@Override
	public int stb() {
		return 97;
	}
	
	@Override
	public String mk() {
		return "PBO";
	}
	
}

 class show {
	
	public static void main (String[] args) {
		Data d = new Data();
		
		d.namaMhs();
		d.stb();
		d.mk();
		
		System.out.println("Stambuk = " + d.stb());
		System.out.println("Mata kuliah = " + d.mk());
	}
}
