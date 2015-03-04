package com.twocloo.base.cache.lru; class BMemCache$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/cache/lru/BMemCache$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BMemCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/cache/lru/BMemCache;->init()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/cache/lru/BMemCache;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/cache/lru/BMemCache$1;->this$0:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/BMemCache$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getMemClass()I
a=0;//     .locals 2
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0x5
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     const-string v1, "activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
