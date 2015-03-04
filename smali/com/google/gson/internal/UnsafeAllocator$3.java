package com.google.gson.internal; class UnsafeAllocator$3 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/UnsafeAllocator$3;
a=0;// .super Lcom/google/gson/internal/UnsafeAllocator;
a=0;// .source "UnsafeAllocator.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/UnsafeAllocator;->create()Lcom/google/gson/internal/UnsafeAllocator;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic val$constructorId:I
a=0;// 
a=0;// .field final synthetic val$newInstance:Ljava/lang/reflect/Method;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/reflect/Method;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/UnsafeAllocator$3;->val$newInstance:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iput p2, p0, Lcom/google/gson/internal/UnsafeAllocator$3;->val$constructorId:I
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/UnsafeAllocator;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/UnsafeAllocator$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public newInstance(Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     .local p1, "c":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/UnsafeAllocator$3;->val$newInstance:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iget v4, p0, Lcom/google/gson/internal/UnsafeAllocator$3;->val$constructorId:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
