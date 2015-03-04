package com.twocloo.base.util; class EventLogUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/EventLogUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EventLogUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TIME_LIMIT:J = 0x1388L
a=0;// 
a=0;// .field public static app:Landroid/app/Application;
a=0;// 
a=0;// .field private static final dateFormat:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyy-MM-dd HH:mm:ss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lcom/twocloo/base/util/EventLogUtils;->dateFormat:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/EventLogUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static createCommonMap(Landroid/content/Context;)Ljava/util/Map;
a=0;//     .locals 6
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 47
a=0;//     .local v1, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, "netType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/common/NetType;->getDesc()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 49
a=0;//     const-string v2, "time"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/twocloo/base/util/EventLogUtils;->dateFormat:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v4=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v5, Ljava/util/Date;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v5}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;
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
a=0;//     invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 51
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static sendEventLog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "event"    # Ljava/lang/String;
a=0;//     .param p2, "label"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-static {p0, p1, p2}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sendEventLog(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;J)V
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "event"    # Ljava/lang/String;
a=0;//     .param p3, "duration"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;J)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     .local p2, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const-wide/16 v1, 0x1388
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, p3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/EventLogUtils;->createCommonMap(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "commonMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-static {p0, p1, v0, p3, p4}, Lcom/umeng/analytics/MobclickAgent;->onEventDuration(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
