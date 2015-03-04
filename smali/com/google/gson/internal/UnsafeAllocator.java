package com.google.gson.internal; class UnsafeAllocator { void a() { int a;
a=0;// .class public abstract Lcom/google/gson/internal/UnsafeAllocator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "UnsafeAllocator.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/UnsafeAllocator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static create()Lcom/google/gson/internal/UnsafeAllocator;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     :try_start_0
a=0;//     const-string v7, "sun.misc.Unsafe"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 40
a=0;//     .local v6, "unsafeClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     const-string v7, "theUnsafe"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "f":Ljava/lang/reflect/Field;
a=0;//     #v2=(Reference,Ljava/lang/reflect/Field;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 43
a=0;//     .local v5, "unsafe":Ljava/lang/Object;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     const-string v7, "allocateInstance"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Class;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const-class v10, Ljava/lang/Class;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "allocateInstance":Ljava/lang/reflect/Method;
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     new-instance v7, Lcom/google/gson/internal/UnsafeAllocator$1;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/google/gson/internal/UnsafeAllocator$1;);
a=0;//     invoke-direct {v7, v0, v5}, Lcom/google/gson/internal/UnsafeAllocator$1;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 97
a=0;//     .end local v0    # "allocateInstance":Ljava/lang/reflect/Method;
a=0;//     .end local v2    # "f":Ljava/lang/reflect/Field;
a=0;//     .end local v5    # "unsafe":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ujava/lang/Object;);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 51
a=0;//     :catch_0
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 60
a=0;//     :try_start_1
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     const-class v7, Ljava/io/ObjectInputStream;
a=0;// 
a=0;//     const-string v8, "newInstance"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const-class v11, Ljava/lang/Class;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const-class v11, Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 62
a=0;//     .local v4, "newInstance":Ljava/lang/reflect/Method;
a=0;//     #v4=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v7, Lcom/google/gson/internal/UnsafeAllocator$2;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/google/gson/internal/UnsafeAllocator$2;);
a=0;//     invoke-direct {v7, v4}, Lcom/google/gson/internal/UnsafeAllocator$2;-><init>(Ljava/lang/reflect/Method;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/UnsafeAllocator$2;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     .end local v4    # "newInstance":Ljava/lang/reflect/Method;
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 79
a=0;//     :try_start_2
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     const-class v7, Ljava/io/ObjectStreamClass;
a=0;// 
a=0;//     const-string v8, "getConstructorId"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     new-array v9, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const-class v11, Ljava/lang/Class;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 81
a=0;//     .local v3, "getConstructorId":Ljava/lang/reflect/Method;
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v3, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const-class v10, Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     invoke-virtual {v3, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "constructorId":I
a=0;//     #v1=(Integer);
a=0;//     const-class v7, Ljava/io/ObjectStreamClass;
a=0;// 
a=0;//     const-string v8, "newInstance"
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Class;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const-class v11, Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 85
a=0;//     .restart local v4    # "newInstance":Ljava/lang/reflect/Method;
a=0;//     #v4=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v7, Lcom/google/gson/internal/UnsafeAllocator$3;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/google/gson/internal/UnsafeAllocator$3;);
a=0;//     invoke-direct {v7, v4, v1}, Lcom/google/gson/internal/UnsafeAllocator$3;-><init>(Ljava/lang/reflect/Method;I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/UnsafeAllocator$3;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     .end local v1    # "constructorId":I
a=0;//     .end local v3    # "getConstructorId":Ljava/lang/reflect/Method;
a=0;//     .end local v4    # "newInstance":Ljava/lang/reflect/Method;
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 97
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v7, Lcom/google/gson/internal/UnsafeAllocator$4;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/google/gson/internal/UnsafeAllocator$4;);
a=0;//     invoke-direct {v7}, Lcom/google/gson/internal/UnsafeAllocator$4;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/UnsafeAllocator$4;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract newInstance(Ljava/lang/Class;)Ljava/lang/Object;
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
a=0;// .end method
}}
