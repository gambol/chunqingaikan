package com.google.gson.internal.bind; class TypeAdapters$22 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$22;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TypeAdapters.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/TypeAdapters;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$22;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 3
a=0;//     .param p1, "gson"    # Lcom/google/gson/Gson;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     .local p2, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     const-class v2, Ljava/sql/Timestamp;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 520
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 524
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 523
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const-class v1, Ljava/util/Date;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 524
a=0;//     .local v0, "dateTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<Ljava/util/Date;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/TypeAdapters$22$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/TypeAdapters$22$1;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/google/gson/internal/bind/TypeAdapters$22$1;-><init>(Lcom/google/gson/internal/bind/TypeAdapters$22;Lcom/google/gson/TypeAdapter;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$22$1;);
a=0;//     goto :goto_0
a=0;// .end method
}}
