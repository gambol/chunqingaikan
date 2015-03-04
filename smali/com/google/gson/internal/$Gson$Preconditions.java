package com.google.gson.internal; class $Gson$Preconditions { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/$Gson$Preconditions;
a=0;// .super Ljava/lang/Object;
a=0;// .source "$Gson$Preconditions.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/$Gson$Preconditions;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static checkArgument(Z)V
a=0;//     .locals 1
a=0;//     .param p0, "condition"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     .local p0, "obj":Ljava/lang/Object;, "TT;"
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     return-object p0
a=0;// .end method
}}
