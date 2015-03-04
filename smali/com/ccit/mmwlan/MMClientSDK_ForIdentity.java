package com.ccit.mmwlan; class MMClientSDK_ForIdentity { void a() { int a;
a=0;// .class public final Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MMClientSDK_ForIdentity.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private clientsdk:Lcom/ccit/mmwlan/MMClientSDK_ForLogin;
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;// .field private userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 13
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;);
a=0;//     const-string v0, "IdentitySDK"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 15
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->clientsdk:Lcom/ccit/mmwlan/MMClientSDK_ForLogin;
a=0;// 
a=0;//     .line 16
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 17
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     .line 18
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     .line 13
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public applyCert()I
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     #v4=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     .local v10, "result":I
a=0;//     #v10=(Null);
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget v0, v0, Lcom/ccit/mmwlan/UserProfile;->cardSlot:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget v1, v1, Lcom/ccit/mmwlan/UserProfile;->loginType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget-object v2, v2, Lcom/ccit/mmwlan/UserProfile;->userName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->checkSecCert(IILjava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p0}, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->getSessionID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 94
a=0;//     .local v6, "sessionID":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget-object v3, v0, Lcom/ccit/mmwlan/UserProfile;->password:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     .local v3, "passCode":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     iget v0, v0, Lcom/ccit/mmwlan/UserProfile;->cardSlot:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget v1, v1, Lcom/ccit/mmwlan/UserProfile;->loginType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/ccit/mmwlan/UserProfile;->userName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget-object v5, v5, Lcom/ccit/mmwlan/UserProfile;->appID:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v7=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget-object v7, v7, Lcom/ccit/mmwlan/UserProfile;->moServerHost:Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move-object v8, v4
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static/range {v0 .. v9}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->applySecCert(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpHost;I)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 98
a=0;//     .end local v3    # "passCode":Ljava/lang/String;
a=0;//     .end local v6    # "sessionID":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Integer);
a=0;//     return v10
a=0;// .end method
a=0;// 
a=0;// .method public getDeviceID()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "deviceID":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     iget-object v3, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v2, Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     invoke-direct {v2}, Lcom/ccit/mmwlan/util/GetDeviceInfo;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     .local v2, "getDevInfo":Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     iget-object v3, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->context:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     iget v4, v4, Lcom/ccit/mmwlan/UserProfile;->cardSlot:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 59
a=0;//     .end local v2    # "getDevInfo":Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/ccit/mmwlan/vo/DeviceInfo;->getStrImei()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 54
a=0;//     .restart local v2    # "getDevInfo":Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getIdentity()Ljava/lang/String;
a=0;//     .locals 21
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 108
a=0;//     .local v9, "identity":Ljava/lang/String;
a=0;//     #v9=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 110
a=0;//     .local v15, "signature":Ljava/lang/String;
a=0;//     #v15=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->getSessionID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 111
a=0;//     .local v14, "sessionID":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;);
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Lcom/ccit/mmwlan/UserProfile;->cardSlot:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;);
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Lcom/ccit/mmwlan/UserProfile;->loginType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;);
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/UserProfile;->userName:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Lcom/ccit/mmwlan/UserProfile;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/UserProfile;->appID:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v3, v20
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v14, v3}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->SIDSign(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 113
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const-string v17, "<req><sidSignature>%s</sidSignature></req>"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     aput-object v15, v18, v19
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 114
a=0;//     .local v12, "reqMsg":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;);
a=0;//     invoke-direct {v8}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     .local v8, "httpTool":Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;
a=0;//     #v8=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;);
a=0;//     new-instance v11, Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     invoke-direct {v11}, Lcom/ccit/mmwlan/util/ReadConfigFile;-><init>()V
a=0;// 
a=0;//     .line 116
a=0;//     .local v11, "readConfigFile":Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;//     #v11=(Reference,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v18, "http://"
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/UserProfile;->moServerHost:Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     const-string v18, ":"
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 117
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ccit/mmwlan/UserProfile;->moServerHost:Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     const-string v18, "/"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 118
a=0;//     const-string v18, "applyIdentUrl"
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lcom/ccit/mmwlan/util/ReadConfigFile;->getConfigInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 119
a=0;//     .local v4, "applyIdentUrl":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     check-cast v13, [B
a=0;// 
a=0;//     .line 121
a=0;//     .local v13, "respContent":[B
a=0;//     :try_start_0
a=0;//     #v13=(Reference,[B);
a=0;//     invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v8, v4, v0, v1}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->doPostByHttpClient(Ljava/lang/String;[BLorg/apache/http/HttpHost;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     #v1=(Integer);v6=(Conflicted);v18=(Reference,Ljava/lang/String;);
a=0;//     new-instance v16, Ljava/lang/String;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v13}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 128
a=0;//     .local v16, "xml":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v17, "result"
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 129
a=0;//     .local v7, "firstIndex":I
a=0;//     #v7=(Integer);
a=0;//     const-string v17, "result"
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 130
a=0;//     .local v10, "lastIndex":I
a=0;//     #v10=(Integer);
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v7, v0, :cond_0
a=0;// 
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-eq v10, v0, :cond_0
a=0;// 
a=0;//     add-int/lit8 v17, v7, 0x7
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     add-int/lit8 v18, v10, -0x3
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     add-int/lit8 v17, v10, -0x3
a=0;// 
a=0;//     add-int/lit8 v18, v7, 0x7
a=0;// 
a=0;//     sub-int v17, v17, v18
a=0;// 
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     new-array v5, v0, [C
a=0;// 
a=0;//     .line 133
a=0;//     .local v5, "buffer":[C
a=0;//     #v5=(Reference,[C);
a=0;//     add-int/lit8 v17, v7, 0x7
a=0;// 
a=0;//     add-int/lit8 v18, v10, -0x3
a=0;// 
a=0;//     add-int/lit8 v18, v18, 0x1
a=0;// 
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v19
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v5, v3}, Ljava/lang/String;->getChars(II[CI)V
a=0;// 
a=0;//     .line 134
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     if-nez v17, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     const-string v17, "mobilephone"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 137
a=0;//     const-string v17, "mobilephone"
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 138
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v7, v0, :cond_0
a=0;// 
a=0;//     const/16 v17, -0x1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-eq v10, v0, :cond_0
a=0;// 
a=0;//     add-int/lit8 v17, v7, 0xc
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     add-int/lit8 v18, v10, -0x3
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     add-int/lit8 v17, v10, -0x3
a=0;// 
a=0;//     add-int/lit8 v18, v7, 0xc
a=0;// 
a=0;//     sub-int v17, v17, v18
a=0;// 
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     new-array v5, v0, [C
a=0;// 
a=0;//     .line 141
a=0;//     add-int/lit8 v17, v7, 0xc
a=0;// 
a=0;//     add-int/lit8 v18, v10, -0x3
a=0;// 
a=0;//     add-int/lit8 v18, v18, 0x1
a=0;// 
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     move/from16 v3, v19
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v5, v3}, Ljava/lang/String;->getChars(II[CI)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v18, "13900000000"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v9, Ljava/lang/String;
a=0;// 
a=0;//     .end local v9    # "identity":Ljava/lang/String;
a=0;//     #v9=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v5}, Ljava/lang/String;-><init>([C)V
a=0;// 
a=0;//     .line 150
a=0;//     .end local v5    # "buffer":[C
a=0;//     .restart local v9    # "identity":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v9=(Reference,Ljava/lang/String;);v17=(Integer);v18=(Conflicted);
a=0;//     return-object v9
a=0;// 
a=0;//     .line 123
a=0;//     .end local v7    # "firstIndex":I
a=0;//     .end local v10    # "lastIndex":I
a=0;//     .end local v16    # "xml":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Null);v10=(Uninit);v16=(Uninit);v17=(Reference,Ljava/lang/Object;);v18=(Reference,Ljava/lang/String;);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 125
a=0;//     .local v6, "e":Ljava/lang/Exception;
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSessionID()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "sessionID":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public initContext(Landroid/content/Context;Lcom/ccit/mmwlan/UserProfile;)I
a=0;//     .locals 2
a=0;//     .param p1, "appContext"    # Landroid/content/Context;
a=0;//     .param p2, "userProfile"    # Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "result":I
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->clientsdk:Lcom/ccit/mmwlan/MMClientSDK_ForLogin;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForLogin;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     new-instance v1, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ccit/mmwlan/MMClientSDK_ForLogin;);
a=0;//     invoke-direct {v1}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForLogin;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->clientsdk:Lcom/ccit/mmwlan/MMClientSDK_ForLogin;
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     iget v1, p2, Lcom/ccit/mmwlan/UserProfile;->cardSlot:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->initMmClientSdk(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(Integer);
a=0;//     iput-object p1, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p2, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     .line 38
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public registerIdentity()Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 159
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 162
a=0;//     .local v7, "instruction":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 163
a=0;//     .local v3, "msg":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     const-string v4, "md5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->deviceInfo:Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     invoke-virtual {v5}, Lcom/ccit/mmwlan/vo/DeviceInfo;->getStrImsi()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDigest(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 164
a=0;//     .local v6, "imsi":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GDWLANIDP#%s#%s:%s"
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object v6, v5, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {p0}, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->getSessionID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v5, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     iget-object v9, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->userProfile:Lcom/ccit/mmwlan/UserProfile;
a=0;// 
a=0;//     iget-object v9, v9, Lcom/ccit/mmwlan/UserProfile;->appID:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v9, v5, v8
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 166
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 167
a=0;//     .local v0, "smsManager":Landroid/telephony/SmsManager;
a=0;//     #v0=(Reference,Landroid/telephony/SmsManager;);
a=0;//     const-string v1, "10658682803"
a=0;// 
a=0;//     .local v1, "SMSNumber":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     .line 168
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v2, p0, Lcom/ccit/mmwlan/MMClientSDK_ForIdentity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "send sms:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " to:"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 170
a=0;//     move-object v7, v3
a=0;// 
a=0;//     .line 172
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     return-object v7
a=0;// .end method
}}
