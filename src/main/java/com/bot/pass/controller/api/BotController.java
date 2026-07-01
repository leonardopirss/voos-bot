package com.bot.pass.controller.api;

import com.bot.pass.controller.impl.BotControllerImpl;
import com.bot.pass.dto.Preferences;
import com.bot.pass.dto.Voos;
import com.bot.pass.service.BotService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class BotController implements BotControllerImpl {
    // https://developers.skyscanner.net/docs/flights-live-prices/overview
    private final BotService botService;

    @Override
    public ResponseEntity<Preferences> saveSearchPreferences(Preferences preferences) {
        return botService.savePreferences(preferences);
    }

    @Override
    public ResponseEntity<Preferences> getSearchPreferences() {
        return null;
    }

    @Override
    public ResponseEntity<Preferences> updateSearchPreferences(Preferences preferences) {
        return null;
    }

    @Override
    public ResponseEntity<Voos> searchPromos() {
        return botService.searchPromos();
    }
}
