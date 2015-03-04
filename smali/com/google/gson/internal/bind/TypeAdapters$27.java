package com.google.gson.internal.bind; class TypeAdapters$27 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$27;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TypeAdapters.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic val$type:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;// .field final synthetic val$typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 769
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/TypeAdapters$27;->val$type:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/bind/TypeAdapters$27;->val$typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$27;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
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
a=0;//     .line 772
a=0;//     .local p2, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapters$27;->val$type:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p2, v0}, Lcom/google/gson/reflect/TypeToken;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapters$27;->val$typeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
