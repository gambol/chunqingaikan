package com.tencent.stat.common; class a { void a() { int a;
a=0;// .class public Lcom/tencent/stat/common/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static a:Lcom/tencent/stat/common/c;
a=0;// 
a=0;// .field private static d:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// .field private static e:Lorg/json/JSONObject;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:Ljava/lang/Integer;
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     sput-object v0, Lcom/tencent/stat/common/a;->d:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/common/a;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/a;->a(Landroid/content/Context;)Lcom/tencent/stat/common/c;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->q(Landroid/content/Context;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->p(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/a;->c:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/common/a;->d:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/stat/common/c;
a=0;//     .locals 4
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/common/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/common/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/common/c;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/tencent/stat/common/c;-><init>(Landroid/content/Context;Lcom/tencent/stat/common/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/c;);
a=0;//     sput-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
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
a=0;// .method public static a(Landroid/content/Context;Ljava/util/Map;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sget-object v1, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     sput-object v1, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lorg/json/JSONObject;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     sget-object v1, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/c;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/c;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v1, "cn"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/common/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v1, "tn"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v1, "ev"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     const-string v0, "eva"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/common/a;->d:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
