package com.msamsonov.homeinfoservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Environment {
    double humidity;
    double temperature;
}
