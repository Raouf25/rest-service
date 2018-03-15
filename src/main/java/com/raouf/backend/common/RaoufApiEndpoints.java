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

    public static final String VEHICLES = "/vehicles";
    public static final String VEHICLES_DETAIL = "/vehicles/{vehicleId}";

    public static final String DRIVERS = "/drivers";
    public static final String DRIVERS_DETAIL = "/drivers/{driverId}";

    public static final String TRIPS = "/trips";
    public static final String TRIPS_DETAIL = "/trips/{tripId}";
    public static final String TRIPS_AFFECTATIONS = "/affect/{driverId}/drive/{vehicleId}/for/{tripId}";
}
