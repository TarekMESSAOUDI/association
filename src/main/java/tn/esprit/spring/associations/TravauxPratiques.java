package tn.esprit.spring.associations;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP")
public class TravauxPratiques implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="TP_ID")
Long tpId;
@Column(name="TP_SUJET")
String tpSujet;
@Column(name="TP_DUREE")
Long tpDuree;
@ManyToMany(mappedBy="formationTps", cascade = CascadeType.ALL)
private Set<Formation> formations;




public Long getTpId() {
	return tpId;
}
public void setTpId(Long tpId) {
	this.tpId = tpId;
}
public String getTpSujet() {
	return tpSujet;
}
public void setTpSujet(String tpSujet) {
	this.tpSujet = tpSujet;
}
public Long getTpDuree() {
	return tpDuree;
}
public void setTpDuree(Long tpDuree) {
	this.tpDuree = tpDuree;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public Set<Formation> getFormations() {
	return formations;
}
public void setFormations(Set<Formation> formations) {
	this.formations = formations;
} 

}
