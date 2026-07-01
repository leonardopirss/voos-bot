package com.bot.pass.service;

import com.bot.pass.dto.Preferences;
import com.bot.pass.dto.Voos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class BotService {

    private static final int MAX_LOCATION_LENGTH = 100;

    private boolean validatePreferences(Preferences preferences) {
        if (preferences == null) {
            return false;
        }

        if (!isValidLocation(preferences.origin()) || !isValidLocation(preferences.destination())) {
            return false;
        }

        if (preferences.origin().trim().equalsIgnoreCase(preferences.destination().trim())) {
            return false;
        }

        if (preferences.initial() == null || preferences.end() == null) {
            return false;
        }

        LocalDate today = LocalDate.now();
        LocalDate initial = preferences.initial().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = preferences.end().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (initial.isBefore(today) || end.isBefore(initial)) {
            return false;
        }

        if (preferences.enabled() == null || preferences.enabled() < 0 || preferences.enabled() > 1) {
            return false;
        }

        if (preferences.price() == null || preferences.price() <= 0 || preferences.price().isNaN() || preferences.price().isInfinite()) {
            return false;
        }

        if (preferences.id() != null) {
            return false;
        }

        return true;
    }

    private boolean isValidLocation(String location) {
        if (location == null || location.isBlank()) {
            return false;
        }

        String value = location.trim();
        if (value.length() > MAX_LOCATION_LENGTH) {
            return false;
        }

        return value.chars().noneMatch(Character::isISOControl);
    }

    public ResponseEntity<Preferences> savePreferences(Preferences preferences) {

        if (validatePreferences(preferences)) {
            return ResponseEntity.ok(preferences);
        }

        // TO DO: Salvar no banco de dados e acrescentar log

        return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Preferences> getPreferences() {

        ///  to do : buscar do banco
        return ResponseEntity.ok(null);
    }

    // Pega as promos
    // rodar primeiro o job do grupo
    // depois rodar o bot para assinantes
    // pensar em precificação, como sei que aquela passagem ta barata
    // selecionar destinos mais procurados?
    public ResponseEntity<Voos> searchPromos() {
        // TO DO: Buscar no banco de dados preferências



        // API SKICANNER
        // Mandar essas preferências para o API

        /// RETORNO API SKYSCANNER

        // MAPEAR OS CAMPOS E RETORNAR

        return ResponseEntity.ok(null);
    }
}
