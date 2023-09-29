package tn.enis.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
@Getter @Setter
@NoArgsConstructor
@Entity
public class Etudiant extends Member {
	@NonNull @Temporal(TemporalType.DATE)
	private Date dateInscription;
	@NonNull
	private String diplome;

}
