package com.bot.pass.dto;

import java.util.Date;

public record Preferences(String origin, String destination, Date initial, Date end, Integer enabled, Integer id, Double price) {
}
