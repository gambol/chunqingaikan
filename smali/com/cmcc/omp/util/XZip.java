package com.cmcc.omp.util; class XZip { void a() { int a;
a=0;// .class public Lcom/cmcc/omp/util/XZip;
a=0;// .super Ljava/lang/Object;
a=0;// .source "XZip.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/util/XZip;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static UnZipAll(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p0, "zipFileString"    # Ljava/lang/String;
a=0;//     .param p1, "outPathString"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "/cmcc_omp_safetybin"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 23
a=0;//     .local v2, "tempFile1":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 28
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "/help.data"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 29
a=0;//     .local v3, "tempFile2":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "/readme.data"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 35
a=0;//     .local v4, "tempFile3":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "szName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/util/zip/ZipInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/ZipInputStream;);
a=0;//     new-instance v6, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v6, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, v6}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "inZip":Ljava/util/zip/ZipInputStream;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/zip/ZipInputStream;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .local v5, "zipEntry":Ljava/util/zip/ZipEntry;
a=0;//     #v5=(Reference,Ljava/util/zip/ZipEntry;);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_3
a=0;//     invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->isDirectory()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 52
a=0;//     const-string v6, "assets/cmcc_omp_safetybin"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 54
a=0;//     const-string v6, "cmcc_omp_safetybin"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1, v6}, Lcom/cmcc/omp/util/XZip;->unzip(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 56
a=0;//     :cond_4
a=0;//     #v6=(Boolean);
a=0;//     const-string v6, "assets/help.data"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 58
a=0;//     const-string v6, "help.data"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1, v6}, Lcom/cmcc/omp/util/XZip;->unzip(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 60
a=0;//     :cond_5
a=0;//     #v6=(Boolean);
a=0;//     const-string v6, "assets/readme.data"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     const-string v6, "readme.data"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1, v6}, Lcom/cmcc/omp/util/XZip;->unzip(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static unzip(Ljava/util/zip/ZipInputStream;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p0, "inZip"    # Ljava/util/zip/ZipInputStream;
a=0;//     .param p1, "outPathString"    # Ljava/lang/String;
a=0;//     .param p2, "zipPath"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 77
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     .local v4, "out":Ljava/io/FileOutputStream;
a=0;//     :try_start_1
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v5, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 82
a=0;//     .end local v4    # "out":Ljava/io/FileOutputStream;
a=0;//     .local v5, "out":Ljava/io/FileOutputStream;
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v6, 0x400
a=0;// 
a=0;//     :try_start_2
a=0;//     #v6=(PosShort);
a=0;//     new-array v0, v6, [B
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "buffer":[B
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v3=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Ljava/util/zip/ZipInputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .local v3, "len":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v3, v6, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 90
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 73
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v3    # "len":I
a=0;//     .end local v5    # "out":Ljava/io/FileOutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 74
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "buffer":[B
a=0;//     .restart local v3    # "len":I
a=0;//     .restart local v5    # "out":Ljava/io/FileOutputStream;
a=0;//     :cond_1
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v3=(Integer);v4=(Null);v5=(Reference,Ljava/io/FileOutputStream;);v6=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v0, v6, v3}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 89
a=0;//     .end local v0    # "buffer":[B
a=0;//     .end local v3    # "len":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Short);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 90
a=0;//     .end local v5    # "out":Ljava/io/FileOutputStream;
a=0;//     .restart local v4    # "out":Ljava/io/FileOutputStream;
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);v5=(Conflicted);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_2
a=0;//     throw v6
a=0;// 
a=0;//     .line 89
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Null);
a=0;//     move-exception v6
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
