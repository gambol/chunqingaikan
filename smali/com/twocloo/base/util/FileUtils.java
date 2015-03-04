package com.twocloo.base.util; class FileUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/FileUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FileUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/FileUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static copy(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p0, "from"    # Ljava/lang/String;
a=0;//     .param p1, "to"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     .local v1, "fromFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     .local v6, "toFile":Ljava/io/File;
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 92
a=0;//     .local v2, "input":Ljava/io/InputStream;
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     .local v4, "output":Ljava/io/OutputStream;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 95
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .local v3, "input":Ljava/io/InputStream;
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_7
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 96
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .local v5, "output":Ljava/io/OutputStream;
a=0;//     :try_start_2
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {v3, v5}, Lcom/twocloo/base/util/FileUtils;->copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;)J
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_8
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_4
a=0;//     invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 113
a=0;//     .end local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Null);v4=(Null);v5=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :goto_2
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v2=(Reference,Ljava/io/FileInputStream;);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     .line 106
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_7
a=0;//     invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 109
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 99
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 100
a=0;//     :goto_4
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
a=0;// 
a=0;//     .line 106
a=0;//     :cond_3
a=0;//     :goto_5
a=0;//     #v8=(Conflicted);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 108
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
a=0;// 
a=0;//     .line 112
a=0;//     :cond_4
a=0;//     :goto_6
a=0;//     throw v7
a=0;// 
a=0;//     .line 103
a=0;//     :catch_3
a=0;//     #v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 109
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 103
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v5    # "output":Ljava/io/OutputStream;
a=0;//     :catch_5
a=0;//     #v0=(Uninit);v2=(Null);v3=(Reference,Ljava/io/FileInputStream;);v4=(Null);v5=(Reference,Ljava/io/FileOutputStream;);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     .restart local v0    # "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 99
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .restart local v3    # "input":Ljava/io/InputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v2=(Null);v4=(Null);v5=(Conflicted);v7=(Uninit);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v5    # "output":Ljava/io/OutputStream;
a=0;//     :catchall_2
a=0;//     #v2=(Null);v5=(Reference,Ljava/io/FileOutputStream;);v7=(Uninit);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 97
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .restart local v3    # "input":Ljava/io/InputStream;
a=0;//     :catch_7
a=0;//     #v2=(Null);v4=(Null);v5=(Conflicted);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v2    # "input":Ljava/io/InputStream;
a=0;//     .end local v4    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v5    # "output":Ljava/io/OutputStream;
a=0;//     :catch_8
a=0;//     #v0=(Uninit);v2=(Null);v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "output":Ljava/io/OutputStream;
a=0;//     .restart local v4    # "output":Ljava/io/OutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "input":Ljava/io/InputStream;
a=0;//     .restart local v2    # "input":Ljava/io/InputStream;
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;)J
a=0;//     .locals 2
a=0;//     .param p0, "input"    # Ljava/io/InputStream;
a=0;//     .param p1, "output"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloo/base/util/FileUtils;->copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;[B)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private static copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;[B)J
a=0;//     .locals 5
a=0;//     .param p0, "input"    # Ljava/io/InputStream;
a=0;//     .param p1, "output"    # Ljava/io/OutputStream;
a=0;//     .param p2, "buffer"    # [B
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     .local v0, "count":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "n":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, p2, v3, v2}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 123
a=0;//     int-to-long v3, v2
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v0, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static deleteChildDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;//     .locals 6
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;//     .param p1, "filter"    # Ljava/io/FilenameFilter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 74
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p0, p1}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "children":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     aget-object v4, v0, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3, p1}, Lcom/twocloo/base/util/FileUtils;->deleteDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 79
a=0;//     .local v2, "success":Z
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static deleteDir(Ljava/io/File;)Z
a=0;//     .locals 1
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/FileUtils;->deleteDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static deleteDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;//     .locals 6
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;//     .param p1, "filter"    # Ljava/io/FilenameFilter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Boolean);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {p0, p1}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 51
a=0;//     .local v0, "children":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v1, v4, :cond_3
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "children":[Ljava/lang/String;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     .restart local v0    # "children":[Ljava/lang/String;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_3
a=0;//     #v0=(Reference,[Ljava/lang/String;);v1=(Integer);v3=(Null);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     aget-object v5, v0, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v4, p0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v4, p1}, Lcom/twocloo/base/util/FileUtils;->deleteDir(Ljava/io/File;Ljava/io/FilenameFilter;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 53
a=0;//     .local v2, "success":Z
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static readLines(Ljava/io/Reader;)Ljava/util/List;
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
a=0;//     .line 153
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/FileUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 154
a=0;//     .local v2, "reader":Ljava/io/BufferedReader;
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 155
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
a=0;//     .line 158
a=0;//     return-object v1
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static readString(Ljava/io/Reader;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "input"    # Ljava/io/Reader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/FileUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 138
a=0;//     .local v1, "reader":Ljava/io/BufferedReader;
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 139
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "line":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\n"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
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
a=0;//     .line 162
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
a=0;// .method public static write(Ljava/lang/String;Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "output"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static write(Ljava/lang/String;Ljava/io/Writer;)V
a=0;//     .locals 0
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;//     .param p1, "output"    # Ljava/io/Writer;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     invoke-virtual {p1, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
