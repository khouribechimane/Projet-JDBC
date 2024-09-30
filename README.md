# Travail a rendre: Suivi des Scripts des Développeurs

## Description
Ce projet consiste à suivre la réalisation des scripts des développeurs d’un projet. Un rapport hebdomadaire est effectué par le chef de projet, qui relève chaque jour le nombre de scripts réalisés par les différents développeurs. Les informations sont stockées dans une base de données MySQL, et l’application utilise JDBC pour interagir avec la base.

## Structure de la Base de Données
- **Table :** ScriptsRéalisés
- **Colonnes :**
  - `Developpeur` (VARCHAR)
  - `Jour` (VARCHAR)
  - `NBScripts` (INT)

### Exemple de Données :
| Développeur | Jour    | NBScripts |
|-------------|---------|-----------|
| ALAMI       | Lundi   | 1         |
| WAFI        | Lundi   | 2         |
| SALAMI      | Mardi   | 9         |
| SAFI        | Mardi   | 2         |
| ALAMI       | Mardi   | 2         |
| SEBIHI      | Mercredi| 2         |
| WAFI        | Jeudi   | 3         |
| ALAOUI      | Vendredi| 9         |
| WAFI        | Vendredi| 3         |
| SEBIHI      | Vendredi| 4         |

## Technologies Utilisées
- **Langage :** Java
- **Base de Données :** MySQL
- **JDBC :** Pour l’interaction avec la base de données

## Prérequis
- Avoir MySQL installé et configuré
- Télécharger et ajouter le driver JDBC MySQL dans le classpath 

## Instructions pour l’Exécution
1. Cloner le dépôt depuis GitHub.
2. Créer la base de données et la table en utilisant la structure fournie dans le fichier SQL.
3. Modifier les informations de connexion à la base de données dans le fichier Java (`URL`, `username`, `password`).
4. Compiler et exécuter le programme Java pour interagir avec la base de données et suivre les scripts réalisés par les développeurs.

## Video Demonstratif 
https://github.com/user-attachments/assets/4c56395b-41ab-4df5-828b-5e31738440e1


# TP JDBC - Gestion des Villes

## Description
Ce TP consiste à créer une application Java qui permet de gérer des informations sur des villes à l'aide de JDBC et MySQL. Les fonctionnalités incluent l'ajout, la modification, la suppression et l'affichage des villes. Les villes sont stockées dans une base de données MySQL et chaque ville possède un identifiant unique ainsi qu'un nom.

## Structure de la Base de Données
- **Table :** `Villes`
- **Colonnes :**
  - `id` (INT, clé primaire) : Identifiant unique de la ville
  - `nom` (VARCHAR) : Nom de la ville

### Exemples de Données :
| id  | nom        |
|-----|------------|
| 1   | SAFI       |
| 2   | MARRAKECH  |
| 3   | EL JADIDA  |

Ces données représentent quelques villes de la base, et l'application gère dynamiquement l'ajout, la mise à jour et la suppression des enregistrements.

## Technologies Utilisées
- **Langage :** Java
- **Base de Données :** MySQL
- **JDBC :** Pour interagir avec la base de données

## Prérequis
- **MySQL** : Assurez-vous que MySQL est installé et configuré.
- **Driver JDBC MySQL** : Téléchargez et ajoutez le driver JDBC pour MySQL dans votre classpath
## Video demonstrative 
Voici une vidéo qui montre le fonctionnement de mon projet.
https://github.com/user-attachments/assets/6c0e625d-e54c-470c-9229-68aff8bb22fa
(./media/TP-JDBC.mp4)




