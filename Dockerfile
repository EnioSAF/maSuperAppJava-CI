# Étape 1 : Utilise une image Java JRE
FROM eclipse-temurin:17-jre

# Étape 2 : Crée un dossier de travail
WORKDIR /app

# Étape 3 : Copie le fichier JAR généré par Maven dans le conteneur
COPY target/maSuperAppJava-1.0-SNAPSHOT.jar app.jar

# Étape 4 : Définis la commande à exécuter dans le conteneur
ENTRYPOINT ["java", "-cp", "app.jar", "com.maventdd.app.App"]

# Trigger Build