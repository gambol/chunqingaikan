package com.google.gson.internal; class ConstructorConstructor$12 { void a() { int a;
a=0;// .class Lcom/google/gson/internal/ConstructorConstructor$12;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConstructorConstructor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/ConstructorConstructor;->newUnsafeAllocator(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/google/gson/internal/ObjectConstructor;
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
a=0;// .field private final unsafeAllocator:Lcom/google/gson/internal/UnsafeAllocator;
a=0;// 
a=0;// .field final synthetic val$rawType:Ljava/lang/Class;
a=0;// 
a=0;// .field final synthetic val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->this$0:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->val$rawType:Ljava/lang/Class;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 203
a=0;//     #p0=(Reference,Lcom/google/gson/internal/ConstructorConstructor$12;);
a=0;//     invoke-static {}, Lcom/google/gson/internal/UnsafeAllocator;->create()Lcom/google/gson/internal/UnsafeAllocator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/UnsafeAllocator;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->unsafeAllocator:Lcom/google/gson/internal/UnsafeAllocator;
a=0;// 
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
a=0;//     .line 207
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->unsafeAllocator:Lcom/google/gson/internal/UnsafeAllocator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/internal/UnsafeAllocator;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->val$rawType:Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3}, Lcom/google/gson/internal/UnsafeAllocator;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 208
a=0;//     .local v1, "newInstance":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 209
a=0;//     .end local v1    # "newInstance":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 210
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Unable to invoke no-args constructor for "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/ConstructorConstructor$12;->val$type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ". "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "Register an InstanceCreator with Gson for this type may fix this problem."
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// .end method
}}
