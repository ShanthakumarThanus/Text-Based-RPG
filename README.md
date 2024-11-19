# **Text-Based RPG**

## **Description**
Ce RPG basé sur du texte est un jeu de rôle textuel où le joueur explore un donjon rempli de monstres, d'obstacles, et d'opportunités pour améliorer son équipement. Le joueur doit gérer ses ressources, combattre des ennemis, détruire des obstacles et survivre jusqu'à atteindre la sortie du donjon.

---

## **Fonctionnalités**
- **Exploration :** Le joueur se déplace sur une carte 5x5 en évitant les obstacles et en affrontant des monstres.
- **Combat :** Des affrontements stratégiques avec des monstres où le joueur utilise ses armes pour infliger des dégâts.
- **Boutique :** Achetez des armes pour améliorer vos dégâts en dépensant de l'or.
- **Système d'XP :** Gagnez de l'expérience en tuant des monstres pour progresser dans le jeu.
- **Gestion des obstacles :** Détruisez ou évitez les obstacles pour progresser.

---

## **Prérequis**
- **Java 8** ou version supérieure.
- Un IDE compatible avec Java (par exemple, IntelliJ IDEA, Eclipse) ou une configuration de ligne de commande.

---

## **Installation**
1. Clonez le dépôt sur votre machine :
   ```bash
   git clone https://github.com/votre-utilisateur/rpg-dungeon-adventure.git
2. Ouvrez le projet dans votre IDE ou exécutez-le via la ligne de commande.
3. Compilez et lancez le projet.

## **Structure du Projet**

Voici les principales classes et leurs responsabilités :
    
 - **Personnage :** Représente le joueur, gérant ses statistiques (points de vie, armes, or, etc.).
 - **Weapon :** Définit les armes disponibles dans le jeu, leurs dégâts et leurs prix.
 - **Monster :** Représente les ennemis que le joueur rencontre, avec des points de vie, un nom et une récompense en XP.
 - **Obstacle :** Définit les obstacles sur la carte et leur destruction.
 - **Carte :** Gère la carte du donjon, le positionnement des monstres et des obstacles, ainsi que les déplacements du joueur.
 - **Combat :** Système de combat entre le joueur et un monstre.
 - **WeaponStore :** Boutique où le joueur peut acheter des armes.

## **Comment Jouer**

    Lancer le jeu : Une fois le projet démarré, suivez les instructions affichées dans la console.
    Commandes principales :
        Déplacez le joueur à l'aide des touches :
            z (haut), s (bas), q (gauche), d (droite).
        Interagissez avec les obstacles ou les monstres lorsque vous les rencontrez.
        Utilisez l'or pour acheter des armes et améliorer vos capacités.
    Objectif final : Atteignez la sortie du donjon à la position [4,4].
