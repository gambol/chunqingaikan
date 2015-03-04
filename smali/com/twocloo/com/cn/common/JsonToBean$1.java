package com.twocloo.com.cn.common; class JsonToBean$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/JsonToBean$1;
a=0;// .super Ljava/util/HashSet;
a=0;// .source "JsonToBean.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/JsonToBean;->JsonToSubedchaptersinfo(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/util/HashSet",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
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
a=0;//     .line 1347
a=0;//     invoke-direct {p0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 1
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JsonToBean$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1350
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 1351
a=0;//     .local v1, "res":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/common/JsonToBean$1;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1352
a=0;//     .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1356
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1357
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1359
a=0;//     :goto_1
a=0;//     return-object v2
a=0;// 
a=0;//     .line 1353
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 1354
a=0;//     const-string v2, ","
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1359
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
}}
