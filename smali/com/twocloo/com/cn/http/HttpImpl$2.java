package com.twocloo.com.cn.http; class HttpImpl$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/HttpImpl$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/http/HttpImpl;->downVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/twocloo/base/cache/Filter",
a=0;//         "<",
a=0;//         "Lorg/json/JSONObject;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/HttpImpl$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic accept(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/http/HttpImpl$2;->accept(Lorg/json/JSONObject;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public accept(Lorg/json/JSONObject;)Z
a=0;//     .locals 3
a=0;//     .param p1, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v2, "code"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     :try_start_0
a=0;//     const-string v2, "code"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 269
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 275
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 271
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 272
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 275
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
