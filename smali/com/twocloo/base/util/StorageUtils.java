package com.twocloo.base.util; class StorageUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/StorageUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StorageUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final BYTE:J = 0x1L
a=0;// 
a=0;// .field public static final CARD_MIN_CACHE_SIZE:J = 0xa00000L
a=0;// 
a=0;// .field public static DAY:J = 0x0L
a=0;// 
a=0;// .field public static HOUR:J = 0x0L
a=0;// 
a=0;// .field public static final KB:J = 0x400L
a=0;// 
a=0;// .field public static final MB:J = 0x100000L
a=0;// 
a=0;// .field public static MINUTE:J
a=0;// 
a=0;// .field public static SECOND:J
a=0;// 
a=0;// .field public static VIEW_DATA_TIME_OUT:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v2, 0x3c
a=0;// 
a=0;//     .line 32
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/twocloo/base/util/StorageUtils;->SECOND:J
a=0;// 
a=0;//     .line 33
a=0;//     sget-wide v0, Lcom/twocloo/base/util/StorageUtils;->SECOND:J
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/StorageUtils;->MINUTE:J
a=0;// 
a=0;//     .line 34
a=0;//     sget-wide v0, Lcom/twocloo/base/util/StorageUtils;->MINUTE:J
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/StorageUtils;->HOUR:J
a=0;// 
a=0;//     .line 35
a=0;//     sget-wide v0, Lcom/twocloo/base/util/StorageUtils;->HOUR:J
a=0;// 
a=0;//     const-wide/16 v2, 0x18
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/StorageUtils;->DAY:J
a=0;// 
a=0;//     .line 38
a=0;//     sget-wide v0, Lcom/twocloo/base/util/StorageUtils;->DAY:J
a=0;// 
a=0;//     const-wide/16 v2, 0x5
a=0;// 
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     sput-wide v0, Lcom/twocloo/base/util/StorageUtils;->VIEW_DATA_TIME_OUT:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/StorageUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static append(Ljava/lang/String;Ljava/io/File;)Z
a=0;//     .locals 6
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 278
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 257
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(One);v5=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 259
a=0;//     .local v1, "writer":Ljava/io/Writer;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 263
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v2, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileWriter;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v2, p1, v5}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 264
a=0;//     .end local v1    # "writer":Ljava/io/Writer;
a=0;//     .local v2, "writer":Ljava/io/Writer;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileWriter;);
a=0;//     invoke-virtual {v2, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 269
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 271
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/Writer;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 265
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 272
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 273
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 266
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v2    # "writer":Ljava/io/Writer;
a=0;//     .restart local v1    # "writer":Ljava/io/Writer;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Null);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 267
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/FileWriter;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 269
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 271
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/Writer;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 272
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 273
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v4=(One);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 269
a=0;//     :goto_3
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 271
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/Writer;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     .line 276
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v4=(Conflicted);
a=0;//     throw v3
a=0;// 
a=0;//     .line 272
a=0;//     :catch_3
a=0;//     #v4=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 273
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 268
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v1    # "writer":Ljava/io/Writer;
a=0;//     .restart local v2    # "writer":Ljava/io/Writer;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/FileWriter;);v3=(Null);v4=(One);v5=(One);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "writer":Ljava/io/Writer;
a=0;//     .restart local v1    # "writer":Ljava/io/Writer;
a=0;//     #v1=(Reference,Ljava/io/FileWriter;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 266
a=0;//     .end local v1    # "writer":Ljava/io/Writer;
a=0;//     .restart local v2    # "writer":Ljava/io/Writer;
a=0;//     :catch_4
a=0;//     #v1=(Null);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "writer":Ljava/io/Writer;
a=0;//     .restart local v1    # "writer":Ljava/io/Writer;
a=0;//     #v1=(Reference,Ljava/io/FileWriter;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static append(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/StorageUtils;->append(Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/StorageUtils;->getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static delete(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 166
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static exists(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p0, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 172
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static externalMemoryAvailable()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "currentState":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static externalMemoryRootPath()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAvailableExternalMemorySize()J
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 62
a=0;//     .local v4, "path":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v5, Landroid/os/StatFs;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     .local v5, "stat":Landroid/os/StatFs;
a=0;//     #v5=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v2, v6
a=0;// 
a=0;//     .line 64
a=0;//     .local v2, "blockSize":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     int-to-long v0, v6
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "availableBlocks":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long v6, v0, v2
a=0;// 
a=0;//     .line 67
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(LongLo);v7=(LongHi);
a=0;//     return-wide v6
a=0;// 
a=0;//     .end local v0    # "availableBlocks":J
a=0;//     .end local v2    # "blockSize":J
a=0;//     .end local v4    # "path":Ljava/io/File;
a=0;//     .end local v5    # "stat":Landroid/os/StatFs;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAvailableInternalMemorySize()J
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 43
a=0;//     .local v4, "path":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v5, Landroid/os/StatFs;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 44
a=0;//     .local v5, "stat":Landroid/os/StatFs;
a=0;//     #v5=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v2, v6
a=0;// 
a=0;//     .line 45
a=0;//     .local v2, "blockSize":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     int-to-long v0, v6
a=0;// 
a=0;//     .line 46
a=0;//     .local v0, "availableBlocks":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long v6, v0, v2
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     return-wide v6
a=0;// .end method
a=0;// 
a=0;// .method private static getMD5(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     #v2=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 130
a=0;//     .local v1, "md":Ljava/security/MessageDigest;
a=0;//     #v1=(Reference,Ljava/security/MessageDigest;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/StorageUtils;->toHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v1    # "md":Ljava/security/MessageDigest;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getTotalExternalMemorySize()J
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 75
a=0;//     .local v2, "path":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Landroid/os/StatFs;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     .local v3, "stat":Landroid/os/StatFs;
a=0;//     #v3=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v0, v6
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "blockSize":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     int-to-long v4, v6
a=0;// 
a=0;//     .line 78
a=0;//     .local v4, "totalBlocks":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long v6, v4, v0
a=0;// 
a=0;//     .line 80
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(LongLo);v7=(LongHi);
a=0;//     return-wide v6
a=0;// 
a=0;//     .end local v0    # "blockSize":J
a=0;//     .end local v2    # "path":Ljava/io/File;
a=0;//     .end local v3    # "stat":Landroid/os/StatFs;
a=0;//     .end local v4    # "totalBlocks":J
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getTotalInternalMemorySize()J
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 52
a=0;//     .local v2, "path":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Landroid/os/StatFs;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     .local v3, "stat":Landroid/os/StatFs;
a=0;//     #v3=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v0, v6
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "blockSize":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     int-to-long v4, v6
a=0;// 
a=0;//     .line 55
a=0;//     .local v4, "totalBlocks":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long v6, v4, v0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     return-wide v6
a=0;// .end method
a=0;// 
a=0;// .method public static internalMemoryRootPath()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static laftFileTime(Ljava/lang/String;)J
a=0;//     .locals 3
a=0;//     .param p0, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 160
a=0;//     .local v1, "modifiedTime":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// .end method
a=0;// 
a=0;// .method public static read(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     .local v1, "input":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 200
a=0;//     .local v5, "sb":Ljava/lang/StringBuilder;
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v6, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v2, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 201
a=0;//     .end local v1    # "input":Ljava/io/InputStream;
a=0;//     .local v2, "input":Ljava/io/InputStream;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     const-string v6, "utf-8"
a=0;// 
a=0;//     invoke-static {v2, v6}, Lcom/twocloo/base/util/StorageUtils;->readLines(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 202
a=0;//     .local v4, "lines":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 210
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 219
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .end local v4    # "lines":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .end local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     .restart local v1    # "input":Ljava/io/InputStream;
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 202
a=0;//     .end local v1    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     .restart local v4    # "lines":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .restart local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_1
a=0;//     :try_start_3
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/FileInputStream;);v4=(Reference,Ljava/util/List;);v5=(Reference,Ljava/lang/StringBuilder;);v7=(Boolean);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 203
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 207
a=0;//     .end local v3    # "line":Ljava/lang/String;
a=0;//     .end local v4    # "lines":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 208
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .end local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     .restart local v1    # "input":Ljava/io/InputStream;
a=0;//     :goto_3
a=0;//     :try_start_4
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 210
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 212
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 219
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 213
a=0;//     .end local v1    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     .restart local v4    # "lines":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .restart local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/FileInputStream;);v4=(Reference,Ljava/util/List;);v5=(Reference,Ljava/lang/StringBuilder;);v6=(Reference,Ljava/lang/String;);v7=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 213
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .end local v4    # "lines":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .end local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     .restart local v1    # "input":Ljava/io/InputStream;
a=0;//     :catch_2
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 209
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 210
a=0;//     :goto_5
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 212
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
a=0;// 
a=0;//     .line 217
a=0;//     :cond_3
a=0;//     :goto_6
a=0;//     throw v6
a=0;// 
a=0;//     .line 213
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 214
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 209
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v1    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     .restart local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/FileInputStream;);v5=(Reference,Ljava/lang/StringBuilder;);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .restart local v1    # "input":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 207
a=0;//     .end local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     :catch_4
a=0;//     #v1=(Null);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private static readLines(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 2
a=0;//     .param p0, "input"    # Ljava/io/InputStream;
a=0;//     .param p1, "encoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/InputStream;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     new-instance v0, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v0, p0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 230
a=0;//     .local v0, "reader":Ljava/io/InputStreamReader;
a=0;//     #v0=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/StorageUtils;->readLines(Ljava/io/Reader;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static readLines(Ljava/io/Reader;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .param p0, "input"    # Ljava/io/Reader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/Reader;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/StorageUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 236
a=0;//     .local v2, "reader":Ljava/io/BufferedReader;
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 237
a=0;//     .local v1, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "line":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     return-object v1
a=0;// 
a=0;//     .line 238
a=0;//     :cond_0
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;
a=0;//     .locals 1
a=0;//     .param p0, "reader"    # Ljava/io/Reader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     instance-of v0, p0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     .end local p0    # "reader":Ljava/io/Reader;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .restart local p0    # "reader":Ljava/io/Reader;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static toHexString([B)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "bytes"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     .line 143
a=0;//     #v3=(PosByte);
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 144
a=0;//     .local v1, "sb":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit16 v2, v2, 0xf0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 146
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 144
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "output"    # Ljava/io/OutputStream;
a=0;//     .param p2, "encoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static write(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "output":Ljava/io/OutputStream;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 179
a=0;//     .end local v1    # "output":Ljava/io/OutputStream;
a=0;//     .local v2, "output":Ljava/io/OutputStream;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     invoke-static {p0, v2, v3}, Lcom/twocloo/base/util/StorageUtils;->write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 184
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     :try_start_2
a=0;//     invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 193
a=0;//     .end local v2    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v1    # "output":Ljava/io/OutputStream;
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);v2=(Conflicted);v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 187
a=0;//     .end local v1    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v2    # "output":Ljava/io/OutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v2    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v1    # "output":Ljava/io/OutputStream;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 184
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 186
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 193
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 187
a=0;//     .restart local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catch_2
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 183
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 184
a=0;//     :goto_4
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     .line 191
a=0;//     :cond_2
a=0;//     :goto_5
a=0;//     #v4=(Conflicted);
a=0;//     throw v3
a=0;// 
a=0;//     .line 187
a=0;//     :catch_3
a=0;//     #v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 188
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 183
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v1    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v2    # "output":Ljava/io/OutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/FileOutputStream;);v4=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v1    # "output":Ljava/io/OutputStream;
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 181
a=0;//     .end local v1    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v2    # "output":Ljava/io/OutputStream;
a=0;//     :catch_4
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v1    # "output":Ljava/io/OutputStream;
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_2
a=0;// .end method
}}
