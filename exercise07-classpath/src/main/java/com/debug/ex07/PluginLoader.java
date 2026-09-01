package com.debug.ex07;

public class PluginLoader {

    /**
     * Dynamically loads and instantiates a ReportPlugin by its fully qualified class name.
     */
    public ReportPlugin loadPlugin(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return (ReportPlugin) clazz.getDeclaredConstructor().newInstance();
    }
}
