package com.smfst.xcw.util;

import java.io.File;

public interface BackupConstants {
    /** 备份目录名称 */
    public static final String BACKUP_FOLDER_NAME = "_backup";
    /** 备份目录 */
    public static final String BACKUP_FOLDER = "D:\\SQLBackup" + File.separator + BACKUP_FOLDER_NAME + File.separator;
    /** 还原目录，默认就是备份目录 */
    public static final String RESTORE_FOLDER = BACKUP_FOLDER;
    /** SQL拓展名 */
    public static final String SQL_EXT = ".sql";

    /** 目标备份数据库信息 */
    public static final String HOST = "127.0.0.1";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "123456";
    public static final String DATABASE = "smft";
}

