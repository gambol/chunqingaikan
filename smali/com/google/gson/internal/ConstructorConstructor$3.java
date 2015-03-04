package com.google.gson.internal; class ConstructorConstructor$3 { void a() { int a;
a=0;// .class Lcom/google/gson/internal/ConstructorConstructor$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConstructorConstructor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/ConstructorConstructor;->newDefaultConstructor(Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
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
a=0;// .field final synthetic val$constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;Ljava/lang/reflect/Constructor;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/ConstructorConstructor$3;->this$0:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/ConstructorConstructor$3;->val$constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public construct()Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "args":[Ljava/lang/Object;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/ConstructorConstructor$3;->val$constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 105
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 107
a=0;//     .local v1, "e":Ljava/lang/InstantiationException;
a=0;//     #v1=(Reference,Ljava/lang/InstantiationException;);
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Failed to invoke "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/ConstructorConstructor$3;->val$constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " with no args"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 108
a=0;//     .end local v1    # "e":Ljava/lang/InstantiationException;
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 111
a=0;//     .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v1=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Failed to invoke "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/ConstructorConstructor$3;->val$constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " with no args"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 113
a=0;//     .end local v1    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_2
a=0;//     #v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 114
a=0;//     .local v1, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v1=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     new-instance v2, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v2, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v2
a=0;// .end method
}}
