package com.umeng.analytics.onlineconfig; class a { void a() { int a;
a=0;// .class public Lcom/umeng/analytics/onlineconfig/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OnlineConfigAgent.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/umeng/analytics/onlineconfig/a$a;,
a=0;//         Lcom/umeng/analytics/onlineconfig/a$b;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Ljava/lang/String; = "type"
a=0;// 
a=0;// .field public static final b:Ljava/lang/String; = "package"
a=0;// 
a=0;// .field public static final c:Ljava/lang/String; = "channel"
a=0;// 
a=0;// .field public static final d:Ljava/lang/String; = "idmd5"
a=0;// 
a=0;// .field public static final e:Ljava/lang/String; = "version_code"
a=0;// 
a=0;// .field public static final f:Ljava/lang/String; = "appkey"
a=0;// 
a=0;// .field public static final g:Ljava/lang/String; = "sdk_version"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final h:Ljava/lang/String;
a=0;// 
a=0;// .field private final i:Ljava/lang/String;
a=0;// 
a=0;// .field private final j:Ljava/lang/String;
a=0;// 
a=0;// .field private k:Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;
a=0;// 
a=0;// .field private l:Lcom/umeng/analytics/onlineconfig/c;
a=0;// 
a=0;// .field private m:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/umeng/analytics/onlineconfig/a;);
a=0;//     const-string v0, "last_config_time"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     const-string v0, "report_policy"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     const-string v0, "online_config"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object v1, p0, Lcom/umeng/analytics/onlineconfig/a;->k:Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object v1, p0, Lcom/umeng/analytics/onlineconfig/a;->l:Lcom/umeng/analytics/onlineconfig/c;
a=0;// 
a=0;//     .line 42
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/umeng/analytics/onlineconfig/a;->m:J
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/analytics/onlineconfig/a;)Lcom/umeng/analytics/onlineconfig/c;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->l:Lcom/umeng/analytics/onlineconfig/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/onlineconfig/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/analytics/onlineconfig/a;Landroid/content/Context;)Lorg/json/JSONObject;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->b(Landroid/content/Context;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/g;->a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/g;);
a=0;//     invoke-virtual {v0}, Lcom/umeng/analytics/g;->g()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v1, p2, Lcom/umeng/analytics/onlineconfig/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     const-string v1, "umeng_last_config_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p2, Lcom/umeng/analytics/onlineconfig/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 129
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p2, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 133
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/g;->a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/g;);
a=0;//     iget v1, p2, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p2, Lcom/umeng/analytics/onlineconfig/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/umeng/analytics/g;->a(II)V
a=0;// 
a=0;//     .line 135
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/analytics/onlineconfig/a;Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/onlineconfig/a;->a(Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/umeng/analytics/onlineconfig/a;Lorg/json/JSONObject;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/json/JSONObject;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->k:Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->k:Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;->onDataReceived(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)Lorg/json/JSONObject;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "online_config"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 97
a=0;//     const-string v1, "appkey"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->getAppkey(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 98
a=0;//     const-string v1, "version_code"
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 99
a=0;//     const-string v1, "package"
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->u(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 100
a=0;//     const-string v1, "sdk_version"
a=0;// 
a=0;//     const-string v2, "5.2.4"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 102
a=0;//     const-string v1, "idmd5"
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lu/aly/bv;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 103
a=0;//     const-string v1, "channel"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/g;->a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/umeng/analytics/g;->a()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 106
a=0;//     const-string v2, "report_policy"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget v1, v1, v3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 107
a=0;//     const-string v1, "last_config_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 114
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 109
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 110
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "exception in onlineConfigInternal"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p2, Lcom/umeng/analytics/onlineconfig/b;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p2, Lcom/umeng/analytics/onlineconfig/b;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 142
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/g;->a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/g;);
a=0;//     invoke-virtual {v0}, Lcom/umeng/analytics/g;->g()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 143
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     iget-object v2, p2, Lcom/umeng/analytics/onlineconfig/b;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 149
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 151
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 158
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "get online setting params: "
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "save online config params"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lu/aly/bj;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/umeng/analytics/onlineconfig/a;Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/onlineconfig/a;->b(Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/g;->a(Landroid/content/Context;)Lcom/umeng/analytics/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/g;);
a=0;//     invoke-virtual {v0}, Lcom/umeng/analytics/g;->g()Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 120
a=0;//     const-string v1, "umeng_last_config_time"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->k:Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     :try_start_0
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "unexpected null context in updateOnlineConfig"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-boolean v0, Lu/aly/bj;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {p1}, Lu/aly/bi;->w(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/umeng/analytics/onlineconfig/a$b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/analytics/onlineconfig/a$b;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/umeng/analytics/onlineconfig/a$b;-><init>(Lcom/umeng/analytics/onlineconfig/a;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/onlineconfig/a$b;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "exception in updateOnlineConfig"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/umeng/analytics/onlineconfig/a;->m:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v2, v0, v2
a=0;// 
a=0;//     const-wide/32 v4, 0x36ee80
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     iput-wide v0, p0, Lcom/umeng/analytics/onlineconfig/a;->m:J
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/umeng/analytics/onlineconfig/a$b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/analytics/onlineconfig/a$b;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/umeng/analytics/onlineconfig/a$b;-><init>(Lcom/umeng/analytics/onlineconfig/a;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/onlineconfig/a$b;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/onlineconfig/a;->k:Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/umeng/analytics/onlineconfig/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iput-object p1, p0, Lcom/umeng/analytics/onlineconfig/a;->l:Lcom/umeng/analytics/onlineconfig/c;
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/a;->l:Lcom/umeng/analytics/onlineconfig/c;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
}}
