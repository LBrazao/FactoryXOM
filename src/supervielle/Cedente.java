package supervielle;

import java.util.Vector;



public class Cedente {
	
	protected ilog.rules.xml.types.IlrDate fechaPlafond;
	protected Double limiteLinea;
	protected Double saldoLinea;
	protected Double limitePlafond;
	protected Double saldoPlafond;
	protected Vector<Cheque> cheque;
	protected CodigoDescripcion segmento;
	protected CodigoDescripcion cartera;
	

	public ilog.rules.xml.types.IlrDate getFechaPlafond() {
		return fechaPlafond;
	}
	public void setFechaPlafond(ilog.rules.xml.types.IlrDate fechaPlafond) {
		this.fechaPlafond = fechaPlafond;
	}
	public Double getLimiteLinea() {
		return limiteLinea;
	}
	public void setLimiteLinea(Double limiteLinea) {
		this.limiteLinea = limiteLinea;
	}
	public Double getLimitePlafond() {
		return limitePlafond;
	}
	public void setLimitePlafond(Double limitePlafond) {
		this.limitePlafond = limitePlafond;
	}

	public Vector<Cheque> getCheque() {
		return cheque;
	}
	public void setCheque(Vector<Cheque> cheque) {
		this.cheque = cheque;
	}
	public CodigoDescripcion getSegmento() {
		return segmento;
	}
	public void setSegmento(CodigoDescripcion segmento) {
		this.segmento = segmento;
	}
	public CodigoDescripcion getCartera() {
		return cartera;
	}
	public void setCartera(CodigoDescripcion cartera) {
		this.cartera = cartera;
	}
	public Double getSaldoLinea() {
		return saldoLinea;
	}
	public void setSaldoLinea(Double saldoLinea) {
		this.saldoLinea = saldoLinea;
	}
	public Double getSaldoPlafond() {
		return saldoPlafond;
	}
	public void setSaldoPlafond(Double saldoPlafond) {
		this.saldoPlafond = saldoPlafond;
	}
}
