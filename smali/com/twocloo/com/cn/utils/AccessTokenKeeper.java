package com.twocloo.com.cn.utils; class AccessTokenKeeper { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/AccessTokenKeeper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessTokenKeeper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PREFERENCES_NAME:Ljava/lang/String; = "com_weibo_sdk_android"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/AccessTokenKeeper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clear(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     const-string v2, "com_weibo_sdk_android"
a=0;// 
a=0;//     .line 42
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     .line 41
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "pref":Landroid/content/SharedPreferences;
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 45
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static keepAccessToken(Landroid/content/Context;Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "token"    # Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const-string v2, "com_weibo_sdk_android"
a=0;// 
a=0;//     .line 28
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     .line 27
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 29
a=0;//     .local v1, "pref":Landroid/content/SharedPreferences;
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v2, "token"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 31
a=0;//     const-string v2, "expiresTime"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getExpiresTime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 32
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static readAccessToken(Landroid/content/Context;)Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     new-instance v1, Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     invoke-direct {v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "token":Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     const-string v2, "com_weibo_sdk_android"
a=0;// 
a=0;//     .line 57
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     .line 56
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "pref":Landroid/content/SharedPreferences;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "token"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     const-string v2, "expiresTime"
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setExpiresTime(J)V
a=0;// 
a=0;//     .line 60
a=0;//     return-object v1
a=0;// .end method
}}
