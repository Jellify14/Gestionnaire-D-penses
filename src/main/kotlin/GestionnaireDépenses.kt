package org.example

import java.util.Scanner


class GestionnaireDépenses(name: String = "Gestionnaire", ammount : Double = 0.0) {

    private val name : String = name
    private var ammount : Double = ammount

    fun activer(): Any {
        val scanner = Scanner(System.`in`)
        var continuer = true

        while (continuer) {
            println("\n$name- Menu principal")
            println("1. Connaître le montant")
            println("2. Payer")
            println("3. Quitter")

            when (scanner.nextLine()) {
                //if -> throw
                "1" -> return this.getAmmount()
                "2" -> return this.payer()
                "3" -> {
                    println("Fermeture du gestionnaire de $name.")
                    continuer = false
                }

                else -> println("Ce chiffre ne correspond à aucune action. Veuillez entrez une valeur valide :")
            }
        }
    }


    fun getAmmount(): String {
        return "Il y a ${this.ammount} euros sur le Gestionnaire de $name."
    }

    fun payAmmount(){

        var continuer = true
        val scanner = Scanner(System.`in`)

        while (continuer) {
            print("Combien d'argent avez vous dépenser ?")

            when (scanner.nextLine()) {
                //if -> throw
                readLine()

                println("${readLine()}")
            }
        }
    }

}