package com.ccit.mmwlan; class MMClientSDK_ForLogin { void a() { int a;
a=0;// .class public final Lcom/ccit/mmwlan/MMClientSDK_ForLogin;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MMClientSDK_ForLogin.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final INT_RESULT_0:I = 0x0
a=0;// 
a=0;// .field private static final INT_RESULT_1:I = 0x1
a=0;// 
a=0;// .field private static clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;// .field private static context:Landroid/content/Context;
a=0;// 
a=0;// .field private static getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     .line 50
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/ClientSDK;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/MMClientSDK_ForLogin;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static SIDSign(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 11
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;//     .param p3, "sid"    # Ljava/lang/String;
a=0;//     .param p4, "appid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 623
a=0;//     #v3=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 625
a=0;//     .local v7, "result":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 626
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     if-ne p0, v3, :cond_2
a=0;// 
a=0;//     .line 627
a=0;//     :cond_0
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     if-ne p1, v3, :cond_2
a=0;// 
a=0;//     .line 628
a=0;//     :cond_1
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 630
a=0;//     :cond_2
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SIDSign() result -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 688
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .local v8, "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 633
a=0;//     .end local v8    # "result":Ljava/lang/String;
a=0;//     .restart local v7    # "result":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     if-ne p1, v3, :cond_5
a=0;// 
a=0;//     .line 634
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 636
a=0;//     :cond_4
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SIDSign() result -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 638
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .restart local v8    # "result":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 641
a=0;//     .end local v8    # "result":Ljava/lang/String;
a=0;//     .restart local v7    # "result":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(PosByte);v8=(Uninit);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 643
a=0;//     .local v5, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     sget-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v2, p0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 652
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 654
a=0;//     .local v10, "strPlaintText":Ljava/lang/String;
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 655
a=0;//     .local v9, "signValue":Ljava/lang/String;
a=0;//     #v9=(Null);
a=0;//     if-ne p0, v3, :cond_7
a=0;// 
a=0;//     .line 656
a=0;//     invoke-virtual {v5}, Lcom/ccit/mmwlan/vo/DeviceInfo;->getStrMac()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 664
a=0;//     :goto_1
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p3
a=0;// 
a=0;//     .line 665
a=0;//     .local v1, "signData":Ljava/lang/String;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     move-object v2, p4
a=0;// 
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/ccit/mmwlan/ClientSDK;->SignNativeForLogin(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 667
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 669
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SIDSign() result -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 670
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "; \u7b7e\u540d\u5931\u8d25!"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 669
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 672
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .restart local v8    # "result":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 644
a=0;//     .end local v1    # "signData":Ljava/lang/String;
a=0;//     .end local v8    # "result":Ljava/lang/String;
a=0;//     .end local v9    # "signValue":Ljava/lang/String;
a=0;//     .end local v10    # "strPlaintText":Ljava/lang/String;
a=0;//     .restart local v7    # "result":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Conflicted);v3=(PosByte);v4=(Uninit);v5=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 645
a=0;//     .local v6, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v6=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 646
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SIDSign() ClientSDKException -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 647
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 646
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 648
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .restart local v8    # "result":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 658
a=0;//     .end local v6    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v8    # "result":Ljava/lang/String;
a=0;//     .restart local v7    # "result":Ljava/lang/String;
a=0;//     .restart local v9    # "signValue":Ljava/lang/String;
a=0;//     .restart local v10    # "strPlaintText":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v3=(PosByte);v5=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v6=(Uninit);v8=(Uninit);v9=(Null);v10=(Null);
a=0;//     invoke-virtual {v5}, Lcom/ccit/mmwlan/vo/DeviceInfo;->getStrImsi()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 676
a=0;//     .restart local v1    # "signData":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     :try_start_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Integer);v4=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "#V1.0#"
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 685
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SIDSign() result -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 688
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .restart local v8    # "result":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 677
a=0;//     .end local v8    # "result":Ljava/lang/String;
a=0;//     .restart local v7    # "result":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Null);v8=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 678
a=0;//     .restart local v6    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v6=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 679
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SIDSign() ClientSDKException -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 680
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 679
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 681
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     .restart local v8    # "result":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static applySecCert(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpHost;I)I
a=0;//     .locals 20
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;//     .param p3, "passCode"    # Ljava/lang/String;
a=0;//     .param p4, "iapid"    # Ljava/lang/String;
a=0;//     .param p5, "appid"    # Ljava/lang/String;
a=0;//     .param p6, "sid"    # Ljava/lang/String;
a=0;//     .param p7, "moServerHost"    # Lorg/apache/http/HttpHost;
a=0;//     .param p8, "wapHost"    # Lorg/apache/http/HttpHost;
a=0;//     .param p9, "sessionID"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     const/16 v16, -0x1
a=0;// 
a=0;//     .line 333
a=0;//     .local v16, "result":I
a=0;//     #v16=(Byte);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 334
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, p0
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 336
a=0;//     :cond_1
a=0;//     if-eqz p6, :cond_2
a=0;// 
a=0;//     .line 337
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p6
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 338
a=0;//     if-eqz p5, :cond_2
a=0;// 
a=0;//     .line 339
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual/range {p7 .. p7}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual/range {p7 .. p7}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 342
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v16, 0x5
a=0;// 
a=0;//     .line 344
a=0;//     #v16=(PosByte);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 345
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 344
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 462
a=0;//     .end local v16    # "result":I
a=0;//     .local v17, "result":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Integer);v17=(Integer);v18=(Conflicted);v19=(Conflicted);
a=0;//     return v17
a=0;// 
a=0;//     .line 349
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Byte);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 350
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     .line 351
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 352
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(PosByte);
a=0;//     const/16 v16, 0x5
a=0;// 
a=0;//     .line 354
a=0;//     #v16=(PosByte);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 355
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 354
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 358
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 362
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(PosByte);v6=(Uninit);v16=(Byte);v17=(Uninit);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 364
a=0;//     .local v13, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v13=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     move/from16 v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v5, v0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 373
a=0;//     #v13=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     .local v12, "deviceId":Ljava/lang/String;
a=0;//     #v12=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 375
a=0;//     .local v3, "deviceIdMd5Hash":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, p0
a=0;// 
a=0;//     if-ne v0, v2, :cond_7
a=0;// 
a=0;//     .line 376
a=0;//     invoke-virtual {v13}, Lcom/ccit/mmwlan/vo/DeviceInfo;->getStrMac()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 381
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     const-string v5, "md5"
a=0;// 
a=0;//     invoke-virtual {v2, v5, v12}, Lcom/ccit/mmwlan/ClientSDK;->getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 392
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 394
a=0;//     .local v4, "pubKey":Ljava/lang/String;
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, v1, v13}, Lcom/ccit/mmwlan/ClientSDK;->getPubKeyForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 395
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     .line 396
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1, v13}, Lcom/ccit/mmwlan/ClientSDK;->genPKIKeyNativeForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 398
a=0;//     .local v15, "genKeyRes":I
a=0;//     #v15=(Integer);
a=0;//     if-eqz v15, :cond_8
a=0;// 
a=0;//     .line 399
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 400
a=0;//     #v16=(One);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 401
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 400
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 402
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 365
a=0;//     .end local v3    # "deviceIdMd5Hash":Ljava/lang/String;
a=0;//     .end local v4    # "pubKey":Ljava/lang/String;
a=0;//     .end local v12    # "deviceId":Ljava/lang/String;
a=0;//     .end local v15    # "genKeyRes":I
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v6=(Uninit);v12=(Uninit);v13=(Null);v15=(Uninit);v16=(Byte);v17=(Uninit);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 366
a=0;//     .local v14, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 367
a=0;//     const/16 v16, 0x2
a=0;// 
a=0;//     .line 368
a=0;//     #v16=(PosByte);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     .line 369
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() ClientSDKException -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 368
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 370
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 378
a=0;//     .end local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v3    # "deviceIdMd5Hash":Ljava/lang/String;
a=0;//     .restart local v12    # "deviceId":Ljava/lang/String;
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_7
a=0;//     #v0=(Integer);v2=(PosByte);v3=(Null);v6=(Uninit);v12=(Null);v13=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v14=(Uninit);v16=(Byte);v17=(Uninit);
a=0;//     invoke-virtual {v13}, Lcom/ccit/mmwlan/vo/DeviceInfo;->getStrImsi()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 383
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 384
a=0;//     .restart local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 385
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     .line 386
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() ClientSDKException -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 385
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 387
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 388
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 404
a=0;//     .end local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v4    # "pubKey":Ljava/lang/String;
a=0;//     .restart local v15    # "genKeyRes":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_8
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v6=(Uninit);v14=(Uninit);v15=(Integer);v16=(Byte);v17=(Uninit);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1, v13}, Lcom/ccit/mmwlan/ClientSDK;->getPubKeyForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .end local v15    # "genKeyRes":I
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v2, p5
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v6, p2
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v7, p3
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v8, p6
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v9, p7
a=0;// 
a=0;//     #v9=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     move-object/from16 v10, p8
a=0;// 
a=0;//     .line 414
a=0;//     #v10=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-static/range {v2 .. v10}, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->applySecCertFromMoserver(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpHost;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 417
a=0;//     .local v19, "secCertWithEncData":[Ljava/lang/String;
a=0;//     #v19=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .line 418
a=0;//     :cond_a
a=0;//     #v5=(Conflicted);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 419
a=0;//     #v16=(One);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 420
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 406
a=0;//     .end local v17    # "result":I
a=0;//     .end local v19    # "secCertWithEncData":[Ljava/lang/String;
a=0;//     .restart local v16    # "result":I
a=0;//     :catch_2
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v16=(Byte);v17=(Uninit);v19=(Uninit);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 407
a=0;//     .restart local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 408
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 409
a=0;//     #v16=(One);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     .line 410
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "genPKIKeyNative() ClientSDKException -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 409
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 411
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     .end local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     .restart local v19    # "secCertWithEncData":[Ljava/lang/String;
a=0;//     :cond_b
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Lorg/apache/http/HttpHost;);v10=(Reference,Lorg/apache/http/HttpHost;);v14=(Uninit);v16=(Byte);v17=(Uninit);v19=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     const-string v5, "105"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     .line 422
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 423
a=0;//     #v16=(Integer);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 424
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_c
a=0;//     #v2=(Boolean);v16=(Byte);v17=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     const-string v5, "107"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     .line 426
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 427
a=0;//     #v16=(Integer);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 428
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 429
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_d
a=0;//     #v2=(Boolean);v16=(Byte);v17=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     const-string v5, "108"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_e
a=0;// 
a=0;//     .line 430
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 431
a=0;//     #v16=(Integer);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 432
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 433
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_e
a=0;//     #v2=(Boolean);v16=(Byte);v17=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     const-string v5, "122"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_f
a=0;// 
a=0;//     .line 434
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 435
a=0;//     #v16=(Integer);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 436
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 437
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_f
a=0;//     #v2=(Boolean);v16=(Byte);v17=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     const-string v5, "500"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     .line 438
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v19, v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 439
a=0;//     #v16=(Integer);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 440
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 444
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_10
a=0;//     #v2=(Boolean);v16=(Byte);v17=(Uninit);
a=0;//     const/16 v18, -0x1
a=0;// 
a=0;//     .line 446
a=0;//     .local v18, "saveRes":I
a=0;//     :try_start_4
a=0;//     #v18=(Byte);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v6, v19, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v7, v19, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move/from16 v8, p1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v9, p2
a=0;// 
a=0;//     move-object v10, v13
a=0;// 
a=0;//     move-object/from16 v11, p5
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v5 .. v11}, Lcom/ccit/mmwlan/ClientSDK;->saveSecCertNativeForLogin(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)I
a=0;//     :try_end_4
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 455
a=0;//     #v18=(Integer);
a=0;//     if-nez v18, :cond_11
a=0;// 
a=0;//     .line 456
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 460
a=0;//     :goto_2
a=0;//     #v16=(Boolean);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() result -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 462
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 448
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :catch_3
a=0;//     #v0=(Integer);v2=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);v11=(Conflicted);v16=(Byte);v17=(Uninit);v18=(Byte);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 449
a=0;//     .restart local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v14=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 450
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 451
a=0;//     #v16=(One);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     .line 452
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "saveSecCertNative() ClientSDKException -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 451
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 453
a=0;//     .end local v16    # "result":I
a=0;//     .restart local v17    # "result":I
a=0;//     #v17=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 458
a=0;//     .end local v14    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v17    # "result":I
a=0;//     .restart local v16    # "result":I
a=0;//     :cond_11
a=0;//     #v2=(One);v6=(Null);v7=(Null);v8=(Integer);v11=(Reference,Ljava/lang/String;);v14=(Uninit);v16=(Byte);v17=(Uninit);v18=(Integer);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static applySecCertFromMoserver(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpHost;)[Ljava/lang/String;
a=0;//     .locals 30
a=0;//     .param p0, "appid"    # Ljava/lang/String;
a=0;//     .param p1, "deviceIdMd5Hash"    # Ljava/lang/String;
a=0;//     .param p2, "pubKey"    # Ljava/lang/String;
a=0;//     .param p3, "loginType"    # I
a=0;//     .param p4, "userName"    # Ljava/lang/String;
a=0;//     .param p5, "passCode"    # Ljava/lang/String;
a=0;//     .param p6, "sid"    # Ljava/lang/String;
a=0;//     .param p7, "moServerHost"    # Lorg/apache/http/HttpHost;
a=0;//     .param p8, "wapHost"    # Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v0, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     .line 501
a=0;//     .local v25, "result":[Ljava/lang/String;
a=0;//     #v25=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v22, Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     #v22=(UninitRef,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     invoke-direct/range {v22 .. v22}, Lcom/ccit/mmwlan/util/ReadConfigFile;-><init>()V
a=0;// 
a=0;//     .line 502
a=0;//     .local v22, "readConfigFile":Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;//     #v22=(Reference,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "http://"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p7 .. p7}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ":"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 503
a=0;//     invoke-virtual/range {p7 .. p7}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 504
a=0;//     const-string v5, "applySecCertUrl"
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/ccit/mmwlan/util/ReadConfigFile;->getConfigInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 502
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 505
a=0;//     .local v11, "applyCertUrl":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 506
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCertFromMoserver() applyCertUrl -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 505
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 509
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .line 510
a=0;//     .local v19, "messageType":I
a=0;//     #v19=(Null);
a=0;//     new-instance v20, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;);
a=0;//     invoke-direct/range {v20 .. v20}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;-><init>()V
a=0;// 
a=0;//     .line 511
a=0;//     .local v20, "msPostRequest":Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;
a=0;//     #v20=(Reference,Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;);
a=0;//     new-instance v21, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;
a=0;// 
a=0;//     #v21=(UninitRef,Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;);
a=0;//     invoke-direct/range {v21 .. v21}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;-><init>()V
a=0;// 
a=0;//     .line 512
a=0;//     .local v21, "msPostResponse":Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;
a=0;//     #v21=(Reference,Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;);
a=0;//     new-instance v18, Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;// 
a=0;//     #v18=(UninitRef,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     invoke-direct/range {v18 .. v18}, Lcom/ccit/mmwlan/httpClient/InflaterTool;-><init>()V
a=0;// 
a=0;//     .line 514
a=0;//     .local v18, "inflaterTool":Lcom/ccit/mmwlan/httpClient/InflaterTool;
a=0;//     #v18=(Reference,Lcom/ccit/mmwlan/httpClient/InflaterTool;);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     .line 515
a=0;//     .local v23, "requestXml":Ljava/lang/String;
a=0;//     #v23=(Null);
a=0;//     new-instance v3, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;);
a=0;//     invoke-direct {v3}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;-><init>()V
a=0;// 
a=0;//     .line 517
a=0;//     .local v3, "httpTool":Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v4, :cond_2
a=0;// 
a=0;//     .line 518
a=0;//     const v19, 0x10020
a=0;// 
a=0;//     .line 520
a=0;//     #v19=(Integer);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p0
a=0;// 
a=0;//     move-object/from16 v5, p6
a=0;// 
a=0;//     move-object/from16 v6, p2
a=0;// 
a=0;//     move-object/from16 v7, p1
a=0;// 
a=0;//     .line 519
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v3 .. v8}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->applyCertRequestXML(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     .line 527
a=0;//     :goto_0
a=0;//     #v9=(Conflicted);v10=(Conflicted);v23=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 528
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCertFromMoserver() requestXml -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 527
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 530
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     check-cast v17, [B
a=0;// 
a=0;//     .line 531
a=0;//     .local v17, "finalReqData":[B
a=0;//     #v17=(Reference,[B);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     check-cast v24, [B
a=0;// 
a=0;//     .line 532
a=0;//     .local v24, "response":[B
a=0;//     #v24=(Reference,[B);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     .line 533
a=0;//     .local v29, "strResponse":Ljava/lang/String;
a=0;//     #v29=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 537
a=0;//     .local v13, "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     :try_start_0
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v2, v19
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->getFinalData(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 539
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     move-object/from16 v1, p8
a=0;// 
a=0;//     invoke-virtual {v3, v11, v0, v1}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->doPostByHttpClient(Ljava/lang/String;[BLorg/apache/http/HttpHost;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 551
a=0;//     :try_start_1
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->inflaterHttpPostResponse([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     .line 552
a=0;//     #v29=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v29
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/httpClient/InflaterTool;->getServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 572
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 573
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 574
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "applySecCertFromMoserver()  Errormsg -> Apply cert failed!"
a=0;// 
a=0;//     .line 573
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 598
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);
a=0;//     return-object v25
a=0;// 
a=0;//     .line 522
a=0;//     .end local v13    # "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     .end local v17    # "finalReqData":[B
a=0;//     .end local v24    # "response":[B
a=0;//     .end local v29    # "strResponse":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v4=(One);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v19=(Null);v23=(Null);v24=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);
a=0;//     const v19, 0x10030
a=0;// 
a=0;//     .line 524
a=0;//     #v19=(Integer);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p0
a=0;// 
a=0;//     move-object/from16 v5, p6
a=0;// 
a=0;//     move-object/from16 v6, p2
a=0;// 
a=0;//     move-object/from16 v7, p1
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v9, p4
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v10, p5
a=0;// 
a=0;//     .line 523
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v3 .. v10}, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->applyCertRequest_N_XML(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 540
a=0;//     .restart local v13    # "certDataList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/ccit/mmwlan/vo/CertApplyInfo;>;"
a=0;//     .restart local v17    # "finalReqData":[B
a=0;//     .restart local v24    # "response":[B
a=0;//     .restart local v29    # "strResponse":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Reference,Ujava/lang/Object;);v2=(Integer);v9=(Conflicted);v10=(Conflicted);v13=(Null);v17=(Reference,[B);v24=(Reference,[B);v29=(Null);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 541
a=0;//     .local v14, "e":Ljava/lang/Exception;
a=0;//     #v14=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 542
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCertFromMoserver() Exception -> \u4e0emo.server\u901a\u4fe1\u5f02\u5e38\n"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 543
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 542
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 541
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 544
a=0;//     invoke-virtual {v14}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 553
a=0;//     .end local v14    # "e":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v14=(Uninit);v29=(Reference,Ljava/lang/String;);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 554
a=0;//     .restart local v14    # "e":Ljava/lang/Exception;
a=0;//     #v14=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCertFromMoserver() Exception -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 554
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 556
a=0;//     invoke-virtual {v14}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 559
a=0;//     invoke-virtual {v14}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 560
a=0;//     .local v16, "exceInfo":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v16, :cond_1
a=0;// 
a=0;//     const-string v4, "returnCode"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 561
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     .line 562
a=0;//     .local v28, "retInfoArr":[Ljava/lang/String;
a=0;//     #v28=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aget-object v4, v28, v4
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     .line 563
a=0;//     .local v27, "retCode":Ljava/lang/String;
a=0;//     #v27=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     aput-object v27, v25, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 580
a=0;//     .end local v14    # "e":Ljava/lang/Exception;
a=0;//     .end local v16    # "exceInfo":Ljava/lang/String;
a=0;//     .end local v27    # "retCode":Ljava/lang/String;
a=0;//     .end local v28    # "retInfoArr":[Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v13=(Reference,Ljava/util/ArrayList;);v14=(Uninit);v16=(Uninit);v27=(Uninit);v28=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     .line 581
a=0;//     .local v26, "resultCode":Ljava/lang/String;
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v26, :cond_4
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 582
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 583
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "applySecCertFromMoserver()  Errormsg -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 584
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getErrormsg()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 583
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 582
a=0;//     invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 589
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 590
a=0;//     .local v12, "cert":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v12, v25, v4
a=0;// 
a=0;//     .line 591
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCertFromMoserver() cert -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 592
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 591
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 594
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->getEncData()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 595
a=0;//     .local v15, "encData":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object v15, v25, v4
a=0;// 
a=0;//     .line 596
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCertFromMoserver() encData -> "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static checkSecCert(IILjava/lang/String;)I
a=0;//     .locals 8
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 159
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 162
a=0;//     .local v3, "result":I
a=0;//     #v3=(Byte);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     if-eq p0, v6, :cond_0
a=0;// 
a=0;//     if-ne p0, v5, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     if-eq p1, v6, :cond_2
a=0;// 
a=0;//     if-eq p1, v5, :cond_2
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     .line 167
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checkSecCert() result -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 167
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 217
a=0;//     .end local v3    # "result":I
a=0;//     .local v4, "result":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(PosByte);
a=0;//     return v4
a=0;// 
a=0;//     .line 171
a=0;//     .end local v4    # "result":I
a=0;//     .restart local v3    # "result":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Byte);v4=(Uninit);v5=(PosByte);v6=(One);v7=(Uninit);
a=0;//     if-ne p1, v5, :cond_4
a=0;// 
a=0;//     .line 172
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 173
a=0;//     :cond_3
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     .line 175
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checkSecCert() result -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 178
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v4    # "result":I
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     .end local v4    # "result":I
a=0;//     .restart local v3    # "result":I
a=0;//     :cond_4
a=0;//     #v3=(Byte);v4=(Uninit);v5=(PosByte);v6=(One);v7=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 184
a=0;//     .local v1, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v6, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v5, v6, p0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "checkRes":I
a=0;//     :try_start_1
a=0;//     #v0=(Byte);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v5, p1, p2, v1}, Lcom/ccit/mmwlan/ClientSDK;->checkSecCertNativeForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 207
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 208
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checkSecCert() result -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 217
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v4    # "result":I
a=0;//     #v4=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     .end local v0    # "checkRes":I
a=0;//     .end local v4    # "result":I
a=0;//     .restart local v3    # "result":I
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Null);v3=(Byte);v4=(Uninit);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 186
a=0;//     .local v2, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 188
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 189
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checkSecCert() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 188
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 190
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v4    # "result":I
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     .end local v2    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v4    # "result":I
a=0;//     .restart local v0    # "checkRes":I
a=0;//     .restart local v3    # "result":I
a=0;//     :catch_1
a=0;//     #v0=(Byte);v1=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v2=(Uninit);v3=(Byte);v4=(Uninit);v7=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 199
a=0;//     .restart local v2    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 200
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     .line 201
a=0;//     #v3=(PosByte);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checkSecCertNative() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 203
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 201
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 204
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v4    # "result":I
a=0;//     #v4=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     .end local v2    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v4    # "result":I
a=0;//     .restart local v3    # "result":I
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Byte);v4=(Uninit);v7=(Uninit);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static encWithCert(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "data"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 700
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 701
a=0;//     .local v2, "result":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 703
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "encWithCert() result -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 704
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 703
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 723
a=0;//     .end local v2    # "result":Ljava/lang/String;
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 709
a=0;//     .end local v3    # "result":Ljava/lang/String;
a=0;//     .restart local v2    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v1, Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     invoke-direct {v1}, Lcom/ccit/mmwlan/util/ReadConfigFile;-><init>()V
a=0;// 
a=0;//     .line 710
a=0;//     .local v1, "readConfigFile":Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     const-string v5, "uicCert"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Lcom/ccit/mmwlan/util/ReadConfigFile;->getConfigInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 713
a=0;//     .local v4, "uicCert":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v5, p0, v4}, Lcom/ccit/mmwlan/ClientSDK;->encWithCertNativeForLogin(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 721
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "encWithCert() result -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 723
a=0;//     .end local v2    # "result":Ljava/lang/String;
a=0;//     .restart local v3    # "result":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 714
a=0;//     .end local v3    # "result":Ljava/lang/String;
a=0;//     .restart local v2    # "result":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v2=(Null);v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 715
a=0;//     .local v0, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v0}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 716
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 717
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "encWithCert() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 716
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 718
a=0;//     .end local v2    # "result":Ljava/lang/String;
a=0;//     .restart local v3    # "result":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encWithPubKey(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;//     .param p3, "data"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     .line 919
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 921
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 922
a=0;//     if-eq p0, v5, :cond_0
a=0;// 
a=0;//     if-ne p0, v4, :cond_1
a=0;// 
a=0;//     .line 923
a=0;//     :cond_0
a=0;//     if-eq p1, v5, :cond_2
a=0;// 
a=0;//     if-eq p1, v4, :cond_2
a=0;// 
a=0;//     .line 925
a=0;//     :cond_1
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 926
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "encWithPubKey() error -> parameters error!"
a=0;// 
a=0;//     .line 925
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 969
a=0;//     .end local v3    # "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 929
a=0;//     .restart local v3    # "result":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(PosByte);v5=(One);v6=(Uninit);
a=0;//     if-ne p1, v4, :cond_4
a=0;// 
a=0;//     .line 930
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 932
a=0;//     :cond_3
a=0;//     #v4=(PosByte);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 933
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "encWithPubKey() error -> parameters error!"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 932
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 938
a=0;//     :cond_4
a=0;//     #v4=(PosByte);v5=(One);v6=(Uninit);
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 942
a=0;//     :cond_5
a=0;//     #v4=(PosByte);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "encWithPubKey error --> the fourth parameter error!"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 949
a=0;//     :cond_6
a=0;//     #v4=(Boolean);v5=(One);v6=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 951
a=0;//     .local v0, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v4, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4, v5, p0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 958
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 961
a=0;//     .local v2, "encData":Ljava/lang/String;
a=0;//     :try_start_1
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v4, p1, p2, v0, p3}, Lcom/ccit/mmwlan/ClientSDK;->AsymmetricEncryptionForMMLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 969
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 952
a=0;//     .end local v2    # "encData":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 953
a=0;//     .local v1, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 954
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     .line 955
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "checkSecCert() ClientSDKException -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 954
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 962
a=0;//     .end local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .restart local v2    # "encData":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v1=(Uninit);v2=(Null);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 965
a=0;//     .restart local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v4, "MmClientSdk"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "encWithPubKey call AsymmetricEncryptionForMMLogin error --> !"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static genPKIKey(IILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 232
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 234
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     if-eq p0, v6, :cond_0
a=0;// 
a=0;//     if-ne p0, v5, :cond_1
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     if-eq p1, v6, :cond_2
a=0;// 
a=0;//     if-eq p1, v5, :cond_2
a=0;// 
a=0;//     .line 238
a=0;//     :cond_1
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 239
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "genPKIKey() error -> parameters error!"
a=0;// 
a=0;//     .line 238
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 297
a=0;//     .end local v4    # "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 242
a=0;//     .restart local v4    # "result":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(PosByte);v6=(One);v7=(Uninit);
a=0;//     if-ne p1, v5, :cond_4
a=0;// 
a=0;//     .line 243
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 245
a=0;//     :cond_3
a=0;//     #v5=(PosByte);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 246
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "genPKIKey() error -> parameters error!"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 245
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_4
a=0;//     #v5=(PosByte);v6=(One);v7=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     .local v0, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v6, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v5, v6, p0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 263
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 265
a=0;//     .local v2, "genPkiKeyRes":I
a=0;//     :try_start_1
a=0;//     #v2=(Byte);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v5, p1, p2, v0}, Lcom/ccit/mmwlan/ClientSDK;->genPKIKeyNativeForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 274
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 276
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 277
a=0;//     const-string v6, "genPKIKey() error -> generation pki key failed!"
a=0;// 
a=0;//     .line 276
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     .end local v2    # "genPkiKeyRes":I
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Uninit);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 256
a=0;//     .local v1, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 257
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 258
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "checkSecCert() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 257
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 267
a=0;//     .end local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .restart local v2    # "genPkiKeyRes":I
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v1=(Uninit);v2=(Byte);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 268
a=0;//     .restart local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 269
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "genPKIKeyNative() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 269
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     .end local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Integer);v7=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 285
a=0;//     .local v3, "pubKey":Ljava/lang/String;
a=0;//     :try_start_2
a=0;//     #v3=(Null);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v5, p1, p2, v0}, Lcom/ccit/mmwlan/ClientSDK;->getPubKeyForLogin(ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;)Ljava/lang/String;
a=0;//     :try_end_2
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 294
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "genPKIKey() pubKey -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 297
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     :catch_2
a=0;//     #v3=(Null);v4=(Null);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 287
a=0;//     .restart local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 288
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 289
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "genPKIKeyNative() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 288
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static genSID()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 134
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->genSIDNative()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 136
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "genSID() strResult -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 136
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 143
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 139
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 140
a=0;//     .local v0, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     const-string v2, "MmClientSdk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "genSID() \u751f\u6210SID\u5931\u8d25 -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDigest(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "digestAlg"    # Ljava/lang/String;
a=0;//     .param p1, "strPlaintText"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 737
a=0;//     .local v1, "result":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "MmClientSdk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getMd5Digest() result -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 740
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 739
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 756
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     .local v2, "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 746
a=0;//     .end local v2    # "result":Ljava/lang/String;
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v3, p0, p1}, Lcom/ccit/mmwlan/ClientSDK;->getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 754
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "MmClientSdk"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getMd5Digest() result -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 756
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     .restart local v2    # "result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 747
a=0;//     .end local v2    # "result":Ljava/lang/String;
a=0;//     .restart local v1    # "result":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Uninit);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 748
a=0;//     .local v0, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v0}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 749
a=0;//     const-string v3, "MmClientSdk"
a=0;// 
a=0;//     .line 750
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getDigestNative() ClientSDKException -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 749
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 751
a=0;//     .end local v1    # "result":Ljava/lang/String;
a=0;//     .restart local v2    # "result":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getVersion()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     const-string v0, "1.1.6"
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "strVersion":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static initMmClientSdk(Landroid/content/Context;I)I
a=0;//     .locals 8
a=0;//     .param p0, "appContext"    # Landroid/content/Context;
a=0;//     .param p1, "cardSlot"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 74
a=0;//     .local v2, "result":I
a=0;//     #v2=(Byte);
a=0;//     sput-object p0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v6, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v5, v6, p1}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 88
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 90
a=0;//     .local v4, "transRes":I
a=0;//     :try_start_1
a=0;//     #v4=(Byte);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lcom/ccit/mmwlan/ClientSDK;->transmitInfoNative(Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 101
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 107
a=0;//     .end local v2    # "result":I
a=0;//     .end local v4    # "transRes":I
a=0;//     .local v3, "result":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(PosByte);v3=(PosByte);v4=(Conflicted);v7=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 80
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v2    # "result":I
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 81
a=0;//     .local v1, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 83
a=0;//     #v2=(PosByte);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 84
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "initMmClientSdk() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 83
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 85
a=0;//     .end local v2    # "result":I
a=0;//     .restart local v3    # "result":I
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 91
a=0;//     .end local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v2    # "result":I
a=0;//     .restart local v4    # "transRes":I
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Byte);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 92
a=0;//     .restart local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 95
a=0;//     #v2=(One);
a=0;//     const-string v5, "MmClientSdk"
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "initMmClientSdk() ClientSDKException -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 95
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 98
a=0;//     .end local v2    # "result":I
a=0;//     .restart local v3    # "result":I
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 104
a=0;//     .end local v1    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v3    # "result":I
a=0;//     .restart local v2    # "result":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Integer);v7=(Uninit);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static saveCert(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 12
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;//     .param p3, "appid"    # Ljava/lang/String;
a=0;//     .param p4, "cert"    # Ljava/lang/String;
a=0;//     .param p5, "encData"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 778
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     .line 780
a=0;//     .local v9, "result":I
a=0;//     #v9=(Byte);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 781
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq p0, v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p0, v1, :cond_2
a=0;// 
a=0;//     .line 782
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq p1, v1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 783
a=0;//     :cond_1
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 784
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 785
a=0;//     if-eqz p5, :cond_2
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 786
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 788
a=0;//     #v9=(One);
a=0;//     const-string v1, "MmClientSdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "saveCert() parameter invalid -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v10, v9
a=0;// 
a=0;//     .line 831
a=0;//     .end local v9    # "result":I
a=0;//     .local v10, "result":I
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Boolean);v10=(Boolean);v11=(Conflicted);
a=0;//     return v10
a=0;// 
a=0;//     .line 791
a=0;//     .end local v10    # "result":I
a=0;//     .restart local v9    # "result":I
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Byte);v10=(Uninit);v11=(Uninit);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_5
a=0;// 
a=0;//     .line 792
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 793
a=0;//     :cond_4
a=0;//     #v1=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 795
a=0;//     #v9=(One);
a=0;//     const-string v1, "MmClientSdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "saveCert() the third parameter invalid -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v10, v9
a=0;// 
a=0;//     .line 797
a=0;//     .end local v9    # "result":I
a=0;//     .restart local v10    # "result":I
a=0;//     #v10=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 801
a=0;//     .end local v10    # "result":I
a=0;//     .restart local v9    # "result":I
a=0;//     :cond_5
a=0;//     #v1=(PosByte);v2=(Uninit);v3=(Uninit);v9=(Byte);v10=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 803
a=0;//     .local v6, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     sget-object v1, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v2, p0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 812
a=0;//     #v6=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .line 814
a=0;//     .local v11, "saveRes":I
a=0;//     :try_start_1
a=0;//     #v11=(Byte);
a=0;//     sget-object v1, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     move-object/from16 v2, p4
a=0;// 
a=0;//     move-object/from16 v3, p5
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v1 .. v7}, Lcom/ccit/mmwlan/ClientSDK;->saveSecCertNativeForLogin(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 823
a=0;//     #v11=(Integer);
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     .line 824
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 829
a=0;//     :goto_1
a=0;//     #v9=(Boolean);
a=0;//     const-string v1, "MmClientSdk"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "saveCert() result -> "
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v10, v9
a=0;// 
a=0;//     .line 831
a=0;//     .end local v9    # "result":I
a=0;//     .restart local v10    # "result":I
a=0;//     #v10=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 804
a=0;//     .end local v10    # "result":I
a=0;//     .end local v11    # "saveRes":I
a=0;//     .restart local v9    # "result":I
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Uninit);v9=(Byte);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 805
a=0;//     .local v8, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v8=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 806
a=0;//     const-string v1, "MmClientSdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "saveCert(...) call getDeviceInfo(...) ClientSDKException -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 807
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     move v10, v9
a=0;// 
a=0;//     .line 808
a=0;//     .end local v9    # "result":I
a=0;//     .restart local v10    # "result":I
a=0;//     #v10=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 816
a=0;//     .end local v8    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v10    # "result":I
a=0;//     .restart local v9    # "result":I
a=0;//     .restart local v11    # "saveRes":I
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v7=(Conflicted);v8=(Uninit);v9=(Byte);v10=(Uninit);v11=(Byte);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 817
a=0;//     .restart local v8    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v8=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 818
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 819
a=0;//     #v9=(One);
a=0;//     const-string v1, "MmClientSdk"
a=0;// 
a=0;//     .line 820
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "saveCert(...) call saveSecCertNativeForLogin() throw ClientSDKException -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
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
a=0;//     .line 819
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v10, v9
a=0;// 
a=0;//     .line 821
a=0;//     .end local v9    # "result":I
a=0;//     .restart local v10    # "result":I
a=0;//     #v10=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 826
a=0;//     .end local v8    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v10    # "result":I
a=0;//     .restart local v9    # "result":I
a=0;//     :cond_6
a=0;//     #v4=(Integer);v5=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Byte);v10=(Uninit);v11=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static updateRandNum(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 9
a=0;//     .param p0, "cardSlot"    # I
a=0;//     .param p1, "loginType"    # I
a=0;//     .param p2, "userName"    # Ljava/lang/String;
a=0;//     .param p3, "appid"    # Ljava/lang/String;
a=0;//     .param p4, "strRandNum"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 852
a=0;//     #v1=(PosByte);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     .line 855
a=0;//     .local v7, "iResult":I
a=0;//     #v7=(Byte);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 856
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     if-ne p0, v1, :cond_2
a=0;// 
a=0;//     .line 857
a=0;//     :cond_0
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 858
a=0;//     :cond_1
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 859
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 861
a=0;//     :cond_2
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 862
a=0;//     #v7=(One);
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateRandNum() parameter invalid -> "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v8, v7
a=0;// 
a=0;//     .line 902
a=0;//     .end local v7    # "iResult":I
a=0;//     .local v8, "iResult":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Integer);
a=0;//     return v8
a=0;// 
a=0;//     .line 865
a=0;//     .end local v8    # "iResult":I
a=0;//     .restart local v7    # "iResult":I
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Byte);v8=(Uninit);
a=0;//     if-ne p1, v1, :cond_5
a=0;// 
a=0;//     .line 866
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 868
a=0;//     :cond_4
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 869
a=0;//     #v7=(One);
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateRandNum() the third parameter error -> "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v8, v7
a=0;// 
a=0;//     .line 871
a=0;//     .end local v7    # "iResult":I
a=0;//     .restart local v8    # "iResult":I
a=0;//     #v8=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 875
a=0;//     .end local v8    # "iResult":I
a=0;//     .restart local v7    # "iResult":I
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(PosByte);v2=(Uninit);v7=(Byte);v8=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 877
a=0;//     .local v4, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->getDevInfo:Lcom/ccit/mmwlan/util/GetDeviceInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/GetDeviceInfo;);
a=0;//     sget-object v1, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1, p0}, Lcom/ccit/mmwlan/util/GetDeviceInfo;->getDeviceInfo(Landroid/content/Context;I)Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     :try_end_0
a=0;//     .catch Lcom/ccit/mmwlan/exception/ClientSDKException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 887
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     sget-object v0, Lcom/ccit/mmwlan/MMClientSDK_ForLogin;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     move-object v1, p4
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/ccit/mmwlan/ClientSDK;->UpdateRandNumForLogin(Ljava/lang/String;ILjava/lang/String;Lcom/ccit/mmwlan/vo/DeviceInfo;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 889
a=0;//     #v7=(Integer);
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateRandNum() call UpdateRandNumForLogin(...) iResult -> "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 891
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 893
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v7
a=0;// 
a=0;//     .line 894
a=0;//     .end local v7    # "iResult":I
a=0;//     .restart local v8    # "iResult":I
a=0;//     #v8=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 878
a=0;//     .end local v8    # "iResult":I
a=0;//     .restart local v7    # "iResult":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v7=(Byte);v8=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 879
a=0;//     .local v6, "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     #v6=(Reference,Lcom/ccit/mmwlan/exception/ClientSDKException;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/exception/ClientSDKException;->printStackTrace()V
a=0;// 
a=0;//     .line 880
a=0;//     const-string v0, "MmClientSdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateRandNum() call getDeviceInfo(...) ClientSDKException -> "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Lcom/ccit/mmwlan/exception/ClientSDKException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 881
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v7
a=0;// 
a=0;//     .line 882
a=0;//     .end local v7    # "iResult":I
a=0;//     .restart local v8    # "iResult":I
a=0;//     #v8=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 896
a=0;//     .end local v6    # "e":Lcom/ccit/mmwlan/exception/ClientSDKException;
a=0;//     .end local v8    # "iResult":I
a=0;//     .restart local v7    # "iResult":I
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);v5=(Conflicted);v6=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 898
a=0;//     .local v6, "e":Ljava/lang/Exception;
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 899
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .end local v6    # "e":Ljava/lang/Exception;
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v7=(Integer);
a=0;//     move v8, v7
a=0;// 
a=0;//     .line 902
a=0;//     .end local v7    # "iResult":I
a=0;//     .restart local v8    # "iResult":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
