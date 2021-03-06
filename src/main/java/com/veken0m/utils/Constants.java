package com.veken0m.utils;

import java.util.HashMap;
import java.util.Map;

public final class Constants
{
    //Prime or Free
    public static final boolean adSupported = false;
    public static final String[] METRIC_UNITS = {"m", "µ", "n", "p", "f"};
    public static final String ALERT_UPPER_DEFAULT = "99999";
    public static final String ALERT_LOWER_DEFAULT = "0";

    // Defaults
    public static final String DEFAULT_EXCHANGE = "bitstamp";
    public static final String DEFAULT_CURRENCY_PAIR = "BTC/USD";
    public static final String DEFAULT_MINING_POOL = "BitMinter";
    public static String REFRESH = "com.veken0m.bitcoinium.REFRESH";
    public static String PREFS_NAME_MINER = "com.veken0m.bitcoinium.MinerWidgetProvider";
    public static String PREFS_NAME_PRICE = "com.veken0m.bitcoinium.WidgetProvider";
    public static String PREFS_WALLET_ADDRESS = "com.veken0m.bitcoinium.BalanceWidgetProvider";
    static
    {
        if (adSupported)
        {
            REFRESH = "com.veken0m.cavirtex.REFRESH";
            PREFS_NAME_MINER = "com.veken0m.cavirtex.MinerWidgetProvider";
            PREFS_NAME_PRICE = "com.veken0m.cavirtex.WidgetProvider";
            PREFS_WALLET_ADDRESS = "com.veken0m.cavirtex.BalanceWidgetProvider";
        }
    }
    public static Map<String, String> CRYPTO_SYMBOLS = new HashMap<>();

    static
    {
        CRYPTO_SYMBOLS = new HashMap<>();
        CRYPTO_SYMBOLS.put("BTC", "฿");
        CRYPTO_SYMBOLS.put("XBT", "฿");
        CRYPTO_SYMBOLS.put("LTC", "Ł");
        CRYPTO_SYMBOLS.put("DOGE", "Ð");
        CRYPTO_SYMBOLS.put("XDG", "Ð");
        CRYPTO_SYMBOLS.put("XRP", "Ʀ");
        CRYPTO_SYMBOLS.put("NMC", "ℕ");
    }
}
