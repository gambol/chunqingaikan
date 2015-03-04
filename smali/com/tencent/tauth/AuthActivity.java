package com.tencent.tauth; class AuthActivity { void a() { int a;
a=0;// .class public Lcom/tencent/tauth/AuthActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACTION_KEY:Ljava/lang/String; = "action"
a=0;// 
a=0;// .field private static final ACTION_SHARE_TO_QQ:Ljava/lang/String; = "shareToQQ"
a=0;// 
a=0;// .field private static final ACTION_SHARE_TO_QZONE:Ljava/lang/String; = "shareToQzone"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/tauth/AuthActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private execAuthCallback(Landroid/os/Bundle;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthMap;->getInstance()Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 73
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthMap;);
a=0;//     const-string v1, "serial"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/AuthMap;->get(Ljava/lang/String;)Lcom/tencent/connect/auth/AuthMap$Auth;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 75
a=0;//     #v2=(Reference,Lcom/tencent/connect/auth/AuthMap$Auth;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     const-string v3, "://cancel"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v3, v2, Lcom/tencent/connect/auth/AuthMap$Auth;->listener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v3}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v2, v2, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/auth/AuthMap;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     #v3=(Integer);v4=(Byte);v5=(Uninit);
a=0;//     const-string v3, "access_token"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 81
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 82
a=0;//     const-string v4, "access_token"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, v2, Lcom/tencent/connect/auth/AuthMap$Auth;->key:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v5}, Lcom/tencent/connect/auth/AuthMap;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 86
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v4, v3}, Lcom/tencent/utils/Util;->decodeUrlToJson(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 87
a=0;//     const-string v4, "cb"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 88
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v2, v2, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v4, v3}, Lcom/tencent/connect/auth/AuthDialog;->callJs(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_3
a=0;//     iget-object v4, v2, Lcom/tencent/connect/auth/AuthMap$Auth;->listener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v4, v3}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v2, v2, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/connect/auth/AuthDialog;->dismiss()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private execShareToQQCallback(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     const-string v0, "action"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 103
a=0;//     invoke-static {v0}, Lcom/tencent/utils/TemporaryStorage;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V
a=0;// 
a=0;//     .line 130
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     check-cast v0, Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 109
a=0;//     const-string v1, "result"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "response"
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 112
a=0;//     const-string v3, "cancel"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 113
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v2, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v3, -0x6
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-string v4, "unknown error"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v2, v3, v4, v1}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v2}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 116
a=0;//     :cond_3
a=0;//     #v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v3, "complete"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 119
a=0;//     const-string v1, "{\"ret\": 0}"
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 122
a=0;//     :goto_2
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 124
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 125
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v1, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/4 v3, -0x4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-string v4, "json error"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v3, v4, v2}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private handleActionUri(Landroid/net/Uri;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "#"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 61
a=0;//     const-string v2, "action"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 62
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 63
a=0;//     invoke-direct {p0, v1, v0}, Lcom/tencent/tauth/AuthActivity;->execAuthCallback(Landroid/os/Bundle;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     const-string v3, "shareToQQ"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     const-string v3, "shareToQzone"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 65
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/tauth/AuthActivity;->execShareToQQCallback(Landroid/os/Bundle;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/tencent/tauth/AuthActivity;->execAuthCallback(Landroid/os/Bundle;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/tauth/AuthActivity;->handleActionUri(Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
}}
