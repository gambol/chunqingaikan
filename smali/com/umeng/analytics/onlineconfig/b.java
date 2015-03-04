package com.umeng.analytics.onlineconfig; class b { void a() { int a;
a=0;// .class public Lcom/umeng/analytics/onlineconfig/b;
a=0;// .super Lu/aly/bq;
a=0;// .source "OnlineConfigResponse.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Lorg/json/JSONObject;
a=0;// 
a=0;// .field b:Z
a=0;// 
a=0;// .field c:I
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field e:Ljava/lang/String;
a=0;// 
a=0;// .field private final f:Ljava/lang/String;
a=0;// 
a=0;// .field private final g:Ljava/lang/String;
a=0;// 
a=0;// .field private final h:Ljava/lang/String;
a=0;// 
a=0;// .field private final i:Ljava/lang/String;
a=0;// 
a=0;// .field private final j:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 35
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1}, Lu/aly/bq;-><init>(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/umeng/analytics/onlineconfig/b;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 21
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/umeng/analytics/onlineconfig/b;->b:Z
a=0;// 
a=0;//     .line 23
a=0;//     iput v1, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     .line 24
a=0;//     iput v1, p0, Lcom/umeng/analytics/onlineconfig/b;->d:I
a=0;// 
a=0;//     .line 28
a=0;//     const-string v0, "config_update"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     const-string v0, "report_policy"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     const-string v0, "online_params"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     const-string v0, "last_config_time"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "report_interval"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/b;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Lcom/umeng/analytics/onlineconfig/b;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/json/JSONObject;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     const-string v0, "config_update"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "config_update"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "no"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 52
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     const-string v0, "report_policy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "report_policy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, "report_interval"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->d:I
a=0;// 
a=0;//     .line 55
a=0;//     const-string v0, "last_config_time"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     :goto_1
a=0;//     const-string v0, "online_params"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/umeng/analytics/onlineconfig/b;->a:Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/umeng/analytics/onlineconfig/b;->b:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 64
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "fail to parce online config response"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lu/aly/bj;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 57
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, " online config fetch no report policy"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lu/aly/bj;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
