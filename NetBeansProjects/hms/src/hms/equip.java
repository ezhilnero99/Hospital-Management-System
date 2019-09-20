/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author ezhilnero
 */
public class equip {
    int id;
    String name;
    int pdate;
    int sdate;

    public equip(int id, String name, int pdate, int sdate) {
        this.id = id;
        this.name = name;
        this.pdate = pdate;
        this.sdate = sdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPdate() {
        return pdate;
    }

    public void setPdate(int pdate) {
        this.pdate = pdate;
    }

    public int getSdate() {
        return sdate;
    }

    public void setSdate(int sdate) {
        this.sdate = sdate;
    }
    
    
}
