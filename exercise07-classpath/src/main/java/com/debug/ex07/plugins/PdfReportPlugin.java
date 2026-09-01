package com.debug.ex07.plugins;

import com.debug.ex07.ReportPlugin;

public class PdfReportPlugin implements ReportPlugin {

    @Override
    public String generateReport(String title, String data) {
        return "[PDF] " + title + ": " + data;
    }
}
