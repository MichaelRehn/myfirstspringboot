package dk.rehn.myfirstspringboot.topic

import javax.persistence.Entity
import javax.persistence.Id


@Entity
data class Topic (@Id val id: String, val name: String, val description: String) {


}