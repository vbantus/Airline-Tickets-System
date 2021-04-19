package com.airiline.tickets.domain.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Country {
    ALBANIA("Albania"),
    ANDORRA("Andorra"),
    ARMENIA("Armenia"),
    AUSTRIA("Austria"),
    BELARUS("Belarus"),
    BELGIUM("Belgium"),
    BOSNIA_AND_HERZEGOVINA("Bosnia and Herzegovina"),
    BULGARIA("Bulgaria"),
    CROATIA("Croatia"),
    CYPRUS("Cyprus"),
    CZECH_REPUBLIC("Czech Republic"),
    DENMARK("Denmark"),
    ESTONIA("Estonia"),
    FAROE_ISLANDS("Faroe Islands"),
    FINLAND("Finland"),
    FRANCE("France"),
    GEORGIA("Georgia"),
    GERMANY("Germany"),
    GIBRALTAR("Gibraltar"),
    GREECE("Greece"),
    HUNGARY("Hungary"),
    ICELAND("Iceland"),
    REPUBLIC_OF_IRELAND("Republic of Ireland"),
    ITALY("Italy"),
    KOSOVO("Kosovo"),
    LATVIA("Latvia"),
    LIECHTENSTEIN("Liechtenstein"),
    LITHUANIA("Lithuania"),
    LUXEMBOURG("Luxembourg"),
    MALTA("Malta"),
    MOLDOVA("Moldova"),
    MONACO("Monaco"),
    MONTENEGRO("Montenegro"),
    NETHERLANDS("Netherlands"),
    NORTH_MACEDONIA("North Macedonia"),
    NORWAY("Norway"),
    POLAND("Poland"),
    PORTUGAL("Portugal"),
    ROMANIA("Romania"),
    RUSSIA("Russia"),
    SAN_MARINO("San Marino"),
    SERBIA("Serbia"),
    SLOVAKIA("Slovakia"),
    SLOVENIA("Slovenia"),
    SPAIN("Spain"),
    SWEDEN("Sweden"),
    SWITZERLAND("Switzerland"),
    TURKEY("Turkey"),
    UKRAINE("Ukraine"),
    UNITED_KINGDOM("United Kingdom"),
    VATICAN_CITY_STATE("Vatican City State");

    @JsonValue
    private final String label;
}