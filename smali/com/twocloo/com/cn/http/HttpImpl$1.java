package com.twocloo.com.cn.http; class HttpImpl$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/HttpImpl$1;
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
a=0;//     .line 253
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/HttpImpl$1;);
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
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/http/HttpImpl$1;->accept(Lorg/json/JSONObject;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public accept(Lorg/json/JSONObject;)Z
a=0;//     .locals 2
a=0;//     .param p1, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 258
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 261
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
