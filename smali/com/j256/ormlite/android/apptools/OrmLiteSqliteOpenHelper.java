package com.j256.ormlite.android.apptools; class OrmLiteSqliteOpenHelper { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// .super Landroid/database/sqlite/SQLiteOpenHelper;
a=0;// .source "OrmLiteSqliteOpenHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;// .field private volatile isOpen:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const-class v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "databaseName"    # Ljava/lang/String;
a=0;//     .param p3, "factory"    # Landroid/database/sqlite/SQLiteDatabase$CursorFactory;
a=0;//     .param p4, "databaseVersion"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     new-instance v0, Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     invoke-direct {v0, p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z
a=0;// 
a=0;//     .line 42
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "{}: constructed connectionSource {}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     invoke-virtual {v0, v1, p0, v2}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "databaseName"    # Ljava/lang/String;
a=0;//     .param p3, "factory"    # Landroid/database/sqlite/SQLiteDatabase$CursorFactory;
a=0;//     .param p4, "databaseVersion"    # I
a=0;//     .param p5, "configFileId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-static {p1, p5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->openFileId(Landroid/content/Context;I)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase$CursorFactory;);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/InputStream;)V
a=0;// 
a=0;//     .line 55
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/File;)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "databaseName"    # Ljava/lang/String;
a=0;//     .param p3, "factory"    # Landroid/database/sqlite/SQLiteDatabase$CursorFactory;
a=0;//     .param p4, "databaseVersion"    # I
a=0;//     .param p5, "configFile"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-static {p5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->openFile(Ljava/io/File;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/sqlite/SQLiteDatabase$CursorFactory;);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/InputStream;)V
a=0;// 
a=0;//     .line 66
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/InputStream;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "databaseName"    # Ljava/lang/String;
a=0;//     .param p3, "factory"    # Landroid/database/sqlite/SQLiteDatabase$CursorFactory;
a=0;//     .param p4, "databaseVersion"    # I
a=0;//     .param p5, "stream"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     new-instance v2, Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     invoke-direct {v2, p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z
a=0;// 
a=0;//     .line 78
a=0;//     if-nez p5, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(One);v3=(Uninit);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v2, p5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStreamReader;);
a=0;//     const/16 v3, 0x1000
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
a=0;// 
a=0;//     .line 85
a=0;//     .local v1, "reader":Ljava/io/BufferedReader;
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-static {v1}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->loadDatabaseConfigFromReader(Ljava/io/BufferedReader;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/dao/DaoManager;->addCachedDatabaseConfigs(Ljava/util/Collection;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_1
a=0;//     invoke-virtual {p5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .end local v1    # "reader":Ljava/io/BufferedReader;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "Could not load object config file"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 89
a=0;//     .end local v0    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     .line 94
a=0;//     :goto_1
a=0;//     throw v2
a=0;// 
a=0;//     .line 92
a=0;//     :catch_2
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static openFile(Ljava/io/File;)Ljava/io/InputStream;
a=0;//     .locals 4
a=0;//     .param p0, "configFile"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 282
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 284
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 285
a=0;//     .local v0, "e":Ljava/io/FileNotFoundException;
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not open config file "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static openFileId(Landroid/content/Context;I)Ljava/io/InputStream;
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fileId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "stream":Ljava/io/InputStream;
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 272
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not find object config file with id "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->close()V
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Getting connectionSource was called after closed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/logger/Logger;->warn(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/AndroidConnectionSource;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D::",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-static {v2, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 241
a=0;//     .local v1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 242
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "TD;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D:",
a=0;//             "Lcom/j256/ormlite/dao/RuntimeExceptionDao",
a=0;//             "<TT;*>;T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 257
a=0;//     .local v1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;-><init>(Lcom/j256/ormlite/dao/Dao;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 258
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "TD;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/RuntimeExceptionDao;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 259
a=0;//     .end local v0    # "castDao":Lcom/j256/ormlite/dao/RuntimeExceptionDao;, "TD;"
a=0;//     .end local v1    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 260
a=0;//     .local v2, "e":Ljava/sql/SQLException;
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Could not create RuntimeExcepitionDao for class "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public isOpen()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
a=0;//     .locals 6
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 157
a=0;//     .local v2, "cs":Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getSpecialConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 158
a=0;//     .local v1, "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "clearSpecial":Z
a=0;//     #v0=(Null);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     .end local v1    # "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v1, p1, v4}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;-><init>(Landroid/database/sqlite/SQLiteDatabase;Z)V
a=0;// 
a=0;//     .line 162
a=0;//     .restart local v1    # "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 163
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v2}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 171
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 172
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 164
a=0;//     :catch_0
a=0;//     #v0=(Null);v4=(One);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 165
a=0;//     .local v3, "e":Ljava/sql/SQLException;
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "Could not save special connection"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 171
a=0;//     .end local v3    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 172
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public abstract onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// .end method
a=0;// 
a=0;// .method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
a=0;//     .locals 6
a=0;//     .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
a=0;//     .param p2, "oldVersion"    # I
a=0;//     .param p3, "newVersion"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 188
a=0;//     .local v2, "cs":Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/ConnectionSource;->getSpecialConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 189
a=0;//     .local v1, "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 190
a=0;//     .local v0, "clearSpecial":Z
a=0;//     #v0=(Null);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     new-instance v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;
a=0;// 
a=0;//     .end local v1    # "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v1, p1, v4}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;-><init>(Landroid/database/sqlite/SQLiteDatabase;Z)V
a=0;// 
a=0;//     .line 193
a=0;//     .restart local v1    # "conn":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseConnection;);
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 194
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v2, p2, p3}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 202
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 203
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 195
a=0;//     :catch_0
a=0;//     #v0=(Null);v4=(One);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 196
a=0;//     .local v3, "e":Ljava/sql/SQLException;
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "Could not save special connection"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 202
a=0;//     .end local v3    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 203
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public abstract onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "@"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
