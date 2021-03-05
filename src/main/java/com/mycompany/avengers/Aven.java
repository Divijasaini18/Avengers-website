/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avengers;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HNC
 */
@Entity
@Table(name = "AVEN")
@NamedQueries({
    @NamedQuery(name = "Aven.findAll", query = "SELECT a FROM Aven a"),
    @NamedQuery(name = "Aven.findByName", query = "SELECT a FROM Aven a WHERE a.name = :name"),
    @NamedQuery(name = "Aven.findById", query = "SELECT a FROM Aven a WHERE a.id = :id"),
    @NamedQuery(name = "Aven.findByAvn", query = "SELECT a FROM Aven a WHERE a.avn = :avn")})
public class Aven implements Serializable {

    @Size(max = 20)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "AVN")
    private String avn;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;

    public Aven() {
    }

    public Aven(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aven)) {
            return false;
        }
        Aven other = (Aven) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.avengers.Aven[ id=" + id + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvn() {
        return avn;
    }

    public void setAvn(String avn) {
        this.avn = avn;
    }
    
}
