package com.ccit.mmwlan; class MMClientSDK_ForPad { void a() { int a;
a=0;// .class public final Lcom/ccit/mmwlan/MMClientSDK_ForPad;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MMClientSDK_ForPad.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final INT_RESULT_0:I = 0x0
a=0;// 
a=0;// .field private static final INT_RESULT_1:I = 0x1
a=0;// 
a=0;// .field private static final INT_RESULT_2:I = 0x2
a=0;// 
a=0;// .field private static final INT_RESULT_3:I = 0x3
a=0;// 
a=0;// .field private static final INT_RESULT_4:I = 0x4
a=0;// 
a=0;// .field private static final INT_RESULT_5:I = 0x5
a=0;// 
a=0;// .field private static final INT_RESULT_6:I = 0x6
a=0;// 
a=0;// .field private static final INT_RESULT_7:I = 0x7
a=0;// 
a=0;// .field private static final MMCLIENT_SDK:Ljava/lang/String; = "MMClientSDK_ForPad"
a=0;// 
a=0;// .field private static clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;// .field private static context:Landroid/content/Context;
a=0;// 
a=0;// .field private static strApplyCert:Ljava/lang/String;
a=0;// 
a=0;// .field private static strDeviceOuth:Ljava/lang/String;
a=0;// 
a=0;// .field private static strGetDeviceName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 41
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     .line 42
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strDeviceOuth:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strApplyCert:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strGetDeviceName:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/ClientSDK;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForPad;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static DestorySecCert(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;//     .param p0, "strAuthCode"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1286
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1290
a=0;//     .local v1, "iRet":I
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2, p0}, Lcom/ccit/mmwlan/ClientSDK;->DestorySecCertForBilling(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1293
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "DestroySecCert() iRet -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1296
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1302
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1297
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1299
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static RSAEncryptWithPubKey(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "strBase64PlainText"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 1252
a=0;//     #v5=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1256
a=0;//     .local v1, "strRet":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2, p0}, Lcom/ccit/mmwlan/ClientSDK;->AsymmetricEncryptionForBilling(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1257
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1259
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1263
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "RSAEncryptWithPubKey() strRet -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1264
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1263
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1273
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1267
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1269
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1270
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static applyCert(Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .locals 22
a=0;//     .param p0, "appid"    # Ljava/lang/String;
a=0;//     .param p1, "deviceAuthorizationCode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 579
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 582
a=0;//     .local v13, "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v13=(Null);
a=0;//     new-instance v13, Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     .end local v13    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v13=(UninitRef,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     invoke-direct {v13}, Lcom/ccit/mmwlan/vo/SignView;-><init>()V
a=0;// 
a=0;//     .line 583
a=0;//     .restart local v13    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v13=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .line 585
a=0;//     .local v11, "iResult":I
a=0;//     #v11=(Byte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strApplyCert:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v6, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v6, "mmwlan/applyCert_PAD"
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 588
a=0;//     .local v19, "strUrl":Ljava/lang/String;
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->imeiOfMD5Value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 589
a=0;//     .local v3, "strImeiMD5":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "5"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 591
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 592
a=0;//     const-string v2, "\u83b7\u53d6IMEIMD5\u503c\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 742
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);v21=(Conflicted);
a=0;//     return-object v13
a=0;// 
a=0;//     .line 597
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Byte);v12=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);v21=(Uninit);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->genSid_PAD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 598
a=0;//     .local v4, "strSID":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "2"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 600
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 601
a=0;//     const-string v2, "\u51c6\u5907PKI\u5bc6\u94a5\u5bf9\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 606
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->genPKIKey_PAD()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 607
a=0;//     .local v10, "iGenPKIKEYResult":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v2, v10, :cond_3
a=0;// 
a=0;//     .line 609
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 610
a=0;//     const-string v2, "\u7533\u8bf7\u5b89\u5168\u51ed\u8bc1\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 616
a=0;//     :cond_3
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->getGenPubkey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 617
a=0;//     .local v5, "strPubKey":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "4"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 619
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 620
a=0;//     const-string v2, "\u4fdd\u5b58\u5b89\u5168\u51ed\u8bc1\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 627
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 628
a=0;//     .local v17, "strRequestXML":Ljava/lang/String;
a=0;//     #v17=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     check-cast v7, [B
a=0;// 
a=0;//     .line 629
a=0;//     .local v7, "byResponse":[B
a=0;//     #v7=(Reference,[B);
a=0;//     new-instance v1, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     invoke-direct {v1}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;-><init>()V
a=0;// 
a=0;//     .line 630
a=0;//     .local v1, "httpConnetTool":Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     if-nez p1, :cond_6
a=0;// 
a=0;//     .line 633
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     .line 632
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v1 .. v6}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->ConbinCertApply(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 642
a=0;//     :goto_1
a=0;//     #v6=(Reference,Ljava/lang/String;);v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v21, "applyCert() strRequestXML -> "
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 646
a=0;//     new-instance v12, Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     invoke-direct {v12}, Lcom/ccit/mmwlan/httpClient/InflaterTool;-><init>()V
a=0;// 
a=0;//     .line 650
a=0;//     .local v12, "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     :try_start_0
a=0;//     #v12=(Reference,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 649
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->doPost(Ljava/lang/String;[B)[B
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 653
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v21, "applyCert() byResponse -> "
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 654
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v21, Ljava/lang/String;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v7}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 653
a=0;//     invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 659
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v7}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v2}, Lcom/ccit/mmwlan/httpClient/InflaterTool;->getServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 662
a=0;//     .local v8, "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 664
a=0;//     .local v14, "strCertResult":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getErrormsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 665
a=0;//     .local v15, "strError":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v15}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 668
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v21, "applyCert() strCertResult -> "
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 669
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 668
a=0;//     invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 673
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 676
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 679
a=0;//     .local v18, "strSecCert":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getRandNum()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 682
a=0;//     .local v16, "strRandom":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v16, :cond_5
a=0;// 
a=0;//     .line 684
a=0;//     invoke-static/range {v16 .. v16}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->updateRandNum_PAD(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 686
a=0;//     .local v20, "upRandomResult":I
a=0;//     #v20=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v13, v0}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 687
a=0;//     if-nez v20, :cond_0
a=0;// 
a=0;//     .line 699
a=0;//     .end local v20    # "upRandomResult":I
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v20=(Conflicted);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, v6}, Lcom/ccit/mmwlan/ClientSDK;->saveSecCertNativeForBilling(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 701
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v13, v11}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 704
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v21, "applyCert() saveSecCertNative -> "
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 705
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 704
a=0;//     invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 717
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 718
a=0;//     const-string v2, "\u6210\u529f"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 727
a=0;//     .end local v8    # "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     .end local v14    # "strCertResult":Ljava/lang/String;
a=0;//     .end local v15    # "strError":Ljava/lang/String;
a=0;//     .end local v16    # "strRandom":Ljava/lang/String;
a=0;//     .end local v18    # "strSecCert":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Conflicted);v21=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 730
a=0;//     .local v9, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v9=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 731
a=0;//     const-string v2, "\u7b7e\u540d\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 733
a=0;//     invoke-virtual {v9}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .end local v9    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     .end local v12    # "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v2=(Boolean);v6=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Uninit);v11=(Byte);v12=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Null);v18=(Uninit);v20=(Uninit);v21=(Uninit);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v6, p1
a=0;// 
a=0;//     .line 636
a=0;//     invoke-virtual/range {v1 .. v6}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->ConbinCertApply(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 708
a=0;//     .restart local v8    # "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     .restart local v12    # "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     .restart local v14    # "strCertResult":Ljava/lang/String;
a=0;//     .restart local v15    # "strError":Ljava/lang/String;
a=0;//     .restart local v16    # "strRandom":Ljava/lang/String;
a=0;//     .restart local v18    # "strSecCert":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v6=(Conflicted);v8=(Reference,Ljava/util/ArrayList;);v11=(Integer);v12=(Reference,Lcom/ccit/mmwlan/httpClient/InflaterTool;);v14=(Reference,Ljava/lang/String;);v15=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/String;);v18=(Reference,Ljava/lang/String;);v20=(Conflicted);v21=(Reference,Ljava/lang/String;);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 711
a=0;//     .local v9, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v9=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     :try_start_3
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 712
a=0;//     const-string v2, "\u4fdd\u5b58\u5b89\u5168\u51ed\u8bc1\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 713
a=0;//     invoke-virtual {v9}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 734
a=0;//     .end local v8    # "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     .end local v9    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v14    # "strCertResult":Ljava/lang/String;
a=0;//     .end local v15    # "strError":Ljava/lang/String;
a=0;//     .end local v16    # "strRandom":Ljava/lang/String;
a=0;//     .end local v18    # "strSecCert":Ljava/lang/String;
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Conflicted);v21=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 737
a=0;//     .local v9, "e":Ljava/lang/Exception;
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 738
a=0;//     const-string v2, "\u7b7e\u540d\u5931\u8d25"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 739
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 723
a=0;//     .end local v9    # "e":Ljava/lang/Exception;
a=0;//     .restart local v8    # "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     .restart local v14    # "strCertResult":Ljava/lang/String;
a=0;//     .restart local v15    # "strError":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Boolean);v6=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/util/ArrayList;);v9=(Uninit);v11=(Byte);v14=(Reference,Ljava/lang/String;);v15=(Reference,Ljava/lang/String;);v16=(Uninit);v18=(Uninit);v20=(Uninit);v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 724
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v13, v11}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static applyCert_PAD(Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .locals 3
a=0;//     .param p0, "appid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 553
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 556
a=0;//     .local v0, "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     .end local v0    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/vo/SignView;-><init>()V
a=0;// 
a=0;//     .line 558
a=0;//     .restart local v0    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 561
a=0;//     const-string v2, "\u83b7\u53d6\u5e94\u7528appid\u9519\u8bef"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 567
a=0;//     .end local v0    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .local v1, "signView":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 565
a=0;//     .end local v1    # "signView":Ljava/lang/Object;
a=0;//     .restart local v0    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, v2}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->applyCert(Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 567
a=0;//     .restart local v1    # "signView":Ljava/lang/Object;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static authProcess(Lcom/ccit/mmwlan/vo/SignView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .locals 17
a=0;//     .param p0, "signView"    # Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "strImeiMD5"    # Ljava/lang/String;
a=0;//     .param p3, "deviceName"    # Ljava/lang/String;
a=0;//     .param p4, "mobilePhone"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http://"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strDeviceOuth:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 426
a=0;//     const-string v3, "mmwlan/ApplyDeviceAuth_PAD"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 428
a=0;//     .local v16, "strUrl":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "authProcess() strUrl -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 432
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 433
a=0;//     .local v15, "strRequestXML":Ljava/lang/String;
a=0;//     #v15=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     check-cast v9, [B
a=0;// 
a=0;//     .line 435
a=0;//     .local v9, "byResponse":[B
a=0;//     #v9=(Reference,[B);
a=0;//     new-instance v1, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     invoke-direct {v1}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;-><init>()V
a=0;// 
a=0;//     .line 437
a=0;//     .local v1, "httpConnetTool":Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v2, p1
a=0;// 
a=0;//     move-object/from16 v3, p4
a=0;// 
a=0;//     move-object/from16 v4, p2
a=0;// 
a=0;//     move-object/from16 v6, p3
a=0;// 
a=0;//     .line 436
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v1 .. v8}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->conbinGetDeviceAuth(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 440
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "authProcess() strRequestXML -> "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 441
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 440
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 445
a=0;//     new-instance v13, Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     invoke-direct {v13}, Lcom/ccit/mmwlan/httpClient/InflaterTool;-><init>()V
a=0;// 
a=0;//     .line 449
a=0;//     .local v13, "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     :try_start_0
a=0;//     #v13=(Reference,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 448
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->doPost(Ljava/lang/String;[B)[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 452
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "authProcess() byResponse -> "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 453
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v9}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 452
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 458
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v9}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v2}, Lcom/ccit/mmwlan/httpClient/InflaterTool;->getDeviceAuthServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 461
a=0;//     .local v10, "deviceAuthInfoList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/DeviceAuthInfo;>;"
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/ccit/mmwlan/vo/DeviceAuthInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/vo/DeviceAuthInfo;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 468
a=0;//     .local v14, "strCertResult":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/ccit/mmwlan/vo/DeviceAuthInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/vo/DeviceAuthInfo;->getErrormsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 469
a=0;//     .local v12, "error":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 474
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "authProcess() strCertResult -> "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 475
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 474
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 478
a=0;//     invoke-virtual {v14}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 490
a=0;//     .end local v10    # "deviceAuthInfoList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/DeviceAuthInfo;>;"
a=0;//     .end local v12    # "error":Ljava/lang/String;
a=0;//     .end local v14    # "strCertResult":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 480
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v11=(Uninit);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 482
a=0;//     .local v11, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v11=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 483
a=0;//     invoke-virtual {v11}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 484
a=0;//     .end local v11    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v11=(Uninit);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 486
a=0;//     .local v11, "e":Ljava/lang/Exception;
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 487
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static checkSecCert_PAD()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 167
a=0;//     .local v1, "iResult":I
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->checkSecCertNativeForBilling()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 170
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "checkSecCert_PAD() -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 179
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 173
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 175
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 176
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static genPKIKey_PAD()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 967
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 971
a=0;//     .local v1, "iResult":I
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->genPKIKeyNativeForBilling()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 974
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "genPKIKey_PAD() -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 983
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 977
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 979
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     .line 980
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static genSid_PAD()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 936
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 940
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->genSIDNative()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 941
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 943
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 947
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "genSid_PAD() -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 956
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 950
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 952
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 953
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDeviceID_PAD()Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 192
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 193
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 194
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const-string v6, "phone"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 196
a=0;//     .local v1, "mTelephonyMgr":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 197
a=0;//     .local v3, "strIMEI":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 199
a=0;//     const-string v6, "wifi"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 198
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 200
a=0;//     .local v4, "wifi":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     .local v0, "info":Landroid/net/wifi/WifiInfo;
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiInfo;);
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 204
a=0;//     const-string v5, "MMClientSDK_ForPad"
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "getDeviceID_PAD() MacAddress -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 204
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 219
a=0;//     .end local v0    # "info":Landroid/net/wifi/WifiInfo;
a=0;//     .end local v4    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v4=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 214
a=0;//     const-string v5, "MMClientSDK_ForPad"
a=0;// 
a=0;//     .line 215
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "getDeviceID_PAD() strIMEI -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 214
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDeviceNameNew_PAD()Lcom/ccit/mmwlan/vo/DeviceName;
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     .line 862
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "http://"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v12, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strGetDeviceName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "/"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 863
a=0;//     const-string v12, "mmwlan/getDeviceName_PAD"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 862
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 866
a=0;//     .local v10, "strURL":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     invoke-direct {v6}, Lcom/ccit/mmwlan/vo/DeviceName;-><init>()V
a=0;// 
a=0;//     .line 869
a=0;//     .local v6, "stDeviceNameFirst":Lcom/ccit/mmwlan/vo/DeviceName;
a=0;//     #v6=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->imeiOfMD5Value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 870
a=0;//     .local v8, "strImeiMD5":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "5"
a=0;// 
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_0
a=0;// 
a=0;//     .line 872
a=0;//     const-string v11, "5"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setResult(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 873
a=0;//     const-string v11, "imei/imsi/mac\u7684MD5\u5931\u8d25"
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setErrormsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 874
a=0;//     const-string v11, ""
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setDeviceName(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v7, v6
a=0;// 
a=0;//     .line 925
a=0;//     .end local v6    # "stDeviceNameFirst":Lcom/ccit/mmwlan/vo/DeviceName;
a=0;//     .local v7, "stDeviceNameFirst":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 880
a=0;//     .end local v7    # "stDeviceNameFirst":Ljava/lang/Object;
a=0;//     .restart local v6    # "stDeviceNameFirst":Lcom/ccit/mmwlan/vo/DeviceName;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);v11=(Boolean);v12=(Reference,Ljava/lang/String;);v13=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 881
a=0;//     .local v9, "strRequestXML":Ljava/lang/String;
a=0;//     #v9=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     .line 883
a=0;//     .local v1, "byResponse":[B
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v4, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     invoke-direct {v4}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;-><init>()V
a=0;// 
a=0;//     .line 884
a=0;//     .local v4, "httpConnetTool":Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     invoke-virtual {v4, v8}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->conbinGetDeviceName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 887
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "getDeviceName_PAD() strRequestXML -> "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 888
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 887
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 892
a=0;//     new-instance v5, Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     invoke-direct {v5}, Lcom/ccit/mmwlan/httpClient/InflaterTool;-><init>()V
a=0;// 
a=0;//     .line 896
a=0;//     .local v5, "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     const-string v11, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v9, v11}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 895
a=0;//     invoke-virtual {v4, v10, v11}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->doPost(Ljava/lang/String;[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 899
a=0;//     const-string v11, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "getDeviceName_PAD() byResponse -> "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 900
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v13, Ljava/lang/String;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v13, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 899
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 905
a=0;//     new-instance v11, Ljava/lang/String;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v11}, Lcom/ccit/mmwlan/httpClient/InflaterTool;->getDeviceNameServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 908
a=0;//     .local v2, "deviceNameList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/DeviceName;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v11
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     move-object v6, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .end local v2    # "deviceNameList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/DeviceName;>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-object v7, v6
a=0;// 
a=0;//     .line 925
a=0;//     .restart local v7    # "stDeviceNameFirst":Ljava/lang/Object;
a=0;//     #v7=(Reference,Lcom/ccit/mmwlan/vo/DeviceName;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 910
a=0;//     .end local v7    # "stDeviceNameFirst":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v3=(Uninit);v7=(Uninit);v11=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 912
a=0;//     .local v3, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v3=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     const-string v11, "7"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setResult(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 913
a=0;//     const-string v11, "\u8bf7\u6c42\u8bbe\u5907\u540d\u5931\u8d25"
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setErrormsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 914
a=0;//     const-string v11, ""
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setDeviceName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 915
a=0;//     invoke-virtual {v3}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 916
a=0;//     .end local v3    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_1
a=0;//     #v3=(Uninit);v11=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 918
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v11, "7"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setResult(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 919
a=0;//     const-string v11, "\u8bf7\u6c42\u8bbe\u5907\u540d\u5931\u8d25"
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setErrormsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 920
a=0;//     const-string v11, ""
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Lcom/ccit/mmwlan/vo/DeviceName;->setDeviceName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 922
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getDeviceName_PAD()Ljava/lang/String;
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     new-instance v16, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v17, "http://"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v17, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strGetDeviceName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     const-string v17, "/"
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 755
a=0;//     const-string v17, "mmwlan/getDeviceName_PAD"
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 754
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 757
a=0;//     .local v12, "strURL":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 760
a=0;//     .local v6, "sb":Ljava/lang/StringBuilder;
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->imeiOfMD5Value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 761
a=0;//     .local v9, "strImeiMD5":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, "5"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Boolean);
a=0;//     if-eqz v16, :cond_0
a=0;// 
a=0;//     .line 763
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 764
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 765
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 847
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return-object v16
a=0;// 
a=0;//     .line 769
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Boolean);v17=(Reference,Ljava/lang/String;);v18=(Uninit);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 770
a=0;//     .local v10, "strRequestXML":Ljava/lang/String;
a=0;//     #v10=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     .line 772
a=0;//     .local v1, "byResponse":[B
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v4, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     invoke-direct {v4}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;-><init>()V
a=0;// 
a=0;//     .line 773
a=0;//     .local v4, "httpConnetTool":Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;);
a=0;//     invoke-virtual {v4, v9}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->conbinGetDeviceName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 776
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v18, "getDeviceName_PAD() strRequestXML -> "
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 777
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 776
a=0;//     invoke-static/range {v16 .. v17}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 781
a=0;//     new-instance v5, Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     invoke-direct {v5}, Lcom/ccit/mmwlan/httpClient/InflaterTool;-><init>()V
a=0;// 
a=0;//     .line 785
a=0;//     .local v5, "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     const-string v16, "utf-8"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v10, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 784
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v4, v12, v0}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForBilling;->doPost(Ljava/lang/String;[B)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 788
a=0;//     const-string v16, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v18, "getDeviceName_PAD() byResponse -> "
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 789
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v18, Ljava/lang/String;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 788
a=0;//     invoke-static/range {v16 .. v17}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 794
a=0;//     new-instance v16, Ljava/lang/String;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lcom/ccit/mmwlan/httpClient/InflaterTool;->getDeviceNameServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 797
a=0;//     .local v2, "deviceNameList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/DeviceName;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/ccit/mmwlan/vo/DeviceName;->getDeviceName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 798
a=0;//     .local v13, "strXMLResult":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/ccit/mmwlan/vo/DeviceName;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 799
a=0;//     .local v11, "strResult":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/ccit/mmwlan/vo/DeviceName;->getErrormsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 802
a=0;//     .local v8, "strErrormsg":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v18, "getDeviceName_PAD() strXMLResult -> "
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 803
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 802
a=0;//     invoke-static/range {v16 .. v17}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 807
a=0;//     const-string v16, "0"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Boolean);
a=0;//     if-eqz v16, :cond_1
a=0;// 
a=0;//     .line 809
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/ccit/mmwlan/vo/DeviceName;->getDeviceName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 810
a=0;//     .local v7, "strDeviceName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/ccit/mmwlan/vo/DeviceName;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 811
a=0;//     .local v15, "strgetResult":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Lcom/ccit/mmwlan/vo/DeviceName;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/ccit/mmwlan/vo/DeviceName;->getErrormsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 812
a=0;//     .local v14, "strgetErrormsg":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, "strDeviceName --- >"
a=0;// 
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v18, "strDeviceName"
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-static/range {v16 .. v17}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 816
a=0;//     const-string v16, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v18, "getDeviceName_PAD() strDeviceName -> "
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 817
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 816
a=0;//     invoke-static/range {v16 .. v17}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 820
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 821
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 822
a=0;//     invoke-virtual {v15}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 823
a=0;//     invoke-virtual {v14}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 828
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 831
a=0;//     .end local v7    # "strDeviceName":Ljava/lang/String;
a=0;//     .end local v14    # "strgetErrormsg":Ljava/lang/String;
a=0;//     .end local v15    # "strgetResult":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v7=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Boolean);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 832
a=0;//     invoke-virtual {v13}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 847
a=0;//     .end local v2    # "deviceNameList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/DeviceName;>;"
a=0;//     .end local v8    # "strErrormsg":Ljava/lang/String;
a=0;//     .end local v11    # "strResult":Ljava/lang/String;
a=0;//     .end local v13    # "strXMLResult":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 835
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Uninit);v16=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 837
a=0;//     .local v3, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v3=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 838
a=0;//     const/16 v16, 0x7
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 839
a=0;//     invoke-virtual {v3}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 840
a=0;//     .end local v3    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v3=(Uninit);v16=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 842
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 843
a=0;//     const/16 v16, 0x7
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 844
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static getGenPubkey()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     .line 993
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 996
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->getPubKeyForBilling()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 997
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 999
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1013
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1004
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "getGenPubkey() -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1007
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1009
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1010
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getIMSI_PAD()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 234
a=0;//     const-string v1, "10086"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 237
a=0;//     const-string v1, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getIMSI_PAD() strIMEI -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static getVersion()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     const-string v0, "1.1.6"
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "strVersion":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getVersion() -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 119
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static imeiOfMD5Value()Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1213
a=0;//     #v7=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1214
a=0;//     .local v2, "strIMEI":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 1216
a=0;//     .local v1, "sb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->getDeviceID_PAD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1219
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     const-string v5, "md5"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5, v2}, Lcom/ccit/mmwlan/ClientSDK;->getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1220
a=0;//     .local v3, "strMD5Result":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1222
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1223
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1224
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1242
a=0;//     .end local v3    # "strMD5Result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 1227
a=0;//     .restart local v3    # "strMD5Result":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v3=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);
a=0;//     const-string v4, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "imeiOfMD5Value() strMD5Result -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1228
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1227
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1232
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1233
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1242
a=0;//     .end local v3    # "strMD5Result":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1235
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1237
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1238
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1239
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static initialImsiAndImeiValue()I
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1099
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 1100
a=0;//     .local v3, "iResult":I
a=0;//     #v3=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1101
a=0;//     .local v6, "strIMSI":Ljava/lang/String;
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1103
a=0;//     .local v5, "strIMEI":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     new-instance v1, Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     invoke-direct {v1}, Lcom/ccit/mmwlan/vo/DeviceInfo;-><init>()V
a=0;// 
a=0;//     .line 1105
a=0;//     .local v1, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const-string v6, "10086"
a=0;// 
a=0;//     .line 1106
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImei(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1108
a=0;//     const-string v7, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "initialImsiAndImeiValue() strIMSI -> "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1109
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1108
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1113
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->getDeviceID_PAD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1116
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "initialImsiAndImeiValue() IMEI ->"
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1119
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 1121
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1164
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v8=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 1125
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Byte);v4=(Uninit);v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImsi(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1127
a=0;//     const-string v7, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "initialImsiAndImeiValue() strIMEI -> "
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1128
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1127
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1131
a=0;//     sget-object v7, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1132
a=0;//     .local v0, "certFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1133
a=0;//     .local v4, "strFilePath":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setFilePath(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1136
a=0;//     const-string v7, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "initialImsiAndImeiValue() FilePath -> "
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1137
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1136
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1142
a=0;//     :try_start_0
a=0;//     sget-object v7, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Lcom/ccit/mmwlan/ClientSDK;->transmitInfoNative(Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1145
a=0;//     #v3=(Integer);
a=0;//     const-string v7, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "initialImsiAndImeiValue() iResult -> "
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1146
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1145
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1150
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 1152
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1163
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(PosByte);v8=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1164
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1155
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Integer);v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1157
a=0;//     :catch_0
a=0;//     #v3=(Integer);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 1159
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     .line 1160
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static initialMMSDK(Landroid/content/Context;Lcom/ccit/mmwlan/vo/IPDress_ForPad;)I
a=0;//     .locals 5
a=0;//     .param p0, "context1"    # Landroid/content/Context;
a=0;//     .param p1, "ipDress"    # Lcom/ccit/mmwlan/vo/IPDress_ForPad;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "iResult":I
a=0;//     #v0=(Byte);
a=0;//     sput-object p0, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 68
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "iResult":I
a=0;//     .local v1, "iResult":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 74
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v0    # "iResult":I
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/vo/IPDress_ForPad;->getStrDeviceOuthIp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/vo/IPDress_ForPad;->getStrApplySecCertIP()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/vo/IPDress_ForPad;->getStrGetDeviceName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 78
a=0;//     :cond_1
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 79
a=0;//     .end local v0    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 82
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v0    # "iResult":I
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/vo/IPDress_ForPad;->getStrDeviceOuthIp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strDeviceOuth:Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/vo/IPDress_ForPad;->getStrApplySecCertIP()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strApplyCert:Ljava/lang/String;
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/vo/IPDress_ForPad;->getStrGetDeviceName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strGetDeviceName:Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "initialMMSDK() strIPDress -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strApplyCert:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 90
a=0;//     const-string v4, "  :  "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->strApplyCert:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 89
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 94
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->initialImsiAndImeiValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "initialMMSDK() -> "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static md5Algorithm(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "strPlaintText"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 130
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 152
a=0;//     .end local v1    # "strResult":Ljava/lang/String;
a=0;//     .local v2, "strResult":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 140
a=0;//     .end local v2    # "strResult":Ljava/lang/String;
a=0;//     .restart local v1    # "strResult":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     const-string v4, "md5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, p0}, Lcom/ccit/mmwlan/ClientSDK;->getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 141
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 143
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 152
a=0;//     .end local v1    # "strResult":Ljava/lang/String;
a=0;//     .restart local v2    # "strResult":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     .end local v2    # "strResult":Ljava/lang/String;
a=0;//     .restart local v1    # "strResult":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static sidSign_PAD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .locals 10
a=0;//     .param p0, "appid"    # Ljava/lang/String;
a=0;//     .param p1, "deviceName"    # Ljava/lang/String;
a=0;//     .param p2, "mobilePhone"    # Ljava/lang/String;
a=0;//     .param p3, "deviceAuthorizationCode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     .line 294
a=0;//     #v9=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 297
a=0;//     .local v4, "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v4=(Null);
a=0;//     new-instance v4, Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     .end local v4    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v4=(UninitRef,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     invoke-direct {v4}, Lcom/ccit/mmwlan/vo/SignView;-><init>()V
a=0;// 
a=0;//     .line 298
a=0;//     .restart local v4    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 300
a=0;//     invoke-virtual {v4, v9}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 301
a=0;//     const-string v6, "\u5e94\u7528appid\u4e3a\u7a7a"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 409
a=0;//     .end local v4    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 306
a=0;//     .restart local v4    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->imeiOfMD5Value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 307
a=0;//     .local v5, "strImeiMD5":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "5"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v4, v6}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 310
a=0;//     const-string v6, "\u83b7\u53d6IMEI\u7684MD5\u503c\u9519\u8bef"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_1
a=0;//     #v6=(Boolean);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 318
a=0;//     .local v2, "iCertState":I
a=0;//     :try_start_0
a=0;//     #v2=(Byte);
a=0;//     sget-object v6, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v6=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/ClientSDK;->checkSecCertNativeForBilling()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 321
a=0;//     #v2=(Integer);
a=0;//     const-string v6, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "sidSign_PAD() iCertState -> "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 331
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 334
a=0;//     invoke-static {v4, p0}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->signProcess(Lcom/ccit/mmwlan/vo/SignView;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 324
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 326
a=0;//     .local v0, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const/4 v6, 0x7
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v4, v6}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 327
a=0;//     const-string v6, "\u68c0\u67e5\u51ed\u8bc1\u5f02\u5e38"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v0}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 336
a=0;//     .end local v0    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v6, v2, :cond_6
a=0;// 
a=0;//     .line 338
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 341
a=0;//     invoke-static {v4, p0, v5, p1, p2}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->authProcess(Lcom/ccit/mmwlan/vo/SignView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 343
a=0;//     :cond_3
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     .line 346
a=0;//     invoke-static {p0, p3}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->applyCert(Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 356
a=0;//     .local v1, "iApplyCert":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/vo/SignView;->getResult()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 359
a=0;//     invoke-static {v4, p0}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->signProcess(Lcom/ccit/mmwlan/vo/SignView;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     move-object v4, v1
a=0;// 
a=0;//     .line 363
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 368
a=0;//     .end local v1    # "iApplyCert":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v6=(One);
a=0;//     invoke-virtual {v4, v9}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 369
a=0;//     const-string v6, "\u5e94\u7528appid\u4e3a\u7a7a"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 373
a=0;//     :cond_6
a=0;//     #v6=(One);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v6, v2, :cond_8
a=0;// 
a=0;//     .line 377
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p0, v6}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->applyCert(Ljava/lang/String;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 380
a=0;//     .local v3, "iUpdateCert":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     const-string v6, "MMClientSDK_ForPad"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "sidSign_PAD() iUpdateCert -> "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 381
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 380
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 392
a=0;//     invoke-virtual {v3}, Lcom/ccit/mmwlan/vo/SignView;->getResult()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 395
a=0;//     invoke-static {v4, p0}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->signProcess(Lcom/ccit/mmwlan/vo/SignView;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 400
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 406
a=0;//     .end local v3    # "iUpdateCert":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     :cond_8
a=0;//     #v3=(Uninit);v6=(PosByte);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v4, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static signProcess(Lcom/ccit/mmwlan/vo/SignView;Ljava/lang/String;)Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .locals 7
a=0;//     .param p0, "signView"    # Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x7
a=0;// 
a=0;//     .line 503
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->genSid_PAD()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 504
a=0;//     .local v1, "strSID":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "2"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 506
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 507
a=0;//     const-string v3, "\u83b7\u53d6sid\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 540
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v1, p1, v4}, Lcom/ccit/mmwlan/ClientSDK;->SIDSignNativeForBilling(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 515
a=0;//     .local v2, "strSignResult":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 517
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 518
a=0;//     const-string v3, "\u7b7e\u540d\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 533
a=0;//     .end local v2    # "strSignResult":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 535
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {p0, v6}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 536
a=0;//     const-string v3, "\u7b7e\u540d\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 537
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 524
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v2    # "strSignResult":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Reference,Ljava/lang/String;);v4=(Null);v5=(Uninit);
a=0;//     const-string v3, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "signProcess() strSignResult -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 525
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 524
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 529
a=0;//     const-string v3, "\u7b7e\u540d\u6210\u529f"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lcom/ccit/mmwlan/vo/SignView;->setErrMsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 530
a=0;//     invoke-virtual {p0, v2}, Lcom/ccit/mmwlan/vo/SignView;->setUserSignature(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static updateRandNum_PAD(Ljava/lang/String;)I
a=0;//     .locals 6
a=0;//     .param p0, "strRandNum"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 251
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 253
a=0;//     .local v1, "iResult":I
a=0;//     #v1=(Byte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 278
a=0;//     .end local v1    # "iResult":I
a=0;//     .local v2, "iResult":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 261
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Byte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/MMClientSDK_ForPad;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v3, p0}, Lcom/ccit/mmwlan/ClientSDK;->UpdateRandNumForBilling(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 262
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 264
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 265
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v2    # "iResult":I
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 269
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     const-string v3, "MMClientSDK_ForPad"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "updateRandNum()  iResult -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 278
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v2    # "iResult":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 272
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 274
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 275
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
