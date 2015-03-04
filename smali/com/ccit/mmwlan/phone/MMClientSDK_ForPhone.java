package com.ccit.mmwlan.phone; class MMClientSDK_ForPhone { void a() { int a;
a=0;// .class public final Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MMClientSDK_ForPhone.java"
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
a=0;// .field private static final MMCLIENT_SDK:Ljava/lang/String; = "MMClientSDK_ForPhone"
a=0;// 
a=0;// .field private static SMSNumber:Ljava/lang/String;
a=0;// 
a=0;// .field private static clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;// .field private static context:Landroid/content/Context;
a=0;// 
a=0;// .field private static strApplyCertForPhone:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 24
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     .line 25
a=0;//     sput-object v0, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 27
a=0;//     sput-object v0, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->strApplyCertForPhone:Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     sput-object v0, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->SMSNumber:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/ClientSDK;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;);
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
a=0;//     .line 1214
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 1218
a=0;//     .local v1, "iRet":I
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2, p0}, Lcom/ccit/mmwlan/ClientSDK;->DestorySecCertForBilling(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1221
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
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
a=0;//     .line 1229
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1224
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1226
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
a=0;//     .line 1180
a=0;//     #v5=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1184
a=0;//     .local v1, "strRet":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2, p0}, Lcom/ccit/mmwlan/ClientSDK;->AsymmetricEncryptionForBilling(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1185
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1187
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1191
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
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
a=0;//     .line 1192
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1191
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1201
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1195
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1197
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1198
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static SIDSign(Ljava/lang/String;Lorg/apache/http/HttpHost;)Lcom/ccit/mmwlan/vo/SignView;
a=0;//     .locals 13
a=0;//     .param p0, "appuid"    # Ljava/lang/String;
a=0;//     .param p1, "getHttpProxy"    # Lorg/apache/http/HttpHost;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 727
a=0;//     .local v2, "iResult":I
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 729
a=0;//     .local v3, "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v3=(Null);
a=0;//     new-instance v3, Lcom/ccit/mmwlan/vo/SignView;
a=0;// 
a=0;//     .end local v3    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v3=(UninitRef,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     invoke-direct {v3}, Lcom/ccit/mmwlan/vo/SignView;-><init>()V
a=0;// 
a=0;//     .line 730
a=0;//     .restart local v3    # "signView":Lcom/ccit/mmwlan/vo/SignView;
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/vo/SignView;);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 731
a=0;//     const/4 v10, 0x6
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 844
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 735
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Byte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 737
a=0;//     .local v4, "strResult":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     sget-object v10, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v10=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v10}, Lcom/ccit/mmwlan/ClientSDK;->checkSecCertNativeForBilling()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 739
a=0;//     .local v1, "iCertState":I
a=0;//     #v1=(Integer);
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "SIDSign() iCertState -> "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 741
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 742
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 743
a=0;//     .local v5, "strSID0":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "2"
a=0;// 
a=0;//     invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 744
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 748
a=0;//     :cond_1
a=0;//     #v10=(Boolean);
a=0;//     invoke-static {v5, p0}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->getSIDSignValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 749
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 750
a=0;//     const/4 v10, 0x7
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 754
a=0;//     :cond_2
a=0;//     #v10=(Boolean);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 755
a=0;//     invoke-virtual {v3, v4}, Lcom/ccit/mmwlan/vo/SignView;->setUserSignature(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 758
a=0;//     .end local v5    # "strSID0":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v4=(Null);v5=(Uninit);v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     if-ne v10, v1, :cond_7
a=0;// 
a=0;//     .line 759
a=0;//     invoke-static {p0, p1}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->sendMessageAndApplyCert(Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 760
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 761
a=0;//     invoke-virtual {v3, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 766
a=0;//     :cond_4
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 767
a=0;//     .local v6, "strSID1":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "2"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 768
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 772
a=0;//     :cond_5
a=0;//     #v10=(Boolean);
a=0;//     invoke-static {v6, p0}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->getSIDSignValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 773
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 774
a=0;//     const/4 v10, 0x7
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 778
a=0;//     :cond_6
a=0;//     #v10=(Boolean);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 779
a=0;//     invoke-virtual {v3, v4}, Lcom/ccit/mmwlan/vo/SignView;->setUserSignature(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 782
a=0;//     .end local v6    # "strSID1":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v2=(Byte);v4=(Null);v6=(Uninit);v10=(One);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     if-ne v10, v1, :cond_c
a=0;// 
a=0;//     .line 783
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 784
a=0;//     .local v7, "strSID2":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "2"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_8
a=0;// 
a=0;//     .line 785
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 790
a=0;//     :cond_8
a=0;//     :try_start_0
a=0;//     #v10=(Boolean);
a=0;//     invoke-static {v7, p0, p1}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->applySecCertMethod(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 792
a=0;//     #v2=(Integer);
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "SIDSign() iResult -> "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 794
a=0;//     if-nez v2, :cond_b
a=0;// 
a=0;//     .line 795
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 796
a=0;//     .local v8, "strSID21":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "2"
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_9
a=0;// 
a=0;//     .line 797
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 816
a=0;//     .end local v8    # "strSID21":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v4=(Reference,Ljava/lang/String;);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 817
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v10, 0x6
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 818
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 803
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v8    # "strSID21":Ljava/lang/String;
a=0;//     :cond_9
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v4=(Null);v8=(Reference,Ljava/lang/String;);v10=(Boolean);v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, p0}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->getSIDSignValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 804
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_a
a=0;// 
a=0;//     .line 805
a=0;//     const/4 v10, 0x7
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 809
a=0;//     :cond_a
a=0;//     #v10=(Boolean);
a=0;//     invoke-virtual {v3, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 810
a=0;//     invoke-virtual {v3, v4}, Lcom/ccit/mmwlan/vo/SignView;->setUserSignature(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 814
a=0;//     .end local v8    # "strSID21":Ljava/lang/String;
a=0;//     :cond_b
a=0;//     #v4=(Null);v8=(Uninit);v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 824
a=0;//     .end local v7    # "strSID2":Ljava/lang/String;
a=0;//     :cond_c
a=0;//     #v2=(Byte);v7=(Uninit);v10=(PosByte);
a=0;//     invoke-static {p0, p1}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->sendMessageAndApplyCert(Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 825
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     .line 826
a=0;//     invoke-virtual {v3, v2}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 830
a=0;//     :cond_d
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 831
a=0;//     .local v9, "strSID3":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "2"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_e
a=0;// 
a=0;//     .line 832
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 836
a=0;//     :cond_e
a=0;//     #v10=(Boolean);
a=0;//     invoke-static {v9, p0}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->getSIDSignValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 837
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_f
a=0;// 
a=0;//     .line 838
a=0;//     const/4 v10, 0x7
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 842
a=0;//     :cond_f
a=0;//     #v10=(Boolean);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v10}, Lcom/ccit/mmwlan/vo/SignView;->setResult(I)V
a=0;// 
a=0;//     .line 843
a=0;//     invoke-virtual {v3, v4}, Lcom/ccit/mmwlan/vo/SignView;->setUserSignature(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static applyCertPrivate(Lcom/ccit/mmwlan/phone/HTTPConnectionTool;Lcom/ccit/mmwlan/phone/InflaterTool;Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 13
a=0;//     .param p0, "httpConnetTool1"    # Lcom/ccit/mmwlan/phone/HTTPConnectionTool;
a=0;//     .param p1, "inflaterTool1"    # Lcom/ccit/mmwlan/phone/InflaterTool;
a=0;//     .param p2, "strUrl1"    # Ljava/lang/String;
a=0;//     .param p3, "requestXML1"    # Ljava/lang/String;
a=0;//     .param p4, "getHttpProxy1"    # Lorg/apache/http/HttpHost;
a=0;//     .param p5, "strFlag"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 643
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 644
a=0;//     .local v7, "strResult":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     check-cast v2, [B
a=0;// 
a=0;//     .line 648
a=0;//     .local v2, "byResponse":[B
a=0;//     #v2=(Reference,[B);
a=0;//     const-string v10, "utf-8"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v10}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p2, v10, v0, v1}, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->doPost(Ljava/lang/String;[BLorg/apache/http/HttpHost;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 651
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "applyCertPrivate() -> "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 652
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v12, Ljava/lang/String;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v2}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 651
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 656
a=0;//     new-instance v10, Ljava/lang/String;
a=0;// 
a=0;//     .line 657
a=0;//     #v10=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v2}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 656
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v10}, Lcom/ccit/mmwlan/phone/InflaterTool;->getServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 660
a=0;//     .local v3, "certDataList":Ljava/util/ArrayList;
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     .line 661
a=0;//     invoke-virtual {v10}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 663
a=0;//     .local v5, "strCertResult":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "0"
a=0;// 
a=0;//     invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 666
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 680
a=0;//     .local v8, "strSecCert":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     .line 681
a=0;//     invoke-virtual {v10}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getRandNum()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 683
a=0;//     .local v6, "strRandom":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 687
a=0;//     .local v4, "iResult":I
a=0;//     #v4=(Null);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 689
a=0;//     invoke-static {v6}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->updateRandNum(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 690
a=0;//     .local v9, "upRandomResult":I
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 692
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 712
a=0;//     .end local v4    # "iResult":I
a=0;//     .end local v5    # "strCertResult":Ljava/lang/String;
a=0;//     .end local v6    # "strRandom":Ljava/lang/String;
a=0;//     .end local v8    # "strSecCert":Ljava/lang/String;
a=0;//     .end local v9    # "upRandomResult":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 699
a=0;//     .restart local v4    # "iResult":I
a=0;//     .restart local v5    # "strCertResult":Ljava/lang/String;
a=0;//     .restart local v6    # "strRandom":Ljava/lang/String;
a=0;//     .restart local v8    # "strSecCert":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v4=(Null);v6=(Reference,Ljava/lang/String;);v7=(Null);v8=(Reference,Ljava/lang/String;);v10=(Reference,Lcom/ccit/mmwlan/phone/CertApplyInfo;);
a=0;//     sget-object v10, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-virtual {v10, v8, v11}, Lcom/ccit/mmwlan/ClientSDK;->saveSecCertNativeForBilling(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 703
a=0;//     #v4=(Integer);
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "applyCertPrivate() iResult -> "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 705
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 712
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static applySecCert(Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;//     .locals 7
a=0;//     .param p0, "appuid"    # Ljava/lang/String;
a=0;//     .param p1, "getHttpProxy"    # Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 414
a=0;//     .local v1, "iResult":I
a=0;//     #v1=(One);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 442
a=0;//     .end local v1    # "iResult":I
a=0;//     .local v2, "iResult":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 421
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 422
a=0;//     .local v3, "strSID":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 424
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 425
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v2    # "iResult":I
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(One);v2=(Uninit);
a=0;//     invoke-static {v3, p0, p1}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->applySecCertMethod(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 433
a=0;//     #v1=(Integer);
a=0;//     const-string v4, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "applySecCert() iResult -> "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 442
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v2    # "iResult":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 436
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 438
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     .line 439
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static applySecCertMethod(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;//     .locals 25
a=0;//     .param p0, "strSID"    # Ljava/lang/String;
a=0;//     .param p1, "appuid"    # Ljava/lang/String;
a=0;//     .param p2, "getHttpProxy"    # Lorg/apache/http/HttpHost;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     .line 458
a=0;//     .local v14, "iResult":I
a=0;//     #v14=(One);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     .local v22, "strSecCert":Ljava/lang/String;
a=0;//     #v22=(Null);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v9, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->strApplyCertForPhone:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "/"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 462
a=0;//     const-string v9, "mmwlan/applySecCertForAPPThird"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 461
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 465
a=0;//     .local v6, "strUrl":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() strUrl -> "
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 469
a=0;//     sget-object v8, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/ClientSDK;->checkSecCertNativeForBilling()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 472
a=0;//     .local v12, "iCertState":I
a=0;//     #v12=(Integer);
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() iCertState -> "
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 473
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 472
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 475
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .line 476
a=0;//     .local v19, "strPubKey":Ljava/lang/String;
a=0;//     #v19=(Null);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v12, v8, :cond_1
a=0;// 
a=0;//     .line 479
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->getGenPubkey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 480
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "4"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 482
a=0;//     const/4 v14, 0x4
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v23, v14
a=0;// 
a=0;//     .line 624
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Reference,Ljava/lang/String;);v23=(Integer);
a=0;//     return v23
a=0;// 
a=0;//     .line 488
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(PosByte);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(One);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Null);v20=(Uninit);v21=(Uninit);v22=(Null);v23=(Uninit);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genPKIKey()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 489
a=0;//     .local v13, "iGenPKIKEYResult":I
a=0;//     #v13=(Integer);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     if-ne v8, v13, :cond_2
a=0;// 
a=0;//     .line 491
a=0;//     const/4 v14, 0x3
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v23, v14
a=0;// 
a=0;//     .line 492
a=0;//     #v23=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 496
a=0;//     :cond_2
a=0;//     #v14=(One);v23=(Uninit);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->getGenPubkey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 497
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "4"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 499
a=0;//     const/4 v14, 0x4
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v23, v14
a=0;// 
a=0;//     .line 500
a=0;//     #v23=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 505
a=0;//     .end local v13    # "iGenPKIKEYResult":I
a=0;//     :cond_3
a=0;//     #v13=(Conflicted);v14=(One);v23=(Uninit);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->imsiOfMD5Value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 506
a=0;//     .local v18, "strImsiMD5":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "5"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 508
a=0;//     const/4 v14, 0x5
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     move/from16 v23, v14
a=0;// 
a=0;//     .line 509
a=0;//     #v23=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 513
a=0;//     :cond_4
a=0;//     #v14=(One);v23=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 514
a=0;//     .local v7, "requestXML":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     check-cast v10, [B
a=0;// 
a=0;//     .line 515
a=0;//     .local v10, "byResponse":[B
a=0;//     #v10=(Reference,[B);
a=0;//     new-instance v4, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/ccit/mmwlan/phone/HTTPConnectionTool;);
a=0;//     invoke-direct {v4}, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;-><init>()V
a=0;// 
a=0;//     .line 516
a=0;//     .local v4, "httpConnetTool":Lcom/ccit/mmwlan/phone/HTTPConnectionTool;
a=0;//     #v4=(Reference,Lcom/ccit/mmwlan/phone/HTTPConnectionTool;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v18
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0, v1, v2, v3}, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->ConbinCertApply(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 520
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() requestXML -> "
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 521
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 520
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 525
a=0;//     new-instance v5, Lcom/ccit/mmwlan/phone/InflaterTool;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/ccit/mmwlan/phone/InflaterTool;);
a=0;//     invoke-direct {v5}, Lcom/ccit/mmwlan/phone/InflaterTool;-><init>()V
a=0;// 
a=0;//     .line 529
a=0;//     .local v5, "inflaterTool":Lcom/ccit/mmwlan/phone/InflaterTool;
a=0;//     #v5=(Reference,Lcom/ccit/mmwlan/phone/InflaterTool;);
a=0;//     const-string v8, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "3"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v4, v6, v8, v0, v9}, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->doPost(Ljava/lang/String;[BLorg/apache/http/HttpHost;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 532
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() byResponse -> "
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 533
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v24, Ljava/lang/String;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v10}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);v24=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 532
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 537
a=0;//     new-instance v8, Ljava/lang/String;
a=0;// 
a=0;//     .line 538
a=0;//     #v8=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v10}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 537
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v8}, Lcom/ccit/mmwlan/phone/InflaterTool;->getServiceInit(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 541
a=0;//     .local v11, "certDataList":Ljava/util/ArrayList;
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     .line 542
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getResult()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 545
a=0;//     .local v16, "strApplyCertResult":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() strApplyCertResult -> "
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 546
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 545
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 549
a=0;//     const-string v8, "0"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 552
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 555
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     .line 556
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getEncKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 559
a=0;//     .local v17, "strDynPdworld":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() strDynPdworld -> "
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 560
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 559
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 564
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/ccit/mmwlan/phone/CertApplyInfo;
a=0;// 
a=0;//     .line 565
a=0;//     invoke-virtual {v8}, Lcom/ccit/mmwlan/phone/CertApplyInfo;->getRandNum()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 569
a=0;//     .local v20, "strRandom":Ljava/lang/String;
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v20, :cond_5
a=0;// 
a=0;//     .line 571
a=0;//     invoke-static/range {v20 .. v20}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->updateRandNum(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 572
a=0;//     .local v23, "upRandomResult":I
a=0;//     #v23=(Integer);
a=0;//     if-nez v23, :cond_0
a=0;// 
a=0;//     .line 579
a=0;//     .end local v23    # "upRandomResult":I
a=0;//     :cond_5
a=0;//     #v23=(Conflicted);
a=0;//     sget-object v8, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v8, v0, v9}, Lcom/ccit/mmwlan/ClientSDK;->saveSecCertNativeForBilling(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 582
a=0;//     #v14=(Integer);
a=0;//     const-string v8, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v24, "applySecCertMethod() iResult -> "
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 583
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 582
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move/from16 v23, v14
a=0;// 
a=0;//     .line 586
a=0;//     #v23=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 588
a=0;//     .end local v17    # "strDynPdworld":Ljava/lang/String;
a=0;//     .end local v20    # "strRandom":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v8=(Boolean);v14=(One);v17=(Uninit);v20=(Uninit);v22=(Null);v23=(Uninit);
a=0;//     const-string v8, "7"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 590
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .local v15, "index":I
a=0;//     :goto_1
a=0;//     #v15=(Integer);v21=(Conflicted);
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-lt v15, v8, :cond_7
a=0;// 
a=0;//     .end local v15    # "index":I
a=0;//     :goto_2
a=0;//     #v14=(Integer);v15=(Conflicted);
a=0;//     move/from16 v23, v14
a=0;// 
a=0;//     .line 624
a=0;//     #v23=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 593
a=0;//     .restart local v15    # "index":I
a=0;//     :cond_7
a=0;//     #v14=(One);v15=(Integer);v23=(Uninit);
a=0;//     const-string v9, "2"
a=0;// 
a=0;//     move-object/from16 v8, p2
a=0;// 
a=0;//     .line 592
a=0;//     #v8=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-static/range {v4 .. v9}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->applyCertPrivate(Lcom/ccit/mmwlan/phone/HTTPConnectionTool;Lcom/ccit/mmwlan/phone/InflaterTool;Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 594
a=0;//     .local v21, "strResult1":Ljava/lang/String;
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "7"
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     .line 596
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 597
a=0;//     #v14=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 590
a=0;//     :cond_8
a=0;//     #v14=(One);
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 621
a=0;//     .end local v15    # "index":I
a=0;//     .end local v21    # "strResult1":Ljava/lang/String;
a=0;//     :cond_9
a=0;//     #v15=(Uninit);v21=(Uninit);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static checkSecCert()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 381
a=0;//     .local v1, "iResult":I
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->checkSecCertNativeForBilling()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 384
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "checkSecCert()  iResult -> "
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
a=0;//     .line 393
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 387
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 389
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 390
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static genPKIKey()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 152
a=0;//     .local v1, "iResult":I
a=0;//     :try_start_0
a=0;//     #v1=(Byte);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->genPKIKeyNativeForBilling()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 155
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "genPKIKey() iResult -> "
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
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 158
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 160
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     .line 161
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static genSID()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     .line 117
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->genSIDNative()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 122
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "genSID() strResult -> "
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
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 131
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDeviceID()Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 301
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 303
a=0;//     sget-object v5, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 304
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const-string v6, "phone"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 303
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 307
a=0;//     .local v1, "mTelephonyMgr":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 308
a=0;//     .local v3, "strIMEI":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 310
a=0;//     sget-object v5, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     const-string v6, "wifi"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 311
a=0;//     .local v4, "wifi":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 312
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
a=0;//     .line 315
a=0;//     const-string v5, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     .line 316
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
a=0;//     .line 315
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 328
a=0;//     .end local v0    # "info":Landroid/net/wifi/WifiInfo;
a=0;//     .end local v4    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v4=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 325
a=0;//     const-string v5, "MMClientSDK_ForPhone"
a=0;// 
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
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getGenPubkey()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     .line 174
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 177
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v2}, Lcom/ccit/mmwlan/ClientSDK;->getPubKeyForBilling()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 178
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 194
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "getGenPubkey()  strResult -> "
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
a=0;//     .line 188
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 190
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getIMSI()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 340
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 341
a=0;//     .local v1, "sb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 343
a=0;//     sget-object v3, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 344
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "phone"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 343
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 347
a=0;//     .local v0, "mTelephonyMgr":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 348
a=0;//     .local v2, "strIMSI":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 353
a=0;//     const-string v3, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getIMSI() errorValue -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
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
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 356
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 366
a=0;//     :goto_0
a=0;//     return-object v3
a=0;// 
a=0;//     .line 359
a=0;//     :cond_0
a=0;//     #v5=(Uninit);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 362
a=0;//     const-string v3, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getIMSI() IMSI -> "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
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
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getSIDSignValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "strSID"    # Ljava/lang/String;
a=0;//     .param p1, "appuid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 856
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 861
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, p0, p1, v3}, Lcom/ccit/mmwlan/ClientSDK;->SIDSignNativeForBilling(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 867
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "getSIDSignValue() -> "
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
a=0;//     .line 874
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 869
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 871
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getVersion()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     const-string v0, "1.1.6"
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "strVersion":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static imsiOfMD5Value()Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1129
a=0;//     #v8=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1130
a=0;//     .local v3, "strIMSI":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 1132
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 1133
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const-string v6, "phone"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1132
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 1136
a=0;//     .local v1, "mTelephonyMgr":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1137
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1139
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1140
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1141
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1169
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1146
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v4=(Uninit);v6=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     const-string v6, "md5"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v3}, Lcom/ccit/mmwlan/ClientSDK;->getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1147
a=0;//     .local v4, "strMD5Result":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1149
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1150
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1151
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1155
a=0;//     :cond_1
a=0;//     const-string v5, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "imsiOfMD5Value() strMD5Result -> "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1156
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1155
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1159
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1160
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1169
a=0;//     .end local v4    # "strMD5Result":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1162
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1164
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 1165
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1166
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static initialImsiAndImeiValue()I
a=0;//     .locals 13
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1036
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1037
a=0;//     .local v3, "iResult":I
a=0;//     #v3=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1038
a=0;//     .local v8, "strIMSI":Ljava/lang/String;
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1042
a=0;//     .local v7, "strIMEI":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     new-instance v1, Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     invoke-direct {v1}, Lcom/ccit/mmwlan/vo/DeviceInfo;-><init>()V
a=0;// 
a=0;//     .line 1044
a=0;//     .local v1, "deviceInfo":Lcom/ccit/mmwlan/vo/DeviceInfo;
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/DeviceInfo;);
a=0;//     sget-object v10, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 1045
a=0;//     #v10=(Reference,Landroid/content/Context;);
a=0;//     const-string v11, "phone"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1044
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 1048
a=0;//     .local v5, "mTelephonyMgr":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1049
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 1050
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1106
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(PosByte);v4=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(One);v4=(Uninit);v6=(Uninit);v7=(Null);v9=(Uninit);v11=(Reference,Ljava/lang/String;);v12=(Uninit);
a=0;//     invoke-virtual {v1, v8}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImsi(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1056
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "strIMSI -> "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1060
a=0;//     invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1061
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 1062
a=0;//     sget-object v10, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     const-string v11, "wifi"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 1063
a=0;//     .local v9, "wifi":Landroid/net/wifi/WifiManager;
a=0;//     invoke-virtual {v9}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1064
a=0;//     .local v4, "info":Landroid/net/wifi/WifiInfo;
a=0;//     #v4=(Reference,Landroid/net/wifi/WifiInfo;);
a=0;//     invoke-virtual {v4}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1066
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     .line 1067
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "initialImsiAndImeiValue() strIMEI MacAddress -> "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1068
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1067
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1066
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1071
a=0;//     invoke-virtual {v1, v7}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImei(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1076
a=0;//     .end local v4    # "info":Landroid/net/wifi/WifiInfo;
a=0;//     .end local v9    # "wifi":Landroid/net/wifi/WifiManager;
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v9=(Conflicted);
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "strIMEI -> "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1080
a=0;//     sget-object v10, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1081
a=0;//     .local v0, "certFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1082
a=0;//     .local v6, "strFilePath":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setFilePath(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1085
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "FilePath -> "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1089
a=0;//     :try_start_0
a=0;//     sget-object v10, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     invoke-virtual {v10, v1}, Lcom/ccit/mmwlan/ClientSDK;->transmitInfoNative(Lcom/ccit/mmwlan/vo/DeviceInfo;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1091
a=0;//     #v3=(Integer);
a=0;//     const-string v10, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     .line 1092
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "initialImsiAndImeiValue() iResult -> "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1091
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1094
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1096
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     .line 1097
a=0;//     #v3=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1073
a=0;//     .end local v0    # "certFile":Ljava/io/File;
a=0;//     .end local v6    # "strFilePath":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(One);v4=(Uninit);v6=(Uninit);v9=(Uninit);
a=0;//     invoke-virtual {v1, v7}, Lcom/ccit/mmwlan/vo/DeviceInfo;->setStrImei(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1099
a=0;//     .restart local v0    # "certFile":Ljava/io/File;
a=0;//     .restart local v6    # "strFilePath":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/io/File;);v3=(Integer);v4=(Conflicted);v6=(Reference,Ljava/lang/String;);v9=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 1101
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     .line 1102
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 1105
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1106
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static initialMMSDK(Landroid/content/Context;Lcom/ccit/mmwlan/phone/IPDress_ForPhone;)I
a=0;//     .locals 5
a=0;//     .param p0, "context1"    # Landroid/content/Context;
a=0;//     .param p1, "ipDress"    # Lcom/ccit/mmwlan/phone/IPDress_ForPhone;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 61
a=0;//     .local v0, "iResult":I
a=0;//     #v0=(Byte);
a=0;//     sput-object p0, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 62
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 91
a=0;//     .end local v0    # "iResult":I
a=0;//     .local v1, "iResult":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 68
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v0    # "iResult":I
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/phone/IPDress_ForPhone;->getStrApplySecCertIP()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/phone/IPDress_ForPhone;->getStrSMSNumber()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v0    # "iResult":I
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/phone/IPDress_ForPhone;->getStrApplySecCertIP()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->strApplyCertForPhone:Ljava/lang/String;
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p1}, Lcom/ccit/mmwlan/phone/IPDress_ForPhone;->getStrSMSNumber()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->SMSNumber:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "initialMMSDK() strIPDress -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->strApplyCertForPhone:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "  :  "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->SMSNumber:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->initialImsiAndImeiValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 88
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "initialMMSDK() iResult -> "
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
a=0;//     .line 91
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
a=0;//     .line 205
a=0;//     #v5=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 207
a=0;//     .local v1, "strResult":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 209
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
a=0;//     .line 227
a=0;//     .end local v1    # "strResult":Ljava/lang/String;
a=0;//     .local v2, "strResult":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 215
a=0;//     .end local v2    # "strResult":Ljava/lang/String;
a=0;//     .restart local v1    # "strResult":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     const-string v4, "md5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, p0}, Lcom/ccit/mmwlan/ClientSDK;->getDigestNative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 216
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 218
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
a=0;//     .line 227
a=0;//     .end local v1    # "strResult":Ljava/lang/String;
a=0;//     .restart local v2    # "strResult":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     .end local v2    # "strResult":Ljava/lang/String;
a=0;//     .restart local v1    # "strResult":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 223
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static sendMessageAndApplyCert(Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;//     .locals 16
a=0;//     .param p0, "appuid"    # Ljava/lang/String;
a=0;//     .param p1, "getHttpProxy"    # Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     .line 888
a=0;//     .local v12, "iResult":I
a=0;//     #v12=(Byte);
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->genSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 889
a=0;//     .local v15, "strSID":Ljava/lang/String;
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 891
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     .line 895
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->imsiOfMD5Value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 896
a=0;//     .local v14, "strImsiMD5":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 898
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     .line 902
a=0;//     :cond_1
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 903
a=0;//     .local v13, "sb":Ljava/lang/StringBuilder;
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 904
a=0;//     const-string v1, "MM#WLAN"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "#"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 905
a=0;//     const-string v2, "#"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "#"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 906
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 909
a=0;//     const-string v1, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendMessageAndApplyCert() sendMessage -> "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 910
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 909
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 914
a=0;//     invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 917
a=0;//     .local v0, "smsManager":Landroid/telephony/SmsManager;
a=0;//     #v0=(Reference,Landroid/telephony/SmsManager;);
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x46
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_3
a=0;// 
a=0;//     .line 920
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 921
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 920
a=0;//     invoke-virtual {v0, v1}, Landroid/telephony/SmsManager;->divideMessage(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 922
a=0;//     .local v10, "contents":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 936
a=0;//     .end local v10    # "contents":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static/range {v15 .. v17}, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->applySecCertMethod(Ljava/lang/String;Ljava/lang/String;Lorg/apache/http/HttpHost;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 939
a=0;//     #v12=(Integer);
a=0;//     const-string v1, "MMClientSDK_ForPhone"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sendMessageAndApplyCert() -> "
a=0;// 
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 948
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v11=(Conflicted);
a=0;//     return v12
a=0;// 
a=0;//     .line 922
a=0;//     .restart local v10    # "contents":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(PosByte);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Reference,Ljava/util/ArrayList;);v11=(Uninit);v12=(Byte);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 925
a=0;//     .local v3, "msg":Ljava/lang/String;
a=0;//     sget-object v1, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->SMSNumber:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 930
a=0;//     .end local v3    # "msg":Ljava/lang/String;
a=0;//     .end local v10    # "contents":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(PosByte);v3=(Uninit);v4=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v10=(Uninit);
a=0;//     sget-object v5, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->SMSNumber:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 931
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     .line 930
a=0;//     invoke-virtual/range {v4 .. v9}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 942
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Integer);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 944
a=0;//     .local v11, "e":Ljava/lang/Exception;
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     .line 945
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static updateRandNum(Ljava/lang/String;)I
a=0;//     .locals 6
a=0;//     .param p0, "strRandNum"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "iResult":I
a=0;//     #v1=(Byte);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 265
a=0;//     .end local v1    # "iResult":I
a=0;//     .local v2, "iResult":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 248
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Byte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v3, Lcom/ccit/mmwlan/phone/MMClientSDK_ForPhone;->clientSDK:Lcom/ccit/mmwlan/ClientSDK;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ccit/mmwlan/ClientSDK;);
a=0;//     invoke-virtual {v3, p0}, Lcom/ccit/mmwlan/ClientSDK;->UpdateRandNumForBilling(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 249
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 251
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 252
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v2    # "iResult":I
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 256
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     const-string v3, "MMClientSDK_ForPhone"
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
a=0;//     .line 265
a=0;//     .end local v1    # "iResult":I
a=0;//     .restart local v2    # "iResult":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 259
a=0;//     .end local v2    # "iResult":I
a=0;//     .restart local v1    # "iResult":I
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 261
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 262
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
