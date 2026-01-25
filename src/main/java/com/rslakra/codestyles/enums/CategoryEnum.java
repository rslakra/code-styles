package com.rslakra.codestyles.entity;

/**
 *
 * @author Rohtash Lakra
 * @created 4/3/23 4:40 PM
 */
public enum CategoryEnum {

    AUTOMOTIVE("Automotive"),
    BUSINESS("Business"),
    EDUCATION("Education"),
    ENTERTAINMENT("Entertainment"),
    EVENTS("Events"),
    FINANCE("Finance"),
    GAMING("Gaming"),
    GAS("Gas"),
    FOOD_AND_DRINK("Food and Drink"),
    HEALTH_AND_FITNESS("Health and Fitness"),
    HOME_AND_GARDEN("Home and Garden"),
    INTERNET_AND_TELECOM("Internet and Telecom"),
    LAW_AND_ORDER("Law and Order"),
    GOVERNMENT_POLICIES("Government Policies"),
    MISCELLANEOUS("Miscellaneous"),
    NEWS("News"),
    OTHER("Other"),
    REAL_ESTATE("Real Estate"),
    SCIENCE_AND_TECHNOLOGY("Science and Technology"),
    SPORTS("Sports"),
    TRAVEL("Travel"),
    TRANSPORTATION("Transportation"),
    UTILITIES("Utilities"),
    WEATHER("Weather"),
    WORK("Work");

    private final String label;

    CategoryEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
