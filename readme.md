[![Build Status](https://travis-ci.org/Raouf25/rest-service.svg?branch=master)](https://travis-ci.org/Raouf25/rest-service)
[![codecov](https://codecov.io/gh/Raouf25/rest-service/branch/master/graph/badge.svg)](https://codecov.io/gh/Raouf25/rest-service)
[![codecov](https://sonarcloud.io/api/project_badges/measure?project=com.raouf%3Araouf-backend&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.raouf%3Araouf-backend)

# Documentation technique Backend


## Base de données

### Création de la base de données

La base de données doit être créée sur l'environnement cible via ces commandes : 

```sql
CREATE USER raouf WITH PASSWORD 'raouf';
```

```sql
CREATE DATABASE raouf WITH OWNER = raouf ENCODING = 'UTF8' TABLESPACE = pg_default CONNECTION LIMIT = -1;
```
ou (selon l'environnement)
```sql
CREATE DATABASE raouf WITH OWNER = raouf ENCODING = 'UTF8' TABLESPACE = pg_default LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8' CONNECTION LIMIT = -1;
```

# Accéder aux endpoints afin de les tester

L'application expose la documentation des apis, **testables** à la racine de l'application :

 `http://[host:port]/` (ex en local : `http://localhost:8080/`)
 
 L'API est éxposée sur internet : https://raouf-restful-services.herokuapp.com/swagger-ui.html
 
 Une collection Postman est disponible ici : https://www.getpostman.com/collections/e538be4d3d5f986ddbea

 

### Configuration de application-[profile].properties:

* `application.properties` contient les clés de configuration keycloak communes (**cross-environnement**)
* les autres configurations (secret, customisation pour test, etc) doivent être définies dans des fichiers activés par **profile** spring

### Sécurisation des endpoints d'api :

Les endpoints exposés par le backend Vitodoc sont sécurisés grace à Spring Security. La classe `RaoufSecurityConfiguration`
permet de sécuriser ces endpoints.

<!-- # Développement avec Stripe
Pour pouvoir travailler sur le module de paiement, il faut avoir un compte "Développeur" sur Stripe, en étant rattaché à l'application Vitodoc.

Pour que Stripe puisse accéder à ton application et que tu puisses bénéficier des webhooks, il faut exposer ton application locale sur l'internet mondial !

## Exposer ton application grace à ngrok
Il te suffit d'utiliser [ngrok](https://ngrok.com/), qui permet de créer un tunnel sécurisé vers ton poste.
Télécharge ngrok et de exécute le avec la commande `ngrok http 8080` (cf. https://ngrok.com/docs#expose)

## Paramétrer le webhook sur Stripe
Rajoute ensuite l'url de ton webhook à cette URL (en ayant bien pris le soin de passer en mode "Test") : https://dashboard.stripe.com/account/webhooks

Récupère enfin le secret de ton webhook (qui permet à l'application de vérifier que l'expéditeur de la requête est bien Stripe) en cliquant sur "Click to reveal", et mets le dans la propriété `stripe.endpoint.secret` de ton fichier de propriété personnel.



Spring Boots REST Controller Guide
Build: mvn clean package Run: mvn spring-boot:run or java -jar target/gs-rest-service-complete-scala.jar Browse: http://localhost:8080/greeting?name=World
-->