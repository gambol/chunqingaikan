package com.tencent.utils; class HttpUtils { void a() { int a;
a=0;// .class public Lcom/tencent/utils/HttpUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/utils/HttpUtils$MyX509TrustManager;,
a=0;//         Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;,
a=0;//         Lcom/tencent/utils/HttpUtils$NetworkProxy;,
a=0;//         Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;,
a=0;//         Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 159
a=0;//     #p0=(Reference,Lcom/tencent/utils/HttpUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 814
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 815
a=0;//     #v0=(Byte);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     .line 816
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 817
a=0;//     invoke-static {p0}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 818
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 819
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 833
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 822
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 825
a=0;//     :cond_2
a=0;//     #v0=(Byte);
a=0;//     const-string v1, "http.proxyPort"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 826
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 828
a=0;//     :try_start_0
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 829
a=0;//     :catch_0
a=0;//     #v0=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/IOException;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 405
a=0;//     instance-of v0, p0, Ljava/io/CharConversionException;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 406
a=0;//     const/16 v0, -0x14
a=0;// 
a=0;//     .line 482
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     .line 407
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/nio/charset/MalformedInputException;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 408
a=0;//     const/16 v0, -0x15
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 409
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/nio/charset/UnmappableCharacterException;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 410
a=0;//     const/16 v0, -0x16
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 411
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Lorg/apache/http/client/HttpResponseException;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 412
a=0;//     const/16 v0, -0x17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/nio/channels/ClosedChannelException;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 414
a=0;//     const/16 v0, -0x18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 415
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Lorg/apache/http/ConnectionClosedException;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 416
a=0;//     const/16 v0, -0x19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 417
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/EOFException;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 418
a=0;//     const/16 v0, -0x1a
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 419
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/nio/channels/FileLockInterruptionException;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 420
a=0;//     const/16 v0, -0x1b
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 422
a=0;//     const/16 v0, -0x1c
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/HttpRetryException;
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 424
a=0;//     const/16 v0, -0x1d
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Lorg/apache/http/conn/ConnectTimeoutException;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 426
a=0;//     const/4 v0, -0x7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 427
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/SocketTimeoutException;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 428
a=0;//     const/4 v0, -0x8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 429
a=0;//     :cond_b
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/util/InvalidPropertiesFormatException;
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 430
a=0;//     const/16 v0, -0x1e
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 431
a=0;//     :cond_c
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Lorg/apache/http/MalformedChunkCodingException;
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 432
a=0;//     const/16 v0, -0x1f
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 433
a=0;//     :cond_d
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/MalformedURLException;
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     .line 434
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 435
a=0;//     :cond_e
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Lorg/apache/http/NoHttpResponseException;
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 436
a=0;//     const/16 v0, -0x20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 437
a=0;//     :cond_f
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/InvalidClassException;
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     .line 438
a=0;//     const/16 v0, -0x21
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 439
a=0;//     :cond_10
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/InvalidObjectException;
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     .line 440
a=0;//     const/16 v0, -0x22
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     :cond_11
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/NotActiveException;
a=0;// 
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     .line 442
a=0;//     const/16 v0, -0x23
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 443
a=0;//     :cond_12
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/NotSerializableException;
a=0;// 
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     .line 444
a=0;//     const/16 v0, -0x24
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 445
a=0;//     :cond_13
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/OptionalDataException;
a=0;// 
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     .line 446
a=0;//     const/16 v0, -0x25
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 447
a=0;//     :cond_14
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/StreamCorruptedException;
a=0;// 
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     .line 448
a=0;//     const/16 v0, -0x26
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 449
a=0;//     :cond_15
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/WriteAbortedException;
a=0;// 
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     .line 450
a=0;//     const/16 v0, -0x27
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 451
a=0;//     :cond_16
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/ProtocolException;
a=0;// 
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     .line 452
a=0;//     const/16 v0, -0x28
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 453
a=0;//     :cond_17
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljavax/net/ssl/SSLHandshakeException;
a=0;// 
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     .line 454
a=0;//     const/16 v0, -0x29
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 455
a=0;//     :cond_18
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljavax/net/ssl/SSLKeyException;
a=0;// 
a=0;//     if-eqz v0, :cond_19
a=0;// 
a=0;//     .line 456
a=0;//     const/16 v0, -0x2a
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 457
a=0;//     :cond_19
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;
a=0;// 
a=0;//     if-eqz v0, :cond_1a
a=0;// 
a=0;//     .line 458
a=0;//     const/16 v0, -0x2b
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 459
a=0;//     :cond_1a
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljavax/net/ssl/SSLProtocolException;
a=0;// 
a=0;//     if-eqz v0, :cond_1b
a=0;// 
a=0;//     .line 460
a=0;//     const/16 v0, -0x2c
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 461
a=0;//     :cond_1b
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/BindException;
a=0;// 
a=0;//     if-eqz v0, :cond_1c
a=0;// 
a=0;//     .line 462
a=0;//     const/16 v0, -0x2d
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 463
a=0;//     :cond_1c
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/ConnectException;
a=0;// 
a=0;//     if-eqz v0, :cond_1d
a=0;// 
a=0;//     .line 464
a=0;//     const/16 v0, -0x2e
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 465
a=0;//     :cond_1d
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/NoRouteToHostException;
a=0;// 
a=0;//     if-eqz v0, :cond_1e
a=0;// 
a=0;//     .line 466
a=0;//     const/16 v0, -0x2f
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     :cond_1e
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/PortUnreachableException;
a=0;// 
a=0;//     if-eqz v0, :cond_1f
a=0;// 
a=0;//     .line 468
a=0;//     const/16 v0, -0x30
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 469
a=0;//     :cond_1f
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/SyncFailedException;
a=0;// 
a=0;//     if-eqz v0, :cond_20
a=0;// 
a=0;//     .line 470
a=0;//     const/16 v0, -0x31
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 471
a=0;//     :cond_20
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/UTFDataFormatException;
a=0;// 
a=0;//     if-eqz v0, :cond_21
a=0;// 
a=0;//     .line 472
a=0;//     const/16 v0, -0x32
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 473
a=0;//     :cond_21
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/UnknownHostException;
a=0;// 
a=0;//     if-eqz v0, :cond_22
a=0;// 
a=0;//     .line 474
a=0;//     const/16 v0, -0x33
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 475
a=0;//     :cond_22
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/net/UnknownServiceException;
a=0;// 
a=0;//     if-eqz v0, :cond_23
a=0;// 
a=0;//     .line 476
a=0;//     const/16 v0, -0x34
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 477
a=0;//     :cond_23
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/io/UnsupportedEncodingException;
a=0;// 
a=0;//     if-eqz v0, :cond_24
a=0;// 
a=0;//     .line 478
a=0;//     const/16 v0, -0x35
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 479
a=0;//     :cond_24
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p0, Ljava/util/zip/ZipException;
a=0;// 
a=0;//     if-eqz v0, :cond_25
a=0;// 
a=0;//     .line 480
a=0;//     const/16 v0, -0x36
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 482
a=0;//     :cond_25
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/IllegalStateException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 620
a=0;//     #v5=(Byte);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 621
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 623
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 624
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 626
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v0, "Content-Encoding"
a=0;// 
a=0;//     invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 627
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "gzip"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v5, :cond_1
a=0;// 
a=0;//     .line 629
a=0;//     new-instance v0, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 633
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v3=(Conflicted);
a=0;//     const/16 v1, 0x200
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 634
a=0;//     :goto_1
a=0;//     #v1=(Reference,[B);v4=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, v5, :cond_0
a=0;// 
a=0;//     .line 635
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 637
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 638
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 392
a=0;//     #v1=(Byte);
a=0;//     const-string v0, "add_share"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "upload_pic"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "add_topic"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "set_user_face"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "add_t"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "add_pic_t"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "add_pic_url"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     const-string v0, "add_video"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 400
a=0;//     :cond_0
a=0;//     const-string v0, "requireApi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p2, v1, v2
a=0;// 
a=0;//     invoke-static {p0, p1, v0, v1}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 402
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 837
a=0;//     .line 838
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 839
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 840
a=0;//     invoke-static {p0}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 841
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 842
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 851
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 845
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 849
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "http.proxyHost"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 755
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 774
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 756
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 757
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 758
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0}, Landroid/os/Bundle;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 759
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 760
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     .line 761
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 762
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v6, v1, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 763
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 766
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\""
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 768
a=0;//     add-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     .line 769
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\r\n--"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 772
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 774
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 707
a=0;//     #v2=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 708
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 742
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 711
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 712
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 713
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 714
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 715
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v6, v3, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     instance-of v6, v3, [Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 719
a=0;//     :cond_2
a=0;//     instance-of v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 720
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 724
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "="
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 725
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 726
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v3, v6, :cond_5
a=0;// 
a=0;//     .line 727
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 728
a=0;//     aget-object v6, v0, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 726
a=0;//     :goto_4
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 723
a=0;//     :cond_3
a=0;//     #v3=(Boolean);v6=(Boolean);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 731
a=0;//     :cond_4
a=0;//     #v3=(Integer);v6=(Integer);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aget-object v7, v0, v3
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v6=(Integer);v7=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Boolean);v3=(Conflicted);v6=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 741
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 734
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Boolean);v6=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 738
a=0;//     :goto_6
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "="
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 737
a=0;//     :cond_7
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Boolean);v6=(Boolean);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 742
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v3=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x1bb
a=0;// 
a=0;//     .line 642
a=0;//     #v5=(PosShort);
a=0;//     new-instance v1, Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
a=0;// 
a=0;//     .line 643
a=0;//     #v1=(Reference,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     new-instance v0, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v2, "http"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/conn/scheme/PlainSocketFactory;);
a=0;//     const/16 v4, 0x50
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {v0, v2, v3, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 652
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     .line 655
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 656
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
a=0;// 
a=0;//     .line 657
a=0;//     new-instance v2, Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 658
a=0;//     #v2=(Reference,Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;);
a=0;//     sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
a=0;// 
a=0;//     .line 660
a=0;//     new-instance v0, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v3, "https"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/16 v4, 0x1bb
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v0, v3, v2, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 670
a=0;//     :goto_0
a=0;//     new-instance v2, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 673
a=0;//     #v2=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-static {p0, p1}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "Common_HttpConnectionTimeout"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 675
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x3a98
a=0;// 
a=0;//     .line 676
a=0;//     :cond_0
a=0;//     invoke-static {v2, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 678
a=0;//     invoke-static {p0, p1}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     const-string v3, "Common_SocketConnectionTimeout"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 680
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     .line 681
a=0;//     :cond_1
a=0;//     invoke-static {v2, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 684
a=0;//     sget-object v0, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v2, v0}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     .line 685
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     invoke-static {v2, v0}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 687
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "AndroidSDK_"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 690
a=0;//     invoke-static {v2, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 692
a=0;//     new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v0, v2, v1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     .line 694
a=0;//     #v0=(Reference,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     .line 697
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {p0}, Lcom/tencent/utils/HttpUtils;->getProxy(Landroid/content/Context;)Lcom/tencent/utils/HttpUtils$NetworkProxy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 698
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 699
a=0;//     new-instance v2, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/HttpHost;);
a=0;//     iget-object v3, v0, Lcom/tencent/utils/HttpUtils$NetworkProxy;->host:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, v0, Lcom/tencent/utils/HttpUtils$NetworkProxy;->port:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {v2, v3, v0}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 700
a=0;//     #v2=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const-string v3, "http.route.default-proxy"
a=0;// 
a=0;//     invoke-interface {v0, v3, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 703
a=0;//     :cond_2
a=0;//     return-object v1
a=0;// 
a=0;//     .line 661
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 662
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v0, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v2, "https"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 666
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(PosByte);v4=(PosByte);
a=0;//     new-instance v0, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v2, "https"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v2, v3, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getProxy(Landroid/content/Context;)Lcom/tencent/utils/HttpUtils$NetworkProxy;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 778
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 799
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$NetworkProxy;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 781
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 783
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 784
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 786
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/net/ConnectivityManager;);
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 787
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 788
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 791
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 792
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 793
a=0;//     invoke-static {p0}, Lcom/tencent/utils/HttpUtils;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 794
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/tencent/utils/HttpUtils;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 795
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     if-ltz v3, :cond_3
a=0;// 
a=0;//     .line 796
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$NetworkProxy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$NetworkProxy;);
a=0;//     invoke-direct {v0, v2, v3, v1}, Lcom/tencent/utils/HttpUtils$NetworkProxy;-><init>(Ljava/lang/String;ILcom/tencent/utils/HttpUtils$1;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$NetworkProxy;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 799
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/utils/Util$Statistic;
a=0;//     .locals 12
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/net/MalformedURLException;,
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;,
a=0;//             Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 493
a=0;//     #v3=(Byte);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 494
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 496
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 497
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 498
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 500
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;);
a=0;//     const-string v1, "network unavailable"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 505
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 506
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 510
a=0;//     :goto_0
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 511
a=0;//     const-string v0, "appid_for_getting_config"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 512
a=0;//     const-string v1, "appid_for_getting_config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 513
a=0;//     invoke-static {p0, v0, p1}, Lcom/tencent/utils/HttpUtils;->getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 514
a=0;//     #v6=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 525
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 526
a=0;//     #v4=(Null);
a=0;//     const-string v1, "GET"
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 527
a=0;//     invoke-static {v2}, Lcom/tencent/utils/HttpUtils;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 528
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int v1, v4, v0
a=0;// 
a=0;//     .line 529
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_3
a=0;// 
a=0;//     .line 530
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 534
a=0;//     :goto_1
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 536
a=0;//     new-instance v0, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v0, v2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 537
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const-string v2, "Accept-Encoding"
a=0;// 
a=0;//     const-string v3, "gzip"
a=0;// 
a=0;//     invoke-interface {v0, v2, v3}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v11, v1
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     move v0, v11
a=0;// 
a=0;//     .line 596
a=0;//     :goto_2
a=0;//     #v0=(Integer);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-interface {v6, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 597
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 598
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 600
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v2, v3, :cond_b
a=0;// 
a=0;//     .line 601
a=0;//     invoke-static {v1}, Lcom/tencent/utils/HttpUtils;->a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 607
a=0;//     new-instance v2, Lcom/tencent/utils/Util$Statistic;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/utils/Util$Statistic;);
a=0;//     invoke-direct {v2, v1, v0}, Lcom/tencent/utils/Util$Statistic;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/utils/Util$Statistic;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 508
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Byte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v4=(Null);v6=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 538
a=0;//     :cond_4
a=0;//     #v0=(Null);v1=(Boolean);v3=(Byte);
a=0;//     const-string v1, "POST"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 539
a=0;//     new-instance v5, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 540
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v0, "Accept-Encoding"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "gzip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 541
a=0;//     new-instance v7, Landroid/os/Bundle;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v7}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 542
a=0;//     #v7=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v8=(Reference,Ljava/util/Iterator;);v9=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 543
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 544
a=0;//     instance-of v9, v1, [B
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     .line 545
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 549
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v9=(Conflicted);
a=0;//     const-string v0, "method"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 550
a=0;//     const-string v0, "method"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 552
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "Content-Type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 554
a=0;//     const-string v0, "Connection"
a=0;// 
a=0;//     const-string v1, "Keep-Alive"
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v8, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 557
a=0;//     #v8=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v0, "--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 558
a=0;//     const-string v0, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/tencent/utils/HttpUtils;->encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 563
a=0;//     invoke-virtual {v7}, Landroid/os/Bundle;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     .line 564
a=0;//     invoke-virtual {v7}, Landroid/os/Bundle;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 566
a=0;//     #v2=(Integer);
a=0;//     const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 567
a=0;//     invoke-virtual {v7}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v3
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 568
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v10, "\"; filename=\""
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v10, "\""
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v10, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 573
a=0;//     const-string v3, "Content-Type: content/unknown\r\n\r\n"
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 575
a=0;//     invoke-virtual {v7, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 576
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 577
a=0;//     invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 579
a=0;//     :cond_9
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_8
a=0;// 
a=0;//     .line 580
a=0;//     const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 586
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 588
a=0;//     invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 589
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, v4
a=0;// 
a=0;//     .line 590
a=0;//     invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 591
a=0;//     new-instance v2, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v2, v1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 592
a=0;//     #v2=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v5, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     move-object v1, v5
a=0;// 
a=0;//     .line 593
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 604
a=0;//     :cond_b
a=0;//     #v2=(Integer);v3=(PosShort);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http status code error:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/utils/HttpUtils$HttpStatusException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Null);v1=(Boolean);v2=(Reference,Landroid/os/Bundle;);v3=(Byte);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v0, v4
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 19
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lorg/json/JSONException;,
a=0;//             Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;,
a=0;//             Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     const-string v3, "openSDK_LOG"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "OpenApi request"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "http"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "https://openmobile.qq.com/"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4, v0, v5}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "https://openmobile.qq.com/"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v5, v0, v6}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 210
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/utils/HttpUtils;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 211
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     #v9=(Null);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 217
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 218
a=0;//     #v6=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v10, "Common_HttpRetryCount"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v10}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 220
a=0;//     #v4=(Integer);
a=0;//     const-string v10, "OpenConfig_test"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "config 1:Common_HttpRetryCount            config_value:"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "   appid:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "     url:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 223
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     const-string v10, "OpenConfig_test"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "config 1:Common_HttpRetryCount            result_value:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "   appid:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "     url:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move-wide/from16 v17, v7
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     move-wide/from16 v6, v17
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     move/from16 v8, v16
a=0;// 
a=0;//     .line 229
a=0;//     :goto_1
a=0;//     #v8=(Integer);v9=(Reference,Lorg/json/JSONObject;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     add-int/lit8 v13, v8, 0x1
a=0;// 
a=0;//     .line 232
a=0;//     :try_start_0
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p4
a=0;// 
a=0;//     move-object/from16 v2, p3
a=0;// 
a=0;//     invoke-static {v0, v3, v1, v2}, Lcom/tencent/utils/HttpUtils;->openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/utils/Util$Statistic;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 234
a=0;//     #v10=(Reference,Lcom/tencent/utils/Util$Statistic;);
a=0;//     iget-object v8, v10, Lcom/tencent/utils/Util$Statistic;->response:Ljava/lang/String;
a=0;// 
a=0;//     .line 235
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_a
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_9
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_6
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_8
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 237
a=0;//     :try_start_1
a=0;//     #v14=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v8, "ret"
a=0;// 
a=0;//     invoke-virtual {v14, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_6
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 242
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v12=(Integer);
a=0;//     iget-wide v8, v10, Lcom/tencent/utils/Util$Statistic;->reqSize:J
a=0;// 
a=0;//     .line 243
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget-wide v10, v10, Lcom/tencent/utils/Util$Statistic;->rspSize:J
a=0;//     :try_end_2
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_6
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
a=0;//     .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8
a=0;// 
a=0;//     .line 323
a=0;//     :goto_3
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 324
a=0;//     return-object v14
a=0;// 
a=0;//     .line 238
a=0;//     :catch_0
a=0;//     #v4=(Integer);v8=(Reference,Ljava/lang/String;);v9=(Reference,Lorg/json/JSONObject;);v10=(Reference,Lcom/tencent/utils/Util$Statistic;);v11=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v12, -0x4
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 246
a=0;//     :catch_1
a=0;//     #v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v15, v14
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     .line 247
a=0;//     :goto_4
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v14}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v12, -0x7
a=0;// 
a=0;//     .line 249
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 250
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 251
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     if-ge v13, v4, :cond_1
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     move-wide/from16 v16, v8
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     move-object v8, v15
a=0;// 
a=0;//     #v8=(Reference,Lorg/json/JSONObject;);
a=0;//     move-wide/from16 v14, v16
a=0;// 
a=0;//     .line 322
a=0;//     :goto_5
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     if-lt v13, v4, :cond_3
a=0;// 
a=0;//     move-wide/from16 v16, v14
a=0;// 
a=0;//     move-object v14, v8
a=0;// 
a=0;//     #v14=(Reference,Lorg/json/JSONObject;);
a=0;//     move-wide/from16 v8, v16
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 255
a=0;//     :cond_1
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);v16=(Conflicted);v17=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 257
a=0;//     throw v14
a=0;// 
a=0;//     .line 259
a=0;//     :catch_2
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Lcom/tencent/utils/Util$Statistic;);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v15=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v15, v14
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     .line 260
a=0;//     :goto_6
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v14}, Ljava/net/SocketTimeoutException;->printStackTrace()V
a=0;// 
a=0;//     .line 261
a=0;//     const/4 v12, -0x8
a=0;// 
a=0;//     .line 262
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 263
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 265
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     if-ge v13, v4, :cond_2
a=0;// 
a=0;//     .line 266
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     move-wide/from16 v16, v8
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     move-object v8, v15
a=0;// 
a=0;//     #v8=(Reference,Lorg/json/JSONObject;);
a=0;//     move-wide/from16 v14, v16
a=0;// 
a=0;//     .line 267
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 269
a=0;//     :cond_2
a=0;//     #v8=(LongLo);v14=(Reference,Ljava/net/SocketTimeoutException;);v15=(Reference,Lorg/json/JSONObject;);v16=(Conflicted);v17=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 271
a=0;//     throw v14
a=0;// 
a=0;//     .line 275
a=0;//     :catch_3
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 276
a=0;//     #v14=(Reference,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     invoke-virtual {v14}, Lcom/tencent/utils/HttpUtils$HttpStatusException;->printStackTrace()V
a=0;// 
a=0;//     .line 277
a=0;//     invoke-virtual {v14}, Lcom/tencent/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 280
a=0;//     :try_start_3
a=0;//     const-string v4, "http status code error:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 282
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 288
a=0;//     :goto_7
a=0;//     #v4=(Conflicted);v8=(Conflicted);v12=(Integer);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 289
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 290
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 292
a=0;//     throw v14
a=0;// 
a=0;//     .line 283
a=0;//     :catch_4
a=0;//     #v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 286
a=0;//     const/16 v12, -0x9
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 293
a=0;//     :catch_5
a=0;//     #v4=(Integer);v12=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {v3}, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;->printStackTrace()V
a=0;// 
a=0;//     .line 295
a=0;//     throw v3
a=0;// 
a=0;//     .line 296
a=0;//     :catch_6
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 297
a=0;//     #v14=(Reference,Ljava/net/MalformedURLException;);
a=0;//     invoke-virtual {v14}, Ljava/net/MalformedURLException;->printStackTrace()V
a=0;// 
a=0;//     .line 298
a=0;//     const/4 v12, -0x3
a=0;// 
a=0;//     .line 299
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 300
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 301
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 303
a=0;//     throw v14
a=0;// 
a=0;//     .line 304
a=0;//     :catch_7
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 305
a=0;//     #v14=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v14}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 307
a=0;//     invoke-static {v14}, Lcom/tencent/utils/HttpUtils;->a(Ljava/io/IOException;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 308
a=0;//     #v12=(Integer);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 309
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 310
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 312
a=0;//     throw v14
a=0;// 
a=0;//     .line 313
a=0;//     :catch_8
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 314
a=0;//     #v14=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v14}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 315
a=0;//     const/4 v12, -0x4
a=0;// 
a=0;//     .line 316
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 317
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 318
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 320
a=0;//     throw v14
a=0;// 
a=0;//     .line 259
a=0;//     :catch_9
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Reference,Lorg/json/JSONObject;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     #v14=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v15, v9
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 246
a=0;//     :catch_a
a=0;//     #v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     #v14=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v15, v9
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v9=(LongHi);v10=(LongLo);v11=(LongHi);v12=(Byte);v14=(LongLo);v15=(LongHi);v16=(LongLo);v17=(LongHi);
a=0;//     move-object v9, v8
a=0;// 
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     move v8, v13
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenApi requestAsync"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 331
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/utils/HttpUtils$1;-><init>(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$1;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/utils/HttpUtils$1;->start()V
a=0;// 
a=0;//     .line 384
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static upload(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lorg/json/JSONObject;
a=0;//     .locals 19
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lorg/json/JSONException;,
a=0;//             Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;,
a=0;//             Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 873
a=0;//     .line 875
a=0;//     invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "http"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 879
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "https://openmobile.qq.com/"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4, v0, v5}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 881
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "https://openmobile.qq.com/"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v5, v0, v6}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 885
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/utils/HttpUtils;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 886
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 887
a=0;//     #v9=(Null);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 892
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 893
a=0;//     #v6=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v10, "Common_HttpRetryCount"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v10}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 895
a=0;//     #v4=(Integer);
a=0;//     const-string v10, "OpenConfig_test"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "config 1:Common_HttpRetryCount            config_value:"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "   appid:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "     url:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 898
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     .line 899
a=0;//     :cond_0
a=0;//     const-string v10, "OpenConfig_test"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "config 1:Common_HttpRetryCount            result_value:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "   appid:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "     url:"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v16, v6
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move-wide/from16 v17, v7
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     move-wide/from16 v6, v17
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     move/from16 v8, v16
a=0;// 
a=0;//     .line 904
a=0;//     :goto_1
a=0;//     #v8=(Integer);v9=(Reference,Lorg/json/JSONObject;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     add-int/lit8 v13, v8, 0x1
a=0;// 
a=0;//     .line 907
a=0;//     :try_start_0
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     invoke-static {v0, v3, v1}, Lcom/tencent/utils/Util;->upload(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/utils/Util$Statistic;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 909
a=0;//     #v10=(Reference,Lcom/tencent/utils/Util$Statistic;);
a=0;//     iget-object v8, v10, Lcom/tencent/utils/Util$Statistic;->response:Ljava/lang/String;
a=0;// 
a=0;//     .line 910
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_a
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_9
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_6
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_8
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 912
a=0;//     :try_start_1
a=0;//     #v14=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v8, "ret"
a=0;// 
a=0;//     invoke-virtual {v14, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_6
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 917
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v12=(Integer);
a=0;//     iget-wide v8, v10, Lcom/tencent/utils/Util$Statistic;->reqSize:J
a=0;// 
a=0;//     .line 918
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget-wide v10, v10, Lcom/tencent/utils/Util$Statistic;->rspSize:J
a=0;//     :try_end_2
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_6
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
a=0;//     .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8
a=0;// 
a=0;//     .line 998
a=0;//     :goto_3
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 999
a=0;//     return-object v14
a=0;// 
a=0;//     .line 913
a=0;//     :catch_0
a=0;//     #v4=(Integer);v8=(Reference,Ljava/lang/String;);v9=(Reference,Lorg/json/JSONObject;);v10=(Reference,Lcom/tencent/utils/Util$Statistic;);v11=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 915
a=0;//     const/4 v12, -0x4
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 921
a=0;//     :catch_1
a=0;//     #v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v15, v14
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     .line 922
a=0;//     :goto_4
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v14}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V
a=0;// 
a=0;//     .line 923
a=0;//     const/4 v12, -0x7
a=0;// 
a=0;//     .line 924
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 925
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 926
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     if-ge v13, v4, :cond_1
a=0;// 
a=0;//     .line 927
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     move-wide/from16 v16, v8
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     move-object v8, v15
a=0;// 
a=0;//     #v8=(Reference,Lorg/json/JSONObject;);
a=0;//     move-wide/from16 v14, v16
a=0;// 
a=0;//     .line 997
a=0;//     :goto_5
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     if-lt v13, v4, :cond_3
a=0;// 
a=0;//     move-wide/from16 v16, v14
a=0;// 
a=0;//     move-object v14, v8
a=0;// 
a=0;//     #v14=(Reference,Lorg/json/JSONObject;);
a=0;//     move-wide/from16 v8, v16
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 930
a=0;//     :cond_1
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);v16=(Conflicted);v17=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 932
a=0;//     throw v14
a=0;// 
a=0;//     .line 934
a=0;//     :catch_2
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Lcom/tencent/utils/Util$Statistic;);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v15=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v15, v14
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     .line 935
a=0;//     :goto_6
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v14}, Ljava/net/SocketTimeoutException;->printStackTrace()V
a=0;// 
a=0;//     .line 936
a=0;//     const/4 v12, -0x8
a=0;// 
a=0;//     .line 937
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 938
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 940
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     if-ge v13, v4, :cond_2
a=0;// 
a=0;//     .line 941
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     move-wide/from16 v16, v8
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     move-object v8, v15
a=0;// 
a=0;//     #v8=(Reference,Lorg/json/JSONObject;);
a=0;//     move-wide/from16 v14, v16
a=0;// 
a=0;//     .line 942
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 944
a=0;//     :cond_2
a=0;//     #v8=(LongLo);v14=(Reference,Ljava/net/SocketTimeoutException;);v15=(Reference,Lorg/json/JSONObject;);v16=(Conflicted);v17=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 946
a=0;//     throw v14
a=0;// 
a=0;//     .line 950
a=0;//     :catch_3
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 951
a=0;//     #v14=(Reference,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     invoke-virtual {v14}, Lcom/tencent/utils/HttpUtils$HttpStatusException;->printStackTrace()V
a=0;// 
a=0;//     .line 952
a=0;//     invoke-virtual {v14}, Lcom/tencent/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 955
a=0;//     :try_start_3
a=0;//     const-string v4, "http status code error:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 957
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 963
a=0;//     :goto_7
a=0;//     #v4=(Conflicted);v8=(Conflicted);v12=(Integer);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 964
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 965
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 967
a=0;//     throw v14
a=0;// 
a=0;//     .line 958
a=0;//     :catch_4
a=0;//     #v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 959
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 961
a=0;//     const/16 v12, -0x9
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 968
a=0;//     :catch_5
a=0;//     #v4=(Integer);v12=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 969
a=0;//     invoke-virtual {v3}, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;->printStackTrace()V
a=0;// 
a=0;//     .line 970
a=0;//     throw v3
a=0;// 
a=0;//     .line 971
a=0;//     :catch_6
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 972
a=0;//     #v14=(Reference,Ljava/net/MalformedURLException;);
a=0;//     invoke-virtual {v14}, Ljava/net/MalformedURLException;->printStackTrace()V
a=0;// 
a=0;//     .line 973
a=0;//     const/4 v12, -0x3
a=0;// 
a=0;//     .line 974
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 975
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 976
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 978
a=0;//     throw v14
a=0;// 
a=0;//     .line 979
a=0;//     :catch_7
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 980
a=0;//     #v14=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v14}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 982
a=0;//     invoke-static {v14}, Lcom/tencent/utils/HttpUtils;->a(Ljava/io/IOException;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 983
a=0;//     #v12=(Integer);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 984
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 985
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 987
a=0;//     throw v14
a=0;// 
a=0;//     .line 988
a=0;//     :catch_8
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 989
a=0;//     #v14=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v14}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 990
a=0;//     const/4 v12, -0x4
a=0;// 
a=0;//     .line 991
a=0;//     #v12=(Byte);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     .line 992
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 993
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {}, Lcom/tencent/open/a/c;->a()Lcom/tencent/open/a/c;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v3 .. v13}, Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;JJJILjava/lang/String;)V
a=0;// 
a=0;//     .line 995
a=0;//     throw v14
a=0;// 
a=0;//     .line 934
a=0;//     :catch_9
a=0;//     #v4=(Integer);v8=(Conflicted);v9=(Reference,Lorg/json/JSONObject;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Integer);v14=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     #v14=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v15, v9
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 921
a=0;//     :catch_a
a=0;//     #v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v14, v8
a=0;// 
a=0;//     #v14=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v15, v9
a=0;// 
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v9=(LongHi);v10=(LongLo);v11=(LongHi);v12=(Byte);v14=(LongLo);v15=(LongHi);v16=(LongLo);v17=(LongHi);
a=0;//     move-object v9, v8
a=0;// 
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     move v8, v13
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
