package com.Record;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by PC on 13/02/2017.
 */

public class TipRecord {


   private double bill;
   private int TipPorcentaje;
   private Date timestamp;

    public double getBill() {

        return bill *(getTipPorcentaje()*100d);
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPorcentaje() {
        return TipPorcentaje;
    }

    public void setTipPorcentaje(int tipPorcentaje) {
        TipPorcentaje = tipPorcentaje;
    }

    public Date getTimestamp() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MMM dd,yyyy");
        simpleDateFormat.format(timestamp);
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
