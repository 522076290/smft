package com.smfst.xcw.service;

import java.util.List;
import java.util.Map;

public interface BackupService {
    List<Map<String, String>> queryBackup();
    String backup(String name);
    String restore(String name);
    String delBackup(String name);
}
