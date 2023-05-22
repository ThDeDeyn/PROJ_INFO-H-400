/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulb.infoh400.project.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adrien Foucart
 */
@Entity
@Table(name = "note")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Note.findAll", query = "SELECT n FROM Note n"),
    @NamedQuery(name = "Note.findByIdnote", query = "SELECT n FROM Note n WHERE n.idnote = :idnote"),
    @NamedQuery(name = "Note.findByDateadded", query = "SELECT n FROM Note n WHERE n.dateadded = :dateadded")})
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnote")
    private Integer idnote;
    @Basic(optional = false)
    @Column(name = "dateadded")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateadded;
    @Lob
    @Column(name = "content")
    private String content;
    @JoinColumn(name = "idappointment", referencedColumnName = "idappointment")
    @ManyToOne
    private Appointment idappointment;
    private Integer patientkey; 
    private Integer dockey; 
    public Note() {
    }

    public Note(Integer idnote) {
        this.idnote = idnote;
    }

    public Note(Integer idnote, Date dateadded) {
        this.idnote = idnote;
        this.dateadded = dateadded;
    }
    
    public Integer getPatientKey(){ return patientkey;}
    public Integer getDoctorKey(){ return dockey;}
    
    public void setDoctorKey(Integer DK){ this.dockey = DK;}
    public void setPatientKey(Integer PK){ this.patientkey = PK;}
    
    public Integer getIdnote() {
        return idnote;
    }

    public void setIdnote(Integer idnote) {
        this.idnote = idnote;
    }
    

    public Date getDateadded() {
        return dateadded;
    }

    public void setDateadded(Date dateadded) {
        this.dateadded = dateadded;
    }

    public String getContent() {
        return content;
    }
    public String getMessage() {
        return content.substring(3,content.length()-2);
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Appointment getIdappointment() {
        return idappointment;
    }

    public void setIdappointment(Appointment idappointment) {
        this.idappointment = idappointment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnote != null ? idnote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.idnote == null && other.idnote != null) || (this.idnote != null && !this.idnote.equals(other.idnote))) {
            return false;
        }
        return true;
    }
    public String getType(){
        System.out.println(content.charAt(0));
        System.out.println('0');
        
        if((content.charAt(0)) == '0'){
            return "presc";
        }
        
        return "msg";
    } 

    @Override
    public String toString() {
        String str = "Note : " + idnote + " (" + dateadded + ")";
        return str; 
    }
    public List<String> toStrings(){

        String str = content; 
        Integer firstSeparatorIndex = str.indexOf("||");
        Integer secondSeparatorIndex = str.indexOf("||", firstSeparatorIndex + 1);
        String str1 = str.substring(firstSeparatorIndex + 2, secondSeparatorIndex);

        Integer thirdSeparatorIndex = str.indexOf("||", secondSeparatorIndex + 1);
        String str2 = str.substring(secondSeparatorIndex + 2, thirdSeparatorIndex);

        Integer fourthSeparatorIndex = str.indexOf("&&", thirdSeparatorIndex + 1);
        String str3 = (str.substring(thirdSeparatorIndex + 2, fourthSeparatorIndex));
       
        List<String> L = Arrays.asList(str1, str2, str3);
        return  ( L ); 
        
    }
    
}
