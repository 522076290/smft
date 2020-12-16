package com.smfst.xcw.service.impl;

import com.smfst.xcw.service.BackupService;
import com.smfst.xcw.util.BackupConstants;
import com.smfst.xcw.util.FileUtils;
import com.smfst.xcw.util.MySqlBackupRestoreUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BackupServiceImpl implements BackupService {
    @Override
    public List<Map<String, String>> queryBackup(){
        List<Map<String, String>> backupRecords = new ArrayList<>();
        File restoreFolderFile = new File(BackupConstants.RESTORE_FOLDER);
        if(restoreFolderFile.exists()) {
            for(File file:restoreFolderFile.listFiles()) {
                Map<String, String> backup = new HashMap<>();
                backup.put("title", file.getName());
                backupRecords.add(backup);
            }
        }
        // 按时间戳排序，新备份在前面
        backupRecords.sort((o1, o2) -> o2.get("title").compareTo(o1.get("title")));
        return backupRecords;
    }

    @Override
    public String backup(String name){
        String host = BackupConstants.HOST;
        String userName = BackupConstants.USER_NAME;
        String password = BackupConstants.PASSWORD;
        String database = BackupConstants.DATABASE;
        String backupFolderPath = BackupConstants.BACKUP_FOLDER + name + File.separator;
        String fileName = name;
        try {
            boolean success = MySqlBackupRestoreUtils.backup(host, userName, password, backupFolderPath, fileName, database);
            if(!success) {
              return "数据备份失败";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "数据备份成功";
    }

    @Override
    public String restore(String name){
        String host = BackupConstants.HOST;
        String userName = BackupConstants.USER_NAME;
        String password = BackupConstants.PASSWORD;
        String database = BackupConstants.DATABASE;
        String restoreFilePath = BackupConstants.RESTORE_FOLDER + name;
        try {
           boolean b =  MySqlBackupRestoreUtils.restore(restoreFilePath, host, userName, password, database);
           if (b){
               return "数据还原成功";
           }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "数据还原失败";
    }

    @Override
    public String delBackup(String name){
        String restoreFilePath = BackupConstants.BACKUP_FOLDER + name;
        try {
            FileUtils.deleteFile(new File(restoreFilePath));
            return "备份删除成功";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "备份删除失败";
    }
}

