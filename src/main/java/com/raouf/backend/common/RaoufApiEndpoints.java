package com.raouf.backend.common;

/**
 * <p>Created by Abderraouf Makhlouf < makhlouf.raouf@gmail.com > on 18/08/2017.</p>
 * <p>
 * <p>
 * Centralise l'ensemble des endpoints disponibles pour les apis RESTS.
 * Utilisée dans
 * <ul>
 * <li>la définition des apis</li>
 * <li>la sécurisation des apis</li>
 * <li>les tests</li>
 * </ul>
 * </p>
 */
public abstract class RaoufApiEndpoints {


    private RaoufApiEndpoints() {
    }

    public static final String ROOT = "/";
    public static final String SWAGGER = "/swagger";
    public static final String SWAGGER_API_DOCS = "/v2/api-docs/**";
    public static final String SWAGGER_WEBJARS = "/webjars/**";
    public static final String SWAGGER_RESOURCES = "/swagger-resources/**";
    public static final String SWAGGER_UI = "/swagger-ui.html";
    public static final String LOGOUT = "/logout";

    public static final String CITIES_SEARCH = "/cities/search";
}
