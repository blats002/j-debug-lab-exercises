package com.debug.ex07;

public class App {
    public static void main(String[] args) throws Exception {
        PluginLoader loader = new PluginLoader();

        // Corrected fully-qualified class name to existing package 'com.debug.ex07.plugins'
        String pluginClassName = "com.debug.ex07.plugins.PdfReportPlugin";
        
        ReportPlugin plugin = loader.loadPlugin(pluginClassName);
        System.out.println(plugin.generateReport("Q3 Summary", "All systems operational"));
    }
}