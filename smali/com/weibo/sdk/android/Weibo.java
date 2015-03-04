package com.weibo.sdk.android; class Weibo { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/Weibo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Weibo.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final KEY_EXPIRES:Ljava/lang/String; = "expires_in"
a=0;// 
a=0;// .field public static final KEY_REFRESHTOKEN:Ljava/lang/String; = "refresh_token"
a=0;// 
a=0;// .field public static final KEY_TOKEN:Ljava/lang/String; = "access_token"
a=0;// 
a=0;// .field public static URL_OAUTH2_ACCESS_AUTHORIZE:Ljava/lang/String;
a=0;// 
a=0;// .field public static app_key:Ljava/lang/String;
a=0;// 
a=0;// .field public static isWifi:Z
a=0;// 
a=0;// .field private static mWeiboInstance:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;// .field public static redirecturl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     const-string v0, "https://open.weibo.cn/oauth2/authorize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/Weibo;->URL_OAUTH2_ACCESS_AUTHORIZE:Ljava/lang/String;
a=0;// 
a=0;//     .line 19
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/Weibo;->mWeiboInstance:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     .line 21
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/Weibo;->app_key:Ljava/lang/String;
a=0;// 
a=0;//     .line 22
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/weibo/sdk/android/Weibo;->redirecturl:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/weibo/sdk/android/Weibo;->isWifi:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/Weibo;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized getInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/weibo/sdk/android/Weibo;
a=0;//     .locals 2
a=0;//     .param p0, "appKey"    # Ljava/lang/String;
a=0;//     .param p1, "redirectUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     const-class v1, Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/weibo/sdk/android/Weibo;->mWeiboInstance:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/Weibo;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/Weibo;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/Weibo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/Weibo;);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/Weibo;->mWeiboInstance:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     sput-object p0, Lcom/weibo/sdk/android/Weibo;->app_key:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     sput-object p1, Lcom/weibo/sdk/android/Weibo;->redirecturl:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     sget-object v0, Lcom/weibo/sdk/android/Weibo;->mWeiboInstance:Lcom/weibo/sdk/android/Weibo;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 37
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public authorize(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-static {p1}, Lcom/weibo/sdk/android/util/Utility;->isWifi(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/weibo/sdk/android/Weibo;->isWifi:Z
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/weibo/sdk/android/Weibo;->startAuthDialog(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setupConsumerConfig(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "appKey"    # Ljava/lang/String;
a=0;//     .param p2, "redirectUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     sput-object p1, Lcom/weibo/sdk/android/Weibo;->app_key:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     sput-object p2, Lcom/weibo/sdk/android/Weibo;->redirecturl:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startAuthDialog(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v1, Lcom/weibo/sdk/android/Weibo$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/Weibo$1;);
a=0;//     invoke-direct {v1, p0, p2}, Lcom/weibo/sdk/android/Weibo$1;-><init>(Lcom/weibo/sdk/android/Weibo;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/Weibo$1;);
a=0;//     invoke-virtual {p0, p1, v0, v1}, Lcom/weibo/sdk/android/Weibo;->startDialog(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboParameters;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startDialog(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboParameters;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "parameters"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const-string v1, "client_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/weibo/sdk/android/Weibo;->app_key:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     const-string v1, "response_type"
a=0;// 
a=0;//     const-string v2, "token"
a=0;// 
a=0;//     invoke-virtual {p2, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     const-string v1, "redirect_uri"
a=0;// 
a=0;//     sget-object v2, Lcom/weibo/sdk/android/Weibo;->redirecturl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     const-string v1, "display"
a=0;// 
a=0;//     const-string v2, "mobile"
a=0;// 
a=0;//     invoke-virtual {p2, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v1, p0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     const-string v1, "access_token"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p2, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/weibo/sdk/android/Weibo;->URL_OAUTH2_ACCESS_AUTHORIZE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "?"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p2}, Lcom/weibo/sdk/android/util/Utility;->encodeUrl(Lcom/weibo/sdk/android/WeiboParameters;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 121
a=0;//     .local v0, "url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.permission.INTERNET"
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     const-string v1, "Error"
a=0;// 
a=0;//     .line 123
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Application requires permission to access the Internet"
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {p1, v1, v2}, Lcom/weibo/sdk/android/util/Utility;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-direct {v1, p1, v0, p3}, Lcom/weibo/sdk/android/WeiboDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     invoke-virtual {v1}, Lcom/weibo/sdk/android/WeiboDialog;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
