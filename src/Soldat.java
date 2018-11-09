
public abstract class Soldat extends Element implements ISoldat, IConfig {

	private int pv,po,pui,tir;

 
	public int getTir() {
		return tir;
	}

	public void setTir(int tir) {
		this.tir = tir;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getPo() {
		return po;
	}

	public void setPo(int po) {
		this.po = po;
	}

	public int getPui() {
		return pui;
	}

	public void setPui(int pui) {
		this.pui = pui;
	}
	
	
}
