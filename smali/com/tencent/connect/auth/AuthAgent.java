package com.tencent.connect.auth; class AuthAgent { void a() { int a;
a=0;// .class public Lcom/tencent/connect/auth/AuthAgent;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;,
a=0;//         Lcom/tencent/connect/auth/AuthAgent$RequestListener;,
a=0;//         Lcom/tencent/connect/auth/AuthAgent$TokenListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Landroid/app/Activity;
a=0;// 
a=0;// .field private d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 325
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/connect/auth/AuthAgent$1;-><init>(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 367
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/connect/auth/AuthAgent$2;-><init>(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$2;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->e:Landroid/os/Handler;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(ZLcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenUi, showDialog --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 239
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     const-string v1, "isadd"
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v1, "scope"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     const-string v1, "client_id"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 244
a=0;//     sget-boolean v1, Lcom/tencent/connect/auth/AuthAgent;->isOEM:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 245
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "desktop_m_qq-"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/auth/AuthAgent;->installChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "android"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/auth/AuthAgent;->registerChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/connect/auth/AuthAgent;->businessId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/tencent/utils/SystemUtils;->getAppSignatureMD5(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 253
a=0;//     const-string v3, "sign"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 254
a=0;//     const-string v2, "time"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 257
a=0;//     const-string v1, "display"
a=0;// 
a=0;//     const-string v2, "mobile"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     const-string v1, "response_type"
a=0;// 
a=0;//     const-string v2, "token"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 259
a=0;//     const-string v1, "redirect_uri"
a=0;// 
a=0;//     const-string v2, "auth://tauth.qq.com/"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 261
a=0;//     const-string v1, "cancel_display"
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 262
a=0;//     const-string v1, "switch"
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 264
a=0;//     const-string v1, "status_userip"
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/utils/Util;->getUserIp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 266
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "https://openmobile.qq.com/oauth2.0/m_authorize?"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 267
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 271
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$TokenListener;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent$TokenListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Landroid/content/Context;Lcom/tencent/tauth/IUiListener;ZZ)V
a=0;// 
a=0;//     .line 273
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$TokenListener;);
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenUi, showDialog TDialog"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 274
a=0;//     new-instance v1, Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;
a=0;// 
a=0;//     const-string v3, "action_login"
a=0;// 
a=0;//     iget-object v6, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     move-object v4, v7
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/connect/auth/AuthAgent$TokenListener;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/tencent/connect/auth/AuthDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 275
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/AuthDialog;->show()V
a=0;// 
a=0;//     .line 276
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 247
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/os/Bundle;);v1=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "openmobile_android"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v0, v1, v2, v3}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Z)I
a=0;// 
a=0;//     .line 322
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/auth/AuthAgent;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/auth/AuthAgent;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenUi, EncrytokenListener() validToken()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 493
a=0;//     const-string v2, "https://openmobile.qq.com/user/user_login_statis"
a=0;// 
a=0;//     .line 494
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 495
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "encrytoken"
a=0;// 
a=0;//     invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 496
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lcom/tencent/connect/auth/AuthAgent$RequestListener;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$RequestListener;);
a=0;//     invoke-direct {v5, p0}, Lcom/tencent/connect/auth/AuthAgent$RequestListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/connect/auth/AuthAgent$RequestListener;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// 
a=0;//     .line 498
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Activity;Z)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     const-string v0, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthAgent;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 283
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeCGIParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 285
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     const-string v2, "isadd"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 288
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "scope"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 289
a=0;//     const-string v2, "client_id"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 291
a=0;//     sget-boolean v2, Lcom/tencent/connect/auth/AuthAgent;->isOEM:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 292
a=0;//     const-string v2, "pf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "desktop_m_qq-"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/connect/auth/AuthAgent;->installChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "-"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "android"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "-"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/connect/auth/AuthAgent;->registerChannel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "-"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lcom/tencent/connect/auth/AuthAgent;->businessId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 296
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v2, "need_pay"
a=0;// 
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     const-string v2, "oauth_app_name"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/utils/SystemUtils;->getAppName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x3e8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     div-long/2addr v3, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3, v2}, Lcom/tencent/utils/SystemUtils;->getAppSignatureMD5(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 300
a=0;//     const-string v4, "sign"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     const-string v3, "time"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     const-string v2, "key_action"
a=0;// 
a=0;//     const-string v3, "action_login"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 303
a=0;//     const-string v2, "key_params"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 305
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->hasActivityForIntent()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 309
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/connect/auth/AuthAgent;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 311
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 315
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 294
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Reference,Landroid/os/Bundle;);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v2, "pf"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "openmobile_android"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/tencent/connect/auth/AuthAgent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/auth/AuthAgent;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/tencent/connect/auth/AuthAgent;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/tauth/IUiListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lcom/tencent/connect/auth/AuthAgent;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic j(Lcom/tencent/connect/auth/AuthAgent;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic k(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 166
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Z)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthAgent;->doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public doLogin(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;ZZ)I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 174
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent;->c:Landroid/app/Activity;
a=0;// 
a=0;//     .line 175
a=0;//     iput-object p3, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 176
a=0;//     if-nez p4, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     const-string v3, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lcom/tencent/connect/auth/AuthAgent;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 187
a=0;//     const-string v4, "com.tencent.open.agent.EncryTokenActivity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lcom/tencent/connect/auth/AuthAgent;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 190
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/ComponentName;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 195
a=0;//     const-string v3, "oauth_consumer_key"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 196
a=0;//     const-string v2, "openid"
a=0;// 
a=0;//     invoke-virtual {v4, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 197
a=0;//     const-string v1, "access_token"
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 198
a=0;//     const-string v0, "key_action"
a=0;// 
a=0;//     const-string v1, "action_check_token"
a=0;// 
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 199
a=0;//     iput-object v4, p0, Lcom/tencent/connect/auth/AuthAgent;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/auth/AuthAgent;->hasActivityForIntent()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/connect/auth/AuthAgent;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 230
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);v4=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "tencent&sdk&qazxc***14969%%"
a=0;// 
a=0;//     .line 205
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "qzone3.4"
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 208
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "encry_token"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 214
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 211
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-direct {p0, p1, p5}, Lcom/tencent/connect/auth/AuthAgent;->a(Landroid/app/Activity;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 222
a=0;//     if-eqz p4, :cond_3
a=0;// 
a=0;//     .line 223
a=0;//     const-string v0, "10785"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p1, v0, v1, v2, v3}, Lcom/tencent/utils/Util;->reportBernoulli(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
a=0;// 
a=0;//     .line 225
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenUi, showUi, return Constants.UI_ACTIVITY"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 226
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 228
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;-><init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 229
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthAgent$FeedConfirmListener;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-direct {p0, p5, v0}, Lcom/tencent/connect/auth/AuthAgent;->a(ZLcom/tencent/tauth/IUiListener;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 544
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 545
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/connect/common/BaseApi$ApiTask;
a=0;// 
a=0;//     .line 546
a=0;//     iget v3, v0, Lcom/tencent/connect/common/BaseApi$ApiTask;->mRequestCode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v1, v0, Lcom/tencent/connect/common/BaseApi$ApiTask;->mListener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 548
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthAgent;->mTaskList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 553
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 597
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 557
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne p2, v0, :cond_6
a=0;// 
a=0;//     .line 558
a=0;//     const-string v0, "key_error_code"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p3, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 559
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 560
a=0;//     const-string v0, "key_response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 561
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 563
a=0;//     :try_start_0
a=0;//     invoke-static {v2}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 564
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-ne v1, v3, :cond_3
a=0;// 
a=0;//     .line 565
a=0;//     const-string v3, "access_token"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 566
a=0;//     const-string v4, "expires_in"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 567
a=0;//     const-string v5, "openid"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 568
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 570
a=0;//     iget-object v6, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v6, v3, v4}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 574
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 596
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/b/a/g;->a()Lcom/tencent/b/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/g;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/g;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 575
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 576
a=0;//     new-instance v3, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v4, -0x4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const-string v5, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v5, v2}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v3}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 578
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenUi, onActivityResult, json error"
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 582
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenUi, onActivityResult, onComplete"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 584
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 587
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Null);
a=0;//     const-string v2, "openSDK_LOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "OpenUi, onActivityResult, onError = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/tencent/b/a/g;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 588
a=0;//     const-string v2, "key_error_msg"
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 589
a=0;//     const-string v3, "key_error_detail"
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 590
a=0;//     new-instance v4, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-direct {v4, v0, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v4}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 593
a=0;//     :cond_6
a=0;//     #v0=(Byte);v3=(Conflicted);v4=(Uninit);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "OpenUi, onActivityResult, Constants.ACTIVITY_CANCEL"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 594
a=0;//     invoke-interface {v1}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public writeEncryToken(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "SetJavaScriptEnabled"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 502
a=0;//     #v7=(One);
a=0;//     const-string v1, "tencent&sdk&qazxc***14969%%"
a=0;// 
a=0;//     .line 503
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 504
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 505
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 506
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "qzone3.4"
a=0;// 
a=0;//     .line 507
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 508
a=0;//     #v0=(Null);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 510
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 512
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/webkit/WebView;);
a=0;//     invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 513
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 514
a=0;//     invoke-virtual {v2, v7}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     .line 515
a=0;//     invoke-virtual {v2, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 516
a=0;//     invoke-virtual {v2, v7}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V
a=0;// 
a=0;//     .line 517
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = \'qq.com\';localStorage[\""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\"]=\""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\";</script></head><body></body></html>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 524
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "http://qzs.qq.com"
a=0;// 
a=0;//     invoke-virtual {v1, p1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 526
a=0;//     const-string v3, "text/html"
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     move-object v5, v1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 528
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
