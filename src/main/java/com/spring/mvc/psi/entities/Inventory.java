package com.spring.mvc.psi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "INVENTORY")
public class Inventory {

    @Id
    private Integer id;
    @Column
    private String name;
    @Column(name = "image", columnDefinition = "clob")
    private String image;
    @Column(name = "PU_QTY")
    private Integer puQty;
    @Column(name = "PU_Total")
    private Integer puTotal;
    @Column(name = "SA_QTY")
    private Integer saQty;
    @Column(name = "SA_Total")
    private Integer saTotal;

    public Integer getPuTotal() {
        return puTotal;
    }

    public void setPuTotal(Integer puTotal) {
        this.puTotal = puTotal;
    }

    public Integer getSaTotal() {
        return saTotal;
    }

    public void setSaTotal(Integer saTotal) {
        this.saTotal = saTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPuQty() {
        return puQty;
    }

    public void setPuQty(Integer puQty) {
        this.puQty = puQty;
    }

    public Integer getSaQty() {
        return saQty;
    }

    public void setSaQty(Integer saQty) {
        this.saQty = saQty;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Inventory{" + "id=" + id + ", name=" + name + ", puQty=" + puQty + ", puTotal=" + puTotal + ", saQty=" + saQty + ", saTotal=" + saTotal + '}';
    }


}
