package com.google.gson.internal; class ConstructorConstructor$5 { void a() { int a;
a=0;// .class Lcom/google/gson/internal/ConstructorConstructor$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConstructorConstructor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/ConstructorConstructor;->newDefaultImplementationConstructor(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
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
a=0;//         "Lcom/google/gson/internal/ObjectConstructor",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;// .field final synthetic val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;Ljava/lang/reflect/Type;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/ConstructorConstructor$5;->this$0:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/ConstructorConstructor$5;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public construct()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/ConstructorConstructor$5;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v1, v1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/ConstructorConstructor$5;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v1, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "elementType":Ljava/lang/reflect/Type;
a=0;//     #v0=(Null);
a=0;//     instance-of v1, v0, Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .end local v0    # "elementType":Ljava/lang/reflect/Type;
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/EnumSet;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 146
a=0;//     .restart local v0    # "elementType":Ljava/lang/reflect/Type;
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     new-instance v1, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Invalid EnumSet type: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/ConstructorConstructor$5;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 149
a=0;//     .end local v0    # "elementType":Ljava/lang/reflect/Type;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Invalid EnumSet type: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/ConstructorConstructor$5;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v1
a=0;// .end method
}}
