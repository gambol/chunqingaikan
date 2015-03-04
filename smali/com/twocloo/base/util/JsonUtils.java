package com.twocloo.base.util; class JsonUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/JsonUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JsonUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/JsonUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     new-instance v0, Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     .local v0, "gson":Lcom/google/gson/Gson;
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     invoke-virtual {v0, p0, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 25
a=0;//     .local v1, "obj":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/util/List;
a=0;//     .locals 2
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;//     .param p1, "typeOfT"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "gson":Lcom/google/gson/Gson;
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     invoke-virtual {v0, p0, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "obj":Ljava/util/List;, "Ljava/util/List<TT;>;"
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static toJson(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "obj":Ljava/lang/Object;, "TT;"
a=0;//     new-instance v0, Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "gson":Lcom/google/gson/Gson;
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "json":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
}}
