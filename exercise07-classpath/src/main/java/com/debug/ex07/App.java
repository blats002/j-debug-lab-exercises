package com.debug.ex07;

public class App {
    public static void main(String[] args) throws Exception {
        PluginLoader loader = new PluginLoader();

        // Intentional bug: Misspelled package 'plugin' instead of 'plugins'
        String pluginClassName = "com.debug.ex07.plugin.PdfReportPlugin";
        
        ReportPlugin plugin = loader.loadPlugin(pluginClassName);
        System.out.println(plugin.generateReport("Q3 Summary", "All systems operational"));
    }
}