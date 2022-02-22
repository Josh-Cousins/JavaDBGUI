/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadb;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Josh
 */
@Entity
@Table(name = "MANUFACTURERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manufacturers.findAll", query = "SELECT m FROM Manufacturers m")
    , @NamedQuery(name = "Manufacturers.findByManid", query = "SELECT m FROM Manufacturers m WHERE m.manid = :manid")
    , @NamedQuery(name = "Manufacturers.findByManname", query = "SELECT m FROM Manufacturers m WHERE m.manname = :manname")})
public class Manufacturers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MANID")
    private Integer manid;
    @Column(name = "MANNAME")
    private String manname;
    @OneToMany(mappedBy = "manid")
    private Collection<Products> productsCollection;

    public Manufacturers() {
    }

    public Manufacturers(Integer manid) {
        this.manid = manid;
    }

    public Integer getManid() {
        return manid;
    }

    public void setManid(Integer manid) {
        Integer oldManid = this.manid;
        this.manid = manid;
        changeSupport.firePropertyChange("manid", oldManid, manid);
    }

    public String getManname() {
        return manname;
    }

    public void setManname(String manname) {
        String oldManname = this.manname;
        this.manname = manname;
        changeSupport.firePropertyChange("manname", oldManname, manname);
    }

    @XmlTransient
    public Collection<Products> getProductsCollection() {
        return productsCollection;
    }

    public void setProductsCollection(Collection<Products> productsCollection) {
        this.productsCollection = productsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manid != null ? manid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manufacturers)) {
            return false;
        }
        Manufacturers other = (Manufacturers) object;
        if ((this.manid == null && other.manid != null) || (this.manid != null && !this.manid.equals(other.manid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return manname;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
