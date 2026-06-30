package com.bot.pass.controller.impl;

import com.bot.pass.dto.Voos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bot.pass.dto.Preferences;

@RequestMapping("api/v1/bot")
public interface BotControllerImpl {

    @PostMapping("save/preferences")
    ResponseEntity<Preferences> saveSearchPreferences(@RequestBody Preferences preferences);

    @GetMapping("list/preferences")
    ResponseEntity<Preferences> getSearchPreferences();

    @PatchMapping("update/preferences")
    ResponseEntity<Preferences> updateSearchPreferences(Preferences preferences);

    @GetMapping("search/promos")
    ResponseEntity<Voos> searchPromos();

}
