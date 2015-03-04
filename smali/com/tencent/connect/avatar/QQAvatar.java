package com.tencent.connect.avatar; class QQAvatar { void a() { int a;
a=0;// .class public Lcom/tencent/connect/avatar/QQAvatar;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/QQAvatar;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()Landroid/content/Intent;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/QQAvatar;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-class v2, Lcom/tencent/connect/avatar/ImageActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 31
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Activity;Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0, p2}, Lcom/tencent/connect/avatar/QQAvatar;->a(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "key_action"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "action_avatar"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "key_params"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/connect/avatar/QQAvatar;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 67
a=0;//     const-string v0, "appid"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     const-string v0, "keystr"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 71
a=0;//     const-string v0, "keytype"
a=0;// 
a=0;//     const-string v1, "0x80"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 75
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     const-string v1, "hopenid"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     const-string v0, "platform"
a=0;// 
a=0;//     const-string v1, "androidqz"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "pfStore"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     const-string v2, "openmobile_android"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 94
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, "sdkv"
a=0;// 
a=0;//     const-string v1, "2.2.1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     const-string v0, "sdkp"
a=0;// 
a=0;//     const-string v1, "a"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// 
a=0;//     .line 88
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 90
a=0;//     const-string v0, "pf"
a=0;// 
a=0;//     const-string v1, "openmobile_android"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne p2, v0, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     const-string v0, "key_error_code"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 105
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     const-string v0, "key_response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 107
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 110
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v2, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 126
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Lorg/json/JSONObject;);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v3, -0x4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-string v4, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v4, v0}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v1, v2}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     const-string v1, "key_error_msg"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 120
a=0;//     const-string v2, "key_error_detail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     new-instance v4, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-direct {v4, v0, v1, v2}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v3, v4}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAvatar(Landroid/app/Activity;Landroid/net/Uri;Lcom/tencent/tauth/IUiListener;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     iput-object p3, p0, Lcom/tencent/connect/avatar/QQAvatar;->a:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "picture"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     const-string v1, "exitAnim"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 44
a=0;//     const-string v1, "appid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     const-string v1, "access_token"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     const-string v1, "expires_in"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getExpireTimeInSecond()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 47
a=0;//     const-string v1, "openid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/QQAvatar;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/QQAvatar;->a()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/avatar/QQAvatar;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/QQAvatar;->hasActivityForIntent()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/connect/avatar/QQAvatar;->a(Landroid/app/Activity;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 54
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
}}
