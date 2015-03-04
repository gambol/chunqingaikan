package com.lidroid.xutils.http.callback; class FileDownloadHandler { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/callback/FileDownloadHandler;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FileDownloadHandler.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/callback/FileDownloadHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleEntity(Lorg/apache/http/HttpEntity;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;Ljava/lang/String;ZLjava/lang/String;)Ljava/io/File;
a=0;//     .locals 21
a=0;//     .param p1, "entity"    # Lorg/apache/http/HttpEntity;
a=0;//     .param p2, "callBackHandler"    # Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;//     .param p3, "target"    # Ljava/lang/String;
a=0;//     .param p4, "isResume"    # Z
a=0;//     .param p5, "responseFileName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Reference,Ljava/io/File;);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     return-object v17
a=0;// 
a=0;//     .line 35
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     new-instance v17, Ljava/io/File;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     .local v17, "targetFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);v17=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 39
a=0;//     .local v12, "dir":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v12}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 42
a=0;//     :cond_3
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 45
a=0;//     .end local v12    # "dir":Ljava/io/File;
a=0;//     :cond_4
a=0;//     #v12=(Conflicted);
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     .local v5, "current":J
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     .local v8, "bis":Ljava/io/BufferedInputStream;
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     .local v10, "bos":Ljava/io/BufferedOutputStream;
a=0;//     #v10=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     .local v13, "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     #v13=(Null);
a=0;//     if-eqz p4, :cond_5
a=0;// 
a=0;//     .line 51
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v14, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-direct {v14, v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .end local v13    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     .local v14, "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     #v14=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v13, v14
a=0;// 
a=0;//     .line 56
a=0;//     .end local v14    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     .restart local v13    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v13=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     #v19=(LongLo);v20=(LongHi);
a=0;//     add-long v3, v19, v5
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "total":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     new-instance v9, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v9, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 58
a=0;//     .end local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .local v9, "bis":Ljava/io/BufferedInputStream;
a=0;//     :try_start_1
a=0;//     #v9=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     new-instance v11, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     invoke-direct {v11, v13}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 60
a=0;//     .end local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .local v11, "bos":Ljava/io/BufferedOutputStream;
a=0;//     #v11=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     if-eqz p2, :cond_6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface/range {v2 .. v7}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {v11}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     .end local v3    # "total":J
a=0;//     .end local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .end local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     :cond_5
a=0;//     :try_start_3
a=0;//     #v3=(Uninit);v4=(Uninit);v7=(Uninit);v9=(Uninit);v11=(Uninit);v13=(Null);v14=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     new-instance v14, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-direct {v14, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .end local v13    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     .restart local v14    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     #v14=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object v13, v14
a=0;// 
a=0;//     .end local v14    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     .restart local v13    # "fileOutputStream":Ljava/io/FileOutputStream;
a=0;//     #v13=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 64
a=0;//     .end local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .end local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "total":J
a=0;//     .restart local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v3=(LongLo);v4=(LongHi);v7=(Conflicted);v9=(Reference,Ljava/io/BufferedInputStream;);v11=(Reference,Ljava/io/BufferedOutputStream;);v19=(LongLo);v20=(LongHi);
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(PosShort);
a=0;//     new-array v0, v2, [B
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v18, "tmp":[B
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v15=(Conflicted);v18=(Reference,[B);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v9, v0}, Ljava/io/BufferedInputStream;->read([B)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .local v15, "len":I
a=0;//     #v15=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v15, v2, :cond_9
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v13}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 76
a=0;//     if-eqz p2, :cond_8
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     invoke-interface/range {v2 .. v7}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     .line 80
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {v11}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v16, Ljava/io/File;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getParent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     .local v16, "newFile":Ljava/io/File;
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/io/File;);v16=(Reference,Ljava/io/File;);v19=(Conflicted);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     .line 89
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .end local v16    # "newFile":Ljava/io/File;
a=0;//     :goto_3
a=0;//     move-object/from16 v17, v16
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v2=(Byte);v16=(Uninit);v19=(LongLo);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v13, v0, v2, v15}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 68
a=0;//     int-to-long v0, v15
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v19, v0
a=0;// 
a=0;//     add-long v5, v5, v19
a=0;// 
a=0;//     .line 69
a=0;//     if-eqz p2, :cond_7
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;);
a=0;//     invoke-interface/range {v2 .. v7}, Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;->updateProgress(JJZ)Z
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_2
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {v11}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     .end local v3    # "total":J
a=0;//     .end local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .end local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .end local v15    # "len":I
a=0;//     .end local v18    # "tmp":[B
a=0;//     .restart local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Uninit);v9=(Conflicted);v11=(Uninit);v14=(Conflicted);v15=(Uninit);v18=(Uninit);v19=(Conflicted);v20=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 80
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/Throwable;);v7=(Conflicted);v8=(Reference,Ljava/io/BufferedInputStream;);v10=(Reference,Ljava/io/BufferedOutputStream;);v11=(Conflicted);v15=(Conflicted);v18=(Conflicted);
a=0;//     invoke-static {v8}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {v10}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 82
a=0;//     throw v2
a=0;// 
a=0;//     .line 87
a=0;//     .end local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .end local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v3    # "total":J
a=0;//     .restart local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v15    # "len":I
a=0;//     .restart local v16    # "newFile":Ljava/io/File;
a=0;//     .restart local v18    # "tmp":[B
a=0;//     :cond_a
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(LongLo);v4=(LongHi);v8=(Null);v9=(Reference,Ljava/io/BufferedInputStream;);v10=(Null);v11=(Reference,Ljava/io/BufferedOutputStream;);v14=(Reference,Ljava/io/FileOutputStream;);v15=(Integer);v16=(Reference,Ljava/io/File;);v18=(Reference,[B);v20=(LongHi);
a=0;//     new-instance v16, Ljava/io/File;
a=0;// 
a=0;//     .end local v16    # "newFile":Ljava/io/File;
a=0;//     #v16=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getParent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     #v19=(LongLo);
a=0;//     invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v2, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .restart local v16    # "newFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);v16=(Reference,Ljava/io/File;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v2=(Boolean);v7=(Conflicted);v19=(Conflicted);
a=0;//     move-object/from16 v16, v17
a=0;// 
a=0;//     .line 89
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 79
a=0;//     .end local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .end local v15    # "len":I
a=0;//     .end local v16    # "newFile":Ljava/io/File;
a=0;//     .end local v18    # "tmp":[B
a=0;//     .restart local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     :catchall_1
a=0;//     #v2=(Reference,Ljava/io/InputStream;);v7=(Uninit);v11=(Conflicted);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(LongLo);
a=0;//     move-exception v2
a=0;// 
a=0;//     move-object v8, v9
a=0;// 
a=0;//     .end local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     #v8=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .end local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .end local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Null);v11=(Reference,Ljava/io/BufferedOutputStream;);v15=(Conflicted);v18=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v10, v11
a=0;// 
a=0;//     .end local v11    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     .restart local v10    # "bos":Ljava/io/BufferedOutputStream;
a=0;//     #v10=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     move-object v8, v9
a=0;// 
a=0;//     .end local v9    # "bis":Ljava/io/BufferedInputStream;
a=0;//     .restart local v8    # "bis":Ljava/io/BufferedInputStream;
a=0;//     #v8=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     goto :goto_4
a=0;// .end method
}}
