package personnage

import item.Armes
import item.Armure
import java.security.Principal

class Personnage(
    val nom: String,
    var pointDeVie: Int,
    val pointDeVieMax: Int,
    var attaque: Int,
    var defense: Int,
    var endurance: Int,
    var vitesse: Int,
    var armePrincipal: Armes?,
    var armure: Armure?,
    var inventaire : MutableList = mutableListOf<Armes>()
) {

     fun calculeDefense():Int{
         //TODO Mission 4.2
        return this.defense/2;
     }

     // Méthode pour attaquer un adversaire
     fun attaque(adversaire: Personnage) {
       val degats= this.attaque/2
          if (armePrincipal!=null)
          {
              degat += this!!.armePrincipal.calculDegat()

          }
         adversaire.pointDeVie-=degats
        println("$nom attaque ${adversaire.nom} avec une attaque de base et inflige $degats points de dégâts.")

    }

    override fun toString(): String {
        return "$nom (PV: $pointDeVie/$pointDeVieMax, Attaque: $attaque, Défense: $defense, Endurance: $endurance, Vitesse: $vitesse)"
    }

    fun equipe(arme:arme): {
        if(inventaire.contains(arme)){
            armePrincipal = arme
            println("$nom equipe ${arme.nom}")
        } else {
            println("l'arme${arme.nom} n'est pas dans l'inventaire de $nom")
        }
    }


}
fun main() {
    val perso : Personnage("Arthur")
    val epee : Arme("Epée")
    val hache : Arme("Hache")
}