package com.debug.ex07;

public class App {
    public static void main(String[] args) throws Exception {
        PluginLoader loader = new PluginLoader();

        // Solution: Provide the exact fully-qualified class name (matching package 'com.debug.ex07.plugins').
        // Why: Class.forName(String) searches the classpath using the exact binary name. A misspelled package
        // or class name (such as 'plugin' instead of 'plugins') causes ClassNotFoundException.
        // Specifying the exact package path ensures the JVM class loader locates and loads the class bytecode.
        String pluginClassName = "com.debug.ex07.plugins.PdfReportPlugin";
        
        ReportPlugin plugin = loader.loadPlugin(pluginClassName);
        System.out.println(plugin.generateReport("Q3 Summary", "All systems operational"));
    }
}