package com.tencent.connect.share; class QzoneShare { void a() { int a;
a=0;// .class public Lcom/tencent/connect/share/QzoneShare;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final SHARE_TO_QQ_APP_NAME:Ljava/lang/String; = "appName"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_AUDIO_URL:Ljava/lang/String; = "audio_url"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_EXT_INT:Ljava/lang/String; = "cflag"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_EXT_STR:Ljava/lang/String; = "share_qq_ext_str"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_IMAGE_LOCAL_URL:Ljava/lang/String; = "imageLocalUrl"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_IMAGE_URL:Ljava/lang/String; = "imageUrl"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_SITE:Ljava/lang/String; = "site"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_SUMMARY:Ljava/lang/String; = "summary"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_TARGET_URL:Ljava/lang/String; = "targetUrl"
a=0;// 
a=0;// .field public static final SHARE_TO_QQ_TITLE:Ljava/lang/String; = "title"
a=0;// 
a=0;// .field public static final SHARE_TO_QZONE_KEY_TYPE:Ljava/lang/String; = "req_type"
a=0;// 
a=0;// .field public static final SHARE_TO_QZONE_TYPE_IMAGE:I = 0x5
a=0;// 
a=0;// .field public static final SHARE_TO_QZONE_TYPE_IMAGE_TEXT:I = 0x1
a=0;// 
a=0;// .field public static final SHARE_TO_QZONE_TYPE_NO_TYPE:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 68
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/tencent/connect/share/QzoneShare;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z
a=0;// 
a=0;//     .line 63
a=0;//     iput-boolean v1, p0, Lcom/tencent/connect/share/QzoneShare;->b:Z
a=0;// 
a=0;//     .line 64
a=0;//     iput-boolean v1, p0, Lcom/tencent/connect/share/QzoneShare;->c:Z
a=0;// 
a=0;//     .line 65
a=0;//     iput-boolean v1, p0, Lcom/tencent/connect/share/QzoneShare;->d:Z
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/StringBuffer;Landroid/os/Bundle;)Ljava/lang/StringBuffer;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x50
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v8, 0x28
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     #v0=(Null);
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "fillShareToQQParams() --start"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 384
a=0;//     const-string v1, "imageUrl"
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 385
a=0;//     const-string v1, "appName"
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 386
a=0;//     const-string v3, "req_type"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p2, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 387
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 388
a=0;//     const-string v5, "summary"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 390
a=0;//     const-string v6, "appId"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v7=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v7}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {p2, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 391
a=0;//     const-string v6, "sdkp"
a=0;// 
a=0;//     const-string v7, "a"
a=0;// 
a=0;//     invoke-virtual {p2, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 392
a=0;//     const-string v6, "sdkv"
a=0;// 
a=0;//     const-string v7, "2.2.1"
a=0;// 
a=0;//     invoke-virtual {p2, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 393
a=0;//     const-string v6, "status_os"
a=0;// 
a=0;//     sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 395
a=0;//     const-string v6, "status_machine"
a=0;// 
a=0;//     sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 397
a=0;//     const-string v6, "..."
a=0;// 
a=0;//     .line 398
a=0;//     invoke-static {v4}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-le v6, v8, :cond_0
a=0;// 
a=0;//     .line 400
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "..."
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p2, v6, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 402
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     invoke-static {v5}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v4, v9, :cond_1
a=0;// 
a=0;//     .line 403
a=0;//     const-string v4, "summary"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v0, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "..."
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 405
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 406
a=0;//     const-string v4, "site"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 408
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 410
a=0;//     #v4=(Integer);
a=0;//     new-array v5, v4, [Ljava/lang/String;
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 411
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ge v1, v4, :cond_3
a=0;// 
a=0;//     .line 412
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v0, v5, v1
a=0;// 
a=0;//     .line 411
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 414
a=0;//     :cond_3
a=0;//     const-string v0, "imageUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v5}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 416
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 418
a=0;//     invoke-static {p2}, Lcom/tencent/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 421
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\\+"
a=0;// 
a=0;//     const-string v3, "%20"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 422
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "fillShareToQQParams() --end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 423
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     const-string v3, "openSDK_LOG"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "doShareToQQ() --start"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v6, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     const-string v3, "mqqapi://share/to_qzone?src_type=app&version=1&file_type=news"
a=0;// 
a=0;//     invoke-direct {v6, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     #v6=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v3, "imageUrl"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 269
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v3, "title"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 270
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "summary"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 271
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "targetUrl"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 272
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "audio_url"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 273
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "req_type"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 274
a=0;//     #v12=(Integer);
a=0;//     const-string v3, "appName"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 277
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "cflag"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 278
a=0;//     #v14=(Integer);
a=0;//     const-string v3, "share_qq_ext_str"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 280
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 281
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 283
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "shareToQQ"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "openId:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 285
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 286
a=0;//     new-instance v18, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 287
a=0;//     #v18=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-le v3, v4, :cond_1
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 288
a=0;//     :goto_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Integer);v5=(Integer);
a=0;//     if-ge v5, v4, :cond_2
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 290
a=0;//     add-int/lit8 v3, v4, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v5, v3, :cond_0
a=0;// 
a=0;//     .line 291
a=0;//     const-string v3, ";"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 288
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v3, v5, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v5, v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_1
a=0;//     #v4=(PosByte);v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 294
a=0;//     :cond_2
a=0;//     #v5=(Integer);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&image_url="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 296
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v18=(Conflicted);
a=0;//     invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 298
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&title="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 300
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 302
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&description="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 304
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 305
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&share_id="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 307
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&url="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 310
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_8
a=0;// 
a=0;//     .line 311
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&app_name="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 314
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static/range {v17 .. v17}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     .line 315
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&open_id="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 319
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v11}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     .line 320
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&audioUrl="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 323
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&req_type="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 326
a=0;//     invoke-static {v15}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 327
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&share_qq_ext_str="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 329
a=0;//     :cond_b
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&cflag="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 330
a=0;//     const-string v3, "shareToQQ"
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 332
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/connect/share/QzoneShare;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     const-string v5, "requireApi"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const-string v9, "shareToNativeQQ"
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     invoke-static {v3, v4, v5, v7}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 334
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v4, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcom/tencent/connect/share/QzoneShare;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 335
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/connect/share/QzoneShare;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 336
a=0;//     const-string v3, "4.6.0"
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/tencent/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_d
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/share/QzoneShare;->hasActivityForIntent()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     .line 338
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move-object/from16 v2, p3
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/connect/share/QzoneShare;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 349
a=0;//     :cond_c
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v3, "openSDK_LOG"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "doShareToQQ() --end"
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 350
a=0;//     return-void
a=0;// 
a=0;//     .line 341
a=0;//     :cond_d
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     const-string v3, "shareToQzone"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/tencent/utils/TemporaryStorage;->set(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 342
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     .line 343
a=0;//     check-cast v3, Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 345
a=0;//     :cond_e
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/share/QzoneShare;->hasActivityForIntent()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     .line 346
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/connect/share/QzoneShare;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     const-string v0, "shareToQzone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p3}, Lcom/tencent/utils/TemporaryStorage;->set(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 354
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     check-cast v0, Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 358
a=0;//     :cond_0
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToH5Qzone() --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 359
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     const-string v1, "http://openmobile.qq.com/api/check2?page=qzshare.html&loginpage=loginindex.html&logintype=qzone"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 360
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 361
a=0;//     new-instance p2, Landroid/os/Bundle;
a=0;// 
a=0;//     #p2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {p2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 363
a=0;//     :cond_1
a=0;//     #p2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {p0, v0, p2}, Lcom/tencent/connect/share/QzoneShare;->a(Ljava/lang/StringBuffer;Landroid/os/Bundle;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v1, p0, Lcom/tencent/connect/share/QzoneShare;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     const-string v3, "requireApi"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v6, "shareToH5QQ"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/Util;->openBrowser(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 366
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 367
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 368
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v1, -0x6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const-string v2, "\u6253\u5f00\u6d4f\u89c8\u5668\u5931\u8d25!"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 372
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "shareToH5QQ() --end"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 373
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/share/QzoneShare;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/share/QzoneShare;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, -0x5
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v9, -0x6
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     #v8=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v9, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 261
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v0, "title"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 87
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "summary"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 88
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "targetUrl"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 89
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "imageUrl"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 90
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 93
a=0;//     const-string v0, "appName"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v6, "req_type"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 101
a=0;//     #v6=(Integer);
a=0;//     sparse-switch v6, :sswitch_data_0
a=0;// 
a=0;//     .line 120
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 123
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 124
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z
a=0;// 
a=0;//     .line 133
a=0;//     :goto_2
a=0;//     #v7=(Conflicted);
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/share/QzoneShare;->b:Z
a=0;// 
a=0;//     .line 134
a=0;//     iput-boolean v10, p0, Lcom/tencent/connect/share/QzoneShare;->c:Z
a=0;// 
a=0;//     .line 135
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/share/QzoneShare;->d:Z
a=0;// 
a=0;//     .line 141
a=0;//     :goto_3
a=0;//     invoke-static {}, Lcom/tencent/utils/Util;->hasSDCard()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "\u5206\u4eab\u56fe\u7247\u5931\u8d25\uff0c\u68c0\u6d4b\u4e0d\u5230SD\u5361!"
a=0;// 
a=0;//     invoke-direct {v0, v9, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 144
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() sdcard is null--end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     #v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x14
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-le v6, v7, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v7, 0x14
a=0;// 
a=0;//     invoke-virtual {v0, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "..."
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 104
a=0;//     :sswitch_0
a=0;//     #v6=(Integer);v7=(Conflicted);
a=0;//     iput-boolean v10, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z
a=0;// 
a=0;//     .line 105
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/share/QzoneShare;->b:Z
a=0;// 
a=0;//     .line 106
a=0;//     iput-boolean v10, p0, Lcom/tencent/connect/share/QzoneShare;->c:Z
a=0;// 
a=0;//     .line 107
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/share/QzoneShare;->d:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 110
a=0;//     :sswitch_1
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "\u6682\u4e0d\u652f\u6301\u7eaf\u56fe\u7247\u5206\u4eab\u5230\u7a7a\u95f4\uff0c\u5efa\u8bae\u4f7f\u7528\u56fe\u6587\u5206\u4eab"
a=0;// 
a=0;//     invoke-direct {v0, v11, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 112
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() error--end\u6682\u4e0d\u652f\u6301\u7eaf\u56fe\u7247\u5206\u4eab\u5230\u7a7a\u95f4\uff0c\u5efa\u8bae\u4f7f\u7528\u56fe\u6587\u5206\u4eab"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_3
a=0;//     #v7=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "\u6765\u81ea"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v7, "\u7684\u5206\u4eab"
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 127
a=0;//     iput-boolean v10, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 131
a=0;//     :cond_4
a=0;//     #v7=(Boolean);
a=0;//     iput-boolean v10, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 148
a=0;//     :cond_5
a=0;//     iget-boolean v7, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z
a=0;// 
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 149
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "targetUrl\u4e3a\u5fc5\u586b\u9879\uff0c\u8bf7\u8865\u5145\u540e\u5206\u4eab"
a=0;// 
a=0;//     invoke-direct {v0, v11, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 152
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() targetUrl null error--end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     :cond_6
a=0;//     invoke-static {v4}, Lcom/tencent/utils/Util;->isValidUrl(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 156
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "targetUrl\u6709\u8bef"
a=0;// 
a=0;//     invoke-direct {v0, v11, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 158
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() targetUrl error--end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     iget-boolean v4, p0, Lcom/tencent/connect/share/QzoneShare;->b:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_b
a=0;// 
a=0;//     .line 164
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 165
a=0;//     const-string v3, ""
a=0;// 
a=0;//     .line 166
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 167
a=0;//     const-string v1, "summary"
a=0;// 
a=0;//     invoke-virtual {p2, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     :cond_8
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v4=(Conflicted);v7=(PosShort);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 189
a=0;//     const-string v1, "appName"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 192
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     .line 194
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/share/QzoneShare;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "\u7eaf\u56fe\u5206\u4eab\uff0cimageUrl \u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v9, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 197
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() imageUrl is null--end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_b
a=0;//     #v4=(Boolean);v7=(Boolean);
a=0;//     iget-boolean v4, p0, Lcom/tencent/connect/share/QzoneShare;->c:Z
a=0;// 
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "title\u4e0d\u80fd\u4e3a\u7a7a!"
a=0;// 
a=0;//     invoke-direct {v0, v9, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 172
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() title is null--end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_c
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_d
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v7, 0xc8
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     if-le v4, v7, :cond_d
a=0;// 
a=0;//     .line 178
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-static {v1, v4, v8, v8}, Lcom/tencent/utils/Util;->subString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 179
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 181
a=0;//     :cond_d
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/tencent/utils/Util;->isEmpty(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v4, 0x258
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-le v1, v4, :cond_8
a=0;// 
a=0;//     .line 183
a=0;//     const/16 v1, 0x258
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v3, v1, v8, v8}, Lcom/tencent/utils/Util;->subString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 184
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "summary"
a=0;// 
a=0;//     invoke-virtual {p2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 201
a=0;//     :goto_5
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_10
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 203
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->isValidUrl(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_f
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->isValidPath(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_f
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {v5, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 201
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 208
a=0;//     :cond_10
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_11
a=0;// 
a=0;//     .line 209
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "\u975e\u6cd5\u7684\u56fe\u7247\u5730\u5740!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v9, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 211
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :cond_11
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const-string v0, "imageUrl"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "4.6.0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_13
a=0;// 
a=0;//     .line 219
a=0;//     new-instance v0, Lcom/tencent/connect/share/QzoneShare$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/share/QzoneShare$1;);
a=0;//     invoke-direct {v0, p0, p2, p1, p3}, Lcom/tencent/connect/share/QzoneShare$1;-><init>(Lcom/tencent/connect/share/QzoneShare;Landroid/os/Bundle;Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/QzoneShare$1;);
a=0;//     invoke-static {p1, v5, v0}, Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/util/ArrayList;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;// 
a=0;//     .line 260
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "shareToQzone() --end"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 233
a=0;//     :cond_13
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Null);
a=0;//     const-string v0, "4.2.0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_17
a=0;// 
a=0;//     const-string v0, "4.6.0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_17
a=0;// 
a=0;//     .line 236
a=0;//     new-instance v1, Lcom/tencent/connect/share/QQShare;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/share/QQShare;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-direct {v1, p1, v0}, Lcom/tencent/connect/share/QQShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 237
a=0;//     #v1=(Reference,Lcom/tencent/connect/share/QQShare;);
a=0;//     if-eqz v5, :cond_15
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_15
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v6, v2, :cond_14
a=0;// 
a=0;//     .line 241
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->fileExists(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_14
a=0;// 
a=0;//     .line 242
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const-string v1, "\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u7eaf\u56fe\u5206\u4eab\u4e0d\u652f\u6301\u7f51\u8def\u56fe\u7247"
a=0;// 
a=0;//     invoke-direct {v0, v9, v1, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 244
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "shareToQzone()\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u7eaf\u56fe\u5206\u4eab\u4e0d\u652f\u6301\u7f51\u8def\u56fe\u7247"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 249
a=0;//     :cond_14
a=0;//     #v2=(PosByte);
a=0;//     const-string v2, "imageLocalUrl"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 252
a=0;//     :cond_15
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "4.5.0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/tencent/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_16
a=0;// 
a=0;//     .line 253
a=0;//     const-string v0, "cflag"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 255
a=0;//     :cond_16
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/connect/share/QQShare;->shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 258
a=0;//     :cond_17
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/share/QzoneShare;->a(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 101
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x5 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
