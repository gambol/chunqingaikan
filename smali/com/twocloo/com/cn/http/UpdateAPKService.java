package com.twocloo.com.cn.http; class UpdateAPKService { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// .super Landroid/app/Service;
a=0;// .source "UpdateAPKService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/http/UpdateAPKService$UpdateRunnable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DOWNLOAD_COMPLETE:I = 0x0
a=0;// 
a=0;// .field private static final DOWNLOAD_FAIL:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private updateDir:Ljava/io/File;
a=0;// 
a=0;// .field private updateFile:Ljava/io/File;
a=0;// 
a=0;// .field private updateHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private updateIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private updateNotification:Landroid/app/Notification;
a=0;// 
a=0;// .field private updateNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private updatePendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field private url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateDir:Ljava/io/File;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateFile:Ljava/io/File;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     .line 38
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/UpdateAPKService$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/UpdateAPKService$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/http/UpdateAPKService$1;-><init>(Lcom/twocloo/com/cn/http/UpdateAPKService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/UpdateAPKService;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateFile:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/NotificationManager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/Notification;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/app/PendingIntent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updatePendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/http/UpdateAPKService;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/http/UpdateAPKService;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateDir:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/http/UpdateAPKService;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->url:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public downloadUpdateFile(Ljava/lang/String;Ljava/io/File;)J
a=0;//     .locals 18
a=0;//     .param p1, "downloadUrl"    # Ljava/lang/String;
a=0;//     .param p2, "saveFile"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 110
a=0;//     .local v3, "downloadCount":I
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 111
a=0;//     .local v2, "currentSize":I
a=0;//     #v2=(Null);
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     .local v9, "totalSize":J
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     .local v11, "updateTotalSize":I
a=0;//     #v11=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     .local v6, "httpConnection":Ljava/net/HttpURLConnection;
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     .local v7, "is":Ljava/io/InputStream;
a=0;//     #v7=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     .local v4, "fos":Ljava/io/FileOutputStream;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     new-instance v12, Ljava/net/URL;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     .local v12, "url":Ljava/net/URL;
a=0;//     #v12=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/net/URLConnection;);
a=0;//     move-object v0, v13
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     .line 119
a=0;//     #v6=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v13, "User-Agent"
a=0;// 
a=0;//     const-string v14, "PacificHttpClient"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v13, v14}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     const-string v13, "RANGE"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "bytes="
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "-"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v6, v13, v14}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v15=(Conflicted);
a=0;//     const/16 v13, 0x4e20
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     invoke-virtual {v6, v13}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 124
a=0;//     const v13, 0x1d4c0
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v6, v13}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 126
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     const/16 v14, 0x194
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     if-ne v13, v14, :cond_4
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v13, Ljava/lang/Exception;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v14, "fail!"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v14}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Exception;);
a=0;//     throw v13
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 149
a=0;//     .end local v12    # "url":Ljava/net/URL;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Reference,Ljava/io/InputStream;);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     .line 150
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Reference,Ljava/io/FileOutputStream;);v8=(Conflicted);v13=(Reference,Ljava/lang/Throwable;);v16=(Conflicted);v17=(Conflicted);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v7}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 159
a=0;//     :cond_3
a=0;//     throw v13
a=0;// 
a=0;//     .line 129
a=0;//     .restart local v12    # "url":Ljava/net/URL;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);v1=(Uninit);v3=(Null);v4=(Null);v5=(Uninit);v7=(Null);v8=(Uninit);v12=(Reference,Ljava/net/URL;);v13=(Integer);v14=(PosShort);v16=(Uninit);v17=(Uninit);
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 130
a=0;//     #v7=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v5, v0, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 131
a=0;//     .end local v4    # "fos":Ljava/io/FileOutputStream;
a=0;//     .local v5, "fos":Ljava/io/FileOutputStream;
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v13, 0x1000
a=0;// 
a=0;//     :try_start_2
a=0;//     #v13=(PosShort);
a=0;//     new-array v1, v13, [B
a=0;// 
a=0;//     .line 132
a=0;//     .local v1, "buffer":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     .local v8, "readsize":I
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v3=(Integer);v8=(Integer);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     invoke-virtual {v7, v1}, Ljava/io/InputStream;->read([B)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-gtz v8, :cond_9
a=0;// 
a=0;//     .line 150
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 151
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_6
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v7}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_7
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_8
a=0;//     return-wide v9
a=0;// 
a=0;//     .line 134
a=0;//     :cond_9
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v5, v1, v13, v8}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 135
a=0;//     int-to-long v13, v8
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     add-long/2addr v9, v13
a=0;// 
a=0;//     .line 136
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     const-wide/16 v13, 0x64
a=0;// 
a=0;//     mul-long/2addr v13, v9
a=0;// 
a=0;//     int-to-long v15, v11
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     div-long/2addr v13, v15
a=0;// 
a=0;//     long-to-int v13, v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v13, v13, -0xa
a=0;// 
a=0;//     if-le v13, v3, :cond_5
a=0;// 
a=0;//     .line 137
a=0;//     :cond_a
a=0;//     #v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0xa
a=0;// 
a=0;//     .line 138
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v13, v13, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$id;->progressBar1:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     const/16 v15, 0x64
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     long-to-int v0, v9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     mul-int/lit8 v16, v16, 0x64
a=0;// 
a=0;//     div-int v16, v16, v11
a=0;// 
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     invoke-virtual/range {v13 .. v17}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
a=0;// 
a=0;//     .line 139
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v13, v13, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$id;->textView1:I
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "\u8fdb\u5ea6"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     long-to-int v0, v9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     mul-int/lit8 v16, v16, 0x64
a=0;// 
a=0;//     div-int v16, v16, v11
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "%"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 140
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updatePendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v14=(Reference,Landroid/app/PendingIntent;);
a=0;//     iput-object v14, v13, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 145
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v13, v14, v15}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 149
a=0;//     .end local v1    # "buffer":[B
a=0;//     .end local v8    # "readsize":I
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "fos":Ljava/io/FileOutputStream;
a=0;//     .restart local v4    # "fos":Ljava/io/FileOutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onStart(Landroid/content/Intent;I)V
a=0;//     .locals 6
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "startId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v5=(Null);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 52
a=0;//     const-string v0, "url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\u542f\u52a8\u4e0b\u8f7d   :"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->url:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     const-string v0, "mounted"
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "2cloo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateDir:Ljava/io/File;
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateDir:Ljava/io/File;
a=0;// 
a=0;//     const-string v2, "2cloo-up.apk"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateFile:Ljava/io/File;
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateFile:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateFile:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 65
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/http/UpdateAPKService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "\u4e8c\u5c42\u697c\u5c0f\u8bf4\u66f4\u65b0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p0, v5, v0, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updatePendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RemoteViews;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/http/UpdateAPKService;->getApplication()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/Application;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$layout;->progress:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RemoteViews;);
a=0;//     iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->progressBar1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v5, v5}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->textView1:I
a=0;// 
a=0;//     const-string v2, "\u8fdb\u5ea60%"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updatePendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     iput-object v1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/UpdateAPKService;->updateNotification:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/UpdateAPKService$UpdateRunnable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/UpdateAPKService$UpdateRunnable;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/twocloo/com/cn/http/UpdateAPKService$UpdateRunnable;-><init>(Lcom/twocloo/com/cn/http/UpdateAPKService;Lcom/twocloo/com/cn/http/UpdateAPKService$UpdateRunnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/UpdateAPKService$UpdateRunnable;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
}}
