package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {		//Constructor
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca mar) {
		marca=mar;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control cntrl) {
		control=cntrl;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int p) {
		precio=p;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		volumen=vol;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int chan) {
		if (chan>=1 && chan<=120 && estado==true) {
			canal=chan;
		}
	}
	
	public static int getnumTV() {				//Para acceder al atributo de clase numTV
		return numTV;
	}
	
	public void turnOn() {				//Apagar y prender televisor
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {		//devolver el estado
		return estado;
	}
	
	public void canalUp() {					//Subir y bajar canal
		if (canal<120 && estado==true) {		//tiene que estar prendido y maximo 120 canales
			canal++;
		}
	}
	public void canalDown() {
		if (canal>1 && estado==true) {			//minimo canal el 1
			canal--;
		}
	}

	public void volumenUp() {					//Subir y bajar volumen
		if (volumen<7 && estado==true) {		//volumen máximo el 7
			volumen++;
		}
	}
	public void volumenDown() {
		if (volumen>0 && estado==true) {		//volumen minimo 0
			volumen--;
		}
	}
}
