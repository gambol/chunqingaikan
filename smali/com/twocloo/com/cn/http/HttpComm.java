package com.twocloo.com.cn.http; class HttpComm { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/HttpComm;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpComm.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "HttpComm"
a=0;// 
a=0;// .field private static final format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/http/HttpComm;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/HttpComm;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static isNetworkAvalible(Landroid/content/Context;)Z
a=0;//     .locals 5
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 416
a=0;//     #v3=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 428
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 420
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     const-string v4, "connectivity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 421
a=0;//     .local v0, "cm":Landroid/net/ConnectivityManager;
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 422
a=0;//     .local v2, "info":Landroid/net/NetworkInfo;
a=0;//     #v2=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 423
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     .end local v0    # "cm":Landroid/net/ConnectivityManager;
a=0;//     .end local v2    # "info":Landroid/net/NetworkInfo;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 426
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 25
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
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
a=0;//     .line 337
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "files":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/util/UUID;);
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/util/UUID;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 338
a=0;//     .local v2, "BOUNDARY":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "--"
a=0;// 
a=0;//     .local v6, "PREFIX":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\r\n"
a=0;// 
a=0;//     .line 339
a=0;//     .local v4, "LINEND":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "multipart/form-data"
a=0;// 
a=0;//     .line 340
a=0;//     .local v5, "MULTIPART_FROM_DATA":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     .line 342
a=0;//     .local v3, "CHARSET":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v21, Ljava/net/URL;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 343
a=0;//     .local v21, "uri":Ljava/net/URL;
a=0;//     #v0=(Reference,Ljava/net/URL;);v21=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v9, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 344
a=0;//     .local v9, "conn":Ljava/net/HttpURLConnection;
a=0;//     const/16 v22, 0x2710
a=0;// 
a=0;//     #v22=(PosShort);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 345
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     #v22=(One);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 346
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 347
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 348
a=0;//     const-string v22, "POST"
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 349
a=0;//     const-string v22, "connection"
a=0;// 
a=0;//     const-string v23, "keep-alive"
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-virtual {v9, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 350
a=0;//     const-string v22, "Charsert"
a=0;// 
a=0;//     const-string v23, "UTF-8"
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-virtual {v9, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 351
a=0;//     const-string v22, "Content-Type"
a=0;// 
a=0;//     new-instance v23, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v23=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v23 .. v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, ";boundary="
a=0;// 
a=0;//     invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-virtual {v9, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 354
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 355
a=0;//     .local v18, "sb":Ljava/lang/StringBuilder;
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-interface/range {v22 .. v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     :goto_0
a=0;//     #v11=(Conflicted);
a=0;//     invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-nez v22, :cond_2
a=0;// 
a=0;//     .line 366
a=0;//     new-instance v16, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/io/OutputStream;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 367
a=0;//     .local v16, "outStream":Ljava/io/DataOutputStream;
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);v16=(Reference,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 369
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-interface/range {v22 .. v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v19=(Conflicted);
a=0;//     invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-nez v22, :cond_3
a=0;// 
a=0;//     .line 391
a=0;//     :cond_0
a=0;//     #v22=(Conflicted);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 392
a=0;//     .local v10, "end_data":[B
a=0;//     #v10=(Reference,[B);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 393
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 395
a=0;//     invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 396
a=0;//     .local v17, "res":I
a=0;//     #v17=(Integer);
a=0;//     invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 397
a=0;//     .local v13, "in":Ljava/io/InputStream;
a=0;//     #v13=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v20, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 398
a=0;//     .local v20, "sb2":Ljava/lang/StringBuilder;
a=0;//     #v20=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v22, 0xc8
a=0;// 
a=0;//     #v22=(PosShort);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 400
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Char);v8=(Conflicted);v22=(Char);
a=0;//     invoke-virtual {v13}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .local v8, "ch":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v22, -0x1
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v8, v0, :cond_5
a=0;// 
a=0;//     .line 404
a=0;//     .end local v8    # "ch":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v8=(Conflicted);v22=(Short);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/DataOutputStream;->close()V
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 406
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     return-object v22
a=0;// 
a=0;//     .line 355
a=0;//     .end local v10    # "end_data":[B
a=0;//     .end local v13    # "in":Ljava/io/InputStream;
a=0;//     .end local v16    # "outStream":Ljava/io/DataOutputStream;
a=0;//     .end local v17    # "res":I
a=0;//     .end local v20    # "sb2":Ljava/lang/StringBuilder;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);v10=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v19=(Uninit);v20=(Uninit);v22=(Boolean);
a=0;//     invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v11, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 356
a=0;//     .local v11, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 357
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 358
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 359
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v22, "Content-Disposition:form-data;name=\""
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     check-cast v22, Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     const-string v24, "\""
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 360
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "Content-Type:text/plain;charset="
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 361
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "Content-Transfer-Encoding:8bit"
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 362
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 363
a=0;//     invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     check-cast v22, Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 364
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     .end local v11    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .restart local v16    # "outStream":Ljava/io/DataOutputStream;
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Reference,Ljava/io/DataOutputStream;);v19=(Conflicted);v22=(Boolean);
a=0;//     invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 371
a=0;//     .local v12, "file":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     new-instance v19, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 372
a=0;//     .local v19, "sb1":Ljava/lang/StringBuilder;
a=0;//     #v19=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 373
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 374
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 375
a=0;//     new-instance v24, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v22, "Content-Disposition:form-data;name=\"photo\";filename=\""
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v24=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     check-cast v22, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     const-string v24, "\""
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 376
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "Content-Type:application/octet-stream;charset="
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 377
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 378
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 380
a=0;//     new-instance v14, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     check-cast v22, Ljava/io/File;
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-direct {v14, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 381
a=0;//     .local v14, "is":Ljava/io/InputStream;
a=0;//     #v14=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v22, 0x400
a=0;// 
a=0;//     #v22=(PosShort);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v7, v0, [B
a=0;// 
a=0;//     .line 382
a=0;//     .local v7, "buffer":[B
a=0;//     #v7=(Reference,[B);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     .local v15, "len":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v15=(Integer);
a=0;//     invoke-virtual {v14, v7}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     const/16 v22, -0x1
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v15, v0, :cond_4
a=0;// 
a=0;//     .line 386
a=0;//     invoke-virtual {v14}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 387
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,[B);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 384
a=0;//     :cond_4
a=0;//     #v0=(Byte);v22=(Byte);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v7, v1, v15}, Ljava/io/DataOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 401
a=0;//     .end local v7    # "buffer":[B
a=0;//     .end local v12    # "file":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     .end local v14    # "is":Ljava/io/InputStream;
a=0;//     .end local v15    # "len":I
a=0;//     .end local v19    # "sb1":Ljava/lang/StringBuilder;
a=0;//     .restart local v8    # "ch":I
a=0;//     .restart local v10    # "end_data":[B
a=0;//     .restart local v13    # "in":Ljava/io/InputStream;
a=0;//     .restart local v17    # "res":I
a=0;//     .restart local v20    # "sb2":Ljava/lang/StringBuilder;
a=0;//     :cond_5
a=0;//     #v0=(Byte);v1=(Char);v7=(Conflicted);v8=(Integer);v10=(Reference,[B);v12=(Conflicted);v13=(Reference,Ljava/io/InputStream;);v14=(Conflicted);v15=(Conflicted);v17=(Integer);v19=(Conflicted);v20=(Reference,Ljava/lang/StringBuilder;);v22=(Byte);
a=0;//     int-to-char v0, v8
a=0;// 
a=0;//     #v0=(Char);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Char);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static post(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
a=0;//     .locals 10
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 134
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 136
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v7, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     const-string v7, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Reference,Lorg/json/JSONObject;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     .local v1, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     const/16 v7, 0x1770
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/16 v8, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(PosShort);
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/base/http/HttpProvider;->newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 145
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "postRequest\u8bf7\u6c42\u5f00\u59cb\u65f6\u95f4\uff1a"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/http/HttpComm;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     new-instance v9, Ljava/util/Date;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v9}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "|"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const-string v8, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v1, p0, v7, p1, v8}, Lcom/twocloo/base/http/HttpProvider;->post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 147
a=0;//     .local v2, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->httpEntityContent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 149
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 150
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v5=(Uninit);
a=0;//     new-instance v5, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     .local v5, "retJsonObject":Lorg/json/JSONObject;
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "postRequest\u8bf7\u6c42\u7ed3\u675f\u65f6\u95f4\uff1a"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/http/HttpComm;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     new-instance v9, Ljava/util/Date;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v9}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "|"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "|"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .end local v5    # "retJsonObject":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_4
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 165
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 160
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 163
a=0;//     :cond_5
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method public static postMsg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 15
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "v1"    # Ljava/lang/String;
a=0;//     .param p2, "v2"    # Ljava/lang/String;
a=0;//     .param p3, "v3"    # Ljava/lang/String;
a=0;//     .param p4, "v4"    # Ljava/lang/String;
a=0;//     .param p5, "versioncode"    # Ljava/lang/String;
a=0;//     .param p6, "apptype"    # Ljava/lang/String;
a=0;//     .param p7, "clienttype"    # Ljava/lang/String;
a=0;//     .param p8, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v13}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 261
a=0;//     .local v7, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v7=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v13, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v13, v7}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     const-string v13, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     #v13=(Conflicted);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/app/Application;);
a=0;//     const-string v14, "phone"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v12, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 265
a=0;//     .local v12, "tm":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getSimState()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 266
a=0;//     .local v11, "telstate":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 267
a=0;//     .local v10, "sim_card":Ljava/lang/String;
a=0;//     #v10=(Null);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     if-eq v11, v13, :cond_1
a=0;// 
a=0;//     if-nez v11, :cond_7
a=0;// 
a=0;//     .line 268
a=0;//     :cond_1
a=0;//     const-string v10, "0"
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     .local v3, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v3=(Null);
a=0;//     const/16 v13, 0x1770
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     const/16 v14, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v14=(PosShort);
a=0;//     invoke-static {v13, v14}, Lcom/twocloo/base/http/HttpProvider;->newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 278
a=0;//     #v3=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     new-instance v8, Ljava/util/HashMap;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v8}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 279
a=0;//     .local v8, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v8=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v13, "screenpix"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 280
a=0;//     const-string v13, "model"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 281
a=0;//     const-string v13, "imei"
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 282
a=0;//     const-string v13, "from_channel"
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 283
a=0;//     if-eqz p7, :cond_2
a=0;// 
a=0;//     .line 284
a=0;//     const-string v13, "ct"
a=0;// 
a=0;//     move-object/from16 v0, p7
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 286
a=0;//     :cond_2
a=0;//     if-eqz p6, :cond_3
a=0;// 
a=0;//     .line 287
a=0;//     const-string v13, "pt"
a=0;// 
a=0;//     move-object/from16 v0, p6
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 289
a=0;//     :cond_3
a=0;//     if-eqz p5, :cond_4
a=0;// 
a=0;//     .line 290
a=0;//     const-string v13, "versioncode"
a=0;// 
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 292
a=0;//     :cond_4
a=0;//     if-eqz p8, :cond_5
a=0;// 
a=0;//     .line 293
a=0;//     const-string v13, "articleid"
a=0;// 
a=0;//     move-object/from16 v0, p8
a=0;// 
a=0;//     invoke-interface {v8, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 295
a=0;//     :cond_5
a=0;//     const-string v13, "sim_card"
a=0;// 
a=0;//     invoke-interface {v8, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 296
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const-string v14, "utf-8"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p0, v13, v8, v14}, Lcom/twocloo/base/http/HttpProvider;->post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 297
a=0;//     .local v4, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v4=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/base/http/HttpResult;->httpEntityContent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 298
a=0;//     .local v9, "result":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v6, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 299
a=0;//     .local v6, "jo":Lorg/json/JSONObject;
a=0;//     #v6=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "\u53d1\u9001\u7ed3\u679c\uff1a"
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "|"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v13, "code"
a=0;// 
a=0;//     invoke-virtual {v6, v13}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_8
a=0;// 
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 300
a=0;//     const-string v13, "code"
a=0;// 
a=0;//     invoke-virtual {v6, v13}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_b
a=0;// 
a=0;//     .line 301
a=0;//     const-string v13, "code"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 302
a=0;//     .local v1, "code":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "1"
a=0;// 
a=0;//     invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 304
a=0;//     .local v5, "isSuccess":Z
a=0;//     #v5=(Boolean);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "\u662f\u5426\u53d1\u6210\u529f\uff1a"
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 306
a=0;//     if-eqz v5, :cond_b
a=0;// 
a=0;//     .line 315
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 307
a=0;//     :cond_6
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     .line 320
a=0;//     .end local v1    # "code":Ljava/lang/String;
a=0;//     .end local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .end local v5    # "isSuccess":Z
a=0;//     .end local v6    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v8    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v9    # "result":Ljava/lang/String;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v13=(Boolean);
a=0;//     return v13
a=0;// 
a=0;//     .line 270
a=0;//     .end local v3    # "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v13=(One);
a=0;//     const-string v10, "1"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 299
a=0;//     .restart local v3    # "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     .restart local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .restart local v6    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v8    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .restart local v9    # "result":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Reference,Lcom/twocloo/base/http/HttpProvider;);v4=(Reference,Lcom/twocloo/base/http/HttpResult;);v6=(Reference,Lorg/json/JSONObject;);v8=(Reference,Ljava/util/HashMap;);v9=(Reference,Ljava/lang/String;);v13=(Boolean);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 312
a=0;//     .end local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .end local v6    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v8    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v9    # "result":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 313
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v13, "HttpComm"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13, v14, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 315
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 320
a=0;//     .end local v2    # "e":Ljava/lang/Throwable;
a=0;//     :cond_9
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 314
a=0;//     :catchall_0
a=0;//     #v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     .line 315
a=0;//     #v13=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 318
a=0;//     :cond_a
a=0;//     throw v13
a=0;// 
a=0;//     .line 315
a=0;//     .restart local v4    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .restart local v6    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v8    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .restart local v9    # "result":Ljava/lang/String;
a=0;//     :cond_b
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Uninit);v4=(Reference,Lcom/twocloo/base/http/HttpResult;);v6=(Reference,Lorg/json/JSONObject;);v8=(Reference,Ljava/util/HashMap;);v9=(Reference,Ljava/lang/String;);v13=(Conflicted);v14=(Reference,Ujava/lang/Object;);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v3}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 1
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     .locals 10
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 59
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v7, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 60
a=0;//     const-string v7, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Reference,Lorg/json/JSONObject;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     .local v1, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     const/16 v7, 0x1770
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/16 v8, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(PosShort);
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/base/http/HttpProvider;->newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\u8bf7\u6c42\u5f00\u59cb\u65f6\u95f4\uff1a"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/http/HttpComm;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     new-instance v9, Ljava/util/Date;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v9}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "|"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const-string v9, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v1, p0, v7, v8, v9}, Lcom/twocloo/base/http/HttpProvider;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v4=(Reference,Ljava/lang/String;);v7=(Boolean);v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 71
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v4=(Null);v5=(Uninit);v7=(Null);v8=(Null);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->httpEntityContent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 75
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 78
a=0;//     :cond_5
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne p1, v7, :cond_6
a=0;// 
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     const-string v7, "{"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "{root:"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "}"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 81
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     new-instance v5, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     .local v5, "retJsonObject":Lorg/json/JSONObject;
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\u8bf7\u6c42\u7ed3\u675f\u65f6\u95f4\uff1a"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/http/HttpComm;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     new-instance v9, Ljava/util/Date;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v9}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "|"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "|"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 89
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     .end local v5    # "retJsonObject":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 89
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_7
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 94
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 89
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_8
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServer2(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 98
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 100
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v6, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     const-string v6, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Boolean);v7=(Uninit);v8=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     .local v1, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 108
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     const/16 v6, 0x1770
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/16 v7, 0x7530
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(PosShort);
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/base/http/HttpProvider;->newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 109
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u8bf7\u6c42\u5f00\u59cb\u65f6\u95f4\uff1a"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/http/HttpComm;->format:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     new-instance v8, Ljava/util/Date;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v8}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v7, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "|"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const-string v8, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v1, p0, v6, v7, v8}, Lcom/twocloo/base/http/HttpProvider;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 111
a=0;//     .local v2, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->httpEntityContent()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 118
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Null);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 118
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 123
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 118
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 121
a=0;//     :cond_3
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, v1, v1, v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     .locals 1
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0, v0, v0}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;IJ)Lorg/json/JSONObject;
a=0;//     .locals 7
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "flag"    # I
a=0;//     .param p2, "timeOut"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 235
a=0;//     #v2=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-wide v5, p2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;//     .locals 7
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "flag"    # I
a=0;//     .param p4, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "I",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             ")",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     .local p2, "getFilter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/cache/Filter;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/cache/Filter;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/cache/KeyCreater;);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;//     .locals 5
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "flag"    # I
a=0;//     .param p4, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .param p5, "timeOut"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "I",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             "J)",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     .local p2, "getFilter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const-string v3, "/2cloo/viewdataCache2/"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 182
a=0;//     .local v1, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Lorg/json/JSONObject;>;"
a=0;//     #v1=(Reference,Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 184
a=0;//     .local v2, "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Null);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v3, p5, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 185
a=0;//     invoke-interface {v1, p0, p4, p5, p6}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 189
a=0;//     .restart local v2    # "jo":Lorg/json/JSONObject;
a=0;//     :goto_0
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-interface {p2, v2}, Lcom/twocloo/base/cache/Filter;->accept(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 191
a=0;//     .local v0, "accept":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     .end local v0    # "accept":Z
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 197
a=0;//     invoke-interface {v1, p0, v2, p3, p4}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     .line 200
a=0;//     :cond_1
a=0;//     return-object v2
a=0;// 
a=0;//     .line 187
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Null);
a=0;//     invoke-interface {v1, p0, p4}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     .restart local v2    # "jo":Lorg/json/JSONObject;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;//     .locals 7
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p1, "timeOut"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 226
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-wide v5, p1
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;Lcom/twocloo/base/cache/Filter;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;)",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, v1, p1, v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;)",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     .local p1, "getFilter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     .local p2, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, p1, p2, v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendJSONToServerWithCache(Ljava/lang/String;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .param p0, "u"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             ")",
a=0;//             "Lorg/json/JSONObject;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     .local p1, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1, p1, p2}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;ILcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
}}
