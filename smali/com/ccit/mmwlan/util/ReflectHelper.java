package com.ccit.mmwlan.util; class ReflectHelper { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/util/ReflectHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ReflectHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MMCLIENT_SDK:Ljava/lang/String; = "ReflectHelper"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/util/ReflectHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p0, "obj"    # Ljava/lang/Object;
a=0;//     .param p1, "methodname"    # Ljava/lang/String;
a=0;//     .param p2, "types"    # [Ljava/lang/Class;
a=0;//     .param p3, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/lang/Object;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 53
a=0;//     .local v0, "classz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     .local v2, "method":Ljava/lang/reflect/Method;
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     .local v3, "retValue":Ljava/lang/Object;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 61
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     invoke-virtual {v2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 69
a=0;//     .end local v3    # "retValue":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v3    # "retValue":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 64
a=0;//     .local v1, "ex":Ljava/lang/NoSuchMethodException;
a=0;//     #v1=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v4, "ReflectHelper"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     .end local v1    # "ex":Ljava/lang/NoSuchMethodException;
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "ex":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "ReflectHelper"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "methodname"    # Ljava/lang/String;
a=0;//     .param p2, "types"    # [Ljava/lang/Class;
a=0;//     .param p3, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/lang/Object;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     .local p0, "classz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     .local v1, "method":Ljava/lang/reflect/Method;
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     .local v2, "retValue":Ljava/lang/Object;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 101
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 103
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 115
a=0;//     .end local v2    # "retValue":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/Object;);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 105
a=0;//     .restart local v2    # "retValue":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "ex":Ljava/lang/NoSuchMethodException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v3, "ReflectHelper"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     .end local v0    # "ex":Ljava/lang/NoSuchMethodException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 111
a=0;//     .local v0, "ex":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "ReflectHelper"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static callStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p0, "className"    # Ljava/lang/String;
a=0;//     .param p1, "methodname"    # Ljava/lang/String;
a=0;//     .param p2, "types"    # [Ljava/lang/Class;
a=0;//     .param p3, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/lang/Object;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "classz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, p1, p2, p3}, Lcom/ccit/mmwlan/util/ReflectHelper;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 153
a=0;//     .end local v0    # "classz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 147
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 149
a=0;//     .local v1, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v1=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     const-string v2, "ReflectHelper"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 153
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
