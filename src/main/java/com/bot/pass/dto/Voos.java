package com.bot.pass.dto;

import java.util.Date;

public record Voos(Double price, Date initial, Date end, Integer available, String origin, String destination, String url) {
}
